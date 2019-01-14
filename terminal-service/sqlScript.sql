CREATE DATABASE `test`;
CREATE TABLE `test`.`terminal` (
  `id` BINARY(36) NOT NULL,
  `shopid` VARCHAR(6) NULL,
  `terminalindex` VARCHAR(6) NULL,
  `installstatus` VARCHAR(1) NULL,
  `installationdate` DATE NULL,
  `softwareversion` VARCHAR(10) NULL,
  PRIMARY KEY (`id`));

INSERT INTO `test`.`terminal` (`UID`, `shop_id`, `terminal_index`, `install_status`, `installation_date`, `software_version`)
VALUES ((random_uuid()), '3', '4', 'P', '2018-12-31', '543');