/* START */

/* [jooq ignore start] */

BEGIN
   EXECUTE IMMEDIATE 'DROP TABLE "PAYMENT" CASCADE CONSTRAINTS';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP TABLE "BANK_TRANSACTION" CASCADE CONSTRAINTS';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP TABLE "ORDERDETAIL" CASCADE CONSTRAINTS';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP TABLE "ORDER" CASCADE CONSTRAINTS';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP TABLE "PRODUCT" CASCADE CONSTRAINTS';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP TABLE "PRODUCTLINE" CASCADE CONSTRAINTS';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP TABLE "TOP3PRODUCT" CASCADE CONSTRAINTS';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP TABLE "PRODUCTLINEDETAIL" CASCADE CONSTRAINTS';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP TABLE "OFFICE_HAS_MANAGER" CASCADE CONSTRAINTS';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP TABLE "MANAGER" CASCADE CONSTRAINTS';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP TABLE "CUSTOMER" CASCADE CONSTRAINTS';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP TABLE "CUSTOMERDETAIL" CASCADE CONSTRAINTS';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP TABLE "TOKEN" CASCADE CONSTRAINTS';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP TABLE "SALE" CASCADE CONSTRAINTS';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP TABLE "DAILY_ACTIVITY" CASCADE CONSTRAINTS';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP TABLE "EMPLOYEE" CASCADE CONSTRAINTS';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP TABLE "EMPLOYEE_STATUS" CASCADE CONSTRAINTS';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP TABLE "DEPARTMENT" CASCADE CONSTRAINTS';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP TABLE "OFFICE" CASCADE CONSTRAINTS';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP TABLE "OFFICE_FLIGHTS" CASCADE CONSTRAINTS';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
COMMIT;

BEGIN
   EXECUTE IMMEDIATE 'DROP SEQUENCE "EMPLOYEE_SEQ"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP SEQUENCE "SALE_SEQ"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP SEQUENCE "TOKEN_SEQ"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP SEQUENCE "CUSTOMER_SEQ"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP SEQUENCE "MANAGER_SEQ"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP SEQUENCE "PRODUCT_SEQ"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP SEQUENCE "PRODUCT_UID_SEQ"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP SEQUENCE "ORDER_SEQ"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
COMMIT;

BEGIN
   EXECUTE IMMEDIATE 'DROP TYPE "EMPLOYEE_OF_YEAR_ARR"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP TYPE "MONTHLY_BONUS_ARR"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP TYPE "TOPIC_ARR"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP TYPE "EVALUATION_CRITERIA"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP TYPE "SALARY_ARR"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP TYPE "SECOND_MAX_IMPL"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP TYPE "TABLE_POPL"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP TYPE "TABLE_POPL_OBJ"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP TYPE "TABLE_RES"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP TYPE "TABLE_RES_OBJ"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
COMMIT;

BEGIN
   EXECUTE IMMEDIATE 'DROP PACKAGE "DEPARTMENT_PKG"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
COMMIT;

BEGIN
   EXECUTE IMMEDIATE 'DROP FUNCTION "GET_SALARY_STAT"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP FUNCTION "GET_TOTAL_SALES"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP FUNCTION "PRODUCT_OF_PRODUCT_LINE"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP FUNCTION "SWAP"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP FUNCTION "TOP_THREE_SALES_PER_EMPLOYEE"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP FUNCTION "CARD_COMMISSION"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP FUNCTION "GET_CUSTOMER"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP FUNCTION "SALE_PRICE"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP FUNCTION "SECOND_MAX"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP PROCEDURE "SET_COUNTER"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP PROCEDURE "REFRESH_TOP3_PRODUCT"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP PROCEDURE "GET_AVG_PRICE_BY_PRODUCT_LINE"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP PROCEDURE "GET_EMPS_IN_OFFICE"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP PROCEDURE "GET_PRODUCT"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
COMMIT;

BEGIN
   EXECUTE IMMEDIATE 'DROP VIEW "CUSTOMER_MASTER"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP VIEW "OFFICE_MASTER"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'DROP VIEW "PRODUCT_MASTER"';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
COMMIT;

/* Type used in collect() */

BEGIN
   EXECUTE IMMEDIATE 'CREATE TYPE "SALARY_ARR" AS TABLE OF NUMBER(7);';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/

/* [jooq ignore stop] */

-- TABLE OFFICE

CREATE TABLE office (
  office_code         VARCHAR2(10) NOT NULL,
  city                VARCHAR2(50) DEFAULT NULL,
  phone               VARCHAR2(50) NOT NULL,
  address_line_first  VARCHAR2(50) NOT NULL,
  address_line_second VARCHAR2(50) DEFAULT NULL,
  state               VARCHAR2(50) DEFAULT NULL,
  country             VARCHAR2(50) DEFAULT NULL,
  postal_code         VARCHAR2(15) NOT NULL,
  territory           VARCHAR2(10) NOT NULL,
  /* [jooq ignore start] */
  location            SDO_GEOMETRY DEFAULT NULL,
  /* [jooq ignore stop] */
  internal_budget     NUMBER(7)    NOT NULL,
  CONSTRAINT office_pk PRIMARY KEY (office_code),
  CONSTRAINT office_postal_code_uk UNIQUE (postal_code)
);

