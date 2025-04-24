package com.accesadades.botiga.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import com.accesadades.botiga.Dto.CategoriaDTO;
import com.accesadades.botiga.Model.Categoria;

@Mapper(componentModel = "spring")
public interface CategoriaMapper {

    CategoriaMapper INSTANCE = Mappers.getMapper(CategoriaMapper.class);

    @Mappings({
        @Mapping(target = "creationAt", ignore = true),
        @Mapping(target = "updatedAt", ignore = true),
        @Mapping(target = "subcategories", ignore = true)
    })
    Categoria toEntity(CategoriaDTO categoriaDTO);

    CategoriaDTO toDTO(Categoria categoria);
}