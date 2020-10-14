package com.classicmodels.service;

import com.classicmodels.model.ProductLine;
import org.springframework.stereotype.Service;
import com.classicmodels.repository.ProductlineRepository;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductLineService {

    private final ProductlineRepository productLineRepository;

    public ProductLineService(ProductlineRepository productLineRepository) {
        this.productLineRepository = productLineRepository;        
    }

    public Iterable<ProductLine> fetchProductLineAndProduct() {
        // Spring Data JDBC always fetches the entire aggregate via N+1 queries
        return productLineRepository.findAll();
    }

    public List<ProductLine> fetchProductLineJooq() {
        // jOOQ fetches only the data from 'productline'
        return productLineRepository.findProductLineJooq();
    }
    
    @Transactional
    public void updateProductLineDescription() {
        
        ProductLine classicCars = productLineRepository.findById("Classic Cars").get();
        classicCars.setTextDescription("Classic cars are so cool!");
        
        productLineRepository.save(classicCars);
    }
        
    public void updateProductLineDescriptionJooq() {
        
        productLineRepository.updateProductLineDescriptionJooq();
    }
}