-- TABLE EMPLOYEE

/* [jooq ignore start] */
BEGIN
   EXECUTE IMMEDIATE 'CREATE TYPE "EMPLOYEE_OF_YEAR_ARR" AS VARRAY(100) OF INT;';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
BEGIN
   EXECUTE IMMEDIATE 'CREATE TYPE "MONTHLY_BONUS_ARR" AS VARRAY(100) OF INT;';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
/* [jooq ignore stop] */

-- this sequence is not used automatically
CREATE SEQUENCE employee_seq START WITH 100000 INCREMENT BY 10 MINVALUE 100000 MAXVALUE 10000000000;

CREATE TABLE employee (
  employee_number  NUMBER(10)           NOT NULL,
  last_name        VARCHAR2(50)         NOT NULL,
  first_name       VARCHAR2(50)         NOT NULL,
  extension        VARCHAR2(10)         NOT NULL,
  email            VARCHAR2(100)        NOT NULL,
  office_code      VARCHAR2(10)         NOT NULL,
  salary           NUMBER(7)            NOT NULL,
  commission       NUMBER(7)            DEFAULT NULL,
  reports_to       NUMBER(10)           DEFAULT NULL,
  job_title        VARCHAR2(50)         NOT NULL,
  /* [jooq ignore start] */
  employee_of_year EMPLOYEE_OF_YEAR_ARR DEFAULT NULL,
  monthly_bonus    MONTHLY_BONUS_ARR    DEFAULT NULL,
  /* [jooq ignore stop] */
  CONSTRAINT employee_pk PRIMARY KEY (employee_number),
  CONSTRAINT employee_employee_fk FOREIGN KEY (reports_to) REFERENCES employee (employee_number),
  CONSTRAINT employee_office_fk FOREIGN KEY (office_code) REFERENCES office (office_code)
);

-- TABLE EMPLOYEE_STATUS

CREATE TABLE employee_status (
  id              NUMBER(10)   GENERATED BY DEFAULT ON NULL AS IDENTITY,
  employee_number NUMBER(10)   NOT NULL,  
  status          VARCHAR2(50) NOT NULL,  
  acquired_date   DATE         NOT NULL,
  CONSTRAINT id_pk PRIMARY KEY (id),  
  CONSTRAINT employee_status_employee_fk FOREIGN KEY (employee_number) REFERENCES employee (employee_number)
);

-- TABLE SALE

CREATE SEQUENCE sale_seq START WITH 1000000 INCREMENT BY 1;

CREATE TABLE sale (
  sale_id         NUMBER(10)   DEFAULT sale_seq.nextval NOT NULL, 
  fiscal_year     NUMBER(5)    NOT NULL, 
  sale            FLOAT        NOT NULL,    
  employee_number NUMBER(10)   DEFAULT NULL,  
  hot             CHAR(1)      DEFAULT '1' CHECK (hot IN('1', '0')), -- or, 'Y'/'N'
  rate            VARCHAR2(10) DEFAULT NULL CHECK (rate IN('SILVER', 'GOLD', 'PLATINUM')),
  vat             VARCHAR2(10) DEFAULT NULL CHECK (vat IN('NONE', 'MIN', 'MAX')),
  fiscal_month    NUMBER(5)    NOT NULL,
  revenue_growth  FLOAT        NOT NULL,
  trend           VARCHAR2(10) DEFAULT NULL,  
  CONSTRAINT sale_pk PRIMARY KEY (sale_id),  
  CONSTRAINT sale_employee_fk FOREIGN KEY (employee_number) REFERENCES employee (employee_number)
);

-- or,use a trigger for the sequence
/*
CREATE OR REPLACE TRIGGER sale_seq_tr
 BEFORE INSERT ON sale FOR EACH ROW
 WHEN (NEW.sale_id IS NULL)
BEGIN
 SELECT sale_seq.NEXTVAL INTO :NEW.sale_id FROM DUAL;
END;
/
*/

-- TABLE DAILY_ACTIVITY

CREATE TABLE daily_activity (
  day_id     NUMBER(10) GENERATED BY DEFAULT ON NULL AS IDENTITY,
  day_date   DATE       NOT NULL,
  sales      FLOAT      NOT NULL,  
  visitors   FLOAT      NOT NULL,    
  conversion FLOAT      NOT NULL,
  CONSTRAINT daily_activity_pk PRIMARY KEY (day_id)
);

-- TABLE TOKEN

CREATE SEQUENCE token_seq START WITH 1000000 INCREMENT BY 1;

CREATE TABLE token (
  token_id   NUMBER(10) DEFAULT token_seq.nextval NOT NULL,
  sale_id    NUMBER(10) NOT NULL,
  amount     FLOAT      NOT NULL,    
  updated_on TIMESTAMP  DEFAULT CURRENT_TIMESTAMP,
  CONSTRAINT token_pk PRIMARY KEY (token_id),  
  CONSTRAINT token_sale_fk FOREIGN KEY (sale_id) REFERENCES sale (sale_id) ON DELETE CASCADE
);

