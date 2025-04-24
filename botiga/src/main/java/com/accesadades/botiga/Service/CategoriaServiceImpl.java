package com.accesadades.botiga.Service;

import com.accesadades.botiga.Dto.CategoriaDTO;
import com.accesadades.botiga.Mapper.CategoriaMapper;
import com.accesadades.botiga.Model.Categoria;
import com.accesadades.botiga.Repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoriaServiceImpl implements BotigaService<CategoriaDTO, Long> {

    @Autowired private CategoriaRepository categoriaRepository;
    @Autowired private CategoriaMapper categoriaMapper;

    @Override
    public List<CategoriaDTO> findAll() {
        return categoriaRepository.findAll().stream()
                .map(categoriaMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<CategoriaDTO> findById(Long id) {
        return categoriaRepository.findById(id)
                .map(categoriaMapper::toDTO);
    }

    @Override
    public void save(CategoriaDTO categoriaDTO) {
        Categoria categoria = categoriaMapper.toEntity(categoriaDTO);
        categoriaRepository.save(categoria);
    }

    @Override
    public void deleteById(Long id) {
        categoriaRepository.deleteById(id);
    }
}
