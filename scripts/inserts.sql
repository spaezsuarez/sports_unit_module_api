 
insert into SPORTS_UNIT.TIPOESPACIO(IDTIPOESPACIO, DESCTIPOESPACIO) values(1, 'Unidad');
insert into SPORTS_UNIT.TIPOESPACIO(IDTIPOESPACIO, DESCTIPOESPACIO) values(2, 'Sede');
insert into SPORTS_UNIT.TIPOESPACIO(IDTIPOESPACIO, DESCTIPOESPACIO) values(3, 'Campo');
insert into SPORTS_UNIT.TIPOESPACIO(IDTIPOESPACIO, DESCTIPOESPACIO) values(4, 'Pista');
insert into SPORTS_UNIT.TIPOESPACIO(IDTIPOESPACIO, DESCTIPOESPACIO) values(5, 'Salon');
insert into SPORTS_UNIT.TIPOESPACIO(IDTIPOESPACIO, DESCTIPOESPACIO) values(6, 'Piscina');
insert into SPORTS_UNIT.TIPOESPACIO(IDTIPOESPACIO, DESCTIPOESPACIO) values(7, 'Sala Máquinas');
insert into SPORTS_UNIT.TIPOESPACIO(IDTIPOESPACIO, DESCTIPOESPACIO) values(8, 'Muro Escalar');

select * from SPORTS_UNIT.TIPOESPACIO;

insert into SPORTS_UNIT.DEPORTE(IDDEPORTE, NOMDEPORTE) values(1, 'Atletismo');
insert into SPORTS_UNIT.DEPORTE(IDDEPORTE, NOMDEPORTE) values(2, 'Tenis');
insert into SPORTS_UNIT.DEPORTE(IDDEPORTE, NOMDEPORTE) values(3, 'Tenis Mesa');
insert into SPORTS_UNIT.DEPORTE(IDDEPORTE, NOMDEPORTE) values(4, 'Natación');
insert into SPORTS_UNIT.DEPORTE(IDDEPORTE, NOMDEPORTE) values(5, 'Voleivol');
insert into SPORTS_UNIT.DEPORTE(IDDEPORTE, NOMDEPORTE) values(6, 'Futbol');
insert into SPORTS_UNIT.DEPORTE(IDDEPORTE, NOMDEPORTE) values(7, 'Futbol sala');
insert into SPORTS_UNIT.DEPORTE(IDDEPORTE, NOMDEPORTE) values(8, 'Bádminton');
insert into SPORTS_UNIT.DEPORTE(IDDEPORTE, NOMDEPORTE) values(9, 'Aeróbicos');
insert into SPORTS_UNIT.DEPORTE(IDDEPORTE, NOMDEPORTE) values(10, 'Boxeo');
insert into SPORTS_UNIT.DEPORTE(IDDEPORTE, NOMDEPORTE) values(11, 'Artes Marciales');
insert into SPORTS_UNIT.DEPORTE(IDDEPORTE, NOMDEPORTE) values(12, 'Gimnasia Olimpica');

select * from SPORTS_UNIT.DEPORTE;

insert into SPORTS_UNIT.ESTADO(IDESTADO, DESCESTADO) values(1, 'Activo');
insert into SPORTS_UNIT.ESTADO(IDESTADO, DESCESTADO) values(2, 'Prestado');
insert into SPORTS_UNIT.ESTADO(IDESTADO, DESCESTADO) values(3, 'Dañado');
insert into SPORTS_UNIT.ESTADO(IDESTADO, DESCESTADO) values(4, 'Perdido');
insert into SPORTS_UNIT.ESTADO(IDESTADO, DESCESTADO) values(5, 'De baja');

select * from SPORTS_UNIT.ESTADO;

insert into SPORTS_UNIT.PERIODO(IDPERIODO) VALUES(20191);
insert into SPORTS_UNIT.PERIODO(IDPERIODO) VALUES(20192);
insert into SPORTS_UNIT.PERIODO(IDPERIODO) VALUES(20193);
insert into SPORTS_UNIT.PERIODO(IDPERIODO) VALUES(20201);
insert into SPORTS_UNIT.PERIODO(IDPERIODO) VALUES(20202);
insert into SPORTS_UNIT.PERIODO(IDPERIODO) VALUES(20203);
insert into SPORTS_UNIT.PERIODO(IDPERIODO) VALUES(20211);
insert into SPORTS_UNIT.PERIODO(IDPERIODO) VALUES(20212);
insert into SPORTS_UNIT.PERIODO(IDPERIODO) VALUES(20213);
insert into SPORTS_UNIT.PERIODO(IDPERIODO) VALUES(20221);

select * from SPORTS_UNIT.PERIODO;

