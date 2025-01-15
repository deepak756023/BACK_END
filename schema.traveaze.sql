-- --------------------------------------------------------
-- Host:                         localhost
-- Server version:               8.0.28 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             12.7.0.6850
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for traveaze
CREATE DATABASE IF NOT EXISTS `traveaze` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `traveaze`;

-- Dumping structure for table traveaze.cities
CREATE TABLE IF NOT EXISTS `cities` (
  `city_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `state` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `date_added` datetime NOT NULL,
  PRIMARY KEY (`city_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table traveaze.cities: ~0 rows (approximately)

-- Dumping structure for table traveaze.city_communications
CREATE TABLE IF NOT EXISTS `city_communications` (
  `city_id` int NOT NULL,
  `transportation_id` tinyint NOT NULL,
  PRIMARY KEY (`city_id`),
  KEY `FK_city_communications_transportation` (`transportation_id`),
  CONSTRAINT `FK__cities3` FOREIGN KEY (`city_id`) REFERENCES `cities` (`city_id`),
  CONSTRAINT `FK_city_communications_transportation` FOREIGN KEY (`transportation_id`) REFERENCES `transportation` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table traveaze.city_communications: ~0 rows (approximately)

-- Dumping structure for table traveaze.famous_places
CREATE TABLE IF NOT EXISTS `famous_places` (
  `city_id` int NOT NULL,
  `place_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `image` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '',
  `location` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
  `history` varchar(200) COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`place_id`),
  KEY `FK__cities` (`city_id`),
  CONSTRAINT `FK__cities` FOREIGN KEY (`city_id`) REFERENCES `cities` (`city_id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table traveaze.famous_places: ~0 rows (approximately)

-- Dumping structure for table traveaze.hotels
CREATE TABLE IF NOT EXISTS `hotels` (
  `city_id` int NOT NULL,
  `hotel_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `image` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
  `location` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
  `is_available` varchar(3) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '',
  PRIMARY KEY (`hotel_id`),
  KEY `FK__cities1` (`city_id`),
  CONSTRAINT `FK__cities1` FOREIGN KEY (`city_id`) REFERENCES `cities` (`city_id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table traveaze.hotels: ~0 rows (approximately)

-- Dumping structure for table traveaze.tour_guides
CREATE TABLE IF NOT EXISTS `tour_guides` (
  `place_id` int unsigned NOT NULL,
  `guide_id` int unsigned NOT NULL,
  `name` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `email` varchar(50) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '',
  `experience` tinyint unsigned NOT NULL,
  `phone` bigint unsigned NOT NULL,
  `charges` smallint unsigned NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table traveaze.tour_guides: ~0 rows (approximately)

-- Dumping structure for table traveaze.transportation
CREATE TABLE IF NOT EXISTS `transportation` (
  `transportation_name` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `id` tinyint NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table traveaze.transportation: ~0 rows (approximately)

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
