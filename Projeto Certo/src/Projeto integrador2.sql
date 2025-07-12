create database ProjetoIntegrador;

create table Carros(
id int not null primary key auto_increment,
marca varchar(40),
modelo varchar(20),
ano date,
cor varchar(20),
estado varchar(20),
caracteristicas varchar(30),
acessorios varchar(30),
valor double
);

create table Usuario(
id int not null primary key auto_increment,
usuario varchar(40),
senha varchar(20)
);

show tables;