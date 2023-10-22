create table if not exists students(
                                       id int primary key,
                                       first_name varchar(50),
    last_name varchar(50),
    age int,
    team varchar(50),
    city_id int,
    foreign key (city_id) references city(id)
    );
create table if not exists city(
                                   id int primary key ,
                                   city varchar(50)
    );
insert into students values
                         (1,'Mike','Giw',18,'125C',1),
                         (2,'L','Q',20,'124C',2),
                         (3,'Yagami','Light',21,'125C',3),
                         (4,'Alis','Giw',20,'125C',4),
                         (5,'Wiqa','Blue',18,'124C',2),
                         (6,'Wex','Volume',18,'125C',1);
insert into city values
                     (1,'Moscow'),
                     (2,'Sidney'),
                     (3,'Minsk'),
                     (4,'New York');
select *from city;
select *from students join city  on students.city_id = city.id;