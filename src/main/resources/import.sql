INSERT INTO tb_user (name, username, password) VALUES ('Mario', 'mario@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_CLIENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 2);

INSERT INTO tb_environment(name, description) VALUES('Casa Camelo', 'Top environment');
INSERT INTO tb_plant(name, color, url_Icon, environment_Id) VALUES('Suculenta', 'blue', 'https://cdn.pixabay.com/photo/2018/03/22/10/55/training-course-3250007_1280.jpg', 1);
INSERT INTO tb_plant(name, color, url_Icon, environment_Id) VALUES('Cactos', 'red', 'https://cdn.pixabay.com/photo/2018/03/22/10/55/training-course-3250007_1280.jpg', 1);

INSERT INTO tb_sensor(soil_Moisture, air_Humidity, luminosity, info_Date, version, plant_id) VALUES(74.0, 57.0, 3.0, TIMESTAMP WITH TIME ZONE '2020-11-20T03:00:00Z', 'Version 1',1);
INSERT INTO tb_sensor(soil_Moisture, air_Humidity, luminosity, info_Date, version, plant_id) VALUES(70.0, 53.0, 3.0, TIMESTAMP WITH TIME ZONE '2020-11-20T03:00:00Z', 'Version 1',1);
INSERT INTO tb_sensor(soil_Moisture, air_Humidity, luminosity, info_Date, version, plant_id) VALUES(80.0, 53.0, 2.0, TIMESTAMP WITH TIME ZONE '2020-11-20T03:00:00Z', 'Version 1',2);
INSERT INTO tb_sensor(soil_Moisture, air_Humidity, luminosity, info_Date, version, plant_id) VALUES(20.0, 50.0, 2.0, TIMESTAMP WITH TIME ZONE '2020-11-20T03:00:00Z', 'Version 1',2);

UPDATE tb_user SET environment_Id = 1 WHERE Id = 1;

