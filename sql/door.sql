/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2019/11/27 14:54:48                          */
/*==============================================================*/


drop table if exists company_relation;

drop table if exists sys_merchant_resource;

drop table if exists sys_resources;

drop table if exists tb_account;

drop table if exists tb_account_info;

drop table if exists tb_role;

drop table if exists tr_role_resource;

drop table if exists tr_user_role;

/*==============================================================*/
/* Table: company_relation                                      */
/*==============================================================*/
create table company_relation
(
   create_time          datetime,
   create_user          varchar(50),
   update_time          datetime,
   update_user          varchar(50),
   del_flag             varchar(2)
);

alter table company_relation comment '????????';

/*==============================================================*/
/* Table: sys_merchant_resource                                 */
/*==============================================================*/
create table sys_merchant_resource
(
   merchant_id          varchar(50),
   resource_id          varchar(50),
   create_time          datetime,
   create_user          varchar(50),
   update_time          datetime,
   update_user          varchar(50),
   del_flag             varchar(2)
);

alter table sys_merchant_resource comment '????????';

/*==============================================================*/
/* Table: sys_resources                                         */
/*==============================================================*/
create table sys_resources
(
   sys_resource_id      varchar(50) not null,
   resource_name        varchar(100),
   create_time          datetime,
   create_user          varchar(50),
   update_time          datetime,
   update_user          varchar(50),
   del_flag             varchar(2),
   primary key (sys_resource_id)
);

alter table sys_resources comment '???????????';

/*==============================================================*/
/* Table: tb_account                                            */
/*==============================================================*/
create table tb_account
(
   account_id           varchar(50) not null,
   account_pwd          varchar(100),
   user_address         varchar(200),
   province             varchar(50),
   city                 varchar(50),
   account_type         varchar(10),
   create_time          datetime,
   create_user          varchar(50),
   update_time          datetime,
   update_user          varchar(50),
   del_flag             varchar(2),
   primary key (account_id)
);

alter table tb_account comment '?????';

/*==============================================================*/
/* Table: tb_account_info                                       */
/*==============================================================*/
create table tb_account_info
(
   sub_account_id       varchar(50) not null,
   account_id           varchar(50),
   account_phone        varchar(100),
   sub_account_type     varchar(10),
   account_status       varchar(10),
   create_time          datetime,
   create_user          varchar(50),
   update_time          datetime,
   update_user          varchar(50),
   del_flag             varchar(2),
   primary key (sub_account_id)
);

alter table tb_account_info comment '????????';

/*==============================================================*/
/* Table: tb_role                                               */
/*==============================================================*/
create table tb_role
(
   role_id              varchar(50) not null,
   role_name            varchar(100),
   role_type            varchar(10),
   create_time          datetime,
   create_user          varchar(50),
   update_time          datetime,
   update_user          varchar(50),
   del_flag             varchar(2),
   primary key (role_id)
);

alter table tb_role comment '????????';

/*==============================================================*/
/* Table: tr_role_resource                                      */
/*==============================================================*/
create table tr_role_resource
(
   role_id              varchar(50),
   resource_id          varchar(50),
   create_time          datetime,
   create_user          varchar(50),
   update_time          datetime,
   update_user          varchar(50),
   del_flag             varchar(2)
);

alter table tr_role_resource comment '????????';

/*==============================================================*/
/* Table: tr_user_role                                          */
/*==============================================================*/
create table tr_user_role
(
   account_id           varchar(50),
   role_id              varchar(50),
   create_time          datetime,
   create_user          varchar(50),
   update_time          datetime,
   update_user          varchar(50),
   del_flag             varchar(2)
);

alter table tr_user_role comment '????????';

