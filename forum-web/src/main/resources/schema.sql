INSERT INTO `demo`.`t_country`(`id`, `country_name`, `country_code`, `country_num`) VALUES (1, '中国', '001', 1);
INSERT INTO `demo`.`t_country`(`id`, `country_name`, `country_code`, `country_num`) VALUES (2, '美国', '002', 2);
INSERT INTO `demo`.`t_country`(`id`, `country_name`, `country_code`, `country_num`) VALUES (3, '日本', '003', 3);
INSERT INTO `demo`.`t_country`(`id`, `country_name`, `country_code`, `country_num`) VALUES (4, '德国', '004', 4);
ALTER TABLE t_country MODIFY COLUMN country_code VARCHAR(200)
