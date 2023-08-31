
CREATE TABLE person (
                        id INT PRIMARY KEY,
                        name VARCHAR(50),
                        gender VARCHAR(10),
                        birthdate DATE
);

CREATE TABLE hobby (
                       id INT PRIMARY KEY,
                       name VARCHAR(50),
                       type_id INT
);

CREATE TABLE hobby_type (
                            id INT PRIMARY KEY,
                            name VARCHAR(50)
);

CREATE TABLE person_hobby (
                              person_id INT,
                              hobby_id INT,
                              FOREIGN KEY (person_id) REFERENCES person(id),
                              FOREIGN KEY (hobby_id) REFERENCES hobby(id)
);



INSERT INTO person VALUES
                       (1, 'John', 'male', '1990-05-15'),
                       (2, 'Mary', 'female', '1995-03-20'),
                       (3, 'Peter', 'male', '1985-10-10'),
                       (4, 'Jane', 'female', '1992-07-08'),
                       (5, 'Tom', 'male', '1998-01-01'),
                       (6, 'Kate', 'female', '1993-12-25'),
                       (7, 'David', 'male', '1979-06-30'),
                       (8, 'Emily', 'female', '1988-09-18'),
                       (9, 'Sam', 'male', '1997-04-05'),
                       (10, 'Lucy', 'female', '1983-11-11');

INSERT INTO hobby_type VALUES
                           (1, 'active'),
                           (2, 'passive');

INSERT INTO hobby VALUES
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

INSERT INTO person_hobby VALUES
                             (1, 1),
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


--Вывести всех людей старше какого-либо возраста:

SELECT * FROM person WHERE birthdate < '1990-01-01';

--Вывести сколько людей каждого пола есть в бд:

SELECT gender, COUNT(*) FROM person GROUP BY gender;

--Вывести информацию о людях и их хобби:

SELECT person.name, hobby.name
FROM person
         JOIN person_hobby ON person.id = person_hobby.person_id
         JOIN hobby ON person_hobby.hobby_id = hobby.id;

--Вывести список людей у которых более одного хобби:

SELECT person.name
FROM person
         JOIN person_hobby ON person.id = person_hobby.person_id
GROUP BY person.name
HAVING COUNT(*) > 1;

--Вывести какое количество активных хобби и пассивных хобби есть в бд:

SELECT hobby_type.name, COUNT(*)
FROM hobby
         JOIN hobby_type ON hobby.type_id = hobby_type.id
GROUP BY hobby_type.name;

--Вывести информацию какое хобби активное а какое пассивное:

SELECT hobby.name, hobby_type.name
FROM hobby
         JOIN hobby_type ON hobby.type_id = hobby_type.id;
--Удаление таблиц:

DROP TABLE person_hobby;
DROP TABLE hobby;
DROP TABLE hobby_type;
DROP TABLE person;