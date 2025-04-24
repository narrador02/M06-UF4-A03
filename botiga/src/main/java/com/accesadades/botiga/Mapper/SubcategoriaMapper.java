package com.accesadades.botiga.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import com.accesadades.botiga.Dto.SubcategoriaDTO;
import com.accesadades.botiga.Model.Subcategoria;

@Mapper(componentModel = "spring")
public interface SubcategoriaMapper {

    SubcategoriaMapper INSTANCE = Mappers.getMapper(SubcategoriaMapper.class);

    @Mappings({
        @Mapping(target = "creationAt", ignore = true),
        @Mapping(target = "updatedAt", ignore = true),
        @Mapping(target = "categoria", ignore = true)
    })
    Subcategoria toEntity(SubcategoriaDTO subcategoriaDTO);

    @Mapping(target = "idCategoria", source = "categoria.idCategoria")
    SubcategoriaDTO toDTO(Subcategoria subcategoria);
}