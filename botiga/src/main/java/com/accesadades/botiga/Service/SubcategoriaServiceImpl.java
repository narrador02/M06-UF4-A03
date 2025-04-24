package main.java.com.accesadades.botiga.Service;

import com.accesadades.botiga.dto.SubcategoriaDTO;
import com.accesadades.botiga.mapper.SubcategoriaMapper;
import com.accesadades.botiga.model.Subcategoria;
import com.accesadades.botiga.repository.SubcategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SubcategoriaServiceImpl implements BotigaService<SubcategoriaDTO, Long> {

    @Autowired private SubcategoriaRepository subcategoriaRepository;
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
        subcategoriaRepository.save(subcategoria);
    }

    @Override
    public void deleteById(Long id) {
        subcategoriaRepository.deleteById(id);
    }
}
