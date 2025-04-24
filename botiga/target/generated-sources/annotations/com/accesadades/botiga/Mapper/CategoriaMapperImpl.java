package com.accesadades.botiga.Mapper;

import com.accesadades.botiga.Dto.CategoriaDTO;
import com.accesadades.botiga.Model.Categoria;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-24T16:37:21+0200",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.42.0.z20250331-1358, environment: Java 21.0.6 (Eclipse Adoptium)"
)
@Component
public class CategoriaMapperImpl implements CategoriaMapper {

    @Override
    public CategoriaDTO toDTO(Categoria categoria) {
        if ( categoria == null ) {
            return null;
        }

        CategoriaDTO categoriaDTO = new CategoriaDTO();

        categoriaDTO.setDescCategoria( categoria.getDescCategoria() );
        categoriaDTO.setIdCategoria( categoria.getIdCategoria() );
        categoriaDTO.setStatusCategoria( categoria.getStatusCategoria() );

        return categoriaDTO;
    }

    @Override
    public Categoria toEntity(CategoriaDTO categoriaDTO) {
        if ( categoriaDTO == null ) {
            return null;
        }

        Categoria categoria = new Categoria();

        categoria.setDescCategoria( categoriaDTO.getDescCategoria() );
        categoria.setIdCategoria( categoriaDTO.getIdCategoria() );
        categoria.setStatusCategoria( categoriaDTO.getStatusCategoria() );

        return categoria;
    }
}
