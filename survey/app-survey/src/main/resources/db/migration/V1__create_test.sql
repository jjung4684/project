drop table if exists sv_test;
drop sequence  if exists hibernate_sequence;
create sequence hibernate_sequence start with  1 increment by 1;
create table sv_test (id bigint not null, description varchar(255), name varchar(200), primary key (id));