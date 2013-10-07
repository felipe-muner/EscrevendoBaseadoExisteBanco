create database inspetor if not exists;
use inspetor;
create table inspetor(
	idinspetor int auto_increment primary key,
	nome varchar(50),
	idade int(3)
);
insert into inspetor values(null,'felipao',23);

