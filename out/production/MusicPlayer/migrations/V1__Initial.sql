CREATE TABLE `users` (
  `id` BIGINT unsigned NOT NULL AUTO_INCREMENT,
  `email` varchar(254) NOT NULL DEFAULT '',
  `password` varchar(64) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;