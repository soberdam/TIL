CREATE TABLE `businesscard` (
  `name` varchar(10) DEFAULT NULL,
  `phone` varchar(20) NOT NULL,
  `companyName` varchar(20) DEFAULT NULL,
  `createDate` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`phone`)
)