/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.pojos;


import java.io.Serializable;

import javax.annotation.processing.Generated;


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
public class Svals implements Serializable {

    private static final long serialVersionUID = 1L;

    private String svals;

    public Svals() {}

    public Svals(Svals value) {
        this.svals = value.svals;
    }

    public Svals(
        String svals
    ) {
        this.svals = svals;
    }

    /**
     * Getter for <code>public.svals.svals</code>.
     */
    public String getSvals() {
        return this.svals;
    }

    /**
     * Setter for <code>public.svals.svals</code>.
     */
    public void setSvals(String svals) {
        this.svals = svals;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Svals (");

        sb.append(svals);

        sb.append(")");
        return sb.toString();
    }
}