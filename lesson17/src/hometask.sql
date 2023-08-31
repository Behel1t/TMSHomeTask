create table if not exists person(
                                     id int primary key,
                                     name_person varchar(50),
    gender varchar(10),
    person_birth date
    );
insert into person(id,name_person,gender,person_birth) values (1,'Daniel','man','1983-10-24'),
                                                              (2,'Walter','man','1983-09-10'),
                                                              (3,'Dana','women','1949-03-15'),
                                                              (4,'Dora','women','1996-01-22'),
                                                              (5,'Marry','women','1998-03-17'),
                                                              (6,'Frank','man','2000-08-28'),
                                                              (7,'Wally','man','2010-06-30'),
                                                              (8,'Alis','women','2007-10-24'),
                                                              (9,'Harry','men','1999-05-07'),
                                                              (10,'Alex','men','1995-07-31');
create table if not exists hobby (
                                     id int primary key,
                                     name varchar(50),
    type_id int,
    foreign key (type_id) references person(id)


    );
insert into hobby(id, name, type_id) values
                                         (1, 'football', 1),
                                         (2, 'reading', 2),
                                         (3, 'swimming', 1),
                                         (4, 'painting', 2),
                                         (5, 'hiking', 1),
                                         (6, 'cooking', 2),
                                         (7, 'dancing', 1),
                                         (8, 'photography', 2),
                                         (9, 'tennis', 1),
                                         (10, 'knitting', 2);

create table if not exists hobby_type(
                                         id int primary key,
                                         name varchar(50)
    );

insert into  hobby_type(id, name) values (1,'active'),
                                         (2,'passive');
create table if not exists person_hobby(
                                           person_id int,
                                           hobby_id int,
                                           FOREIGN KEY (person_id) REFERENCES person(id),
    FOREIGN KEY (hobby_id) REFERENCES hobby(id)
    );
insert into person_hobby(person_id, hobby_id) values (1, 1),
                                                     (1, 3),
                                                     (1, 5),
                                                     (2, 2),
                                                     (2, 4),
                                                     (3, 1),
                                                     (3, 7),
                                                     (4, 2),
                                                     (4, 6),
                                                     (5, 3),
                                                     (5, 4),
                                                     (6, 5),
                                                     (6, 7),
                                                     (6, 9),
                                                     (7, 1),
                                                     (7, 3),
                                                     (7, 7),
                                                     (8, 2),
                                                     (8, 4),
                                                     (8, 8),
                                                     (9, 1),
                                                     (9, 5),
                                                     (9, 9),
                                                     (10, 2),
                                                     (10, 6);

select *from person;
select *from hobby;
select *from hobby_type;
select *from person_hobby;

-- Вывести всех людей старше какого-либо возраста:

SELECT * FROM person WHERE person_birth < '1990-01-01';

-- Вывести сколько людей каждого пола есть в бд:

SELECT gender, COUNT(*) FROM person GROUP BY gender;

-- Вывести информацию о людях и их хобби:

SELECT person.name, hobby.name
FROM person
         JOIN person_hobby ON person.id = person_hobby.person_id
         JOIN hobby ON person_hobby.hobby_id = hobby.id;

-- Вывести список людей у которых более одного хобби:

SELECT person.name
FROM person
         JOIN person_hobby ON person.id = person_hobby.person_id
GROUP BY person.name
HAVING COUNT(*) > 1;

-- Вывести какое количество активных хобби и пассивных хобби есть в бд:

SELECT hobby_type.name, COUNT(*)
FROM hobby
         JOIN hobby_type ON hobby.type_id = hobby_type.id
GROUP BY hobby_type.name;

-- Вывести информацию какое хобби активное а какое пассивное:

SELECT hobby.name, hobby_type.name
FROM hobby
         JOIN hobby_type ON hobby.type_id = hobby_type.id;
-- Удаление таблиц:

DROP TABLE person_hobby;
DROP TABLE hobby;
DROP TABLE hobby_type;
DROP TABLE person;