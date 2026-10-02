package ie.atu.cicd1.catalog.service.cicd1catalogservice.controller;

import ie.atu.cicd1.catalog.service.cicd1catalogservice.model.Product;
import ie.atu.cicd1.catalog.service.cicd1catalogservice.service.ProductService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    public List<Product> getProduct(){
        return productService.getAll();
    }

    @GetMapping
    public List<Product> getProducts(){
        return productService.getAll();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.create(product);
    }
}
