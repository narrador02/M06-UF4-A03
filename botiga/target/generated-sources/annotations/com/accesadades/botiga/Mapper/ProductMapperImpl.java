package com.accesadades.botiga.Mapper;

import com.accesadades.botiga.Dto.CategoriaDTO;
import com.accesadades.botiga.Dto.ProductDTO;
import com.accesadades.botiga.Dto.SubcategoriaDTO;
import com.accesadades.botiga.Model.Categoria;
import com.accesadades.botiga.Model.Product;
import com.accesadades.botiga.Model.Subcategoria;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-24T14:42:57+0200",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.42.0.z20250331-1358, environment: Java 21.0.6 (Eclipse Adoptium)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDTO toDTO(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDTO productDTO = new ProductDTO();

        productDTO.setCategoria( categoriaToCategoriaDTO( product.getCategoria() ) );
        productDTO.setSubcategoria( subcategoriaToSubcategoriaDTO( product.getSubcategoria() ) );

        return productDTO;
    }

    @Override
    public Product toEntity(ProductDTO productDTO) {
        if ( productDTO == null ) {
            return null;
        }

        Product product = new Product();

        product.setCategoria( categoriaDTOToCategoria( productDTO.getCategoria() ) );
        product.setSubcategoria( subcategoriaDTOToSubcategoria( productDTO.getSubcategoria() ) );

        return product;
    }

    protected CategoriaDTO categoriaToCategoriaDTO(Categoria categoria) {
        if ( categoria == null ) {
            return null;
        }

        CategoriaDTO categoriaDTO = new CategoriaDTO();

        categoriaDTO.setDescCategoria( categoria.getDescCategoria() );
        categoriaDTO.setStatusCategoria( categoria.getStatusCategoria() );

        return categoriaDTO;
    }

    protected SubcategoriaDTO subcategoriaToSubcategoriaDTO(Subcategoria subcategoria) {
        if ( subcategoria == null ) {
            return null;
        }

        SubcategoriaDTO subcategoriaDTO = new SubcategoriaDTO();

        subcategoriaDTO.setDescSubcategoria( subcategoria.getDescSubcategoria() );
        subcategoriaDTO.setStatusSubcategoria( subcategoria.getStatusSubcategoria() );

        return subcategoriaDTO;
    }

    protected Categoria categoriaDTOToCategoria(CategoriaDTO categoriaDTO) {
        if ( categoriaDTO == null ) {
            return null;
        }

        Categoria categoria = new Categoria();

        categoria.setDescCategoria( categoriaDTO.getDescCategoria() );
        categoria.setStatusCategoria( categoriaDTO.getStatusCategoria() );

        return categoria;
    }

    protected Subcategoria subcategoriaDTOToSubcategoria(SubcategoriaDTO subcategoriaDTO) {
        if ( subcategoriaDTO == null ) {
            return null;
        }

        Subcategoria subcategoria = new Subcategoria();

        subcategoria.setDescSubcategoria( subcategoriaDTO.getDescSubcategoria() );
        subcategoria.setStatusSubcategoria( subcategoriaDTO.getStatusSubcategoria() );

        return subcategoria;
    }
}