-- or,use a trigger for the sequence
/*
CREATE OR REPLACE TRIGGER token_seq_tr
 BEFORE INSERT ON token FOR EACH ROW
 WHEN (NEW.token_id IS NULL)
BEGIN
 SELECT token_seq.NEXTVAL INTO :NEW.token_id FROM DUAL;
END;
/
*/

-- TABLE CUSTOMER

CREATE SEQUENCE customer_seq START WITH 1000000 INCREMENT BY 1;

CREATE TABLE customer (
  customer_number           NUMBER(10)   DEFAULT customer_seq.nextval NOT NULL,
  customer_name             VARCHAR2(50) NOT NULL,
  contact_last_name         VARCHAR2(50) NOT NULL,
  contact_first_name        VARCHAR2(50) NOT NULL,
  phone                     VARCHAR2(50) NOT NULL,
  sales_rep_employee_number NUMBER(10)   DEFAULT NULL,
  credit_limit              NUMBER(10,2) DEFAULT NULL,
  first_buy_date            NUMBER(5)    DEFAULT NULL,
  CONSTRAINT customer_pk PRIMARY KEY (customer_number),
  CONSTRAINT customer_name_uk UNIQUE (customer_name),
  CONSTRAINT customer_employee_fk FOREIGN KEY (sales_rep_employee_number) REFERENCES employee (employee_number)
);

-- or,use a trigger for the sequence
/*
CREATE OR REPLACE TRIGGER customer_seq_tr
 BEFORE INSERT ON customer FOR EACH ROW
 WHEN (NEW.customer_number IS NULL)
BEGIN
 SELECT customer_seq.NEXTVAL INTO :NEW.customer_number FROM DUAL;
END;
/
*/

-- TABLE CUSTOMERDETAIL

CREATE TABLE customerdetail (
  customer_number     NUMBER(10)   NOT NULL,
  address_line_first  VARCHAR2(50) NOT NULL,
  address_line_second VARCHAR2(50) DEFAULT NULL,
  city                VARCHAR2(50) DEFAULT NULL,
  state               VARCHAR2(50) DEFAULT NULL,
  postal_code         VARCHAR2(15) DEFAULT NULL,
  country             VARCHAR2(50) DEFAULT NULL,
  CONSTRAINT customerdetail_pk PRIMARY KEY (customer_number),
  CONSTRAINT customerdetail_address_line_first_uk UNIQUE (address_line_first),
  CONSTRAINT customerdetail_customer_fk FOREIGN KEY (customer_number) REFERENCES customer (customer_number)
) ; 

-- TABLE DEPARTMENT

/* [jooq ignore start] */
BEGIN
   EXECUTE IMMEDIATE 'CREATE TYPE "TOPIC_ARR" AS VARRAY(100) OF VARCHAR2(100 CHAR);';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
/* [jooq ignore stop] */

CREATE TABLE department (
  department_id       NUMBER(10)  GENERATED BY DEFAULT ON NULL AS IDENTITY,
  name                VARCHAR(50) NOT NULL,
  phone               VARCHAR(50) NOT NULL,
  code                NUMBER(7)   DEFAULT 1,
  office_code         VARCHAR(10) NOT NULL,
  /* [jooq ignore start] */
  topic               TOPIC_ARR   DEFAULT NULL,  
  /* [jooq ignore stop] */
  dep_net_ipv4        VARCHAR(16) DEFAULT NULL,
  local_budget        FLOAT       DEFAULT NULL,
  profit              FLOAT       DEFAULT NULL,
  forecast_profit     FLOAT       DEFAULT NULL,
  cash                FLOAT       DEFAULT NULL,
  accounts_receivable FLOAT       DEFAULT NULL,
  inventories         FLOAT       DEFAULT NULL,
  accounts_payable    FLOAT       DEFAULT NULL,
  st_borrowing        FLOAT       DEFAULT NULL,
  accrued_liabilities FLOAT       DEFAULT NULL,
  CONSTRAINT department_pk PRIMARY KEY (department_id),
  CONSTRAINT department_code_uk UNIQUE (code),
  CONSTRAINT department_office_fk FOREIGN KEY (office_code) REFERENCES office (office_code)
);

-- TABLE MANAGER

/* [jooq ignore start] */
BEGIN
   EXECUTE IMMEDIATE
     'CREATE OR REPLACE TYPE "EVALUATION_CRITERIA" AS OBJECT (
        "communication_ability" NUMBER(7), 
        "ethics" NUMBER(7), 
        "performance" NUMBER(7), 
        "employee_input" NUMBER(7),
   
        MEMBER FUNCTION "IMPROVE"("k" NUMBER) RETURN "EVALUATION_CRITERIA",
        MAP MEMBER FUNCTION "SCORE" RETURN NUMBER
     );';
   EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
COMMIT;

