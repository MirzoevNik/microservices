--liquibase formatted sql

--changeset mirzoevnik:create-table-client
CREATE TABLE client (
  id BIGINT AUTO_INCREMENT,
  name VARCHAR(100) NULL,
  surname VARCHAR(100) NULL,
  patronymic VARCHAR(100) NULL,
  birthday VARCHAR(50) NULL,
  inn VARCHAR(30) NULL,
  snils VARCHAR(30) NULL,
  address VARCHAR(300) NULL,
  income NUMERIC(10, 2) NULL,
  family_status VARCHAR(100) NULL
);

--changeset mirzoevnik:create-table-application
CREATE TABLE application (
  id BIGINT AUTO_INCREMENT,
  client_id INTEGER REFERENCES client(id),
  amount NUMERIC(10, 2) NULL,
  start_date DATE NULL,
  rate NUMERIC(5, 2) NULL,
  term INTEGER NULL,
  product_name VARCHAR(300) NULL,
  executor VARCHAR(100) NULL,
  status VARCHAR(100) NULL,
  piid VARCHAR(100) NULL
);