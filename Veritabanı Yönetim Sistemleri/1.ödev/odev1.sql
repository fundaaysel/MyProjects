MariaDB [(none)]> create database restoran;
Query OK, 1 row affected (0.01 sec)

MariaDB [(none)]> use restoran;
Database changed
MariaDB [restoran]> create table musteri(mno int primary key,madi varchar(30),msoyadi varchar(30),mtelefon int);
Query OK, 0 rows affected (0.31 sec)

MariaDB [restoran]> insert into musteri values('1','Ayse','Demir','6844652');
Query OK, 1 row affected (0.12 sec)

MariaDB [restoran]> insert into musteri values('2','Ali','Kurt','8241667');
Query OK, 1 row affected (0.13 sec)

MariaDB [restoran]> insert into musteri values('3','Buse','Tunc','6864163');
Query OK, 1 row affected (0.14 sec)

MariaDB [restoran]> insert into musteri values('4','Aysel','Yildiz','7641736');
Query OK, 1 row affected (0.05 sec)

MariaDB [restoran]> insert into musteri values('5','Berke','Klah','1246891');
Query OK, 1 row affected (0.12 sec)

MariaDB [restoran]> select *from musteri;
+-----+-------+---------+----------+
| mno | madi  | msoyadi | mtelefon |
+-----+-------+---------+----------+
|   1 | Ayse  | Demir   |  6844652 |
|   2 | Ali   | Kurt    |  8241667 |
|   3 | Buse  | Tunc    |  6864163 |
|   4 | Aysel | Yildiz  |  7641736 |
|   5 | Berke | Klah   |  1246891 |
+-----+-------+---------+----------+
5 rows in set (0.00 sec)

MariaDB [restoran]> create table Yemek(yno int primary key,yadi varchar(30),ykalori int,yfiyati int,yturu varchar(30));
Query OK, 0 rows affected (0.22 sec)

MariaDB [restoran]> insert into Yemek values('10','Ezogelin','95','10','Corba');
Query OK, 1 row affected (0.03 sec)

MariaDB [restoran]> insert into Yemek values('15','Trl','143','18','Ana yemek');
Query OK, 1 row affected (0.14 sec)

MariaDB [restoran]> insert into Yemek values('20','Kuru faslye','350','15','Ana yemek');
Query OK, 1 row affected (0.12 sec)

MariaDB [restoran]> insert into Yemek values('25','Kereviz yeme§i','220','17','Ana yemek');
Query OK, 1 row affected (0.03 sec)

MariaDB [restoran]> insert into Yemek values('30','€oban Salata','115','21','Salata');
Query OK, 1 row affected (0.12 sec)

MariaDB [restoran]> insert into Yemek values('35','Pirinc pilav','130','12','Ana Yemek');
Query OK, 1 row affected (0.13 sec)

MariaDB [restoran]> select *from Yemek;
+-----+----------------+---------+---------+-----------+
| yno | yadi           | ykalori | yfiyati | yturu     |
+-----+----------------+---------+---------+-----------+
|  10 | Ezogelin       |      95 |      10 | Corba     |
|  15 | Trl          |     143 |      18 | Ana yemek |
|  20 | Kuru faslye   |     350 |      15 | Ana yemek |
|  25 | Kereviz yeme§i |     220 |      17 | Ana yemek |
|  30 | €oban Salata   |     115 |      21 | Salata    |
|  35 | Pirinc pilav  |     130 |      12 | Ana Yemek |
+-----+----------------+---------+---------+-----------+
6 rows in set (0.00 sec)

MariaDB [restoran]> create table Malzeme(zno int primary key,zadi varchar(30),ztipi varchar(30));
Query OK, 0 rows affected (0.29 sec)

MariaDB [restoran]> insert into Malzeme values('101','Patlican','Sebze');
Query OK, 1 row affected (0.12 sec)

MariaDB [restoran]> insert into Malzeme values('102','Kuru faslye','Bakliyat');
Query OK, 1 row affected (0.08 sec)

MariaDB [restoran]> insert into Malzeme values('103','So§an','Sebze');
Query OK, 1 row affected (0.12 sec)

