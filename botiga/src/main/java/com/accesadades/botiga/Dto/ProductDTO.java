package com.accesadades.botiga.Dto;

import lombok.Data;

@Data
public class ProductDTO {
    private String nom;
    private float preu;
    private String descripcio;
    private String company;
    private long units;
    private Long idCategoria;
    private Long idSubcategoria;
}
