CREATE DATABASE  IF NOT EXISTS `unilang_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `unilang_db`;
-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: unilang_db
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `articles`
--

DROP TABLE IF EXISTS `articles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `articles` (
  `idArticles` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `describe` varchar(255) DEFAULT NULL,
  `imageHref` text,
  `category` int DEFAULT NULL,
  `userCreator` int DEFAULT NULL,
  `content` text,
  PRIMARY KEY (`idArticles`),
  KEY `articles_category_idx` (`category`),
  KEY `articles_user_idx` (`userCreator`),
  CONSTRAINT `articles_category` FOREIGN KEY (`category`) REFERENCES `category` (`idCategory`),
  CONSTRAINT `articles_user` FOREIGN KEY (`userCreator`) REFERENCES `users` (`idUser`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `articles`
--

LOCK TABLES `articles` WRITE;
/*!40000 ALTER TABLE `articles` DISABLE KEYS */;
INSERT INTO `articles` VALUES (1,'Переживает ли Иран революцию?','d1','https://cdn.shopify.com/s/files/1/0519/1430/9816/articles/What_are_the_ingredients_for_a_revolution_Clean_Thumb_B_1512x.jpg?v=1666798410',1,NULL,'On the 16th of September 2022, groups of women gathered around the Iranian capital of Tehran and began taking off their hijabs. Holding them aloft on sticks and with crowds of onlookers cheering them on, they set fire to the headscarves, chanting slogans like “death to the dictator”. These demonstrations were in response to the death of 22-year-old Mahsa Amini who was beaten and killed by police after being arrested for improperly wearing her hijab.'),(2,'name2','d2','https://i.ibb.co/mXPFjNq/art2.webp',2,NULL,NULL),(3,'name3','d3','https://i.ibb.co/GF4gwNQ/hello.jpg',1,NULL,NULL);
/*!40000 ALTER TABLE `articles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `category` (
  `idCategory` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idCategory`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'Космос'),(2,'Экология'),(3,'История'),(4,'Животные'),(5,'Здоровье'),(6,'Техника'),(7,'Культура'),(8,'Политика'),(9,'Физика'),(10,'Математика'),(11,'Лингвистика'),(12,'География'),(13,'Экономика'),(14,'Психология'),(15,'Программирование'),(16,'Авто'),(17,'Продуктивность'),(18,'Кухня'),(19,'Художественная литература'),(20,'Юмор');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `forum`
--

DROP TABLE IF EXISTS `forum`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `forum` (
  `idBlock` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `describe` varchar(1000) DEFAULT NULL,
  `category` int DEFAULT NULL,
  `userCreator` int DEFAULT NULL,
  PRIMARY KEY (`idBlock`),
  KEY `block_category_idx` (`category`),
  KEY `block_creator_idx` (`userCreator`),
  CONSTRAINT `block_category` FOREIGN KEY (`category`) REFERENCES `category` (`idCategory`),
  CONSTRAINT `block_creator` FOREIGN KEY (`userCreator`) REFERENCES `users` (`idUser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `forum`
--

LOCK TABLES `forum` WRITE;
/*!40000 ALTER TABLE `forum` DISABLE KEYS */;
/*!40000 ALTER TABLE `forum` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `forumtags`
--

DROP TABLE IF EXISTS `forumtags`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `forumtags` (
  `idForumTags` int NOT NULL AUTO_INCREMENT,
  `blockForum` int DEFAULT NULL,
  `tag` int DEFAULT NULL,
  PRIMARY KEY (`idForumTags`),
  KEY `join_tag_idx` (`tag`),
  KEY `join_forum_idx` (`blockForum`),
  CONSTRAINT `join_forum` FOREIGN KEY (`blockForum`) REFERENCES `forum` (`idBlock`),
  CONSTRAINT `join_tag` FOREIGN KEY (`tag`) REFERENCES `tags` (`idTags`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `forumtags`
--

LOCK TABLES `forumtags` WRITE;
/*!40000 ALTER TABLE `forumtags` DISABLE KEYS */;
/*!40000 ALTER TABLE `forumtags` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ratingarticles`
--

DROP TABLE IF EXISTS `ratingarticles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ratingarticles` (
  `idRating` int NOT NULL AUTO_INCREMENT,
  `mark` int DEFAULT NULL,
  `articles` int DEFAULT NULL,
  `user` int DEFAULT NULL,
  PRIMARY KEY (`idRating`),
  KEY `rating_articles_idx` (`articles`),
  KEY `rating_user_idx` (`user`),
  CONSTRAINT `rating_articles` FOREIGN KEY (`articles`) REFERENCES `articles` (`idArticles`),
  CONSTRAINT `rating_articles_user` FOREIGN KEY (`user`) REFERENCES `users` (`idUser`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ratingarticles`
--

LOCK TABLES `ratingarticles` WRITE;
/*!40000 ALTER TABLE `ratingarticles` DISABLE KEYS */;
INSERT INTO `ratingarticles` VALUES (1,9,1,NULL),(2,8,1,NULL),(3,5,1,NULL);
/*!40000 ALTER TABLE `ratingarticles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ratingsets`
--

DROP TABLE IF EXISTS `ratingsets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ratingsets` (
  `idRating` int NOT NULL AUTO_INCREMENT,
  `mark` int DEFAULT NULL,
  `set` int DEFAULT NULL,
  `user` int DEFAULT NULL,
  PRIMARY KEY (`idRating`),
  KEY `rating_set_idx` (`set`),
  KEY `rating_user_idx` (`user`),
  CONSTRAINT `rating_set` FOREIGN KEY (`set`) REFERENCES `sets` (`idSet`),
  CONSTRAINT `rating_set_user` FOREIGN KEY (`user`) REFERENCES `users` (`idUser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ratingsets`
--

LOCK TABLES `ratingsets` WRITE;
/*!40000 ALTER TABLE `ratingsets` DISABLE KEYS */;
/*!40000 ALTER TABLE `ratingsets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `setcards`
--

DROP TABLE IF EXISTS `setcards`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `setcards` (
  `idCard` int NOT NULL AUTO_INCREMENT,
  `word` varchar(500) DEFAULT NULL,
  `tanslate` varchar(500) DEFAULT NULL,
  `set` int DEFAULT NULL,
  PRIMARY KEY (`idCard`),
  KEY `card_set_idx` (`set`),
  CONSTRAINT `card_set` FOREIGN KEY (`set`) REFERENCES `sets` (`idSet`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `setcards`
--

LOCK TABLES `setcards` WRITE;
/*!40000 ALTER TABLE `setcards` DISABLE KEYS */;
/*!40000 ALTER TABLE `setcards` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sets`
--

DROP TABLE IF EXISTS `sets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `sets` (
  `idSet` int NOT NULL AUTO_INCREMENT,
  `imageHref` varchar(200) DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  `dateCreate` date DEFAULT NULL,
  `userCreator` int DEFAULT NULL,
  `category` int DEFAULT NULL,
  PRIMARY KEY (`idSet`),
  KEY `set_creator_idx` (`userCreator`),
  KEY `set_catogory_idx` (`category`),
  CONSTRAINT `set_catogory` FOREIGN KEY (`category`) REFERENCES `category` (`idCategory`),
  CONSTRAINT `set_creator` FOREIGN KEY (`userCreator`) REFERENCES `users` (`idUser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sets`
--

LOCK TABLES `sets` WRITE;
/*!40000 ALTER TABLE `sets` DISABLE KEYS */;
/*!40000 ALTER TABLE `sets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tags`
--

DROP TABLE IF EXISTS `tags`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tags` (
  `idTags` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idTags`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tags`
--

LOCK TABLES `tags` WRITE;
/*!40000 ALTER TABLE `tags` DISABLE KEYS */;
/*!40000 ALTER TABLE `tags` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `users` (
  `idUser` int NOT NULL AUTO_INCREMENT,
  `fullName` varchar(255) DEFAULT NULL,
  `dateRegistration` date DEFAULT NULL,
  `nick` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `active` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`idUser`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Иван Иванов Иванович','2009-10-10','Hacker','tuta@gmail.com',1);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'unilang_db'
--

--
-- Dumping routines for database 'unilang_db'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-31 20:50:22