MariaDB [restoran]> insert into Malzeme values('104','Patates','Sebze');
Query OK, 1 row affected (0.12 sec)

MariaDB [restoran]> insert into Malzeme values('105','Domates','Meyve');
Query OK, 1 row affected (0.12 sec)

MariaDB [restoran]> insert into Malzeme values('106','Kereviz','Sebze');
Query OK, 1 row affected (0.12 sec)

MariaDB [restoran]> insert into Malzeme values('107','Havu‡','Sebze');
Query OK, 1 row affected (0.03 sec)

MariaDB [restoran]> insert into Malzeme values('108','Taze Faslye','Meyve');
Query OK, 1 row affected (0.05 sec)

MariaDB [restoran]> insert into Malzeme values('109','Mercimek','Bakliyat');
Query OK, 1 row affected (0.12 sec)

MariaDB [restoran]> insert into Malzeme values('110','Pirin‡','Bakliyat');
Query OK, 1 row affected (0.04 sec)

MariaDB [restoran]> insert into Malzeme values('111','Salatalk','Meyve');
Query OK, 1 row affected (0.04 sec)

MariaDB [restoran]> insert into Malzeme values('112','Arpa žehriye','Bakliyat');
Query OK, 1 row affected (0.04 sec)

MariaDB [restoran]> select *from malzeme;
+-----+--------------+----------+
| zno | zadi         | ztipi    |
+-----+--------------+----------+
| 101 | Patlican     | Sebze    |
| 102 | Kuru faslye | Bakliyat |
| 103 | So§an        | Sebze    |
| 104 | Patates      | Sebze    |
| 105 | Domates      | Meyve    |
| 106 | Kereviz      | Sebze    |
| 107 | Havu‡        | Sebze    |
| 108 | Taze Faslye | Meyve    |
| 109 | Mercimek     | Bakliyat |
| 110 | Pirin‡       | Bakliyat |
| 111 | Salatalk    | Meyve    |
| 112 | Arpa žehriye | Bakliyat |
+-----+--------------+----------+
12 rows in set (0.00 sec)

MariaDB [restoran]> create table Siparis(mno int,yno int,tarih/saat datetime);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MariaDB server version for the right syntax to use near '/saat datetime)' at line 1
MariaDB [restoran]> create table Siparis(mno int,yno int,tarih/saat DATET˜ME);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MariaDB server version for the right syntax to use near '/saat DATET˜ME)' at line 1
MariaDB [restoran]> create table Siparis(mno int,yno int,tarih DATE);
Query OK, 0 rows affected (0.25 sec)

MariaDB [restoran]> insert into Siparis values('1','15','12-09-2018');
Query OK, 1 row affected, 1 warning (0.14 sec)

MariaDB [restoran]> delete from siparis where mno=1;
Query OK, 1 row affected (0.14 sec)

MariaDB [restoran]> insert into Siparis values('1','15','2018-09-12');
Query OK, 1 row affected (0.13 sec)

MariaDB [restoran]> insert into Siparis values('2','10','2018-08-13');
Query OK, 1 row affected (0.03 sec)

MariaDB [restoran]> insert into Siparis values('3','25','2018-10-16');
Query OK, 1 row affected (0.83 sec)

MariaDB [restoran]> insert into Siparis values('4','30','2018-09-17');
Query OK, 1 row affected (0.03 sec)

MariaDB [restoran]> insert into Siparis values('5','20','2018-10-19');
Query OK, 1 row affected (0.11 sec)

MariaDB [restoran]> insert into Siparis values('1','35','2018-09-12');
Query OK, 1 row affected (0.14 sec)

MariaDB [restoran]> insert into Siparis values('2','25','2018-08-13');
Query OK, 1 row affected (0.12 sec)

MariaDB [restoran]> insert into Siparis values('3','30','2018-10-16');
Query OK, 1 row affected (0.05 sec)

MariaDB [restoran]> insert into Siparis values('4','35','2018-09-17');
Query OK, 1 row affected (0.11 sec)

