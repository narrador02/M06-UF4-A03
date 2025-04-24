package com.accesadades.botiga.Service;

import com.accesadades.botiga.Dto.SubcategoriaDTO;
import com.accesadades.botiga.Mapper.SubcategoriaMapper;
import com.accesadades.botiga.Model.Categoria;
import com.accesadades.botiga.Model.Subcategoria;
import com.accesadades.botiga.Repository.CategoriaRepository;
import com.accesadades.botiga.Repository.SubcategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SubcategoriaServiceImpl implements BotigaService<SubcategoriaDTO, Long> {

    @Autowired private SubcategoriaRepository subcategoriaRepository;
    @Autowired private CategoriaRepository categoriaRepository;
    @Autowired private SubcategoriaMapper subcategoriaMapper;

    @Override
    public List<SubcategoriaDTO> findAll() {
        return subcategoriaRepository.findAll().stream()
                .map(subcategoriaMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<SubcategoriaDTO> findById(Long id) {
        return subcategoriaRepository.findById(id)
                .map(subcategoriaMapper::toDTO);
    }

    @Override
    public void save(SubcategoriaDTO subcategoriaDTO) {
        Subcategoria subcategoria = subcategoriaMapper.toEntity(subcategoriaDTO);

        Categoria categoria = categoriaRepository.findById(subcategoriaDTO.getIdCategoria())
                .orElseThrow(() -> new RuntimeException("Categoria inexistent"));

        subcategoria.setCategoria(categoria);
        subcategoriaRepository.save(subcategoria);
    }

    @Override
    public void deleteById(Long id) {
        subcategoriaRepository.deleteById(id);
    }
}