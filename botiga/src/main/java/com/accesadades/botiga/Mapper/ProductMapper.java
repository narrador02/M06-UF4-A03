package com.accesadades.botiga.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import com.accesadades.botiga.Dto.ProductDTO;
import com.accesadades.botiga.Model.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mappings({
        @Mapping(target = "categoria", ignore = true),
        @Mapping(target = "subcategoria", ignore = true),
        @Mapping(target = "creationDate", ignore = true),
        @Mapping(target = "updateDate", ignore = true)
    })
    Product toEntity(ProductDTO productDTO);

    @Mappings({
        @Mapping(target = "idCategoria", source = "categoria.idCategoria"),
        @Mapping(target = "idSubcategoria", source = "subcategoria.idSubcategoria")
    })
    ProductDTO toDTO(Product product);
}