MariaDB [restoran]> insert into Siparis values('5','35','2018-10-19');
Query OK, 1 row affected (0.12 sec)

MariaDB [restoran]> select *from siparis;
+------+------+------------+
| mno  | yno  | tarih      |
+------+------+------------+
|    1 |   15 | 2018-09-12 |
|    2 |   10 | 2018-08-13 |
|    3 |   25 | 2018-10-16 |
|    4 |   30 | 2018-09-17 |
|    5 |   20 | 2018-10-19 |
|    1 |   35 | 2018-09-12 |
|    2 |   25 | 2018-08-13 |
|    3 |   30 | 2018-10-16 |
|    4 |   35 | 2018-09-17 |
|    5 |   35 | 2018-10-19 |
+------+------+------------+
10 rows in set (0.00 sec)

MariaDB [restoran]> create table Kullan(yno int,zno int,miktar varchar(30));
Query OK, 0 rows affected (0.28 sec)

MariaDB [restoran]> insert into Kullan values('10','109','2 su barda§');
Query OK, 1 row affected (0.12 sec)

MariaDB [restoran]> insert into Kullan values('10','110','2 yemek kaŸ§');
Query OK, 1 row affected (0.14 sec)

MariaDB [restoran]> insert into Kullan values('10','107','1 tane');
Query OK, 1 row affected (0.12 sec)

MariaDB [restoran]> insert into Kullan values('10','103','1 tane');
Query OK, 1 row affected (0.03 sec)

MariaDB [restoran]> insert into Kullan values('15','101','2 tane');
Query OK, 1 row affected (0.12 sec)

MariaDB [restoran]> insert into Kullan values('15','108','1 kilo');
Query OK, 1 row affected (0.17 sec)

MariaDB [restoran]> insert into Kullan values('15','103','1 tane');
Query OK, 1 row affected (0.04 sec)

MariaDB [restoran]> insert into Kullan values('15','104','1 tane');
Query OK, 1 row affected (0.13 sec)

MariaDB [restoran]> insert into Kullan values('20','102','2 su barda§');
Query OK, 1 row affected (0.12 sec)

MariaDB [restoran]> insert into Kullan values('20','103','1 tane');
Query OK, 1 row affected (0.12 sec)

MariaDB [restoran]> insert into Kullan values('20','104','2 tane');
Query OK, 1 row affected (0.12 sec)

MariaDB [restoran]> insert into Kullan values('25','105','1 tane');
Query OK, 1 row affected (0.13 sec)

MariaDB [restoran]> insert into Kullan values('25','106','1 kilo');
Query OK, 1 row affected (0.12 sec)

MariaDB [restoran]> insert into Kullan values('25','107','2 tane');
Query OK, 1 row affected (0.03 sec)

MariaDB [restoran]> insert into Kullan values('30','105','2 tane');
Query OK, 1 row affected (0.23 sec)

MariaDB [restoran]> insert into Kullan values('30','111','1 tane');
Query OK, 1 row affected (0.12 sec)

MariaDB [restoran]> insert into Kullan values('30','103','1 tane');
Query OK, 1 row affected (0.12 sec)

MariaDB [restoran]> insert into Kullan values('35','110','2 su barda§');
Query OK, 1 row affected (0.04 sec)

MariaDB [restoran]> insert into Kullan values('35','112','Yarm su barda§');
Query OK, 1 row affected (0.13 sec)

MariaDB [restoran]> select *from Kullan;
+------+------+------------------+
| yno  | zno  | miktar           |
+------+------+------------------+
|   10 |  109 | 2 su barda§     |
|   10 |  110 | 2 yemek kaŸ§   |
|   10 |  107 | 1 tane           |
|   10 |  103 | 1 tane           |
|   15 |  101 | 2 tane           |
|   15 |  108 | 1 kilo           |
|   15 |  103 | 1 tane           |
|   15 |  104 | 1 tane           |
|   20 |  102 | 2 su barda§     |
|   20 |  103 | 1 tane           |
|   20 |  104 | 2 tane           |
|   25 |  105 | 1 tane           |
|   25 |  106 | 1 kilo           |
|   25 |  107 | 2 tane           |
|   30 |  105 | 2 tane           |
|   30 |  111 | 1 tane           |
|   30 |  103 | 1 tane           |
|   35 |  110 | 2 su barda§     |
|   35 |  112 | Yarm su barda§ |
+------+------+------------------+
19 rows in set (0.00 sec)

