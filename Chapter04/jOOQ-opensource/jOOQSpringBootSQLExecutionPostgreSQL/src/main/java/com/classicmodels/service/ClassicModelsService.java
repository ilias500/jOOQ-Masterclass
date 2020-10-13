package com.classicmodels.service;

import com.classicmodels.pojo.CustomerAndOrder;
import com.classicmodels.repository.ClassicModelsRepository;
import com.classicmodels.pojo.Manager;
import com.classicmodels.pojo.Order;
import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClassicModelsService {

    private final ClassicModelsRepository classicModelsRepository;

    public ClassicModelsService(ClassicModelsRepository classicModelsRepository) {
        this.classicModelsRepository = classicModelsRepository;
    }

    @Transactional(readOnly = true)
    public Manager fetchManager(Long managerId) {

        return classicModelsRepository.findManager(managerId);
    }

    @Transactional(readOnly = true)
    public List<Order> fetchOrdersByRequiredDate(LocalDate startDate, LocalDate endDate) {

        return classicModelsRepository.findOrdersByRequiredDate(startDate, endDate);
    }

    @Transactional(readOnly = true)
    public List<CustomerAndOrder> fetchCustomersAndOrders() {

        return classicModelsRepository.findCustomersAndOrders();
    }

}
