package com.accesadades.botiga.Service;

import com.accesadades.botiga.dto.ProductDTO;
import com.accesadades.botiga.mapper.ProductMapper;
import com.accesadades.botiga.model.Product;
import com.accesadades.botiga.model.Categoria;
import com.accesadades.botiga.model.Subcategoria;
import com.accesadades.botiga.repository.ProductRepository;
import com.accesadades.botiga.repository.CategoriaRepository;
import com.accesadades.botiga.repository.SubcategoriaRepository;

import main.java.com.accesadades.botiga.Service.BotigaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements BotigaService<ProductDTO, Long> {

    @Autowired private ProductRepository productRepository;
    @Autowired private CategoriaRepository categoriaRepository;
    @Autowired private SubcategoriaRepository subcategoriaRepository;
    @Autowired private ProductMapper productMapper;

    @Override
    public List<ProductDTO> findAll() {
        return productRepository.findAll().stream()
                .map(productMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<ProductDTO> findById(Long id) {
        return productRepository.findById(id)
                .map(productMapper::toDTO);
    }

    @Override
    public void save(ProductDTO productDTO) {
        Categoria categoria = categoriaRepository.findById(productDTO.getCategoria().getIdCategoria())
                .orElseThrow(() -> new RuntimeException("Categoria inexistent"));

        Subcategoria subcategoria = subcategoriaRepository.findById(productDTO.getSubcategoria().getIdSubcategoria())
                .orElseThrow(() -> new RuntimeException("Subcategoria inexistent"));

        Product product = productMapper.toEntity(productDTO);
        product.setCategoria(categoria);
        product.setSubcategoria(subcategoria);

        productRepository.save(product);
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
    public List<ProductDTO> findByName(String nom) {
    return productRepository.findByNameContainingIgnoreCase(nom).stream()
            .map(productMapper::toDTO)
            .collect(Collectors.toList());
    }
    public void updatePreu(Long id, double nouPreu) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producte inexistent"));

        product.setPrice((float) nouPreu);
        productRepository.save(product);
    }
    public List<ProductDTO> findBySubcategoriaId(Long idSubcategoria) {
        return productRepository.findAll().stream()
                .filter(p -> p.getSubcategoria() != null && p.getSubcategoria().getIdSubcategoria().equals(idSubcategoria))
                .map(productMapper::toDTO)
                .collect(Collectors.toList());
    }

    public double calcularPreuMig() {
        return findAll().stream()
                .mapToDouble(ProductDTO::getPreu)
                .average()
                .orElse(0.0);
    }
}
