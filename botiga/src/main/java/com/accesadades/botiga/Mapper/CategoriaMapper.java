package com.accesadades.botiga.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.accesadades.botiga.Dto.CategoriaDTO;
import com.accesadades.botiga.Model.Categoria;

@Mapper(componentModel = "spring")
public interface CategoriaMapper {
    CategoriaMapper INSTANCE = Mappers.getMapper(CategoriaMapper.class);

    CategoriaDTO toDTO(Categoria categoria);
    Categoria toEntity(CategoriaDTO categoriaDTO);
}