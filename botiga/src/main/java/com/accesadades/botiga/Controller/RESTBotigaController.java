package com.accesadades.botiga.Controller;

import com.accesadades.botiga.Dto.ProductDTO;
import com.accesadades.botiga.Dto.CategoriaDTO;
import com.accesadades.botiga.Dto.SubcategoriaDTO;
import com.accesadades.botiga.Service.ProductServiceImpl;
import com.accesadades.botiga.Service.CategoriaServiceImpl;
import com.accesadades.botiga.Service.SubcategoriaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/botiga")
public class RESTBotigaController {

    @Autowired private ProductServiceImpl productService;
    @Autowired private CategoriaServiceImpl categoriaService;
    @Autowired private SubcategoriaServiceImpl subcategoriaService;

    // ------------------ PRODUCTES ------------------

    @PostMapping("/inserirProducte")
    public void inserirProducte(@RequestBody ProductDTO productDTO) {
        productService.save(productDTO);
    }

    @GetMapping("/llistarProductes")
    public List<ProductDTO> llistarProductes() {
        return productService.findAll();
    }

    @GetMapping("/cercaProductes")
    public List<ProductDTO> cercaProductes(@RequestParam String nom) {
        return productService.findByName(nom);
    }

    @PutMapping("/modificarPreu")
    public void modificarPreu(@RequestParam Long id, @RequestParam double nouPreu) {
        productService.updatePreu(id, nouPreu);
    }

    // ------------------ CATEGORIES ------------------

    @PostMapping("/inserirCategoria")
    public void inserirCategoria(@RequestBody CategoriaDTO categoriaDTO) {
        categoriaService.save(categoriaDTO);
    }

    @GetMapping("/llistarCategories")
    public List<CategoriaDTO> llistarCategories() {
        return categoriaService.findAll();
    }

    // ------------------ SUBCATEGORIES ------------------

    @PostMapping("/inserirSubcategoria")
    public void inserirSubcategoria(@RequestBody SubcategoriaDTO subcategoriaDTO) {
        subcategoriaService.save(subcategoriaDTO);
    }

    @GetMapping("/llistarSubcategories")
    public List<SubcategoriaDTO> llistarSubcategories() {
        return subcategoriaService.findAll();
    }
    @GetMapping("/productesPerSubcategoria")
    public List<ProductDTO> productesPerSubcategoria(@RequestParam Long idSubcategoria) {
        return productService.findBySubcategoriaId(idSubcategoria);
    }
    @DeleteMapping("/esborrarCategoria/{id}")
    public void esborrarCategoria(@PathVariable Long id) {
        categoriaService.deleteById(id);
    }

    // Calcular precio medio
    @GetMapping("/preuMig")
    public double calcularPreuMig() {
        List<ProductDTO> productes = productService.findAll();
        return productes.stream()
                .mapToDouble(ProductDTO::getPreu)
                .average()
                .orElse(0.0);
    }
}
