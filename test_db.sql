-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jul 20, 2021 at 11:53 AM
-- Server version: 8.0.17
-- PHP Version: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `test_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `admins`
--

CREATE TABLE `admins` (
  `admin_id` int(11) NOT NULL,
  `title` varchar(5) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `role` varchar(8) NOT NULL,
  `nic` varchar(15) NOT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `uname` varchar(45) NOT NULL,
  `password` varchar(20) NOT NULL,
  `last_logged_in` datetime NOT NULL,
  `logged_in` tinyint(1) NOT NULL DEFAULT '0',
  `available` tinyint(1) DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `admins`
--

INSERT INTO `admins` (`admin_id`, `title`, `name`, `role`, `nic`, `phone`, `email`, `uname`, `password`, `last_logged_in`, `logged_in`, `available`) VALUES
(1, 'Mr.', 'K.T.Perera', 'Admin', '876755450v', '0786754534', 'abc@gmail.com', 'lab0001', 'admin', '2021-07-18 10:34:09', 0, 1),
(2, 'Ms.', 'K.M.G.N.Kulasekara', 'Head', '965771460V', '0774667871', 'gayanisansala999@gmail.com', 'goli', 'gAyAnI', '2021-07-20 16:05:54', 0, 1),
(3, 'Mr.', 'S.S.Dissanayake', 'Admin', '977175034v', '0712356432', 'diisnayaka98@gmail.com', 'lab0003', 'admin', '2020-07-19 06:37:17', 0, 1),
(5, 'Mr.', 'Aka', 'Admin', '987654321v', '0354456237', 'aka@gmail.com', 'lab0005', 'admin', '0000-00-00 00:00:00', 0, 0),
(6, 'Ms.', 'Aaaa', 'Admin', '9897654321v', '0786543212', 'aaaa@gmail.com', 'lab0006', 'admin', '0000-00-00 00:00:00', 0, 1),
(7, 'Mr.', 'BBB', 'Admin', '987654321V', '0987654321', 'asd@gmail.com', 'lab0007', 'admin', '0000-00-00 00:00:00', 0, 1),
(8, 'Mr.', 'M.B.M. Karunarathna', 'Head', '956744543V', '0765432123', 'bmk@gmail.com', 'lab0008', 'head', '0000-00-00 00:00:00', 0, 1),
(9, 'Mr.', 'Charith', 'Head', '987654321V', '0786543212', 'abc@gmail.com', 'charith', 'qwerty', '2021-07-20 15:58:19', 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `apparatus`
--

CREATE TABLE `apparatus` (
  `apparatus_id` int(11) NOT NULL,
  `groupz` varchar(24) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `family` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `component` varchar(45) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `apparatus`
--

INSERT INTO `apparatus` (`apparatus_id`, `groupz`, `family`, `component`, `qty`) VALUES
(1, 'Sources', 'Power_Sources', 'AC_Power', 30),
(2, 'Sources', 'Power_Sources', 'DC_Power', 6),
(3, 'Sources', 'Digital_Sources', 'Digital_clock', 7),
(4, 'Basic', 'Basic_virtual', 'NLT_Virtual', 3),
(5, 'Diodes', 'Diodes_Virtual', 'Diode', 4),
(6, 'Analog', 'Opamp', '741', 6),
(7, 'Analog', 'Comparator', 'AD8561AN', 4),
(8, 'Power', 'Switches', 'Diode_Thermal', 5),
(9, 'Power', 'Switches', 'Transistor', 3),
(10, 'Sources', 'Signal_Voltage_Sources', 'AC_Voltage', 5),
(11, 'Sources', 'Signal_Voltage_Sources', 'AM_Voltage', 5),
(12, 'Sources', 'Signal_Voltage_Sources', 'FM_Voltage', 6),
(13, 'Sources', 'Signal_Voltage_Sources', 'Clock_Voltage', 4),
(14, 'Sources', 'Controlled_Voltage_Sources', 'ABM_Voltage', 2),
(15, 'Sources', 'Control_Function_Sources', 'Divider', 4),
(16, 'Connectors', 'Audio_Video', '46765-1001', 2),
(17, 'Connectors', 'Power', '1028', 1),
(18, 'Power', 'Voltage_Reference', 'AD581TH', 2),
(19, 'Power', 'Voltage_Monitor', 'LM809M3-2.63/NOPB', 1),
(20, 'Transistor', 'BJT_NPN', '2N2222A', 7),
(21, 'Transistor', 'BJT_PNP', '2N4403', 2),
(22, 'Basic', 'Switch', 'DIPSW2', 5),
(23, 'Basic', 'Inductor', '1m', 5),
(24, 'Sources', 'Digital_Sources', 'Digital_Constant', 2),
(25, 'Sources', 'Controlled_Voltage_Sources', 'FSK_Voltage', 3),
(26, 'Sources', 'Control_Function_Sources', 'Multiplier', 2),
(27, 'Sources', 'Power_Sources', 'Ground', 4),
(28, 'Sources', 'Power_Sources', 'DGND', 6),
(29, 'Sources', 'Digital_Sources', 'Interactive_Digital_Constant', 2),
(30, 'Sources', 'Controlled_Voltage_Sources', 'Controlled_One_Shot', 2),
(31, 'Sources', 'Controlled_Voltage_Sources', 'Current_Controlled_Voltage_Sources', 2),
(32, 'Basic', 'Switch', 'DIPSW3', 6),
(33, 'Basic', 'Switch', 'DIPSW4', 4),
(34, 'Basic', 'Switch', 'DIPSW5', 4),
(35, 'Basic', 'Inductor', '1.5m', 4),
(36, 'Basic', 'Inductor', '27.7m', 2),
(37, 'Diode', 'Diodes_Virtual', 'Zener', 7),
(38, 'Diode', 'Zener', '02BZ2.2', 9),
(39, 'Diode', 'Zener', '1N4370A', 7),
(40, 'Diode', 'Zener', '1N4371A', 5),
(41, 'Diode', 'Zener', '1N6020B', 9),
(42, 'Analog', 'Opamp', '3280A', 8),
(43, 'Analog', 'Opamp', '741-DIV', 11),
(44, 'Analog', 'Opamp', 'AD507KH', 6),
(45, 'Analog', 'Comparator', 'AD8561AR', 10),
(46, 'Analog', 'Comparator', 'AD8564AN', 10),
(47, 'Power', 'Switches', 'SCR', 7),
(48, 'Power', 'Switches', 'Diode_Thermal', 20),
(49, 'Power', 'Voltage_Reference', 'AD581KH', 23),
(50, 'Power', 'Voltage_Reference', 'AD584JN', 11),
(51, 'Power', 'Voltage_Monitor', 'MAX634AUT23-T', 6),
(54, 'Test', 'Test', 'Test', 0);

-- --------------------------------------------------------

--
-- Table structure for table `list`
--

CREATE TABLE `list` (
  `list_id` int(11) NOT NULL,
  `student_reg_no` varchar(8) NOT NULL,
  `issued_date` datetime NOT NULL,
  `received` tinyint(1) NOT NULL,
  `received_date` datetime DEFAULT NULL,
  `Admins_admin_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `list`
