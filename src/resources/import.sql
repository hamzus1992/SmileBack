insert into user (id,username,password) values(1,'hamza','hamza')
insert into ZONEGEOGRAPHIQUE (id,name) values (1,'EUROPE');
insert into ZONEGEOGRAPHIQUE (id,name) values (2,'AFRIQUE');
insert into ZONEGEOGRAPHIQUE (id,name) values (3,'ASIE');

insert into PAYS (id,name,ZONEGEOGRAPHIQUEFK) values (1,'FRANCE',1);
insert into PAYS (id,name,ZONEGEOGRAPHIQUEFK) values (2,'ESPAGNE',1);


insert into ETABLISSEMENT (id,name,PAYSFK) values (1,'ETABLISSEMENT1',1);
insert into ETABLISSEMENT (id,name,PAYSFK) values (2,'ETABLISSEMENT2',1);
insert into ETABLISSEMENT (id,name,PAYSFK) values (3,'ETABLISSEMENT3',1);
insert into ETABLISSEMENT (id,name,PAYSFK) values (4,'ETABLISSEMENT4',2);
insert into ETABLISSEMENT (id,name,PAYSFK) values (5,'ETABLISSEMENT4',2);


