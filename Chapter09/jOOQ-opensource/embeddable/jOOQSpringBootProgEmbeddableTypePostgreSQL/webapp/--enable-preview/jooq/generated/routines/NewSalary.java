/*
 * This file is generated by jOOQ.
 */
package jooq.generated.routines;


import javax.annotation.processing.Generated;

import jooq.generated.Public;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


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
public class NewSalary extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>public.new_salary.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>public.new_salary.salary</code>.
     */
    public static final Parameter<Integer> SALARY = Internal.createParameter("salary", SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>public.new_salary.bonus</code>.
     */
    public static final Parameter<Integer> BONUS = Internal.createParameter("bonus", SQLDataType.INTEGER.defaultValue(DSL.field("50", SQLDataType.INTEGER)), true, false);

    /**
     * The parameter <code>public.new_salary.penalty</code>.
     */
    public static final Parameter<Integer> PENALTY = Internal.createParameter("penalty", SQLDataType.INTEGER.defaultValue(DSL.field("0", SQLDataType.INTEGER)), true, false);

    /**
     * Create a new routine call instance
     */
    public NewSalary() {
        super("new_salary", Public.PUBLIC, SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(SALARY);
        addInParameter(BONUS);
        addInParameter(PENALTY);
    }

    /**
     * Set the <code>salary</code> parameter IN value to the routine
     */
    public void setSalary(Integer value) {
        setValue(SALARY, value);
    }

    /**
     * Set the <code>salary</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setSalary(Field<Integer> field) {
        setField(SALARY, field);
    }

    /**
     * Set the <code>bonus</code> parameter IN value to the routine
     */
    public void setBonus(Integer value) {
        setValue(BONUS, value);
    }

    /**
     * Set the <code>bonus</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setBonus(Field<Integer> field) {
        setField(BONUS, field);
    }

    /**
     * Set the <code>penalty</code> parameter IN value to the routine
     */
    public void setPenalty(Integer value) {
        setValue(PENALTY, value);
    }

    /**
     * Set the <code>penalty</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setPenalty(Field<Integer> field) {
        setField(PENALTY, field);
    }
}