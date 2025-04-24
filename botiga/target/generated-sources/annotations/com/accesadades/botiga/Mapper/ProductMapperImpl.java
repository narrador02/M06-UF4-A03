package com.accesadades.botiga.Mapper;

import com.accesadades.botiga.Dto.ProductDTO;
import com.accesadades.botiga.Model.Categoria;
import com.accesadades.botiga.Model.Product;
import com.accesadades.botiga.Model.Subcategoria;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-24T19:07:52+0200",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.42.0.z20250331-1358, environment: Java 21.0.6 (Eclipse Adoptium)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product toEntity(ProductDTO productDTO) {
        if ( productDTO == null ) {
            return null;
        }

        Product product = new Product();

        return product;
    }

    @Override
    public ProductDTO toDTO(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDTO productDTO = new ProductDTO();

        productDTO.setIdCategoria( productCategoriaIdCategoria( product ) );
        productDTO.setIdSubcategoria( productSubcategoriaIdSubcategoria( product ) );

        return productDTO;
    }

    private Long productCategoriaIdCategoria(Product product) {
        Categoria categoria = product.getCategoria();
        if ( categoria == null ) {
            return null;
        }
        return categoria.getIdCategoria();
    }

    private Long productSubcategoriaIdSubcategoria(Product product) {
        Subcategoria subcategoria = product.getSubcategoria();
        if ( subcategoria == null ) {
            return null;
        }
        return subcategoria.getIdSubcategoria();
    }
}
