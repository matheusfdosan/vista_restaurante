create database vista_restaurante;

use vista_restaurante;

create table menu(
  id_prato integer not null auto_increment,
  nome_prato varchar(185) not null,
  desc_prato varchar(255) not null,
  preco decimal(12,2) not null,
  tipo varchar(10) not null,
  primary key (id_prato)
);

create table pedido(
  id_pedido integer auto_increment,
  mesa int(2) not null,
  numeros_pedidos varchar(100) not null,
  observacao varchar(200),
  data_hora datetime not null,
  garcom varchar(30) not null,
  status varchar(10) not null,
  primary key (id_pedido)
);

