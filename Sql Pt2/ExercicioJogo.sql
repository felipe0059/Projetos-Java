create database db_generetion_game_online;
use db_generetion_game_online;
CREATE TABLE tb_class(
	id_class INT AUTO_INCREMENT,
    ClassName VARCHAR(50),
    Weapon VARCHAR(50),
    Armor VARCHAR(50),
    PRIMARY KEY(id_class)
);
create table tb_character(
id_character INT AUTO_INCREMENT,
NameChar varchar(255),
ArmorColor varchar(255),
AttackPower FLOAT,
DefensePower FLOAT,
fk_class INT,
PRIMARY KEY(id_character),
FOREIGN KEY(fk_class) REFERENCES tb_class(id_class)
);

INSERT INTO tb_class (ClassName, Weapon, Armor)
VALUES
('Shooter', 'AK-47','Metal'),
('Defensor', 'M16','Forged Steel'),
('Shooter', 'KARAMBIT','Titanium Suit'),
('Defensor','Black Sword','Diamond Suit'),
('Defensor','M60','Aluminium');

INSERT INTO tb_character (NameChar, ArmorColor, AttackPower, DefensePower, fk_class)
VALUES
('Hawk', 'Gray', 2000, 6000, 3),
('Fanatic', 'Dark Gray', 4000, 2000, 2),
('Darkeye', 'Space Gray', 7000, 1500, 1),
('Xshoot', 'Multicolor', 6000, 2000, 2),
('NightAngel', 'Silver', 2000, 8000, 3);



SELECT * FROM tb_character WHERE AttackPower>2000;
SELECT * FROM tb_character WHERE DefensePower<2000 && DefensePower >1000;
SELECT * FROM tb_character WHERE NameChar LIKE 'C';
SELECT * FROM tb_character WHERE NameChar LIKE 'S%';
SELECT * FROM tb_character INNER JOIN tb_class;
SELECT * FROM tb_character INNER JOIN tb_class WHERE ClassName LIKE 'Shooter';
SELECT * FROM tb_character;
