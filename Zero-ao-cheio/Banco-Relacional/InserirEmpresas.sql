alter table empresas modify cnpj varchar(14);


insert into empresas
    (nome, cnpj)
values
    ('Bradesco', 9568924800009),
    ('Vale', 2788929929000),
    ('Cielo', 0152629200151);

desc empresas; -- ajuda a descrever a tabela para esclarecer se tiver alguma duvida

select * from empresas;


insert into empresas_unidades
    (empresa_id, cidade_id, sede)
values
    (1, 1, 1),
    (1, 2, 0),
    (2, 1, 0),
    (2, 2, 1);

select * from empresas_unidades;