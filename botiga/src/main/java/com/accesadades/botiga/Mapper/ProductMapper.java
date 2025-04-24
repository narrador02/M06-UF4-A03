package com.accesadades.botiga.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.accesadades.botiga.Dto.ProductDTO;
import com.accesadades.botiga.Model.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDTO toDTO(Product product);
    Product toEntity(ProductDTO productDTO);
}