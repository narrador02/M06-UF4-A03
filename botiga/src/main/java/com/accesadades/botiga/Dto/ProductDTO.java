package com.accesadades.botiga.Dto;

import lombok.Data;

@Data
public class ProductDTO {
    private String nom;
    private double preu;
    private String descripcio;
    private CategoriaDTO categoria;       
    private SubcategoriaDTO subcategoria;
}