BEGIN
   EXECUTE IMMEDIATE '
     CREATE OR REPLACE TYPE BODY "EVALUATION_CRITERIA" AS 
       MEMBER FUNCTION "IMPROVE"("k" NUMBER) RETURN "EVALUATION_CRITERIA" IS 
         BEGIN 
           RETURN "EVALUATION_CRITERIA"(self."communication_ability" + "k", 
	              self."ethics" + "k", self."performance" + "k", self."employee_input"); 
         END "IMPROVE";     
       MAP MEMBER FUNCTION "SCORE" RETURN NUMBER IS 
         BEGIN 
           RETURN (SQRT("communication_ability" * "employee_input" - "ethics" * "performance")); 
         END "SCORE";    
     END;';
   EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
COMMIT;
/* [jooq ignore stop] */

CREATE SEQUENCE manager_seq START WITH 1000000 INCREMENT BY 1;

CREATE TABLE manager (
  manager_id         NUMBER(10)          DEFAULT manager_seq.nextval NOT NULL,
  manager_name       VARCHAR2(50)        DEFAULT '"anonymous"' NOT NULL,
  manager_detail     VARCHAR2(4000)      DEFAULT NULL, -- for large JSON use blob
  /* [jooq ignore start] */
  manager_evaluation EVALUATION_CRITERIA DEFAULT NULL, 
  /* [jooq ignore stop] */
  CONSTRAINT manager_pk PRIMARY KEY (manager_id),
  CONSTRAINT ENSURE_JSON CHECK (manager_detail IS JSON)
);

-- or,use a trigger for the sequence
/*
CREATE OR REPLACE TRIGGER manager_seq_tr
 BEFORE INSERT ON manager FOR EACH ROW
 WHEN (NEW.manager_id IS NULL)
BEGIN
 SELECT manager_seq.NEXTVAL INTO :NEW.manager_id FROM DUAL;
END;
/
*/

-- TABLE OFFICE_HAS_MANAGER

CREATE TABLE office_has_manager (
  offices_office_code VARCHAR2(10) NOT NULL,
  managers_manager_id NUMBER(10)   NOT NULL,
  CONSTRAINT office_manager_uk UNIQUE (offices_office_code, managers_manager_id),
  CONSTRAINT office_fk FOREIGN KEY (offices_office_code) REFERENCES office (office_code),
  CONSTRAINT manager_fk FOREIGN KEY (managers_manager_id) REFERENCES manager (manager_id)  
);

-- TABLE PRODUCTLINE

CREATE TABLE productline (
  product_line     VARCHAR2(50)   NOT NULL,
  code             NUMBER(10)     NOT NULL,
  text_description VARCHAR2(4000) DEFAULT NULL,
  /* [jooq ignore start] */
  html_description XMLTYPE        DEFAULT NULL,
  /* [jooq ignore stop] */
  image            BLOB           DEFAULT NULL,
  created_on       DATE           DEFAULT SYSDATE NOT NULL,
  CONSTRAINT productline_pk PRIMARY KEY (product_line, code),
  CONSTRAINT productline_uk UNIQUE(product_line)
);

-- TABLE PRODUCTLINEDETAIL

CREATE TABLE productlinedetail (
  product_line  VARCHAR2(50) NOT NULL,
  code          NUMBER(10)   NOT NULL,
  line_capacity VARCHAR2(20) NOT NULL,
  line_type     NUMBER(7)    DEFAULT 0,
  CONSTRAINT productlinedetail_pk PRIMARY KEY (product_line,code),  
  CONSTRAINT productlinedetail_uk UNIQUE(product_line),
  CONSTRAINT productlinedetail_productline_fk FOREIGN KEY (product_line,code) REFERENCES productline (product_line,code)
);

-- TABLE PRODUCT

CREATE SEQUENCE product_seq START WITH 1000000 INCREMENT BY 1;

-- Generate an IDENTITY, non-primary key
CREATE SEQUENCE product_uid_seq START WITH 10 INCREMENT BY 10;

CREATE TABLE product (
  product_id          NUMBER(10)   DEFAULT product_seq.nextval NOT NULL,
  product_name        VARCHAR2(70) DEFAULT NULL,
  product_line        VARCHAR2(50) DEFAULT NULL,
  code                NUMBER(10)   NOT NULL,
  product_scale       VARCHAR2(10) DEFAULT NULL,
  product_vendor      VARCHAR2(50) DEFAULT NULL,
  product_description CLOB         DEFAULT NULL,
  quantity_in_stock   NUMBER(7)    DEFAULT 0,
  buy_price           NUMBER(10,2) DEFAULT 0.0 NOT NULL,
  msrp                NUMBER(10,2) DEFAULT 0.0 NOT NULL,
  specs               CLOB         DEFAULT NULL,
  product_uid         NUMBER(10)   DEFAULT product_uid_seq.nextval NOT NULL,
  CONSTRAINT product_pk PRIMARY KEY (product_id),
  CONSTRAINT product_productline_fk FOREIGN KEY (product_line, code) REFERENCES productline (product_line, code)
);

