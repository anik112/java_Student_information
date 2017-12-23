-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 23, 2017 at 06:42 AM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `student_information`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_login`
--

CREATE TABLE IF NOT EXISTS `admin_login` (
`id` int(10) NOT NULL,
  `user_name` varchar(30) NOT NULL,
  `user_password` varchar(30) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `dpt_civil`
--

CREATE TABLE IF NOT EXISTS `dpt_civil` (
`id` int(10) NOT NULL,
  `student_id` int(11) NOT NULL,
  `student_first_name` varchar(30) NOT NULL,
  `student_surname` varchar(30) DEFAULT NULL,
  `date_of_birth` varchar(30) NOT NULL,
  `gender` varchar(30) NOT NULL,
  `email` varchar(30) DEFAULT NULL,
  `mobile_number` varchar(30) NOT NULL,
  `present_address` varchar(100) NOT NULL,
  `permanent_address` varchar(100) NOT NULL,
  `house_no` varchar(30) DEFAULT NULL,
  `post_code` int(11) NOT NULL,
  `dpt_code` int(11) DEFAULT NULL,
  `student_image` longblob
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `dpt_computer`
--

CREATE TABLE IF NOT EXISTS `dpt_computer` (
`id` int(10) NOT NULL,
  `student_id` int(11) NOT NULL,
  `student_first_name` varchar(30) NOT NULL,
  `student_surname` varchar(30) DEFAULT NULL,
  `date_of_birth` varchar(30) NOT NULL,
  `gender` varchar(30) NOT NULL,
  `email` varchar(30) DEFAULT NULL,
  `mobile_number` varchar(30) NOT NULL,
  `present_address` varchar(100) NOT NULL,
  `permanent_address` varchar(100) NOT NULL,
  `house_no` varchar(30) DEFAULT NULL,
  `post_code` int(11) NOT NULL,
  `dpt_code` int(11) DEFAULT NULL,
  `student_image` longblob
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `dpt_electrical`
--

CREATE TABLE IF NOT EXISTS `dpt_electrical` (
`id` int(10) NOT NULL,
  `student_id` int(11) NOT NULL,
  `student_first_name` varchar(30) NOT NULL,
  `student_surname` varchar(30) DEFAULT NULL,
  `date_of_birth` varchar(30) NOT NULL,
  `gender` varchar(30) NOT NULL,
  `email` varchar(30) DEFAULT NULL,
  `mobile_number` varchar(30) NOT NULL,
  `present_address` varchar(100) NOT NULL,
  `permanent_address` varchar(100) NOT NULL,
  `house_no` varchar(30) DEFAULT NULL,
  `post_code` int(11) NOT NULL,
  `dpt_code` int(11) DEFAULT NULL,
  `student_image` longblob
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `dpt_telecommuniction`
--

CREATE TABLE IF NOT EXISTS `dpt_telecommuniction` (
`id` int(10) NOT NULL,
  `student_id` int(11) NOT NULL,
  `student_first_name` varchar(30) NOT NULL,
  `student_surname` varchar(30) DEFAULT NULL,
  `date_of_birth` varchar(30) NOT NULL,
  `gender` varchar(30) NOT NULL,
  `email` varchar(30) DEFAULT NULL,
  `mobile_number` varchar(30) NOT NULL,
  `present_address` varchar(100) NOT NULL,
  `permanent_address` varchar(100) NOT NULL,
  `house_no` varchar(30) DEFAULT NULL,
  `post_code` int(11) NOT NULL,
  `dpt_code` int(11) DEFAULT NULL,
  `student_image` longblob
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin_login`
--
ALTER TABLE `admin_login`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `dpt_civil`
--
ALTER TABLE `dpt_civil`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `dpt_computer`
--
ALTER TABLE `dpt_computer`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `dpt_electrical`
--
ALTER TABLE `dpt_electrical`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `dpt_telecommuniction`
--
ALTER TABLE `dpt_telecommuniction`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin_login`
--
ALTER TABLE `admin_login`
MODIFY `id` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `dpt_civil`
--
ALTER TABLE `dpt_civil`
MODIFY `id` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `dpt_computer`
--
ALTER TABLE `dpt_computer`
MODIFY `id` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `dpt_electrical`
--
ALTER TABLE `dpt_electrical`
MODIFY `id` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `dpt_telecommuniction`
--
ALTER TABLE `dpt_telecommuniction`
MODIFY `id` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
