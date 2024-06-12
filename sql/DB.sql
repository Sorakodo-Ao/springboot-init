create database if not exists My_DB;
use My_DB;
create table if not exists user
(
    id          int auto_increment primary key,
    name        text                                  not null comment '姓名',
    phoneNumber varchar(128) unique                   not null comment '电话',
    email       varchar(128)                          not null comment '邮箱',
    account     text                                  not null comment '账户（用户名）',
    password    varchar(50)                           not null comment '密码',
    userRole    varchar(10) default 'user'            not null comment '权限',
    createTime  dateTime    default CURRENT_TIMESTAMP not null comment '创建时间',
    updateTime  datetime    default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间'
)