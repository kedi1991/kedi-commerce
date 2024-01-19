package com.kedicommerce.productservice.service;

import com.kedicommerce.productservice.dto.ProductRequest;
import com.kedicommerce.productservice.model.Product;
import com.kedicommerce.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor //creates constructor to initialise objects like the product repo below
public class ProductService {

    private final ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest){
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        /**
         *   now save in the database
         */
        productRepository.save(product);
    }
}
