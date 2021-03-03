package com.classicmodels.controller;

import com.classicmodels.service.ClassicModelsService;
import jooq.generated.tables.pojos.Payment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClassicModelsController {

    protected static final String ALL_PAYMENT_ATTR = "all";
    protected static final String PAYMENT_ATTR = "payment";

    private final ClassicModelsService classicModelsService;

    public ClassicModelsController(ClassicModelsService classicModelsService) {
        this.classicModelsService = classicModelsService;
    }

    // load all payments for customer 103
    @GetMapping("/all")
    public String fetchAllPayment(Model model) {

        model.addAttribute(ALL_PAYMENT_ATTR,
                classicModelsService.fetchAllPayment103());
        model.addAttribute(PAYMENT_ATTR,
                new Payment(103L, null, null, null, null));

        return "payments";
    }

    @PostMapping("/merge")
    public String mergePayment(Payment p) {

        classicModelsService.mergePayment(p);

        return "redirect:all";
    }

    @GetMapping(value = "/")
    public String indexPage() {

        return "index";
    }

    @InitBinder
    void allowFields(WebDataBinder webDataBinder) {
        webDataBinder.setAllowedFields("checkNumber", "customerNumber",
                "invoiceAmount", "${_csrf.parameterName}");
    }
}