MariaDB [restoran]> select m.zadi from siparis as s,Kullan as k,malzeme as m where s.yno=k.yno and k.zno=m.zno and s.mno='2';
+----------+
| zadi     |
+----------+
| Mercimek |
| Pirin‡   |
| Havu‡    |
| So§an    |
| Domates  |
| Kereviz  |
| Havu‡    |
+----------+
7 rows in set (0.00 sec)

MariaDB [restoran]> select Distinct m.zadi from siparis as s,Kullan as k,malzeme as m where s.yno=k.yno and k.zno=m.zno and s.mno='2';
+----------+
| zadi     |
+----------+
| Mercimek |
| Pirin‡   |
| Havu‡    |
| So§an    |
| Domates  |
| Kereviz  |
+----------+
6 rows in set (0.00 sec)

MariaDB [restoran]> select yemek* from yemek,kullan,malzeme where not exist((select zno from malzeme) minus (select zno from kullan where yno=20));
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MariaDB server version for the right syntax to use near 'from yemek,kullan,malzeme where not exist((select zno from malzeme) minus (selec' at line 1
MariaDB [restoran]> select yemek* from kullan,yemek where not exist((select zno from malzeme) minus (select zno from kullan where yno=20));
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MariaDB server version for the right syntax to use near 'from kullan,yemek where not exist((select zno from malzeme) minus (select zno fr' at line 1
MariaDB [restoran]> select musteri* from kullan as k,siparis as s,musteri as m where k.yno=s.yno and s.mno=m.mno and k.zno='105' INTERSECT select musteri* from kullan as k,siparis as s, musteri as m where k.yno=s.yno and s.mno=m.mno and k.zno='106';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MariaDB server version for the right syntax to use near 'from kullan as k,siparis as s,musteri as m where k.yno=s.yno and s.mno=m.mno and' at line 1
MariaDB [restoran]> select madi,msoyadi from musteri as m,siparis as s,kullan as k where s.yno=k.yno and m.mno=s.mno and k.zno='105';
+-------+---------+
| madi  | msoyadi |
+-------+---------+
| Ali   | Kurt    |
| Buse  | Tunc    |
| Buse  | Tunc    |
| Aysel | Yildiz  |
+-------+---------+
4 rows in set (0.00 sec)

MariaDB [restoran]> select DISTINCT madi,msoyadi from musteri as m,siparis as s,kullan as k where s.yno=k.yno and m.mno=s.mno and k.zno='105';
+-------+---------+
| madi  | msoyadi |
+-------+---------+
| Ali   | Kurt    |
| Buse  | Tunc    |
| Aysel | Yildiz  |
+-------+---------+
3 rows in set (0.00 sec)

MariaDB [restoran]> select COUNT(yno),zno,miktar from kullan group by(select count(zno) from kullan where zno>=3);
+------------+------+--------------+
| COUNT(yno) | zno  | miktar       |
+------------+------+--------------+
|         19 |  109 | 2 su barda§ |
+------------+------+--------------+
1 row in set (0.10 sec)

MariaDB [restoran]> select zno,COUNT(yno),miktar from kullan group by(select count(zno) from kullan where zno>=3);
+------+------------+--------------+
| zno  | COUNT(yno) | miktar       |
+------+------------+--------------+
|  109 |         19 | 2 su barda§ |
+------+------------+--------------+
1 row in set (0.00 sec)

MariaDB [restoran]> select zno,COUNT(yno),AVG(miktar) as ort from kullan group by zno having count(zno)>=3;
+------+------------+------+
| zno  | COUNT(yno) | ort  |
+------+------------+------+
|  103 |          4 |    1 |
+------+------------+------+
1 row in set, 19 warnings (0.01 sec)

MariaDB [restoran]> 