insert into SPORTS_UNIT.TIPOELEMENTO(IDTIPOELEMENTO, DESCTIPOELEMENTO) values(1, 'Balón Baloncesto');
insert into SPORTS_UNIT.TIPOELEMENTO(IDTIPOELEMENTO, DESCTIPOELEMENTO) values(2, 'Balón Futbol');
insert into SPORTS_UNIT.TIPOELEMENTO(IDTIPOELEMENTO, DESCTIPOELEMENTO) values(3, 'Balón Voleibol');
insert into SPORTS_UNIT.TIPOELEMENTO(IDTIPOELEMENTO, DESCTIPOELEMENTO) values(4, 'Pelota Tenis mesa');
insert into SPORTS_UNIT.TIPOELEMENTO(IDTIPOELEMENTO, DESCTIPOELEMENTO) values(5, 'Pelota Tenis campo');
insert into SPORTS_UNIT.TIPOELEMENTO(IDTIPOELEMENTO, DESCTIPOELEMENTO) values(6, 'Colchoneta');
insert into SPORTS_UNIT.TIPOELEMENTO(IDTIPOELEMENTO, DESCTIPOELEMENTO) values(7, 'Lazo salto');
insert into SPORTS_UNIT.TIPOELEMENTO(IDTIPOELEMENTO, DESCTIPOELEMENTO) values(8, 'Guantes Box');
insert into SPORTS_UNIT.TIPOELEMENTO(IDTIPOELEMENTO, DESCTIPOELEMENTO) values(9, 'Malla Volibol');
insert into SPORTS_UNIT.TIPOELEMENTO(IDTIPOELEMENTO, DESCTIPOELEMENTO) values(10, 'Saco Boxeo');
insert into SPORTS_UNIT.TIPOELEMENTO(IDTIPOELEMENTO, DESCTIPOELEMENTO) values(11, 'Aros hula-hula');
insert into SPORTS_UNIT.TIPOELEMENTO(IDTIPOELEMENTO, DESCTIPOELEMENTO) values(12, 'Chaleco Boxeo');
insert into SPORTS_UNIT.TIPOELEMENTO(IDTIPOELEMENTO, DESCTIPOELEMENTO) values(13, 'Malla Pimpón');

select * from SPORTS_UNIT.TIPOELEMENTO;

insert into SPORTS_UNIT.ACTIVIDAD(IDACTIVIDAD, DESCACTIVIDAD) values('CU', 'Curso');
insert into SPORTS_UNIT.ACTIVIDAD(IDACTIVIDAD, DESCACTIVIDAD) values('PR', 'Práctica');
insert into SPORTS_UNIT.ACTIVIDAD(IDACTIVIDAD, DESCACTIVIDAD) values('EN', 'Entrenamiento');

select * from SPORTS_UNIT.ACTIVIDAD;

insert into SPORTS_UNIT.HORA(IDHORA) values('6:00');
insert into SPORTS_UNIT.HORA(IDHORA) values('7:00');
insert into SPORTS_UNIT.HORA(IDHORA) values('8:00');
insert into SPORTS_UNIT.HORA(IDHORA) values('9:00');
insert into SPORTS_UNIT.HORA(IDHORA) values('10:00');
insert into SPORTS_UNIT.HORA(IDHORA) values('11:00');
insert into SPORTS_UNIT.HORA(IDHORA) values('12:00');
insert into SPORTS_UNIT.HORA(IDHORA) values('13:00');
insert into SPORTS_UNIT.HORA(IDHORA) values('14:00');
insert into SPORTS_UNIT.HORA(IDHORA) values('15:00');
insert into SPORTS_UNIT.HORA(IDHORA) values('16:00');
insert into SPORTS_UNIT.HORA(IDHORA) values('17:00');
insert into SPORTS_UNIT.HORA(IDHORA) values('18:00');
insert into SPORTS_UNIT.HORA(IDHORA) values('19:00');
insert into SPORTS_UNIT.HORA(IDHORA) values('20:00');
insert into SPORTS_UNIT.HORA(IDHORA) values('21:00');
insert into SPORTS_UNIT.HORA(IDHORA) values('22:00');

select * from SPORTS_UNIT.HORA;

insert into SPORTS_UNIT.MARCA(IDMARCA, NOMMARCA) values('10', 'Nike');
insert into SPORTS_UNIT.MARCA(IDMARCA, NOMMARCA) values('20', 'Adidas');
insert into SPORTS_UNIT.MARCA(IDMARCA, NOMMARCA) values('30', 'Puma');
insert into SPORTS_UNIT.MARCA(IDMARCA, NOMMARCA) values('40', 'Reebok');
insert into SPORTS_UNIT.MARCA(IDMARCA, NOMMARCA) values('50', 'Fila');
insert into SPORTS_UNIT.MARCA(IDMARCA, NOMMARCA) values('60', 'Asics');
insert into SPORTS_UNIT.MARCA(IDMARCA, NOMMARCA) values('70', 'Kappa');
insert into SPORTS_UNIT.MARCA(IDMARCA, NOMMARCA) values('80', 'The North Face');
insert into SPORTS_UNIT.MARCA(IDMARCA, NOMMARCA) values('90', 'Under Armour');
insert into SPORTS_UNIT.MARCA(IDMARCA, NOMMARCA) values('100', 'Under Armour');
insert into SPORTS_UNIT.MARCA(IDMARCA, NOMMARCA) values('110', 'Converse');
insert into SPORTS_UNIT.MARCA(IDMARCA, NOMMARCA) values('120', 'TI Colombia');

select * from SPORTS_UNIT.MARCA;

insert into SPORTS_UNIT.ROL(IDROL, DESCROL) values(1, 'Director Deportivo');
insert into SPORTS_UNIT.ROL(IDROL, DESCROL) values(2, 'Docente');
insert into SPORTS_UNIT.ROL(IDROL, DESCROL) values(3, 'Entranador');

select * from SPORTS_UNIT.ROL;

insert into SPORTS_UNIT.CARGO(IDCARGO, DESCARGO) values(1, 'Auxiliar');
insert into SPORTS_UNIT.CARGO(IDCARGO, DESCARGO) values(2, 'Docente');
insert into SPORTS_UNIT.CARGO(IDCARGO, DESCARGO) values(3, 'Director Deportivo');
insert into SPORTS_UNIT.CARGO(IDCARGO, DESCARGO) values(4, 'Administrador Deportivo');
insert into SPORTS_UNIT.CARGO(IDCARGO, DESCARGO) values(5, 'Fisioterapeuta');
insert into SPORTS_UNIT.CARGO(IDCARGO, DESCARGO) values(6, 'Entrenador');

select * from SPORTS_UNIT.CARGO;