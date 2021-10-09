CREATE DATABASE IF NOT EXISTS `hotel_reservation_system`;
USE `hotel_reservation_system`;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(45) DEFAULT NULL,
    `last_name` VARCHAR(45) DEFAULT NULL,
    `email` VARCHAR(50) DEFAULT NULL,
    `address` VARCHAR(200) DEFAULT NULL,
    `loyalty_points` int(11) DEFAULT 0,
     PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `payment`;
CREATE TABLE `payment` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `amount` int(11) NOT NULL DEFAULT 0,
    `created_at` DATETIME DEFAULT CURRENT_TIMESTAMP,
    `updated_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    `type` VARCHAR(20) DEFAULT NULL,
    `user_id` int(11) NOT NULL,
    `room_id` int(11) NOT NULL,
     PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `review`;
CREATE TABLE `review` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `rating` int(5) NOT NULL DEFAULT 0,
    `review` VARCHAR(255) DEFAULT NULL,
    `posted_at` DATETIME DEFAULT CURRENT_TIMESTAMP,
    `updated_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    `user_id` int(11) NOT NULL,
    `room_id` int(11) NOT NULL,
     PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `reservation`;
CREATE TABLE `reservation` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `created_at` DATETIME DEFAULT CURRENT_TIMESTAMP,
    `updated_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    `expire_date` DATETIME NOT NULL,
    `room_id` int(11) NOT NULL,
    `user_id` int(11) NOT NULL,
     PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `room`;

CREATE TABLE `room` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(45) DEFAULT NULL,
    `price` int(5) NOT NULL DEFAULT 0,
    `description` VARCHAR(255) DEFAULT NULL,
    `image_url` VARCHAR(255) DEFAULT NULL,
    `status` BOOLEAN NOT NULL DEFAULT 1,
    `user_id` int(11) NOT NULL,
     PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `room` VALUES
    (1, 'Kozi JKIA', 35, 'A place to be and relax', 'https://cf.bstatic.com/xdata/images/hotel/square600/289849327.webp?k=d60c7178c38caba2a5c3770cafd42d44014fb46ba07f1342b7098d5090d95656&o=&s=1', 1),
    (2, 'Edmor Residence Riverside', 56, 'Boasting a shared lounge, garden views', 'https://cf.bstatic.com/xdata/images/hotel/square600/230077216.webp?k=7e51db1d7f4879206865d91c737a56d6c00a645aa9858ba02947b3609c04826d&o=&s=1', 1),
    (3, 'West Suites', 25, 'Free Wifi and free private parking', 'https://cf.bstatic.com/xdata/images/hotel/square600/209453491.webp?k=91f67c355f4066743daf0ab2db0755635732fbb662ed79ede984830d2f9a5687&o=&s=1', 1),
    (4, 'Maison Mitwaba', 45, 'Offering a garden', 'https://cf.bstatic.com/xdata/images/hotel/square600/209453491.webp?k=91f67c355f4066743daf0ab2db0755635732fbb662ed79ede984830d2f9a5687&o=&s=1', 1),
    (5, 'Casa Misa', 54, 'A place to be and relax, garden views, free WIFI', 'https://cf.bstatic.com/xdata/images/hotel/square600/299572807.webp?k=8f8ddeb451071c7ad3f3f0bbf964c34408209393ca537c1e3b2193b218fbee97&o=&s=1', 1),
    (6, 'Luxel Suites by Edmor Suites', 20, 'A place to be and relax', 'https://cf.bstatic.com/xdata/images/hotel/square600/287770404.webp?k=9925a56a111fcd0b36b85a34b4f546b6c89dfd2a30e6ebeb670cd156ee2bd3a6&o=&s=1', 1),
    (7, 'The Monarch Hotel', 100, 'Offering restaurant and Fitness Centre', 'https://cf.bstatic.com/xdata/images/hotel/square600/149748773.webp?k=a79a757967f9c5e0a9415d3cbe3bdffc0f9115bff7ef130fe668d73fc74c143f&o=&s=1', 1),
    (8, 'Sports Road Apartment', 50, 'A place to be and relax', 'https://cf.bstatic.com/xdata/images/hotel/square600/251132954.webp?k=0f3b56a572033fe32a9c22fda72815c1c59373b709df5746f9676056c02f8d90&o=&s=1', 1),
    (9, 'GreenVale Hotel', 67, 'Offers accommodation with private parking', 'https://cf.bstatic.com/xdata/images/hotel/square600/315305704.webp?k=42d4de399b8ca8d0eee67d754d5ddde412a75ab2d2eaee671c41fb2112433206&o=&s=1', 1),
    (10, 'Mimosa Court Apartments', 95, 'located just 500 metres from Royal Nairobi Golf Club', 'https://cf.bstatic.com/xdata/images/hotel/square600/140181824.webp?k=3499612c104ef3a2b4cce138f8bab46de635f394d7ce5de6ae9be71fb4eaf086&o=&s=1', 1);

INSERT INTO `user` VALUES
    (1, "Melvin", "Kimathi", "melvin@gmail.com", "Nairobi", 0),
    (2, "Kelvin", "Kimathi", "kelvin@gmail.com", "Nairobi", 0),
    (3, "Brian", "Mwangi", "brian@gmail.com", "Nairobi", 0),
    (4, "Jane", "Brown", "jane@gmail.com", "Nairobi", 0),
    (5, "Chris", "Kirubi", "chris@gmail.com", "Nairobi", 0);