-- or,use a trigger for the sequence
/*
CREATE OR REPLACE TRIGGER product_seq_tr
 BEFORE INSERT ON product FOR EACH ROW
 WHEN (NEW.product_id IS NULL)
BEGIN
 SELECT product_seq.NEXTVAL INTO :NEW.product_id FROM DUAL;
END;
/

CREATE OR REPLACE TRIGGER product_uid_seq_tr
 BEFORE INSERT ON product FOR EACH ROW
 WHEN (NEW.product_uid IS NULL)
BEGIN
 SELECT product_uid_seq.NEXTVAL INTO :NEW.product_uid FROM DUAL;
END;
/
*/

-- TABLE ORDER

CREATE SEQUENCE order_seq START WITH 1000000 INCREMENT BY 1;

CREATE TABLE "ORDER" (
  order_id        NUMBER(10)   DEFAULT order_seq.nextval NOT NULL,
  order_date      DATE         NOT NULL,
  required_date   DATE         NOT NULL,
  shipped_date    DATE         DEFAULT NULL,
  status          VARCHAR2(15) NOT NULL,
  comments        CLOB         DEFAULT NULL,
  customer_number NUMBER(10)   NOT NULL,
  amount          NUMBER(10,2) NOT NULL,
  CONSTRAINT order_pk PRIMARY KEY (order_id),
  CONSTRAINT order_customer_fk FOREIGN KEY (customer_number) REFERENCES customer (customer_number)
);

-- or,use a trigger for the sequence
/*
CREATE OR REPLACE TRIGGER order_seq_tr
 BEFORE INSERT ON "ORDER" FOR EACH ROW
 WHEN (NEW.order_id IS NULL)
BEGIN
 SELECT order_seq.NEXTVAL INTO :NEW.order_id FROM DUAL;
END;
/
*/

-- TABLE ORDERDETAIL

CREATE TABLE orderdetail (
  orderdetail_id    NUMBER(10)   GENERATED BY DEFAULT ON NULL AS IDENTITY,
  order_id          NUMBER(10)   NOT NULL,
  product_id        NUMBER(10)   NOT NULL,
  quantity_ordered  NUMBER(7)    NOT NULL,
  price_each        NUMBER(10,2) NOT NULL,
  order_line_number NUMBER(7)    NOT NULL,
  CONSTRAINT orderdetail_pk PRIMARY KEY (orderdetail_id),
  CONSTRAINT orderdetail_uk UNIQUE (order_id, product_id),
  CONSTRAINT orderdetail_order_fk FOREIGN KEY (order_id) REFERENCES "ORDER" (order_id),
  CONSTRAINT orderdetail_product__fk FOREIGN KEY (product_id) REFERENCES product (product_id)
);

-- TABLE TOP3PRODUCT

CREATE TABLE top3product (  
  product_id   NUMBER(10)   NOT NULL,
  product_name VARCHAR2(70) DEFAULT NULL,  
  CONSTRAINT top3product_pk PRIMARY KEY (product_id),  
  CONSTRAINT top3product_product_fk FOREIGN KEY (product_id) REFERENCES product (product_id)
);

-- TABLE PAYMENT

CREATE TABLE payment (
  customer_number NUMBER(10)   NOT NULL,
  check_number    VARCHAR2(50) NOT NULL,
  payment_date    TIMESTAMP    DEFAULT CURRENT_TIMESTAMP,
  invoice_amount  NUMBER(10,2) NOT NULL,
  caching_date    TIMESTAMP    DEFAULT NULL,
  version         INT          DEFAULT 0,
  modified        TIMESTAMP    DEFAULT CURRENT_TIMESTAMP,
  CONSTRAINT payment_pk PRIMARY KEY (customer_number,check_number),
  CONSTRAINT check_number_uk UNIQUE (check_number),
  CONSTRAINT payment_customer_fk FOREIGN KEY (customer_number) REFERENCES customer (customer_number)
);

-- TABLE BANK_TRANSACTION

CREATE TABLE bank_transaction (
  transaction_id  NUMBER(10)   GENERATED BY DEFAULT ON NULL AS IDENTITY,
  bank_name       VARCHAR2(50) NOT NULL,
  bank_iban       VARCHAR2(50) NOT NULL,  
  transfer_amount NUMBER(10,2) NOT NULL,
  caching_date    TIMESTAMP    DEFAULT SYSTIMESTAMP,
  customer_number NUMBER(10)   NOT NULL,
  check_number    VARCHAR2(50) NOT NULL, 
  card_type       VARCHAR2(50) NOT NULL,
  status          VARCHAR2(50) DEFAULT 'SUCCESS',
  CONSTRAINT bank_transaction_pk PRIMARY KEY (transaction_id),  
  CONSTRAINT bank_transaction_customer_fk FOREIGN KEY (customer_number,check_number) REFERENCES payment (customer_number,check_number)
);

-- TABLE OFFICE_FLIGHTS

CREATE TABLE office_flights (  
  depart_town  VARCHAR2(32) NOT NULL,
  arrival_town VARCHAR2(32) NOT NULL,
  distance_km  NUMBER(7)    NOT NULL,
  CONSTRAINT office_flights_pk PRIMARY KEY (depart_town, arrival_town)
);

