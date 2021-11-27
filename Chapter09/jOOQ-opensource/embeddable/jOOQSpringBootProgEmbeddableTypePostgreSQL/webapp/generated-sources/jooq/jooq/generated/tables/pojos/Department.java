/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.pojos;


import java.io.Serializable;
import java.util.Arrays;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


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
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer  departmentId;
    private String   name;
    private String   phone;
    private Short    code;
    private String   officeCode;
    private String[] topic;
    private Object   depNetIpv4;
    private Double   localBudget;
    private Double   profit;
    private Double   forecastProfit;
    private Double   cash;
    private Double   accountsReceivable;
    private Double   inventories;
    private Double   accountsPayable;
    private Double   stBorrowing;
    private Double   accruedLiabilities;

    public Department() {}

    public Department(Department value) {
        this.departmentId = value.departmentId;
        this.name = value.name;
        this.phone = value.phone;
        this.code = value.code;
        this.officeCode = value.officeCode;
        this.topic = value.topic;
        this.depNetIpv4 = value.depNetIpv4;
        this.localBudget = value.localBudget;
        this.profit = value.profit;
        this.forecastProfit = value.forecastProfit;
        this.cash = value.cash;
        this.accountsReceivable = value.accountsReceivable;
        this.inventories = value.inventories;
        this.accountsPayable = value.accountsPayable;
        this.stBorrowing = value.stBorrowing;
        this.accruedLiabilities = value.accruedLiabilities;
    }

    public Department(
        Integer  departmentId,
        String   name,
        String   phone,
        Short    code,
        String   officeCode,
        String[] topic,
        Object   depNetIpv4,
        Double   localBudget,
        Double   profit,
        Double   forecastProfit,
        Double   cash,
        Double   accountsReceivable,
        Double   inventories,
        Double   accountsPayable,
        Double   stBorrowing,
        Double   accruedLiabilities
    ) {
        this.departmentId = departmentId;
        this.name = name;
        this.phone = phone;
        this.code = code;
        this.officeCode = officeCode;
        this.topic = topic;
        this.depNetIpv4 = depNetIpv4;
        this.localBudget = localBudget;
        this.profit = profit;
        this.forecastProfit = forecastProfit;
        this.cash = cash;
        this.accountsReceivable = accountsReceivable;
        this.inventories = inventories;
        this.accountsPayable = accountsPayable;
        this.stBorrowing = stBorrowing;
        this.accruedLiabilities = accruedLiabilities;
    }

    /**
     * Getter for <code>public.department.department_id</code>.
     */
    public Integer getDepartmentId() {
        return this.departmentId;
    }

    /**
     * Setter for <code>public.department.department_id</code>.
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * Getter for <code>public.department.name</code>.
     */
    @NotNull
    @Size(max = 50)
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>public.department.name</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>public.department.phone</code>.
     */
    @NotNull
    @Size(max = 50)
    public String getPhone() {
        return this.phone;
    }

    /**
     * Setter for <code>public.department.phone</code>.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Getter for <code>public.department.code</code>.
     */
    @NotNull
    public Short getCode() {
        return this.code;
    }

    /**
     * Setter for <code>public.department.code</code>.
     */
    public void setCode(Short code) {
        this.code = code;
    }

    /**
     * Getter for <code>public.department.office_code</code>.
     */
    @NotNull
    @Size(max = 10)
    public String getOfficeCode() {
        return this.officeCode;
    }

    /**
     * Setter for <code>public.department.office_code</code>.
     */
    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    /**
     * Getter for <code>public.department.topic</code>.
     */
    public String[] getTopic() {
        return this.topic;
    }

    /**
     * Setter for <code>public.department.topic</code>.
     */
    public void setTopic(String[] topic) {
        this.topic = topic;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getDepNetIpv4() {
        return this.depNetIpv4;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setDepNetIpv4(Object depNetIpv4) {
        this.depNetIpv4 = depNetIpv4;
    }

    /**
     * Getter for <code>public.department.local_budget</code>.
     */
    public Double getLocalBudget() {
        return this.localBudget;
    }

    /**
     * Setter for <code>public.department.local_budget</code>.
     */
    public void setLocalBudget(Double localBudget) {
        this.localBudget = localBudget;
    }

    /**
     * Getter for <code>public.department.profit</code>.
     */
    public Double getProfit() {
        return this.profit;
    }

    /**
     * Setter for <code>public.department.profit</code>.
     */
    public void setProfit(Double profit) {
        this.profit = profit;
    }

    /**
     * Getter for <code>public.department.forecast_profit</code>.
     */
    public Double getForecastProfit() {
        return this.forecastProfit;
    }

    /**
     * Setter for <code>public.department.forecast_profit</code>.
     */
    public void setForecastProfit(Double forecastProfit) {
        this.forecastProfit = forecastProfit;
    }

    /**
     * Getter for <code>public.department.cash</code>.
     */
    public Double getCash() {
        return this.cash;
    }

    /**
     * Setter for <code>public.department.cash</code>.
     */
    public void setCash(Double cash) {
        this.cash = cash;
    }

    /**
     * Getter for <code>public.department.accounts_receivable</code>.
     */
    public Double getAccountsReceivable() {
        return this.accountsReceivable;
    }

    /**
     * Setter for <code>public.department.accounts_receivable</code>.
     */
    public void setAccountsReceivable(Double accountsReceivable) {
        this.accountsReceivable = accountsReceivable;
    }

    /**
     * Getter for <code>public.department.inventories</code>.
     */
    public Double getInventories() {
        return this.inventories;
    }

    /**
     * Setter for <code>public.department.inventories</code>.
     */
    public void setInventories(Double inventories) {
        this.inventories = inventories;
    }

    /**
     * Getter for <code>public.department.accounts_payable</code>.
     */
    public Double getAccountsPayable() {
        return this.accountsPayable;
    }

    /**
     * Setter for <code>public.department.accounts_payable</code>.
     */
    public void setAccountsPayable(Double accountsPayable) {
        this.accountsPayable = accountsPayable;
    }

    /**
     * Getter for <code>public.department.st_borrowing</code>.
     */
    public Double getStBorrowing() {
        return this.stBorrowing;
    }

    /**
     * Setter for <code>public.department.st_borrowing</code>.
     */
    public void setStBorrowing(Double stBorrowing) {
        this.stBorrowing = stBorrowing;
    }

    /**
     * Getter for <code>public.department.accrued_liabilities</code>.
     */
    public Double getAccruedLiabilities() {
        return this.accruedLiabilities;
    }

    /**
     * Setter for <code>public.department.accrued_liabilities</code>.
     */
    public void setAccruedLiabilities(Double accruedLiabilities) {
        this.accruedLiabilities = accruedLiabilities;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Department (");

        sb.append(departmentId);
        sb.append(", ").append(name);
        sb.append(", ").append(phone);
        sb.append(", ").append(code);
        sb.append(", ").append(officeCode);
        sb.append(", ").append(Arrays.toString(topic));
        sb.append(", ").append(depNetIpv4);
        sb.append(", ").append(localBudget);
        sb.append(", ").append(profit);
        sb.append(", ").append(forecastProfit);
        sb.append(", ").append(cash);
        sb.append(", ").append(accountsReceivable);
        sb.append(", ").append(inventories);
        sb.append(", ").append(accountsPayable);
        sb.append(", ").append(stBorrowing);
        sb.append(", ").append(accruedLiabilities);

        sb.append(")");
        return sb.toString();
    }
}
