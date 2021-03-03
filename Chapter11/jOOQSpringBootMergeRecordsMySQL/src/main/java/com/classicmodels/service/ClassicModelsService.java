package com.classicmodels.service;

import com.classicmodels.repository.ClassicModelsRepository;
import jooq.generated.tables.records.PaymentRecord;
import org.jooq.Result;
import org.springframework.stereotype.Service;

@Service
public class ClassicModelsService {

    private final ClassicModelsRepository classicModelsRepository;

    public ClassicModelsService(ClassicModelsRepository classicModelsRepository) {
        this.classicModelsRepository = classicModelsRepository;
    }

    public Result<PaymentRecord> fetchAllPayment103() {

        return classicModelsRepository.fetchAllPayment103();
    }

    public int mergePayment(PaymentRecord pr) {

        return classicModelsRepository.mergePayment(pr);
    }
}
