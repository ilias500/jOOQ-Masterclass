package com.classicmodels.repository;

import java.math.BigInteger;
import java.util.List;
import static jooq.generated.tables.Sale.SALE;
import jooq.generated.tables.pojos.Sale;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

@Repository
public class SaleRepositoryImpl implements SaleRepository {

    private final DSLContext ctx;

    public SaleRepositoryImpl(DSLContext ctx) {
        this.ctx = ctx;
    }

    @Override
    public List<Sale> findSaleByFiscalYear(int year) {

        return ctx.selectFrom(SALE)
                .where(SALE.FISCAL_YEAR.eq(BigInteger.valueOf(year)))
                .fetchInto(Sale.class);
    }

    @Override
    public List<Sale> findSaleAscGtLimit(int limit) {

        return ctx.selectFrom(SALE)
                .where(SALE.SALE_.ge(Double.valueOf(limit)))
                .orderBy(SALE.SALE_)
                .fetchInto(Sale.class);
    }

    @Override
    public List<Sale> fetchAll() {

        return ctx.selectFrom(SALE)
                .fetchInto(Sale.class);
    }

    @Override
    public void deleteById(Long id) {

        ctx.deleteFrom(SALE)
                .where(SALE.SALE_ID.eq(BigInteger.valueOf(id)))
                .execute();
    }
}
