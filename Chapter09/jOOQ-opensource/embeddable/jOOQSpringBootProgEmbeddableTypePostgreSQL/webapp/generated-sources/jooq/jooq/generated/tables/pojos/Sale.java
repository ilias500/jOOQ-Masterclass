/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.pojos;


import java.io.Serializable;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import jooq.generated.enums.RateType;
import jooq.generated.enums.VatType;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.14.4",
        "schema version:1.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sale implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long     saleId;
    private Integer  fiscalYear;
    private Double   sale;
    private Long     employeeNumber;
    private Boolean  hot;
    private RateType rate;
    private VatType  vat;
    private Integer  fiscalMonth;
    private Double   revenueGrowth;
    private String   trend;

    public Sale() {}

    public Sale(Sale value) {
        this.saleId = value.saleId;
        this.fiscalYear = value.fiscalYear;
        this.sale = value.sale;
        this.employeeNumber = value.employeeNumber;
        this.hot = value.hot;
        this.rate = value.rate;
        this.vat = value.vat;
        this.fiscalMonth = value.fiscalMonth;
        this.revenueGrowth = value.revenueGrowth;
        this.trend = value.trend;
    }

    public Sale(
        Long     saleId,
        Integer  fiscalYear,
        Double   sale,
        Long     employeeNumber,
        Boolean  hot,
        RateType rate,
        VatType  vat,
        Integer  fiscalMonth,
        Double   revenueGrowth,
        String   trend
    ) {
        this.saleId = saleId;
        this.fiscalYear = fiscalYear;
        this.sale = sale;
        this.employeeNumber = employeeNumber;
        this.hot = hot;
        this.rate = rate;
        this.vat = vat;
        this.fiscalMonth = fiscalMonth;
        this.revenueGrowth = revenueGrowth;
        this.trend = trend;
    }

    /**
     * Getter for <code>public.sale.sale_id</code>.
     */
    public Long getSaleId() {
        return this.saleId;
    }

    /**
     * Setter for <code>public.sale.sale_id</code>.
     */
    public void setSaleId(Long saleId) {
        this.saleId = saleId;
    }

    /**
     * Getter for <code>public.sale.fiscal_year</code>.
     */
    @NotNull
    public Integer getFiscalYear() {
        return this.fiscalYear;
    }

    /**
     * Setter for <code>public.sale.fiscal_year</code>.
     */
    public void setFiscalYear(Integer fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    /**
     * Getter for <code>public.sale.sale</code>.
     */
    @NotNull
    public Double getSale() {
        return this.sale;
    }

    /**
     * Setter for <code>public.sale.sale</code>.
     */
    public void setSale(Double sale) {
        this.sale = sale;
    }

    /**
     * Getter for <code>public.sale.employee_number</code>.
     */
    public Long getEmployeeNumber() {
        return this.employeeNumber;
    }

    /**
     * Setter for <code>public.sale.employee_number</code>.
     */
    public void setEmployeeNumber(Long employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    /**
     * Getter for <code>public.sale.hot</code>.
     */
    public Boolean getHot() {
        return this.hot;
    }

    /**
     * Setter for <code>public.sale.hot</code>.
     */
    public void setHot(Boolean hot) {
        this.hot = hot;
    }

    /**
     * Getter for <code>public.sale.rate</code>.
     */
    public RateType getRate() {
        return this.rate;
    }

    /**
     * Setter for <code>public.sale.rate</code>.
     */
    public void setRate(RateType rate) {
        this.rate = rate;
    }

    /**
     * Getter for <code>public.sale.vat</code>.
     */
    public VatType getVat() {
        return this.vat;
    }

    /**
     * Setter for <code>public.sale.vat</code>.
     */
    public void setVat(VatType vat) {
        this.vat = vat;
    }

    /**
     * Getter for <code>public.sale.fiscal_month</code>.
     */
    @NotNull
    public Integer getFiscalMonth() {
        return this.fiscalMonth;
    }

    /**
     * Setter for <code>public.sale.fiscal_month</code>.
     */
    public void setFiscalMonth(Integer fiscalMonth) {
        this.fiscalMonth = fiscalMonth;
    }

    /**
     * Getter for <code>public.sale.revenue_growth</code>.
     */
    @NotNull
    public Double getRevenueGrowth() {
        return this.revenueGrowth;
    }

    /**
     * Setter for <code>public.sale.revenue_growth</code>.
     */
    public void setRevenueGrowth(Double revenueGrowth) {
        this.revenueGrowth = revenueGrowth;
    }

    /**
     * Getter for <code>public.sale.trend</code>.
     */
    @Size(max = 10)
    public String getTrend() {
        return this.trend;
    }

    /**
     * Setter for <code>public.sale.trend</code>.
     */
    public void setTrend(String trend) {
        this.trend = trend;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Sale (");

        sb.append(saleId);
        sb.append(", ").append(fiscalYear);
        sb.append(", ").append(sale);
        sb.append(", ").append(employeeNumber);
        sb.append(", ").append(hot);
        sb.append(", ").append(rate);
        sb.append(", ").append(vat);
        sb.append(", ").append(fiscalMonth);
        sb.append(", ").append(revenueGrowth);
        sb.append(", ").append(trend);

        sb.append(")");
        return sb.toString();
    }
}
