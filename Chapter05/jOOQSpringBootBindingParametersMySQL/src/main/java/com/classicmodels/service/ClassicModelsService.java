package com.classicmodels.service;

import com.classicmodels.repository.ClassicModelsRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClassicModelsService {

    private final ClassicModelsRepository classicModelsRepository;

    public ClassicModelsService(ClassicModelsRepository classicModelsRepository) {
        this.classicModelsRepository = classicModelsRepository;
    }

    @Transactional
    public void jooqQuery() {

        classicModelsRepository.extractBindValueNamedParams();
    }

}