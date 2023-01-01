CREATE DATABASE dbagenda;

CREATE TABLE contatos (
	idcon int primary key auto_increment,
    nome varchar(50) not null,
    fone varchar(50) not null,
    email varchar(50) not null
);

INSERT INTO contatos(nome, fone, email) VALUES ('Jose Lino', '99999999999', 'teste@teste.com.br');
INSERT INTO contatos(nome, fone, email) VALUES ('Luana Silva', '99999999999', 'teste@teste.com.br');
INSERT INTO contatos(nome, fone, email) VALUES ('Silvia Lucia', '99999999999', 'teste@teste.com.br');
INSERT INTO contatos(nome, fone, email) VALUES ('Lucas Leandro', '99999999999', 'teste@teste.com.br');