/* [jooq ignore start] */
COMMIT;
/* [jooq ignore stop] */

/* USER-DEFINED FUNCTIONS */

/* [jooq ignore start] */

CREATE OR REPLACE PACKAGE "DEPARTMENT_PKG"
AS
  TYPE "BGT" IS RECORD ("LOCAL_BUDGET" FLOAT, "CASH" FLOAT);

  FUNCTION "GET_BGT"("p_profit" IN FLOAT)
    RETURN "BGT";
	
  FUNCTION "GET_MAX_CASH"
    RETURN FLOAT; 
END "DEPARTMENT_PKG";
/

CREATE OR REPLACE PACKAGE BODY "DEPARTMENT_PKG"
 AS  
  FUNCTION "GET_BGT"("p_profit" IN FLOAT)
    RETURN "BGT"
  IS
    "r_bgt" "BGT";
  BEGIN
    SELECT "DEPARTMENT"."LOCAL_BUDGET", "DEPARTMENT"."CASH"
      INTO "r_bgt"
      FROM "DEPARTMENT"
     WHERE "DEPARTMENT"."PROFIT" > "p_profit";

    RETURN "r_bgt";
	BEGIN
      dbms_output.put_line('Control is now executing the package initialization part');
	END;
  END;
  
  FUNCTION "GET_MAX_CASH"
    RETURN FLOAT 
  IS
    "r_max_cash" FLOAT;
  BEGIN
    SELECT max("DEPARTMENT"."CASH") INTO "r_max_cash"
	  FROM "DEPARTMENT";
	  
	RETURN "r_max_cash";  
  END;  
END "DEPARTMENT_PKG";
/

CREATE OR REPLACE FUNCTION "GET_TOTAL_SALES"(
    "in_year" IN PLS_INTEGER) 
  RETURN NUMBER
  IS
    "l_total_sales" NUMBER := 0;
  BEGIN  
    SELECT SUM("ORDERDETAIL"."PRICE_EACH" * "ORDERDETAIL"."QUANTITY_ORDERED")
    INTO "l_total_sales"
    FROM "ORDERDETAIL"
    INNER JOIN "ORDER" USING ("ORDER_ID")
    WHERE "ORDER"."STATUS" = 'Shipped'
    GROUP BY EXTRACT(YEAR FROM "ORDER"."ORDER_DATE")
    HAVING EXTRACT(YEAR FROM "ORDER"."ORDER_DATE") = "in_year";
        
    RETURN "l_total_sales";
  END;
/

CREATE OR REPLACE FUNCTION "GET_SALARY_STAT"(
    "min_sal" OUT INT, "max_sal" OUT INT, "avg_sal" OUT REAL) 
  RETURN REAL IS 
  BEGIN
    SELECT MIN("EMPLOYEE"."SALARY"),
           MAX("EMPLOYEE"."SALARY"),
		   AVG("EMPLOYEE"."SALARY")
    INTO "min_sal", "max_sal", "avg_sal"
    FROM "EMPLOYEE";
	
    RETURN "avg_sal" / sqrt("min_sal" * "max_sal");
  END;
/

CREATE OR REPLACE FUNCTION "SWAP"(
  "x" IN OUT PLS_INTEGER, "y" IN OUT PLS_INTEGER) 
  RETURN PLS_INTEGER IS
  BEGIN
     SELECT "x","y" INTO "y","x" FROM dual;
     RETURN "x" + "y";
  END; 
/

CREATE OR REPLACE NONEDITIONABLE FUNCTION "SALE_PRICE"(
    "quantity" IN PLS_INTEGER, "list_price" IN REAL, "fraction_of_price" IN REAL)
  RETURN REAL IS
    "result" REAL := ("list_price" - ("list_price" * "fraction_of_price")) * "quantity";    
  BEGIN
    RETURN "result";
  END;
/

CREATE OR REPLACE NONEDITIONABLE FUNCTION "CARD_COMMISSION"("card_type" IN VARCHAR2)
   RETURN NUMBER IS
     "commision" NUMBER := 0;
   BEGIN
     RETURN CASE "card_type"
       WHEN 'VisaElectron' THEN .15
       WHEN 'Mastercard' THEN .22
       ELSE .25
     END;
  END;   
/   

CREATE OR REPLACE NONEDITIONABLE FUNCTION "GET_CUSTOMER" ("cl" IN NUMBER)
  RETURN SYS_REFCURSOR
    AS "cur" SYS_REFCURSOR;
  BEGIN
    OPEN "cur" FOR
      SELECT *
      FROM "CUSTOMER"
	  WHERE "CUSTOMER"."CREDIT_LIMIT" > "cl"
      ORDER BY "CUSTOMER"."CUSTOMER_NAME";
	  
    RETURN "cur";
  END;
/

-- Create Object of your table
BEGIN
   EXECUTE IMMEDIATE 'CREATE TYPE "TABLE_RES_OBJ" AS OBJECT (SALES FLOAT);';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/

