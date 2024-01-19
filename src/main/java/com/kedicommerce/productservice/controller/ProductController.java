package com.kedicommerce.productservice.controller;

import com.kedicommerce.productservice.dto.ProductRequest;
import com.kedicommerce.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    /**
     * USE th final keyword to make the value assigned at constructor level only
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest){
        //productRequest is a DTO - data transfer object
        productService.createProduct(productRequest);
    }
}
