package com.accesadades.botiga.Model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Subcategoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSubcategoria;

    private String descSubcategoria;
    private String statusSubcategoria;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    private LocalDateTime creationAt;
    private LocalDateTime updatedAt;
}