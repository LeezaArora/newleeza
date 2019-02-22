create database ftp02;
use ftp02;
use sqlpractice;
select * from emp;
update emp set name = upper(name);

update emp set name = lower(name);

increase 1000 basic for empno5

update emp set basic = basic+1000 where empno=5; 
update emp set basic =basic+10000 where dept='java';

select * from emp;

select * from agent;

update AGENT SET FullName=concat(FirstName,' ',MI,' ',LastName);

select LOWER(substr(name,2)) from emp;

select UPPER(substr(NAME,1,1)) FROM EMP;

SELECT CONCAT(UPPER(substr(NAME,1,1)),LOWER(substr(name,2))) AS 'CAP'FROM EMP ;

SELECT LENGTH(NAME) FROM EMP

SELECT LEFT(NAME,1) FROM EMP


DROP DATABASE FTP02

CREATE DATABASE SQLDAY4

USE SQLDAY4

CREATE TABLE AGENT (
  AGENTID INT AUTO_INCREMENT,
  FIRSTNAME VARCHAR(30),
  MI VARCHAR(1),
  LASTNAME VARCHAR(30),
  FULLNAME VARCHAR(80),
  GENDER VARCHAR(10),
  DOB DATE,
  SSN VARCHAR(30),
  MARITALSTATUS INT,
  ADDRESS1 VARCHAR(30),
  ADDRESS2 VARCHAR(30),
  CITY VARCHAR(30),
  STATE VARCHAR(30),
  ZIPCODE VARCHAR(30),
  COUNTRY VARCHAR(30),
  PRIMARY KEY(AGENTID)
)


SELECT * FROM AGENT

DESC AGENT

AGENT ( AGENTID, FIRSTNAME,MI,LASTNAME, FULLNAME,GENDER,DOB,SSN,MARITALSTATUS,ADDRESS1,ADDRESS2,CITY,STATE,ZIPCODE,COUNTRY)

INSERT INTO AGENT(FIRSTNAME,MI,LASTNAME,GENDER,DOB,SSN,MARITALSTATUS,ADDRESS1,ADDRESS2,CITY,STATE,ZIPCODE,COUNTRY) 
VALUES('OM','K','WEA','MALE','2019-01-12','DASD',1,'ADAS','ASDAS','PUNE','MAHA','52551','INDIA'),
('O','G','WAD','MALE','2019-01-12','DASD',1,'ADAS','ASDAS','PUNE','MAHA','52551','INDIA'),
('DFB','K','WAF','FEMALE','2019-01-12','DASD',1,'ADAS','ASDAS','PUNE','MAHA','52551','INDIA'),
('RC','K','WAF','FEMALE','2019-01-12','DASD',1,'ADAS','ASDAS','PUNE','MAHA','52551','INDIA'),
('ZF','K','WDA','FEMALE','2019-01-12','DASD',1,'ADAS','ASDAS','PUNE','MAHA','52551','INDIA'),
('SDVB','K','WSA','MALE','2019-01-12','DASD',1,'ADAS','ASDAS','PUNE','MAHA','52551','INDIA'),
('VVV','K','WASA','MALE','2019-01-12','DASD',1,'ADAS','ASDAS','PUNE','MAHA','52551','INDIA'),
('DFF','K','WASD','MALE','2019-01-12','DASD',1,'ADAS','ASDAS','PUNE','MAHA','52551','INDIA'),
('XCVSF','K','WAAA','MALE','2019-01-12','DASD',1,'ADAS','ASDAS','PUNE','MAHA','52551','INDIA')


CREATE TABLE POLICY(
POLICYID INT AUTO_INCREMENT,
Appnumber varchar(30),
Appdate date,
PolicyNumber varchar(30),
AnuualPremium numeric(9,2),
paymentModeID int CHECK(PaymentModeID IN(1,2,3)),
ModelPremium numeric(9,2),
constraint pk_policy_policyID primary key(PolicyID)
);


insert into policy(Appnumber,Appdate,PolicyNumber,AnuualPremium,paymentModeID,ModelPremium) 
values(12,'2019-02-14','D25','5154.22','1','5566.22'),
(12,'2019-02-14','D25.','52545.25','1','556.02'),
(12,'2019-02-14','D200','52552.52','3','5866.12'),
(12,'2019-02-14','D35','52530.62','2','5667.32'),
(12,'2019-02-14','D96','5255.72','3','558.82'),
(12,'2019-02-14','D146','52504.12','2','559.62'),
(12,'2019-02-14','D416','52964.02','3','584.52'),
(12,'2019-02-14','D6','52548.32','1','562.12'),
(12,'2019-02-14','D256','52587.82','3','5845.32'),
(12,'2019-02-14','D256','5254.24','2','5854.22')


create table AgentPolicy
(
AgentID INT,
PolicyID INT,
IsSplitAgent INT,
Constraint fk_agentPolicy_AgentID Foreign key(AgentID) references agent(agentID) on delete cascade,
Constraint fk_agentPolicy_PolicyID Foreign key(policyID) references policy(policyID),
constraint pk_agp primary key(AgentID, PolicyID)
)

drop table agentpolicy;
desc agentpolicy;

insert into agentpolicy(agentID,policyID,IssplitAgent) 
values (1,1,2),
(1,3,1),
(2,3,1),
(2,1,1)


insert into agentpolicy(agentID,policyID,IssplitAgent) 
values (2,4,1),
(2,5,1),
(4,1,2),
(4,3,1),
(5,3,2),
(5,2,1)

select * from agent


select * from agentpolicy

delete from agent where agentid=1 


use sqlpractice
desc emp
show tables
 
alter table emp 
modify column dept Name1 varchar(30)