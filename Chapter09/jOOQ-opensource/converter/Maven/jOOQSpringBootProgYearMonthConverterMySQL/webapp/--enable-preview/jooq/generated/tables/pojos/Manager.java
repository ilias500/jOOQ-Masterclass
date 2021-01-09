/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.pojos;


import java.io.Serializable;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.JSON;


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
public class Manager implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long   managerId;
    private String managerName;
    private JSON   managerDetail;
    private String managerEvaluation;

    public Manager() {}

    public Manager(Manager value) {
        this.managerId = value.managerId;
        this.managerName = value.managerName;
        this.managerDetail = value.managerDetail;
        this.managerEvaluation = value.managerEvaluation;
    }

    public Manager(
        Long   managerId,
        String managerName,
        JSON   managerDetail,
        String managerEvaluation
    ) {
        this.managerId = managerId;
        this.managerName = managerName;
        this.managerDetail = managerDetail;
        this.managerEvaluation = managerEvaluation;
    }

    /**
     * Getter for <code>classicmodels.manager.manager_id</code>.
     */
    public Long getManagerId() {
        return this.managerId;
    }

    /**
     * Setter for <code>classicmodels.manager.manager_id</code>.
     */
    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    /**
     * Getter for <code>classicmodels.manager.manager_name</code>.
     */
    @NotNull
    @Size(max = 50)
    public String getManagerName() {
        return this.managerName;
    }

    /**
     * Setter for <code>classicmodels.manager.manager_name</code>.
     */
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    /**
     * Getter for <code>classicmodels.manager.manager_detail</code>.
     */
    public JSON getManagerDetail() {
        return this.managerDetail;
    }

    /**
     * Setter for <code>classicmodels.manager.manager_detail</code>.
     */
    public void setManagerDetail(JSON managerDetail) {
        this.managerDetail = managerDetail;
    }

    /**
     * Getter for <code>classicmodels.manager.manager_evaluation</code>.
     */
    @Size(max = 200)
    public String getManagerEvaluation() {
        return this.managerEvaluation;
    }

    /**
     * Setter for <code>classicmodels.manager.manager_evaluation</code>.
     */
    public void setManagerEvaluation(String managerEvaluation) {
        this.managerEvaluation = managerEvaluation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Manager (");

        sb.append(managerId);
        sb.append(", ").append(managerName);
        sb.append(", ").append(managerDetail);
        sb.append(", ").append(managerEvaluation);

        sb.append(")");
        return sb.toString();
    }
}
