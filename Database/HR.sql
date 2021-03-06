
CREATE TABLE "TRAINING"."COUNTRIES" (
"COUNTRY_ID" CHAR(2 BYTE) NOT NULL ,
"COUNTRY_NAME" VARCHAR2(40 BYTE) NULL ,
"REGION_ID" NUMBER NULL ,
PRIMARY KEY ("COUNTRY_ID")
);


INSERT INTO "TRAINING"."COUNTRIES" VALUES ('AR', 'Argentina', '2');
INSERT INTO "TRAINING"."COUNTRIES" VALUES ('AU', 'Australia', '3');
INSERT INTO "TRAINING"."COUNTRIES" VALUES ('BE', 'Belgium', '1');
INSERT INTO "TRAINING"."COUNTRIES" VALUES ('BR', 'Brazil', '2');
INSERT INTO "TRAINING"."COUNTRIES" VALUES ('CA', 'Canada', '2');
INSERT INTO "TRAINING"."COUNTRIES" VALUES ('CH', 'Switzerland', '1');
INSERT INTO "TRAINING"."COUNTRIES" VALUES ('CN', 'China', '3');
INSERT INTO "TRAINING"."COUNTRIES" VALUES ('DE', 'Germany', '1');
INSERT INTO "TRAINING"."COUNTRIES" VALUES ('DK', 'Denmark', '1');
INSERT INTO "TRAINING"."COUNTRIES" VALUES ('EG', 'Egypt', '4');
INSERT INTO "TRAINING"."COUNTRIES" VALUES ('FR', 'France', '1');
INSERT INTO "TRAINING"."COUNTRIES" VALUES ('HK', 'HongKong', '3');
INSERT INTO "TRAINING"."COUNTRIES" VALUES ('IL', 'Israel', '4');
INSERT INTO "TRAINING"."COUNTRIES" VALUES ('IN', 'India', '3');
INSERT INTO "TRAINING"."COUNTRIES" VALUES ('IT', 'Italy', '1');
INSERT INTO "TRAINING"."COUNTRIES" VALUES ('JP', 'Japan', '3');
INSERT INTO "TRAINING"."COUNTRIES" VALUES ('KW', 'Kuwait', '4');
INSERT INTO "TRAINING"."COUNTRIES" VALUES ('MX', 'Mexico', '2');
INSERT INTO "TRAINING"."COUNTRIES" VALUES ('NG', 'Nigeria', '4');
INSERT INTO "TRAINING"."COUNTRIES" VALUES ('NL', 'Netherlands', '1');
INSERT INTO "TRAINING"."COUNTRIES" VALUES ('SG', 'Singapore', '3');
INSERT INTO "TRAINING"."COUNTRIES" VALUES ('UK', 'United Kingdom', '1');
INSERT INTO "TRAINING"."COUNTRIES" VALUES ('US', 'United States of America', '2');
INSERT INTO "TRAINING"."COUNTRIES" VALUES ('ZM', 'Zambia', '4');
INSERT INTO "TRAINING"."COUNTRIES" VALUES ('ZW', 'Zimbabwe', '4');


CREATE TABLE "TRAINING"."DEPARTMENTS" (
"DEPARTMENT_ID" NUMBER(4) NOT NULL ,
"DEPARTMENT_NAME" VARCHAR2(30 BYTE) NOT NULL ,
"MANAGER_ID" NUMBER(6) NULL ,
"LOCATION_ID" NUMBER(4) NULL 
);


