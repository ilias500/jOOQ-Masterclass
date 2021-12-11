package com.classicmodels.jooq.config;

import org.jooq.codegen.GenerationTool;
import org.jooq.meta.jaxb.Configuration;
import org.jooq.meta.jaxb.Database;
import org.jooq.meta.jaxb.Generate;
import org.jooq.meta.jaxb.Generator;
import org.jooq.meta.jaxb.Jdbc;
import org.jooq.meta.jaxb.MatcherRule;
import org.jooq.meta.jaxb.MatcherTransformType;
import org.jooq.meta.jaxb.Matchers;
import org.jooq.meta.jaxb.MatchersTableType;
import org.jooq.meta.jaxb.Strategy;
import org.jooq.meta.jaxb.Target;
import org.jooq.meta.jaxb.Property;

public class JooqConfig {

    public static void main(String[] args) throws Exception {

        Configuration configuration = new Configuration()
                .withGenerator(new Generator()
                        .withDatabase(new Database()
                                .withName("org.jooq.meta.extensions.ddl.DDLDatabase")
                                .withInputSchema("PUBLIC")  
                                .withSchemaVersionProvider("com.classicmodels.jooq.config.MySchemaVersionProvider")
                                .withProperties(
                                        new Property().withKey("scripts").withValue(
                                                System.getProperty("user.dir").endsWith("webapp")
                                                ? "./../../../../../db/migration/ddl/mysql/sql"
                                                : "./../../../../db/migration/ddl/mysql/sql"),
                                        new Property().withKey("sort").withValue("flyway"),
                                        new Property().withKey("unqualifiedSchema").withValue("none"),
                                        new Property().withKey("defaultNameCase").withValue("as_is"))
                                .withExcludes("flyway_schema_history | sequences | customer_pgs"
                                        + " | get_avg_price_by_product_line | get_emps_in_office"
                                        + " | get_product | refresh_top3_product | sale_price"
                                        + " | set_counter | sale_rate | sale_vat"
                                        + " | customer_master | office_master | product_master")
                        )
                        .withGenerate(new Generate()
                                .withDaos(true)
                                .withValidationAnnotations(Boolean.TRUE)
                                .withSpringAnnotations(Boolean.TRUE)
                        )
                        .withStrategy(new Strategy()
                                .withMatchers(new Matchers()
                                        .withTables(new MatchersTableType()
                                                .withPojoClass(new MatcherRule()
                                                        .withExpression("Jooq_$0")
                                                        .withTransform(MatcherTransformType.PASCAL))
                                                .withDaoClass(new MatcherRule()
                                                        .withExpression("$0_Repository")
                                                        .withTransform(MatcherTransformType.PASCAL))))
                        )
                        .withTarget(new Target()
                                .withPackageName("jooq.generated")
                                .withDirectory(System.getProperty("user.dir").endsWith("webapp")
                                        ? "target/generated-sources/jooq"
                                        : "webapp/target/generated-sources/jooq")));

        GenerationTool.generate(configuration);
    }
}
