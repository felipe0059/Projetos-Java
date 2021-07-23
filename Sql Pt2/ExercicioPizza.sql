create database db_pizzaria_legal;
use db_pizzaria_legal;

create table tb_categoria(
id_categoria bigint(5) auto_increment,
Categoria varchar(100) not null,
Bebidas varchar(100) not null,
Sobremesa varchar(100) not null,
primary key(id_categoria)
);

INSERT INTO `db_pizzaria_legal`.`tb_categoria` (`Categoria`, `Bebidas`, `Sobremesa`) VALUES ('Salgada', 'Refrigerante', 'Bolo');
INSERT INTO `db_pizzaria_legal`.`tb_categoria` (`Categoria`, `Bebidas`, `Sobremesa`) VALUES ('Doce', 'Suco ', 'Torta');
INSERT INTO `db_pizzaria_legal`.`tb_categoria` (`Categoria`, `Bebidas`, `Sobremesa`) VALUES ('Vegana', 'Vinho', 'Pudim');
INSERT INTO `db_pizzaria_legal`.`tb_categoria` (`Categoria`, `Bebidas`, `Sobremesa`) VALUES ('Frutos do mar', 'Cerveja', 'Mousse');
INSERT INTO `db_pizzaria_legal`.`tb_categoria` (`Categoria`, `Bebidas`, `Sobremesa`) VALUES ('Exotica', 'Agua', 'Sorvete');

select * from tb_categoria;

create table tb_pizza (
    id_pizza int  auto_increment,
    Sabor varchar(100) not null,
    Tamanho varchar(100) not null,
    Borda enum('sim', 'nao'),
    Sabor_Borda varchar(100) not null,
    Valor float,
    fk_categoria bigint,
    primary key (id_pizza),
    foreign key (fk_categoria) references tb_categoria (id_categoria)
);

INSERT INTO `db_pizzaria_legal`.`tb_pizza` (`Sabor`, `Tamanho`, `Borda`, `Sabor_Borda`, `Valor`, `fk_categoria`) VALUES ('Queijo', 'Pequeno', 'nao', 'sem borda', '20', '1');
INSERT INTO `db_pizzaria_legal`.`tb_pizza` (`Sabor`, `Tamanho`, `Borda`, `Sabor_Borda`, `Valor`, `fk_categoria`) VALUES ('Calabresa', 'Grande', 'sim', 'Catupiry', '40', '3');
INSERT INTO `db_pizzaria_legal`.`tb_pizza` (`Sabor`, `Tamanho`, `Borda`, `Sabor_Borda`, `Valor`, `fk_categoria`) VALUES ('Frango com catupiry', 'Grande', 'sim', 'Catupiry', '40', '3');
INSERT INTO `db_pizzaria_legal`.`tb_pizza` (`Sabor`, `Tamanho`, `Borda`, `Sabor_Borda`, `Valor`, `fk_categoria`) VALUES ('Chocolate', 'Medio', 'nao', 'sem borda', '30', '2');
INSERT INTO `db_pizzaria_legal`.`tb_pizza` (`Sabor`, `Tamanho`, `Borda`, `Sabor_Borda`, `Valor`, `fk_categoria`) VALUES ('Camarão', 'Grande', 'Sim', 'Catupiry', '69', '5');
INSERT INTO `db_pizzaria_legal`.`tb_pizza` (`Sabor`, `Tamanho`, `Borda`, `Sabor_Borda`, `Valor`, `fk_categoria`) VALUES ('Camarão', 'Pequeno', 'nao', 'sem borda', '39', '1');
INSERT INTO `db_pizzaria_legal`.`tb_pizza` (`Sabor`, `Tamanho`, `Borda`, `Sabor_Borda`, `Valor`, `fk_categoria`) VALUES ('Vegana', 'Medio', 'nao', 'sem borda', '30', '2');
INSERT INTO `db_pizzaria_legal`.`tb_pizza` (`Sabor`, `Tamanho`, `Borda`, `Sabor_Borda`, `Valor`, `fk_categoria`) VALUES ('Morango com chocolate', 'Grande', 'nao', 'sem borda', '35', '3');

select * from tb_pizza;

select * from db_pizzaria_legal.tb_pizza where Valor > 45;
select * from db_pizzaria_legal.tb_pizza where Valor >= 29 and Valor <= 60;
select * from db_pizzaria_legal.tb_pizza where Sabor like "%C%";
select * from db_pizzaria_legal.tb_pizza
inner join db_pizzaria_legal.tb_categoria 
on tb_categoria.id_categoria = tb_pizza.id_pizza;
select Sabor from tb_pizza;