INSERT INTO "TRAINING"."DEPARTMENTS" VALUES ('10', 'Administration', '200', '1700');
INSERT INTO "TRAINING"."DEPARTMENTS" VALUES ('20', 'Marketing', '201', '1800');
INSERT INTO "TRAINING"."DEPARTMENTS" VALUES ('30', 'Purchasing', '114', '1700');
INSERT INTO "TRAINING"."DEPARTMENTS" VALUES ('40', 'Human Resources', '203', '2400');
INSERT INTO "TRAINING"."DEPARTMENTS" VALUES ('50', 'Shipping', '121', '1500');
INSERT INTO "TRAINING"."DEPARTMENTS" VALUES ('60', 'IT', '103', '1400');
INSERT INTO "TRAINING"."DEPARTMENTS" VALUES ('70', 'Public Relations', '204', '2700');
INSERT INTO "TRAINING"."DEPARTMENTS" VALUES ('80', 'Sales', '145', '2500');
INSERT INTO "TRAINING"."DEPARTMENTS" VALUES ('90', 'Executive', '100', '1700');
INSERT INTO "TRAINING"."DEPARTMENTS" VALUES ('100', 'Finance', '108', '1700');
INSERT INTO "TRAINING"."DEPARTMENTS" VALUES ('110', 'Accounting', '205', '1700');
INSERT INTO "TRAINING"."DEPARTMENTS" VALUES ('120', 'Treasury', null, '1700');
INSERT INTO "TRAINING"."DEPARTMENTS" VALUES ('130', 'Corporate Tax', null, '1700');
INSERT INTO "TRAINING"."DEPARTMENTS" VALUES ('140', 'Control And Credit', null, '1700');
INSERT INTO "TRAINING"."DEPARTMENTS" VALUES ('150', 'Shareholder Services', null, '1700');
INSERT INTO "TRAINING"."DEPARTMENTS" VALUES ('160', 'Benefits', null, '1700');
INSERT INTO "TRAINING"."DEPARTMENTS" VALUES ('170', 'Manufacturing', null, '1700');
INSERT INTO "TRAINING"."DEPARTMENTS" VALUES ('180', 'Construction', null, '1700');
INSERT INTO "TRAINING"."DEPARTMENTS" VALUES ('190', 'Contracting', null, '1700');
INSERT INTO "TRAINING"."DEPARTMENTS" VALUES ('200', 'Operations', null, '1700');
INSERT INTO "TRAINING"."DEPARTMENTS" VALUES ('210', 'IT Support', null, '1700');
INSERT INTO "TRAINING"."DEPARTMENTS" VALUES ('220', 'NOC', null, '1700');
INSERT INTO "TRAINING"."DEPARTMENTS" VALUES ('230', 'IT Helpdesk', null, '1700');
INSERT INTO "TRAINING"."DEPARTMENTS" VALUES ('240', 'Government Sales', null, '1700');
INSERT INTO "TRAINING"."DEPARTMENTS" VALUES ('250', 'Retail Sales', null, '1700');
INSERT INTO "TRAINING"."DEPARTMENTS" VALUES ('260', 'Recruiting', null, '1700');
INSERT INTO "TRAINING"."DEPARTMENTS" VALUES ('270', 'Payroll', null, '1700');


CREATE TABLE "TRAINING"."EMPLOYEES" (
"EMPLOYEE_ID" NUMBER(6) NOT NULL ,
"FIRST_NAME" VARCHAR2(20 BYTE) NULL ,
"LAST_NAME" VARCHAR2(25 BYTE) NOT NULL ,
"EMAIL" VARCHAR2(25 BYTE) NOT NULL ,
"PHONE_NUMBER" VARCHAR2(20 BYTE) NULL ,
"HIRE_DATE" DATE NOT NULL ,
"JOB_ID" VARCHAR2(10 BYTE) NOT NULL ,
"SALARY" NUMBER(8,2) NULL ,
"COMMISSION_PCT" NUMBER(2,2) NULL ,
"MANAGER_ID" NUMBER(6) NULL ,
"DEPARTMENT_ID" NUMBER(4) NULL 
);

INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('198', 'Donald', 'OConnell', 'DOCONNEL', '650.507.9833', TO_DATE('1999-06-21 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SH_CLERK', '2600', null, '124', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('199', 'Douglas', 'Grant', 'DGRANT', '650.507.9844', TO_DATE('2000-01-13 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SH_CLERK', '2600', null, '124', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('200', 'Jennifer', 'Whalen', 'JWHALEN', '515.123.4444', TO_DATE('1987-09-17 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'AD_ASST', '4400', null, '101', '10');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('201', 'Michael', 'Hartstein', 'MHARTSTE', '515.123.5555', TO_DATE('1996-02-17 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'MK_MAN', '13000', null, '100', '20');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('202', 'Pat', 'Fay', 'PFAY', '603.123.6666', TO_DATE('1997-08-17 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'MK_REP', '6000', null, '201', '20');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('203', 'Susan', 'Mavris', 'SMAVRIS', '515.123.7777', TO_DATE('1994-06-07 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'TRAINING_REP', '6500', null, '101', '40');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('204', 'Hermann', 'Baer', 'HBAER', '515.123.8888', TO_DATE('1994-06-07 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'PR_REP', '10000', null, '101', '70');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('205', 'Shelley', 'Higgins', 'SHIGGINS', '515.123.8080', TO_DATE('1994-06-07 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'AC_MGR', '12000', null, '101', '110');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('206', 'William', 'Gietz', 'WGIETZ', '515.123.8181', TO_DATE('1994-06-07 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'AC_ACCOUNT', '8300', null, '205', '110');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('100', 'Steven', 'King', 'SKING', '515.123.4567', TO_DATE('1987-06-17 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'AD_PRES', '24000', null, null, '90');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('101', 'Neena', 'Kochhar', 'NKOCHHAR', '515.123.4568', TO_DATE('1989-09-21 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'AD_VP', '17000', null, '100', '90');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('102', 'Lex', 'De Haan', 'LDEHAAN', '515.123.4569', TO_DATE('1993-01-13 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'AD_VP', '17000', null, '100', '90');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('103', 'Alexander', 'Hunold', 'AHUNOLD', '590.423.4567', TO_DATE('1990-01-03 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'IT_PROG', '9000', null, '102', '60');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('104', 'Bruce', 'Ernst', 'BERNST', '590.423.4568', TO_DATE('1991-05-21 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'IT_PROG', '6000', null, '103', '60');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('105', 'David', 'Austin', 'DAUSTIN', '590.423.4569', TO_DATE('1997-06-25 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'IT_PROG', '4800', null, '103', '60');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('106', 'Valli', 'Pataballa', 'VPATABAL', '590.423.4560', TO_DATE('1998-02-05 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'IT_PROG', '4800', null, '103', '60');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('107', 'Diana', 'Lorentz', 'DLORENTZ', '590.423.5567', TO_DATE('1999-02-07 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'IT_PROG', '4200', null, '103', '60');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('108', 'Nancy', 'Greenberg', 'NGREENBE', '515.124.4569', TO_DATE('1994-08-17 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'FI_MGR', '12000', null, '101', '100');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('109', 'Daniel', 'Faviet', 'DFAVIET', '515.124.4169', TO_DATE('1994-08-16 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'FI_ACCOUNT', '9000', null, '108', '100');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('110', 'John', 'Chen', 'JCHEN', '515.124.4269', TO_DATE('1997-09-28 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'FI_ACCOUNT', '8200', null, '108', '100');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('111', 'Ismael', 'Sciarra', 'ISCIARRA', '515.124.4369', TO_DATE('1997-09-30 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'FI_ACCOUNT', '7700', null, '108', '100');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('112', 'Jose Manuel', 'Urman', 'JMURMAN', '515.124.4469', TO_DATE('1998-03-07 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'FI_ACCOUNT', '7800', null, '108', '100');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('113', 'Luis', 'Popp', 'LPOPP', '515.124.4567', TO_DATE('1999-12-07 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'FI_ACCOUNT', '6900', null, '108', '100');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('114', 'Den', 'Raphaely', 'DRAPHEAL', '515.127.4561', TO_DATE('1994-12-07 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'PU_MAN', '11000', null, '100', '30');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('115', 'Alexander', 'Khoo', 'AKHOO', '515.127.4562', TO_DATE('1995-05-18 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'PU_CLERK', '3100', null, '114', '30');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('116', 'Shelli', 'Baida', 'SBAIDA', '515.127.4563', TO_DATE('1997-12-24 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'PU_CLERK', '2900', null, '114', '30');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('117', 'Sigal', 'Tobias', 'STOBIAS', '515.127.4564', TO_DATE('1997-07-24 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'PU_CLERK', '2800', null, '114', '30');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('118', 'Guy', 'Himuro', 'GHIMURO', '515.127.4565', TO_DATE('1998-11-15 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'PU_CLERK', '2600', null, '114', '30');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('119', 'Karen', 'Colmenares', 'KCOLMENA', '515.127.4566', TO_DATE('1999-08-10 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'PU_CLERK', '2500', null, '114', '30');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('120', 'Matthew', 'Weiss', 'MWEISS', '650.123.1234', TO_DATE('1996-07-18 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'ST_MAN', '8000', null, '100', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('121', 'Adam', 'Fripp', 'AFRIPP', '650.123.2234', TO_DATE('1997-04-10 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'ST_MAN', '8200', null, '100', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('122', 'Payam', 'Kaufling', 'PKAUFLIN', '650.123.3234', TO_DATE('1995-05-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'ST_MAN', '7900', null, '100', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('123', 'Shanta', 'Vollman', 'SVOLLMAN', '650.123.4234', TO_DATE('1997-10-10 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'ST_MAN', '6500', null, '100', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('124', 'Kevin', 'Mourgos', 'KMOURGOS', '650.123.5234', TO_DATE('1999-11-16 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'ST_MAN', '5800', null, '100', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('125', 'Julia', 'Nayer', 'JNAYER', '650.124.1214', TO_DATE('1997-07-16 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'ST_CLERK', '3200', null, '120', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('126', 'Irene', 'Mikkilineni', 'IMIKKILI', '650.124.1224', TO_DATE('1998-09-28 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'ST_CLERK', '2700', null, '120', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('127', 'James', 'Landry', 'JLANDRY', '650.124.1334', TO_DATE('1999-01-14 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'ST_CLERK', '2400', null, '120', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('128', 'Steven', 'Markle', 'SMARKLE', '650.124.1434', TO_DATE('2000-03-08 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'ST_CLERK', '2200', null, '120', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('129', 'Laura', 'Bissot', 'LBISSOT', '650.124.5234', TO_DATE('1997-08-20 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'ST_CLERK', '3300', null, '121', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('130', 'Mozhe', 'Atkinson', 'MATKINSO', '650.124.6234', TO_DATE('1997-10-30 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'ST_CLERK', '2800', null, '121', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('131', 'James', 'Marlow', 'JAMRLOW', '650.124.7234', TO_DATE('1997-02-16 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'ST_CLERK', '2500', null, '121', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('132', 'TJ', 'Olson', 'TJOLSON', '650.124.8234', TO_DATE('1999-04-10 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'ST_CLERK', '2100', null, '121', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('133', 'Jason', 'Mallin', 'JMALLIN', '650.127.1934', TO_DATE('1996-06-14 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'ST_CLERK', '3300', null, '122', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('134', 'Michael', 'Rogers', 'MROGERS', '650.127.1834', TO_DATE('1998-08-26 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'ST_CLERK', '2900', null, '122', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('135', 'Ki', 'Gee', 'KGEE', '650.127.1734', TO_DATE('1999-12-12 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'ST_CLERK', '2400', null, '122', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('136', 'Hazel', 'Philtanker', 'HPHILTAN', '650.127.1634', TO_DATE('2000-02-06 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'ST_CLERK', '2200', null, '122', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('137', 'Renske', 'Ladwig', 'RLADWIG', '650.121.1234', TO_DATE('1995-07-14 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'ST_CLERK', '3600', null, '123', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('138', 'Stephen', 'Stiles', 'SSTILES', '650.121.2034', TO_DATE('1997-10-26 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'ST_CLERK', '3200', null, '123', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('139', 'John', 'Seo', 'JSEO', '650.121.2019', TO_DATE('1998-02-12 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'ST_CLERK', '2700', null, '123', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('140', 'Joshua', 'Patel', 'JPATEL', '650.121.1834', TO_DATE('1998-04-06 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'ST_CLERK', '2500', null, '123', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('141', 'Trenna', 'Rajs', 'TRAJS', '650.121.8009', TO_DATE('1995-10-17 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'ST_CLERK', '3500', null, '124', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('142', 'Curtis', 'Davies', 'CDAVIES', '650.121.2994', TO_DATE('1997-01-29 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'ST_CLERK', '3100', null, '124', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('143', 'Randall', 'Matos', 'RMATOS', '650.121.2874', TO_DATE('1998-03-15 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'ST_CLERK', '2600', null, '124', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('144', 'Peter', 'Vargas', 'PVARGAS', '650.121.2004', TO_DATE('1998-07-09 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'ST_CLERK', '2500', null, '124', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('145', 'John', 'Russell', 'JRUSSEL', '011.44.1344.429268', TO_DATE('1996-10-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_MAN', '14000', '0.40', '100', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('146', 'Karen', 'Partners', 'KPARTNER', '011.44.1344.467268', TO_DATE('1997-01-05 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_MAN', '13500', '0.30', '100', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('147', 'Alberto', 'Errazuriz', 'AERRAZUR', '011.44.1344.429278', TO_DATE('1997-03-10 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_MAN', '12000', '0.30', '100', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('148', 'Gerald', 'Cambrault', 'GCAMBRAU', '011.44.1344.619268', TO_DATE('1999-10-15 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_MAN', '11000', '0.30', '100', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('149', 'Eleni', 'Zlotkey', 'EZLOTKEY', '011.44.1344.429018', TO_DATE('2000-01-29 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_MAN', '10500', '0.20', '100', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('150', 'Peter', 'Tucker', 'PTUCKER', '011.44.1344.129268', TO_DATE('1997-01-30 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_REP', '10000', '0.30', '145', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('151', 'David', 'Bernstein', 'DBERNSTE', '011.44.1344.345268', TO_DATE('1997-03-24 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_REP', '9500', '0.25', '145', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('152', 'Peter', 'Hall', 'PHALL', '011.44.1344.478968', TO_DATE('1997-08-20 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_REP', '9000', '0.25', '145', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('153', 'CTRAININGistopher', 'Olsen', 'COLSEN', '011.44.1344.498718', TO_DATE('1998-03-30 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_REP', '8000', '0.20', '145', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('154', 'Nanette', 'Cambrault', 'NCAMBRAU', '011.44.1344.987668', TO_DATE('1998-12-09 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_REP', '7500', '0.20', '145', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('155', 'Oliver', 'Tuvault', 'OTUVAULT', '011.44.1344.486508', TO_DATE('1999-11-23 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_REP', '7000', '0.15', '145', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('156', 'Janette', 'King', 'JKING', '011.44.1345.429268', TO_DATE('1996-01-30 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_REP', '10000', '0.35', '146', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('157', 'Patrick', 'Sully', 'PSULLY', '011.44.1345.929268', TO_DATE('1996-03-04 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_REP', '9500', '0.35', '146', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('158', 'Allan', 'McEwen', 'AMCEWEN', '011.44.1345.829268', TO_DATE('1996-08-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_REP', '9000', '0.35', '146', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('159', 'Lindsey', 'Smith', 'LSMITH', '011.44.1345.729268', TO_DATE('1997-03-10 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_REP', '8000', '0.30', '146', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('160', 'Louise', 'Doran', 'LDORAN', '011.44.1345.629268', TO_DATE('1997-12-15 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_REP', '7500', '0.30', '146', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('161', 'Sarath', 'Sewall', 'SSEWALL', '011.44.1345.529268', TO_DATE('1998-11-03 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_REP', '7000', '0.25', '146', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('162', 'Clara', 'Vishney', 'CVISHNEY', '011.44.1346.129268', TO_DATE('1997-11-11 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_REP', '10500', '0.25', '147', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('163', 'Danielle', 'Greene', 'DGREENE', '011.44.1346.229268', TO_DATE('1999-03-19 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_REP', '9500', '0.15', '147', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('164', 'Mattea', 'Marvins', 'MMARVINS', '011.44.1346.329268', TO_DATE('2000-01-24 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_REP', '7200', '0.10', '147', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('165', 'David', 'Lee', 'DLEE', '011.44.1346.529268', TO_DATE('2000-02-23 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_REP', '6800', '0.10', '147', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('166', 'Sundar', 'Ande', 'SANDE', '011.44.1346.629268', TO_DATE('2000-03-24 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_REP', '6400', '0.10', '147', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('167', 'Amit', 'Banda', 'ABANDA', '011.44.1346.729268', TO_DATE('2000-04-21 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_REP', '6200', '0.10', '147', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('168', 'Lisa', 'Ozer', 'LOZER', '011.44.1343.929268', TO_DATE('1997-03-11 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_REP', '11500', '0.25', '148', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('169', 'Harrison', 'Bloom', 'HBLOOM', '011.44.1343.829268', TO_DATE('1998-03-23 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_REP', '10000', '0.20', '148', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('170', 'Tayler', 'Fox', 'TFOX', '011.44.1343.729268', TO_DATE('1998-01-24 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_REP', '9600', '0.20', '148', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('171', 'William', 'Smith', 'WSMITH', '011.44.1343.629268', TO_DATE('1999-02-23 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_REP', '7400', '0.15', '148', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('172', 'Elizabeth', 'Bates', 'EBATES', '011.44.1343.529268', TO_DATE('1999-03-24 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_REP', '7300', '0.15', '148', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('173', 'Sundita', 'Kumar', 'SKUMAR', '011.44.1343.329268', TO_DATE('2000-04-21 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_REP', '6100', '0.10', '148', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('174', 'Ellen', 'Abel', 'EABEL', '011.44.1644.429267', TO_DATE('1996-05-11 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_REP', '11000', '0.30', '149', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('175', 'Alyssa', 'Hutton', 'AHUTTON', '011.44.1644.429266', TO_DATE('1997-03-19 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_REP', '8800', '0.25', '149', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('176', 'Jonathon', 'Taylor', 'JTAYLOR', '011.44.1644.429265', TO_DATE('1998-03-24 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_REP', '8600', '0.20', '149', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('177', 'Jack', 'Livingston', 'JLIVINGS', '011.44.1644.429264', TO_DATE('1998-04-23 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_REP', '8400', '0.20', '149', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('178', 'Kimberely', 'Grant', 'KGRANT', '011.44.1644.429263', TO_DATE('1999-05-24 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_REP', '7000', '0.15', '149', null);
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('179', 'Charles', 'Johnson', 'CJOHNSON', '011.44.1644.429262', TO_DATE('2000-01-04 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_REP', '6200', '0.10', '149', '80');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('180', 'Winston', 'Taylor', 'WTAYLOR', '650.507.9876', TO_DATE('1998-01-24 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SH_CLERK', '3200', null, '120', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('181', 'Jean', 'Fleaur', 'JFLEAUR', '650.507.9877', TO_DATE('1998-02-23 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SH_CLERK', '3100', null, '120', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('182', 'Martha', 'Sullivan', 'MSULLIVA', '650.507.9878', TO_DATE('1999-06-21 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SH_CLERK', '2500', null, '120', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('183', 'Girard', 'Geoni', 'GGEONI', '650.507.9879', TO_DATE('2000-02-03 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SH_CLERK', '2800', null, '120', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('184', 'Nandita', 'Sarchand', 'NSARCHAN', '650.509.1876', TO_DATE('1996-01-27 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SH_CLERK', '4200', null, '121', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('185', 'Alexis', 'Bull', 'ABULL', '650.509.2876', TO_DATE('1997-02-20 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SH_CLERK', '4100', null, '121', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('186', 'Julia', 'Dellinger', 'JDELLING', '650.509.3876', TO_DATE('1998-06-24 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SH_CLERK', '3400', null, '121', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('187', 'Anthony', 'Cabrio', 'ACABRIO', '650.509.4876', TO_DATE('1999-02-07 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SH_CLERK', '3000', null, '121', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('188', 'Kelly', 'Chung', 'KCHUNG', '650.505.1876', TO_DATE('1997-06-14 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SH_CLERK', '3800', null, '122', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('189', 'Jennifer', 'Dilly', 'JDILLY', '650.505.2876', TO_DATE('1997-08-13 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SH_CLERK', '3600', null, '122', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('190', 'Timothy', 'Gates', 'TGATES', '650.505.3876', TO_DATE('1998-07-11 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SH_CLERK', '2900', null, '122', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('191', 'Randall', 'Perkins', 'RPERKINS', '650.505.4876', TO_DATE('1999-12-19 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SH_CLERK', '2500', null, '122', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('192', 'Sarah', 'Bell', 'SBELL', '650.501.1876', TO_DATE('1996-02-04 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SH_CLERK', '4000', null, '123', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('193', 'Britney', 'Everett', 'BEVERETT', '650.501.2876', TO_DATE('1997-03-03 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SH_CLERK', '3900', null, '123', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('194', 'Samuel', 'McCain', 'SMCCAIN', '650.501.3876', TO_DATE('1998-07-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SH_CLERK', '3200', null, '123', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('195', 'Vance', 'Jones', 'VJONES', '650.501.4876', TO_DATE('1999-03-17 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SH_CLERK', '2800', null, '123', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('196', 'Alana', 'Walsh', 'AWALSH', '650.507.9811', TO_DATE('1998-04-24 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SH_CLERK', '3100', null, '124', '50');
INSERT INTO "TRAINING"."EMPLOYEES" VALUES ('197', 'Kevin', 'Feeney', 'KFEENEY', '650.507.9822', TO_DATE('1998-05-23 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SH_CLERK', '3000', null, '124', '50');


CREATE TABLE "TRAINING"."JOB_HISTORY" (
"EMPLOYEE_ID" NUMBER(6) NOT NULL ,
"START_DATE" DATE NOT NULL ,
"END_DATE" DATE NOT NULL ,
"JOB_ID" VARCHAR2(10 BYTE) NOT NULL ,
"DEPARTMENT_ID" NUMBER(4) NULL 
);
INSERT INTO "TRAINING"."JOB_HISTORY" VALUES ('102', TO_DATE('1993-01-13 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), TO_DATE('1998-07-24 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'IT_PROG', '60');
INSERT INTO "TRAINING"."JOB_HISTORY" VALUES ('101', TO_DATE('1989-09-21 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), TO_DATE('1993-10-27 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'AC_ACCOUNT', '110');
INSERT INTO "TRAINING"."JOB_HISTORY" VALUES ('101', TO_DATE('1993-10-28 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), TO_DATE('1997-03-15 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'AC_MGR', '110');
INSERT INTO "TRAINING"."JOB_HISTORY" VALUES ('201', TO_DATE('1996-02-17 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), TO_DATE('1999-12-19 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'MK_REP', '20');
INSERT INTO "TRAINING"."JOB_HISTORY" VALUES ('114', TO_DATE('1998-03-24 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), TO_DATE('1999-12-31 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'ST_CLERK', '50');
INSERT INTO "TRAINING"."JOB_HISTORY" VALUES ('122', TO_DATE('1999-01-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), TO_DATE('1999-12-31 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'ST_CLERK', '50');
INSERT INTO "TRAINING"."JOB_HISTORY" VALUES ('200', TO_DATE('1987-09-17 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), TO_DATE('1993-06-17 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'AD_ASST', '90');
INSERT INTO "TRAINING"."JOB_HISTORY" VALUES ('176', TO_DATE('1998-03-24 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), TO_DATE('1998-12-31 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_REP', '80');
INSERT INTO "TRAINING"."JOB_HISTORY" VALUES ('176', TO_DATE('1999-01-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), TO_DATE('1999-12-31 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'SA_MAN', '80');
INSERT INTO "TRAINING"."JOB_HISTORY" VALUES ('200', TO_DATE('1994-07-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), TO_DATE('1998-12-31 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'AC_ACCOUNT', '90');


CREATE TABLE "TRAINING"."JOBS" (
"JOB_ID" VARCHAR2(10 BYTE) NOT NULL ,
"JOB_TITLE" VARCHAR2(35 BYTE) NOT NULL ,
"MIN_SALARY" NUMBER(6) NULL ,
"MAX_SALARY" NUMBER(6) NULL 
);
INSERT INTO "TRAINING"."JOBS" VALUES ('AD_PRES', 'President', '20000', '40000');
INSERT INTO "TRAINING"."JOBS" VALUES ('AD_VP', 'Administration Vice President', '15000', '30000');
INSERT INTO "TRAINING"."JOBS" VALUES ('AD_ASST', 'Administration Assistant', '3000', '6000');
INSERT INTO "TRAINING"."JOBS" VALUES ('FI_MGR', 'Finance Manager', '8200', '16000');
INSERT INTO "TRAINING"."JOBS" VALUES ('FI_ACCOUNT', 'Accountant', '4200', '9000');
INSERT INTO "TRAINING"."JOBS" VALUES ('AC_MGR', 'Accounting Manager', '8200', '16000');
INSERT INTO "TRAINING"."JOBS" VALUES ('AC_ACCOUNT', 'Public Accountant', '4200', '9000');
INSERT INTO "TRAINING"."JOBS" VALUES ('SA_MAN', 'Sales Manager', '10000', '20000');
INSERT INTO "TRAINING"."JOBS" VALUES ('SA_REP', 'Sales Representative', '6000', '12000');
INSERT INTO "TRAINING"."JOBS" VALUES ('PU_MAN', 'Purchasing Manager', '8000', '15000');
INSERT INTO "TRAINING"."JOBS" VALUES ('PU_CLERK', 'Purchasing Clerk', '2500', '5500');
INSERT INTO "TRAINING"."JOBS" VALUES ('ST_MAN', 'Stock Manager', '5500', '8500');
INSERT INTO "TRAINING"."JOBS" VALUES ('ST_CLERK', 'Stock Clerk', '2000', '5000');
INSERT INTO "TRAINING"."JOBS" VALUES ('SH_CLERK', 'Shipping Clerk', '2500', '5500');
INSERT INTO "TRAINING"."JOBS" VALUES ('IT_PROG', 'Programmer', '4000', '10000');
INSERT INTO "TRAINING"."JOBS" VALUES ('MK_MAN', 'Marketing Manager', '9000', '15000');
INSERT INTO "TRAINING"."JOBS" VALUES ('MK_REP', 'Marketing Representative', '4000', '9000');
INSERT INTO "TRAINING"."JOBS" VALUES ('TRAINING_REP', 'Human Resources Representative', '4000', '9000');
INSERT INTO "TRAINING"."JOBS" VALUES ('PR_REP', 'Public Relations Representative', '4500', '10500');



CREATE TABLE "TRAINING"."LOCATIONS" (
"LOCATION_ID" NUMBER(4) NOT NULL ,
"STREET_ADDRESS" VARCHAR2(40 BYTE) NULL ,
"POSTAL_CODE" VARCHAR2(12 BYTE) NULL ,
"CITY" VARCHAR2(30 BYTE) NOT NULL ,
"STATE_PROVINCE" VARCHAR2(25 BYTE) NULL ,
"COUNTRY_ID" CHAR(2 BYTE) NULL 
);

INSERT INTO "TRAINING"."LOCATIONS" VALUES ('1000', '1297 Via Cola di Rie', '00989', 'Roma', null, 'IT');
INSERT INTO "TRAINING"."LOCATIONS" VALUES ('1100', '93091 Calle della Testa', '10934', 'Venice', null, 'IT');
INSERT INTO "TRAINING"."LOCATIONS" VALUES ('1200', '2017 Shinjuku-ku', '1689', 'Tokyo', 'Tokyo Prefecture', 'JP');
INSERT INTO "TRAINING"."LOCATIONS" VALUES ('1300', '9450 Kamiya-cho', '6823', 'Hiroshima', null, 'JP');
INSERT INTO "TRAINING"."LOCATIONS" VALUES ('1400', '2014 Jabberwocky Rd', '26192', 'Southlake', 'Texas', 'US');
INSERT INTO "TRAINING"."LOCATIONS" VALUES ('1500', '2011 Interiors Blvd', '99236', 'South San Francisco', 'California', 'US');
INSERT INTO "TRAINING"."LOCATIONS" VALUES ('1600', '2007 Zagora St', '50090', 'South Brunswick', 'New Jersey', 'US');
INSERT INTO "TRAINING"."LOCATIONS" VALUES ('1700', '2004 Charade Rd', '98199', 'Seattle', 'Washington', 'US');
INSERT INTO "TRAINING"."LOCATIONS" VALUES ('1800', '147 Spadina Ave', 'M5V 2L7', 'Toronto', 'Ontario', 'CA');
INSERT INTO "TRAINING"."LOCATIONS" VALUES ('1900', '6092 Boxwood St', 'YSW 9T2', 'Whitehorse', 'Yukon', 'CA');
INSERT INTO "TRAINING"."LOCATIONS" VALUES ('2000', '40-5-12 Laogianggen', '190518', 'Beijing', null, 'CN');
INSERT INTO "TRAINING"."LOCATIONS" VALUES ('2100', '1298 Vileparle (E)', '490231', 'Bombay', 'Maharashtra', 'IN');
INSERT INTO "TRAINING"."LOCATIONS" VALUES ('2200', '12-98 Victoria Street', '2901', 'Sydney', 'New South Wales', 'AU');
INSERT INTO "TRAINING"."LOCATIONS" VALUES ('2300', '198 Clementi North', '540198', 'Singapore', null, 'SG');
INSERT INTO "TRAINING"."LOCATIONS" VALUES ('2400', '8204 Arthur St', null, 'London', null, 'UK');
INSERT INTO "TRAINING"."LOCATIONS" VALUES ('2500', 'Magdalen Centre, The Oxford Science Park', 'OX9 9ZB', 'Oxford', 'Oxford', 'UK');
INSERT INTO "TRAINING"."LOCATIONS" VALUES ('2600', '9702 Chester Road', '09629850293', 'Stretford', 'Manchester', 'UK');
INSERT INTO "TRAINING"."LOCATIONS" VALUES ('2700', 'Schwanthalerstr. 7031', '80925', 'Munich', 'Bavaria', 'DE');
INSERT INTO "TRAINING"."LOCATIONS" VALUES ('2800', 'Rua Frei Caneca 1360 ', '01307-002', 'Sao Paulo', 'Sao Paulo', 'BR');
INSERT INTO "TRAINING"."LOCATIONS" VALUES ('2900', '20 Rue des Corps-Saints', '1730', 'Geneva', 'Geneve', 'CH');
INSERT INTO "TRAINING"."LOCATIONS" VALUES ('3000', 'Murtenstrasse 921', '3095', 'Bern', 'BE', 'CH');
INSERT INTO "TRAINING"."LOCATIONS" VALUES ('3100', 'Pieter Breughelstraat 837', '3029SK', 'Utrecht', 'Utrecht', 'NL');
INSERT INTO "TRAINING"."LOCATIONS" VALUES ('3200', 'Mariano Escobedo 9991', '11932', 'Mexico City', 'Distrito Federal,', 'MX');


CREATE TABLE "TRAINING"."REGIONS" (
"REGION_ID" NUMBER NOT NULL ,
"REGION_NAME" VARCHAR2(25 BYTE) NULL 
);

INSERT INTO "TRAINING"."REGIONS" VALUES ('1', 'Europe');
INSERT INTO "TRAINING"."REGIONS" VALUES ('2', 'Americas');
INSERT INTO "TRAINING"."REGIONS" VALUES ('3', 'Asia');
INSERT INTO "TRAINING"."REGIONS" VALUES ('4', 'Middle East and Africa');

CREATE OR REPLACE FORCE VIEW "TRAINING"."EMP_DETAILS_VIEW" AS 
SELECT
  e.employee_id,
  e.job_id,
  e.manager_id,
  e.department_id,
  d.location_id,
  l.country_id,
  e.first_name,
  e.last_name,
  e.salary,
  e.commission_pct,
  d.department_name,
  j.job_title,
  l.city,
  l.state_province,
  c.country_name,
  r.region_name
FROM
  employees e,
  departments d,
  jobs j,
  locations l,
  countries c,
  regions r
WHERE e.department_id = d.department_id
  AND d.location_id = l.location_id
  AND l.country_id = c.country_id
  AND c.region_id = r.region_id
  AND j.job_id = e.job_id
WITH READ ONLY 
CONSTRAINTS "SYS_C005392";

/
