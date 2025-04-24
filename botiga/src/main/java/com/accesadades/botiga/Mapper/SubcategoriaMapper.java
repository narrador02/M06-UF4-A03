package com.accesadades.botiga.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.accesadades.botiga.Dto.SubcategoriaDTO;
import com.accesadades.botiga.Model.Subcategoria;

@Mapper(componentModel = "spring")
public interface SubcategoriaMapper {
    SubcategoriaMapper INSTANCE = Mappers.getMapper(SubcategoriaMapper.class);

    SubcategoriaDTO toDTO(Subcategoria subcategoria);
    Subcategoria toEntity(SubcategoriaDTO subcategoriaDTO);
}