--

INSERT INTO `list` (`list_id`, `student_reg_no`, `issued_date`, `received`, `received_date`, `Admins_admin_id`) VALUES
(7, '172089', '2020-08-07 17:12:04', 0, '0000-00-00 00:00:00', 1),
(8, '172097', '2020-08-07 17:23:08', 1, '2020-10-01 12:22:19', 2),
(9, '172067', '2020-08-07 17:24:11', 1, '2020-08-07 17:44:13', 1),
(10, '172038', '2020-08-07 17:30:05', 0, '0000-00-00 00:00:00', 1),
(11, '172038', '2020-08-07 17:30:58', 0, '0000-00-00 00:00:00', 1),
(12, '172089', '2020-08-09 00:14:14', 1, '2020-10-01 10:24:17', 2),
(13, '172076', '2020-08-09 00:18:53', 1, '2020-10-01 12:10:47', 2),
(14, '172082', '2020-09-30 16:48:13', 1, '2020-10-01 10:22:44', 2),
(15, '172011', '2020-09-30 16:53:05', 1, '2020-10-01 08:49:02', 2),
(16, '172098', '2020-10-01 09:01:26', 0, '0000-00-00 00:00:00', 3),
(17, '172029', '2020-10-01 11:28:00', 1, '2020-10-01 11:28:29', 2),
(18, '172164', '2020-10-01 21:06:36', 1, '2020-10-01 21:08:46', 1),
(19, '172098', '2021-07-18 20:54:27', 1, '2021-07-18 20:56:24', 2),
(20, '172098', '2021-07-20 15:47:19', 1, '2021-07-20 15:48:12', 2);

-- --------------------------------------------------------

--
-- Table structure for table `list_has_apparatus`
--

