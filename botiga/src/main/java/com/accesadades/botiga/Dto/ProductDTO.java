package com.accesadades.botiga.Dto;

import lombok.Data;

@Data
public class ProductDTO {
    private String nom;
    private double preu;
    private String descripcio;
    private Long idCategoria;
    private Long idSubcategoria;
}
