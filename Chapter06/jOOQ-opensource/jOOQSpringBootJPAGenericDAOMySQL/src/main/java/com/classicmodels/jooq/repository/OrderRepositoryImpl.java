package com.classicmodels.jooq.repository;

import java.time.LocalDate;
import java.util.List;
import static jooq.generated.tables.Order.ORDER;
import jooq.generated.tables.pojos.Order;
import jooq.generated.tables.records.OrderRecord;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepositoryImpl
        extends ClassicModelsRepositoryImpl<OrderRecord, Order, Long>
        implements OrderRepository {

    private final DSLContext ctx;

    public OrderRepositoryImpl(DSLContext ctx) {
        super(ORDER, Order.class, ctx);
        this.ctx = ctx;
    }

    @Override
    public List<Order> findOrderDescByDate() {

        List<Order> result = ctx.selectFrom(ORDER)
                .orderBy(ORDER.ORDER_DATE.desc())
                .fetchInto(Order.class);

        return result;
    }

    @Override
    public List<Order> findOrderBetweenDate(LocalDate sd, LocalDate ed) {

        List<Order> result = ctx.selectFrom(ORDER)
                .where(ORDER.ORDER_DATE.between(sd, ed))
                .fetchInto(Order.class);

        return result;

    }
}
