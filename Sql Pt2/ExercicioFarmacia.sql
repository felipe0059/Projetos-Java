create database db_farmacia_do_bem;

use db_farmacia_do_bem;
create table tb_categoria(
id_categoria int(5) auto_increment,
Antibióticos varchar(100)not null,
Antialégicos varchar(100)not null,
Genéricos varchar(100)not null,
primary key(id_categoria)
);

INSERT INTO `db_farmacia_do_bem`.`tb_categoria` (`Antibióticos`, `Antialégicos`, `Genéricos`) VALUES ('Ciprofloxacino', 'Loratamed', 'Aclidínio');
INSERT INTO `db_farmacia_do_bem`.`tb_categoria` (`Antibióticos`, `Antialégicos`, `Genéricos`) VALUES ('Amoxicilina', 'Celestone', 'Aciclovir');
INSERT INTO `db_farmacia_do_bem`.`tb_categoria` (`Antibióticos`, `Antialégicos`, `Genéricos`) VALUES ('Ampicilina', 'Histamin', 'Acarbose');
INSERT INTO `db_farmacia_do_bem`.`tb_categoria` (`Antibióticos`, `Antialégicos`, `Genéricos`) VALUES ('Cefalexina', 'Prednisona', 'Betaxolol');
INSERT INTO `db_farmacia_do_bem`.`tb_categoria` (`Antibióticos`, `Antialégicos`, `Genéricos`) VALUES ('Tetraciclina', 'Alektos', 'Cefaclor');

select * from tb_categoria;

create table tb_produto(
id_produto int auto_increment,
Tipo varchar(100)not null,
Nome varchar(100)not null,
Quantidade int not null,
Atestado enum('sim', 'nao'),
Valor float,
fk_categoria bigint,
primary key (id_produto),
foreign key(fk_categoria) references tb_categoria (id_categoria)
);

INSERT INTO `db_farmacia_do_bem`.`tb_produto` (`Tipo`, `Nome`, `Quantidade`, `Atestado`, `Valor`, `fk_categoria`) VALUES ('Antibióticos', 'Ciprofloxacino', '2', 'sim', '30', '1');
INSERT INTO `db_farmacia_do_bem`.`tb_produto` (`Tipo`, `Nome`, `Quantidade`, `Atestado`, `Valor`, `fk_categoria`) VALUES ('Genéricos', 'Betaxolol', '1', 'nao', '2', '2');
INSERT INTO `db_farmacia_do_bem`.`tb_produto` (`Tipo`, `Nome`, `Quantidade`, `Atestado`, `Valor`, `fk_categoria`) VALUES ('Antibióticos', 'Amoxicilina', '1', 'nao', '39', '1');
INSERT INTO `db_farmacia_do_bem`.`tb_produto` (`Tipo`, `Nome`, `Quantidade`, `Atestado`, `Valor`, `fk_categoria`) VALUES ('Antibióticos', 'Tetraciclina', '3', 'sim', '89', '1');
INSERT INTO `db_farmacia_do_bem`.`tb_produto` (`Tipo`, `Nome`, `Quantidade`, `Atestado`, `Valor`, `fk_categoria`) VALUES ('Genéricos', 'Cefaclor', '5', 'nao', '20', '2');
INSERT INTO `db_farmacia_do_bem`.`tb_produto` (`Tipo`, `Nome`, `Quantidade`, `Atestado`, `Valor`, `fk_categoria`) VALUES ('Genéricos', 'Aclidínio', '2', 'sim', '3', '2');
INSERT INTO `db_farmacia_do_bem`.`tb_produto` (`Tipo`, `Nome`, `Quantidade`, `Atestado`, `Valor`, `fk_categoria`) VALUES ('Antialégicos', 'Histamin', '1', 'sim', '65', '3');
INSERT INTO `db_farmacia_do_bem`.`tb_produto` (`Tipo`, `Nome`, `Quantidade`, `Atestado`, `Valor`, `fk_categoria`) VALUES ('Antialégicos', 'Prednisona', '1', 'nao', '50', '3');
select * from tb_produto;
select * from db_farmacia_do_bem.tb_produto where Valor > 50;
select * from db_farmacia_do_bem.tb_produto where Valor >= 3 and Valor <= 60;
select * from db_farmacia_do_bem.tb_produto where Nome like "%B%";

select * from db_farmacia_do_bem.tb_produto
inner join db_farmacia_do_bem.tb_categoria 
on tb_categoria.id_categoria = tb_produto.id_produto;

select Genéricos from tb_categoria;