--Create a type of your object 
BEGIN
   EXECUTE IMMEDIATE 'CREATE TYPE "TABLE_RES" AS TABLE OF TABLE_RES_OBJ;';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/

CREATE OR REPLACE NONEDITIONABLE FUNCTION "TOP_THREE_SALES_PER_EMPLOYEE" (
    "employee_nr" IN NUMBER) 
  RETURN TABLE_RES IS
    "table_result" TABLE_RES;
  BEGIN
    SELECT
        TABLE_RES_OBJ("SALE"."SALE") "sales"
    BULK COLLECT
    INTO "table_result"
    FROM
        "SALE"
    WHERE
        "employee_nr" = "SALE"."EMPLOYEE_NUMBER"
    ORDER BY
        "SALE"."SALE" DESC
    FETCH NEXT 3 ROWS ONLY;

    RETURN "table_result";
  END;
/

-- Create Object of your table 2
BEGIN
   EXECUTE IMMEDIATE 'CREATE TYPE "TABLE_POPL_OBJ" AS OBJECT (P_ID NUMBER(10), P_NAME VARCHAR2(70), P_LINE VARCHAR2(50));';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/

--Create a type of your object 2
BEGIN
   EXECUTE IMMEDIATE 'CREATE TYPE "TABLE_POPL" AS TABLE OF TABLE_POPL_OBJ;';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/

CREATE OR REPLACE NONEDITIONABLE FUNCTION "PRODUCT_OF_PRODUCT_LINE" (
    "p_line_in" IN VARCHAR2) 
  RETURN TABLE_POPL IS
    "table_result" TABLE_POPL;
  BEGIN
    SELECT
        TABLE_POPL_OBJ("PRODUCT"."PRODUCT_ID",  "PRODUCT"."PRODUCT_NAME", "PRODUCT"."PRODUCT_LINE")
    BULK COLLECT
    INTO "table_result"
    FROM
        "PRODUCT"
    WHERE
        "p_line_in" = "PRODUCT"."PRODUCT_LINE";

    RETURN "table_result";
  END;
/

--Creating and Using a User-Defined Aggregate
BEGIN
   EXECUTE IMMEDIATE 'CREATE TYPE "SECOND_MAX_IMPL" AS OBJECT
(
  max NUMBER, 
  secmax NUMBER, 
  STATIC FUNCTION ODCIAggregateInitialize(sctx IN OUT SECOND_MAX_IMPL) 
    RETURN NUMBER,
  MEMBER FUNCTION ODCIAggregateIterate(self IN OUT SECOND_MAX_IMPL, 
    value IN NUMBER) RETURN NUMBER,
  MEMBER FUNCTION ODCIAggregateTerminate(self IN SECOND_MAX_IMPL, 
    returnValue OUT NUMBER, flags IN NUMBER) RETURN NUMBER,
  MEMBER FUNCTION ODCIAggregateMerge(self IN OUT SECOND_MAX_IMPL, 
    ctx2 IN SECOND_MAX_IMPL) RETURN NUMBER
);';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/

CREATE OR REPLACE TYPE BODY "SECOND_MAX_IMPL" IS 
STATIC FUNCTION ODCIAggregateInitialize(sctx IN OUT SECOND_MAX_IMPL) RETURN NUMBER IS 
BEGIN
  sctx := SECOND_MAX_IMPL(0, 0);
  RETURN ODCIConst.Success;
END;

MEMBER FUNCTION ODCIAggregateIterate(self IN OUT SECOND_MAX_IMPL, value IN NUMBER) RETURN NUMBER IS
BEGIN
  IF value > self.max THEN
    self.secmax := self.max;
    self.max := value;
  ELSIF value > self.secmax THEN
    self.secmax := value;
  END IF;
  RETURN ODCIConst.Success;
END;

MEMBER FUNCTION ODCIAggregateTerminate(self IN SECOND_MAX_IMPL, returnValue OUT NUMBER, flags IN NUMBER) RETURN NUMBER IS
BEGIN
  returnValue := self.secmax;
  RETURN ODCIConst.Success;
END;

MEMBER FUNCTION ODCIAggregateMerge(self IN OUT SECOND_MAX_IMPL, ctx2 IN SECOND_MAX_IMPL) RETURN NUMBER IS
BEGIN
  IF ctx2.max > self.max THEN
    IF ctx2.secmax > self.secmax THEN 
      self.secmax := ctx2.secmax;
    ELSE
      self.secmax := self.max;
    END IF;
    self.max := ctx2.max;
  ELSIF ctx2.max > self.secmax THEN
    self.secmax := ctx2.max;
  END IF;
  RETURN ODCIConst.Success;
END;
END;
/

CREATE OR REPLACE FUNCTION "SECOND_MAX" (input NUMBER) RETURN NUMBER 
PARALLEL_ENABLE AGGREGATE USING SECOND_MAX_IMPL;
/

/* USER-DEFINED PROCEDURES */

