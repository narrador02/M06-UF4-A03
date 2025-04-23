package com.accesadades.botiga.Model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoria;

    private String descCategoria;
    private String statusCategoria;

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    private List<Subcategoria> subcategories;

    private LocalDateTime creationAt;
    private LocalDateTime updatedAt;
}