CREATE TABLE `list_has_apparatus` (
  `List_list_id` int(11) NOT NULL,
  `Apparatus_apparatus_id` int(11) NOT NULL,
  `qty` int(11) NOT NULL,
  `received` tinyint(1) NOT NULL DEFAULT '0',
  `received_date` datetime DEFAULT NULL,
  `Admins_admin_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `list_has_apparatus`
--

INSERT INTO `list_has_apparatus` (`List_list_id`, `Apparatus_apparatus_id`, `qty`, `received`, `received_date`, `Admins_admin_id`) VALUES
(7, 6, 2, 1, '2020-10-01 15:03:13', 2),
(7, 20, 1, 1, '2020-10-01 12:14:40', 2),
(7, 21, 2, 0, '0000-00-00 00:00:00', 1),
(8, 1, 2, 1, '2020-10-01 12:21:54', 2),
(8, 43, 4, 1, '2020-10-01 12:21:36', 2),
(9, 45, 3, 0, '0000-00-00 00:00:00', 1),
(10, 1, 2, 1, '2020-10-01 16:12:00', 2),
(11, 42, 2, 0, '0000-00-00 00:00:00', 1),
(12, 45, 4, 0, '0000-00-00 00:00:00', 1),
(13, 1, 2, 1, '2020-10-01 12:09:16', 2),
(13, 8, 1, 1, '2020-10-01 12:06:32', 2),
(14, 6, 1, 0, '0000-00-00 00:00:00', 1),
(14, 46, 3, 0, '0000-00-00 00:00:00', 1),
(15, 1, 2, 0, '0000-00-00 00:00:00', 1),
(16, 46, 1, 0, '0000-00-00 00:00:00', 3),
(17, 39, 2, 0, '0000-00-00 00:00:00', 2),
(18, 4, 2, 1, '2020-10-01 21:08:23', 1),
(18, 15, 1, 1, '2020-10-01 21:08:07', 1),
(19, 9, 2, 1, '2021-07-18 20:55:46', 2),
(19, 46, 2, 1, '2021-07-18 20:56:03', 2),
(20, 1, 4, 1, '2021-07-20 15:47:40', 2),
(20, 43, 2, 1, '2021-07-20 15:47:53', 2);

-- --------------------------------------------------------

--
-- Table structure for table `replacements`
--

CREATE TABLE `replacements` (
  `List_list_id` int(11) NOT NULL,
  `Apparatus_apparatus_id` int(11) NOT NULL,
  `qty` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `replacements`
--

INSERT INTO `replacements` (`List_list_id`, `Apparatus_apparatus_id`, `qty`) VALUES
(10, 1, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admins`
--
ALTER TABLE `admins`
  ADD PRIMARY KEY (`admin_id`),
  ADD UNIQUE KEY `admin_id_UNIQUE` (`admin_id`);

--
-- Indexes for table `apparatus`
--
ALTER TABLE `apparatus`
  ADD PRIMARY KEY (`apparatus_id`),
  ADD UNIQUE KEY `apparatus_id_UNIQUE` (`apparatus_id`);

--
-- Indexes for table `list`
--
ALTER TABLE `list`
  ADD PRIMARY KEY (`list_id`),
  ADD UNIQUE KEY `list_id_UNIQUE` (`list_id`),
  ADD KEY `fk_List_Admins_idx` (`Admins_admin_id`);

--
-- Indexes for table `list_has_apparatus`
--
ALTER TABLE `list_has_apparatus`
  ADD PRIMARY KEY (`List_list_id`,`Apparatus_apparatus_id`),
  ADD KEY `fk_List_has_Apparatus_Apparatus1_idx` (`Apparatus_apparatus_id`),
  ADD KEY `fk_List_has_Apparatus_List1_idx` (`List_list_id`),
  ADD KEY `Admins_admin_id` (`Admins_admin_id`);

--
-- Indexes for table `replacements`
--
ALTER TABLE `replacements`
  ADD PRIMARY KEY (`List_list_id`,`Apparatus_apparatus_id`),
  ADD KEY `fk_List_has_Apparatus1_Apparatus1_idx` (`Apparatus_apparatus_id`),
  ADD KEY `fk_List_has_Apparatus1_List1_idx` (`List_list_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admins`
--
ALTER TABLE `admins`
  MODIFY `admin_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `apparatus`
--
ALTER TABLE `apparatus`
  MODIFY `apparatus_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=55;

--
-- AUTO_INCREMENT for table `list`
--
ALTER TABLE `list`
  MODIFY `list_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `list`
--
ALTER TABLE `list`
  ADD CONSTRAINT `fk_List_Admins` FOREIGN KEY (`Admins_admin_id`) REFERENCES `admins` (`admin_id`);

--
-- Constraints for table `list_has_apparatus`
--
ALTER TABLE `list_has_apparatus`
  ADD CONSTRAINT `fk_List_has_Apparatus_Apparatus1` FOREIGN KEY (`Apparatus_apparatus_id`) REFERENCES `apparatus` (`apparatus_id`),
  ADD CONSTRAINT `fk_List_has_Apparatus_List1` FOREIGN KEY (`List_list_id`) REFERENCES `list` (`list_id`),
  ADD CONSTRAINT `list_has_apparatus_ibfk_1` FOREIGN KEY (`Admins_admin_id`) REFERENCES `admins` (`admin_id`);

--
-- Constraints for table `replacements`
--
ALTER TABLE `replacements`
  ADD CONSTRAINT `fk_List_has_Apparatus1_Apparatus1` FOREIGN KEY (`Apparatus_apparatus_id`) REFERENCES `apparatus` (`apparatus_id`),
  ADD CONSTRAINT `fk_List_has_Apparatus1_List1` FOREIGN KEY (`List_list_id`) REFERENCES `list` (`list_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
