-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 31, 2019 at 06:17 AM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `zhsm`
--

-- --------------------------------------------------------

--
-- Table structure for table `employeerecord`
--

CREATE TABLE `employeerecord` (
  `keyemp` int(11) NOT NULL,
  `code` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `age` varchar(255) NOT NULL,
  `fname` varchar(255) NOT NULL,
  `education` varchar(255) NOT NULL,
  `salary` varchar(255) NOT NULL,
  `roll` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employeerecord`
--

INSERT INTO `employeerecord` (`keyemp`, `code`, `name`, `age`, `fname`, `education`, `salary`, `roll`, `address`, `phone`) VALUES
(2, '12123', 'skdav', '22', 'dskcfk', 'dcnkjdnk', '123333', 'kcfkd fc', 'cjnkncdk', '312334'),
(3, 'dsf4454', 'dcvcffc', '76', 'fedcfdrvc', 'cffcedf', '433333', 'fefcrfvf', 'frevctrg', '54443221');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employeerecord`
--
ALTER TABLE `employeerecord`
  ADD PRIMARY KEY (`keyemp`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employeerecord`
--
ALTER TABLE `employeerecord`
  MODIFY `keyemp` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
