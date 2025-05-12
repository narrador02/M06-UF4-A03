package com.accesadades.botiga.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import com.accesadades.botiga.Dto.ProductDTO;
import com.accesadades.botiga.Model.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mappings({
        @Mapping(source = "nom", target = "name"),
        @Mapping(source = "preu", target = "price"),
        @Mapping(source = "descripcio", target = "description"),
        @Mapping(source = "company", target = "company"),
        @Mapping(source = "units", target = "units"),
        @Mapping(target = "categoria.idCategoria", source = "idCategoria"),
        @Mapping(target = "subcategoria.idSubcategoria", source = "idSubcategoria")
    })
    Product toEntity(ProductDTO dto);

    @Mappings({
        @Mapping(source = "name", target = "nom"),
        @Mapping(source = "price", target = "preu"),
        @Mapping(source = "description", target = "descripcio"),
        @Mapping(source = "company", target = "company"),
        @Mapping(source = "units", target = "units"),
        @Mapping(source = "categoria.idCategoria", target = "idCategoria"),
        @Mapping(source = "subcategoria.idSubcategoria", target = "idSubcategoria")
    })
    ProductDTO toDTO(Product product);
}
