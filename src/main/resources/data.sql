insert into type_of_price (price_type, active) values ('За все', true),('За квадратный метр', true);
insert into transaction_type (name,active) values ('Продажа', true), ('Аренда', true);
insert into property_type (name,active) values ('Квартира', true), ('Дом', true), ('Комната', true);
insert into room_count(count_of_room, active) values (1, true),(2,true),(3,true),(4,true),(5,true),(6,true);
insert into residential_complex(name, active) values ('ЖК Мурас', true),('ЖК Алтын Ордо', true),('ЖК Ала Арча', true),('ЖК Салкын Тор', true),('ЖК Авангард', true);
insert into series(name, active) values ('102', true),('104', true),('105', true),('105', true),('106', true),('хрущевка', true),('элитка', true),('малосемейка', true),('пентхаус', true),('107', true),('108', true);
insert into state(name, active) values ('Евроремонт', true), ('Хорошее', true), ('Среднее', true);
insert into type_of_structure(name, active) values ('Кирпич', true), ('Монолит', true), ('Панельный', true);
insert into possibility_of_exchange(status, active) values ('Рассмотрю варианты', true), ('С доплатой покупателя', true), ('Ключ на ключ', true), ('С доплатой продавца', true);
insert into heating(name, active) values ('Центральное', true), ('На газе', true),('Электрическое', true);
insert into mortgage(mortgage_possibility, active) values ('Есть', true), ('Нет', true);
insert into installment_plan(possibility_of_installments, active) values ('Да', true),('Нет', true);
insert into currencies(active, name) values (true, 'Доллары'), (true, 'Сомы');
insert into exchange_rates(rate, start_date, end_date, active) values (89.3, '2024-05-28 15:45:10', '2024-05-28 23:59:59', true);
insert into exchange_rates(rate, start_date, end_date, active) values (88.5, '2024-05-29 00:00:01', '2024-05-29 23:59:59', true);
insert into location(id,name,active) values (1, 'Чуйская область', true), (2,'Ошская область', true), (3,'Нарынская область', true), (4,'Жалал-Абадская область', true),
                                (5,'Таласская область', true), (6,'Иссык-Кульская область', true), (7,'Баткенская область', true);
insert into location(id, name, id_region, active) values (8, 'Бишкек', 1, true), (9, 'Кара-Балта', 1, true), (10,'Кант', 1, true),
                                               (11, 'Ош', 2, true), (12, 'Озгон', 2, true), (13, 'Нарын', 3, true), (14,'Чаек', 3, true),
                                               (15,'Майлы-Суу', 4, true),(16, 'Бакай-Ата', 5, true), (17, 'Манас', 5, true),
                                               (18, 'Чолпон-Ата', 6, true), (19,'Туп', 6, true), (20, 'Лейлек', 7, true),(21,'Раззаков', 7, true);
insert into location(id, name, id_city, active) values (22,'Ленинский райн', 8, true),(23,'Свердловский район',8, true),(24, 'Октябрьский район', 8, true),(25, 'Первомайский район', 8, true),
                                                     (26, 'Жайылский район',9, true),(27,'Ысык-Ата', 10, true),(28, 'Центральный район', 11, true), (29, 'Новый город', 11, true),
                                                     (30, 'Верхний Озгон',12, true), (31, 'Нижний Озгон', 12, true),
                                                     (32, 'Кек-Таш', 15, true), (33,'Сары-Бээ', 15, true);


