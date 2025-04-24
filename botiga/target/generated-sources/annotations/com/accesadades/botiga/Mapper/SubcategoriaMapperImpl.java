package com.accesadades.botiga.Mapper;

import com.accesadades.botiga.Dto.SubcategoriaDTO;
import com.accesadades.botiga.Model.Subcategoria;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-24T14:52:41+0200",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.42.0.z20250331-1358, environment: Java 21.0.6 (Eclipse Adoptium)"
)
@Component
public class SubcategoriaMapperImpl implements SubcategoriaMapper {

    @Override
    public SubcategoriaDTO toDTO(Subcategoria subcategoria) {
        if ( subcategoria == null ) {
            return null;
        }

        SubcategoriaDTO subcategoriaDTO = new SubcategoriaDTO();

        subcategoriaDTO.setDescSubcategoria( subcategoria.getDescSubcategoria() );
        subcategoriaDTO.setStatusSubcategoria( subcategoria.getStatusSubcategoria() );

        return subcategoriaDTO;
    }

    @Override
    public Subcategoria toEntity(SubcategoriaDTO subcategoriaDTO) {
        if ( subcategoriaDTO == null ) {
            return null;
        }

        Subcategoria subcategoria = new Subcategoria();

        subcategoria.setDescSubcategoria( subcategoriaDTO.getDescSubcategoria() );
        subcategoria.setStatusSubcategoria( subcategoriaDTO.getStatusSubcategoria() );

        return subcategoria;
    }
}