CREATE OR REPLACE NONEDITIONABLE PROCEDURE "GET_PRODUCT"(
    "pid" IN NUMBER, "cursor_result" OUT SYS_REFCURSOR) AS 
  BEGIN
    OPEN "cursor_result" FOR
	  SELECT * FROM "PRODUCT" WHERE "PRODUCT"."PRODUCT_ID" = "pid";
  END;
/

CREATE OR REPLACE NONEDITIONABLE PROCEDURE "GET_EMPS_IN_OFFICE"("in_office_code" IN VARCHAR,
  "cursor_office" OUT SYS_REFCURSOR, "cursor_employee" OUT SYS_REFCURSOR) AS 
  BEGIN
    OPEN "cursor_office" FOR
      SELECT "OFFICE"."CITY", "OFFICE"."COUNTRY", "OFFICE"."INTERNAL_BUDGET"
      FROM "OFFICE"
      WHERE "OFFICE"."OFFICE_CODE" = "in_office_code";

    OPEN "cursor_employee" FOR
      SELECT "EMPLOYEE"."EMPLOYEE_NUMBER", "EMPLOYEE"."FIRST_NAME", "EMPLOYEE"."LAST_NAME"
      FROM "EMPLOYEE"
      WHERE "EMPLOYEE"."OFFICE_CODE" = "in_office_code";
  END;
/

CREATE OR REPLACE NONEDITIONABLE PROCEDURE "GET_AVG_PRICE_BY_PRODUCT_LINE" (
	"pl" IN VARCHAR2, "average" OUT DECIMAL) AS 
  BEGIN
	SELECT AVG("PRODUCT"."BUY_PRICE")
	INTO "average"
	FROM "PRODUCT"
	WHERE "PRODUCT"."PRODUCT_LINE" = "pl";
  END;
/

CREATE OR REPLACE NONEDITIONABLE PROCEDURE "REFRESH_TOP3_PRODUCT"("p_line_in" IN VARCHAR2) AS 
  BEGIN
	DELETE FROM "TOP3PRODUCT"; 
    INSERT INTO "TOP3PRODUCT"("TOP3PRODUCT"."PRODUCT_ID", "TOP3PRODUCT"."PRODUCT_NAME")        
	  SELECT "T"."PRODUCT_ID", "T"."PRODUCT_NAME" FROM (
        SELECT "ORDERDETAIL"."PRODUCT_ID", "PRODUCT_NAME", max("ORDERDETAIL"."QUANTITY_ORDERED") "QO" 
		FROM "ORDERDETAIL" 
		CROSS APPLY (SELECT "PRODUCT"."PRODUCT_NAME" "PRODUCT_NAME" 
		  FROM "PRODUCT" WHERE ("ORDERDETAIL"."PRODUCT_ID" = "PRODUCT"."PRODUCT_ID" 
		    AND "PRODUCT"."PRODUCT_LINE" = "p_line_in"))
      GROUP BY "ORDERDETAIL"."PRODUCT_ID", "PRODUCT_NAME") "T"
	  ORDER BY "T"."QO"        
	  FETCH NEXT 3 ROWS ONLY;         
  END;
/

CREATE OR REPLACE PROCEDURE "SET_COUNTER"(
	"counter" IN OUT INT, "inc" IN INT) AS 
  BEGIN
	"counter" := "counter" + "inc";
  END;
/

/* [jooq ignore stop] */

/* USER-DEFINED VIEWS */

CREATE OR REPLACE VIEW "CUSTOMER_MASTER" AS
SELECT "CUSTOMER"."CUSTOMER_NAME",
       "CUSTOMER"."CREDIT_LIMIT",
       "CUSTOMERDETAIL"."CITY",
       "CUSTOMERDETAIL"."COUNTRY",
       "CUSTOMERDETAIL"."ADDRESS_LINE_FIRST",
       "CUSTOMERDETAIL"."POSTAL_CODE",
       "CUSTOMERDETAIL"."STATE"
FROM "CUSTOMER"
JOIN "CUSTOMERDETAIL" ON "CUSTOMERDETAIL"."CUSTOMER_NUMBER" = "CUSTOMER"."CUSTOMER_NUMBER"
WHERE "CUSTOMER"."FIRST_BUY_DATE" IS NOT NULL;

CREATE OR REPLACE VIEW "OFFICE_MASTER" AS
SELECT "OFFICE"."OFFICE_CODE",
       "OFFICE"."CITY",
       "OFFICE"."COUNTRY",
       "OFFICE"."STATE",
       "OFFICE"."PHONE",
	   "OFFICE"."POSTAL_CODE"
FROM "OFFICE"
WHERE "OFFICE"."CITY" IS NOT NULL;

CREATE OR REPLACE VIEW "PRODUCT_MASTER" AS
SELECT "PRODUCT"."PRODUCT_LINE",
       "PRODUCT"."PRODUCT_NAME",
       "PRODUCT"."PRODUCT_SCALE"       
FROM "PRODUCT";

/* END */

/*
*********************************************************************
http://www.mysqltutorial.org
*********************************************************************
Name: MySQL Sample Database classicmodels
Link: http://www.mysqltutorial.org/mysql-sample-database.aspx
*********************************************************************

This is a modified version of the original schema for MySQL
*/