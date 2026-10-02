package ie.atu.cicd1.catalog.service.cicd1catalogservice.service;


import ie.atu.cicd1.catalog.service.cicd1catalogservice.model.Product;
import ie.atu.cicd1.catalog.service.cicd1catalogservice.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository repository) {
        this.productRepository = repository;
    }



    public List<Product> getAll(){
        return productRepository.findAll();
    }

    public Product create(Product product){
        product.setId(null);
        //null for now. We use DTO's next week so this will disappear naturally

        return productRepository.save(product);
    }
}
