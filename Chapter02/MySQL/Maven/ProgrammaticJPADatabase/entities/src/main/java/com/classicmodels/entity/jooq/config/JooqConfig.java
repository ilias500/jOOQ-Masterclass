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
                .withJdbc(new Jdbc()
                        .withDriver("org.h2.Driver")
                        .withUrl("jdbc:h2:~/classicmodels"))
                .withGenerator(new Generator()
                        .withDatabase(new Database()
                                .withName("org.jooq.meta.extensions.jpa.JPADatabase")                                
                                .withSchemaVersionProvider("com.classicmodels.jooq.config.MySchemaVersionProvider")
                                .withProperties(
                                        new Property().withKey("hibernate.physical_naming_strategy").withValue("org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy"),
                                        new Property().withKey("packages").withValue("com.classicmodels.entity"),
                                        new Property().withKey("useAttributeConverters").withValue("true"),
                                        new Property().withKey("unqualifiedSchema").withValue("none"))                                
                        )
                        .withGenerate(new Generate()
                                .withInterfaces(true)
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
                                        ? "target/generated-sources"
                                        : "webapp/target/generated-sources")));

        GenerationTool.generate(configuration);
    }
}