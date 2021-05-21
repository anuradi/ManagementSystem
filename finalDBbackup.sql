-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.7.23-log - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             11.1.0.6116
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for management_system
DROP DATABASE IF EXISTS `management_system`;
CREATE DATABASE IF NOT EXISTS `management_system` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `management_system`;

-- Dumping structure for table management_system.building
DROP TABLE IF EXISTS `building`;
CREATE TABLE IF NOT EXISTS `building` (
  `idbuilding` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `room_name` varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `capacity` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idbuilding`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- Dumping data for table management_system.building: ~5 rows (approximately)
/*!40000 ALTER TABLE `building` DISABLE KEYS */;
INSERT INTO `building` (`idbuilding`, `name`, `room_name`, `type`, `capacity`, `status`) VALUES
	(1, 'New building', 'E3C', 'Lecture Hall', '100', 'Active'),
	(2, 'D-block ', 'A501', 'Lecture Hall', '50', 'Active'),
	(3, 'B -block', 'Pull', 'Lecture Hall', '75', 'Active'),
	(4, 'Dimo', 'Push', 'Lecture Hall', '90', 'Active'),
	(5, 'main', 'A402', 'Laboratory', '120', 'Active'),
	(6, 'test_final', 'lolo', 'Lecture Hall', '2000', 'deactive');
/*!40000 ALTER TABLE `building` ENABLE KEYS */;

-- Dumping structure for table management_system.campus
DROP TABLE IF EXISTS `campus`;
CREATE TABLE IF NOT EXISTS `campus` (
  `idcampus` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idcampus`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Dumping data for table management_system.campus: ~4 rows (approximately)
/*!40000 ALTER TABLE `campus` DISABLE KEYS */;
INSERT INTO `campus` (`idcampus`, `name`, `status`) VALUES
	(1, 'Metro', NULL),
	(2, 'Malabe', NULL),
	(3, 'Kandy', NULL),
	(4, 'kurunegala', NULL);
/*!40000 ALTER TABLE `campus` ENABLE KEYS */;

-- Dumping structure for table management_system.consecutive
DROP TABLE IF EXISTS `consecutive`;
CREATE TABLE IF NOT EXISTS `consecutive` (
  `idconsecutive` int(11) NOT NULL AUTO_INCREMENT,
  `subject` int(11) NOT NULL,
  `group_id` varchar(45) DEFAULT NULL,
  `tag` varchar(45) DEFAULT NULL,
  `lecturer1` int(11) NOT NULL,
  `lecturer2` int(11) NOT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idconsecutive`),
  KEY `fk_consecutive_subjects2_idx` (`subject`),
  KEY `fk_consecutive_lecturer1_idx` (`lecturer1`),
  KEY `fk_consecutive_lecturer2_idx` (`lecturer2`),
  CONSTRAINT `fk_consecutive_lecturer1` FOREIGN KEY (`lecturer1`) REFERENCES `lecturer` (`idlecturer`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_consecutive_lecturer2` FOREIGN KEY (`lecturer2`) REFERENCES `lecturer` (`idlecturer`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_consecutive_subjects2` FOREIGN KEY (`subject`) REFERENCES `subjects` (`idsubjects`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- Dumping data for table management_system.consecutive: ~9 rows (approximately)
/*!40000 ALTER TABLE `consecutive` DISABLE KEYS */;
INSERT INTO `consecutive` (`idconsecutive`, `subject`, `group_id`, `tag`, `lecturer1`, `lecturer2`, `status`) VALUES
	(1, 1, '2', NULL, 1, 1, NULL),
	(3, 1, '2', NULL, 1, 1, NULL),
	(4, 1, '2', NULL, 1, 1, NULL),
	(5, 1, '2', NULL, 1, 1, NULL),
	(6, 1, '2', NULL, 3, 1, NULL),
	(7, 3, '3', '4', 8, 3, 'Active'),
	(8, 3, '3', '2', 3, 3, 'deactive'),
	(9, 3, '4', '2', 3, 9, 'Active'),
	(10, 3, '2021.IT.2', '3', 3, 11, 'Active'),
	(11, 1, '5', '2', 1, 1, 'Active');
/*!40000 ALTER TABLE `consecutive` ENABLE KEYS */;

-- Dumping structure for table management_system.department
DROP TABLE IF EXISTS `department`;
CREATE TABLE IF NOT EXISTS `department` (
  `iddepartment` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`iddepartment`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Dumping data for table management_system.department: ~3 rows (approximately)
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` (`iddepartment`, `name`, `status`) VALUES
	(1, 'IT', NULL),
	(2, 'SE', NULL),
	(3, 'DS', NULL);
/*!40000 ALTER TABLE `department` ENABLE KEYS */;

-- Dumping structure for table management_system.faculty
DROP TABLE IF EXISTS `faculty`;
CREATE TABLE IF NOT EXISTS `faculty` (
  `idfaculty` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idfaculty`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Dumping data for table management_system.faculty: ~4 rows (approximately)
/*!40000 ALTER TABLE `faculty` DISABLE KEYS */;
INSERT INTO `faculty` (`idfaculty`, `name`, `status`) VALUES
	(1, 'Engineering', NULL),
	(2, 'Computing', NULL),
	(3, 'Business Management', NULL),
	(4, 'HR', NULL);
/*!40000 ALTER TABLE `faculty` ENABLE KEYS */;

-- Dumping structure for table management_system.lecturer
DROP TABLE IF EXISTS `lecturer`;
CREATE TABLE IF NOT EXISTS `lecturer` (
  `idlecturer` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `emp_id` varchar(45) DEFAULT NULL,
  `rank` varchar(45) DEFAULT NULL,
  `faculty_id` int(11) NOT NULL,
  `department_id` int(11) NOT NULL,
  `campus_id` int(11) NOT NULL,
  `building_id` int(11) NOT NULL,
  `level_id` int(11) NOT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idlecturer`),
  KEY `fk_lecturer_faculty1_idx` (`faculty_id`),
  KEY `fk_lecturer_department1_idx` (`department_id`),
  KEY `fk_lecturer_campus1_idx` (`campus_id`),
  KEY `fk_lecturer_building1_idx` (`building_id`),
  KEY `fk_lecturer_level1_idx` (`level_id`),
  CONSTRAINT `fk_lecturer_building1` FOREIGN KEY (`building_id`) REFERENCES `building` (`idbuilding`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_lecturer_campus1` FOREIGN KEY (`campus_id`) REFERENCES `campus` (`idcampus`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_lecturer_department1` FOREIGN KEY (`department_id`) REFERENCES `department` (`iddepartment`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_lecturer_faculty1` FOREIGN KEY (`faculty_id`) REFERENCES `faculty` (`idfaculty`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_lecturer_level1` FOREIGN KEY (`level_id`) REFERENCES `level` (`idlevel`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- Dumping data for table management_system.lecturer: ~14 rows (approximately)
/*!40000 ALTER TABLE `lecturer` DISABLE KEYS */;
INSERT INTO `lecturer` (`idlecturer`, `name`, `emp_id`, `rank`, `faculty_id`, `department_id`, `campus_id`, `building_id`, `level_id`, `status`) VALUES
	(1, 'lec test11', '125478', '546542', 1, 1, 2, 1, 3, NULL),
	(3, 'Kamal Gunarathna SLIIT', '123645', '1.2001', 1, 1, 1, 1, 1, 'Active'),
	(6, 'dewg', '123548', '1.000123', 3, 1, 3, 3, 1, 'deactive'),
	(7, 'Dalith', '124789', '2.2021', 1, 2, 2, 2, 2, 'deactive'),
	(8, 'nelum', '123456', '1.000123', 1, 2, 1, 1, 1, 'deactive'),
	(9, 'chamodi', '000122', '2.000122', 1, 1, 2, 2, 2, 'Active'),
	(10, 'chamodi', '000122', '2.000122', 1, 1, 2, 2, 2, 'Active'),
	(11, 'chamodi bandara', '000122', '2.000122', 3, 2, 2, 1, 2, 'Active'),
	(12, 'namal maitpe', '000133', '1.000133', 2, 1, 1, 2, 1, 'Active'),
	(13, 'anuradi', '000131', '2.000133', 4, 2, 1, 2, 2, 'Active'),
	(14, 'chamodi', '000122', '3.000222', 2, 1, 1, 1, 2, 'Active'),
	(15, 'chamodi', '000122', '2.000122', 2, 1, 1, 1, 2, 'Active'),
	(16, 'pdk', '125468', '2.256', 1, 1, 1, 1, 2, 'deactive'),
	(17, 'ko', '123546', '2.222', 2, 3, 1, 2, 2, 'deactive'),
	(18, 'test_final', '12530', '1.12530', 1, 1, 1, 2, 1, 'deactive');
/*!40000 ALTER TABLE `lecturer` ENABLE KEYS */;

-- Dumping structure for table management_system.lecture_sessions
DROP TABLE IF EXISTS `lecture_sessions`;
CREATE TABLE IF NOT EXISTS `lecture_sessions` (
  `idlecture_sessions` int(11) NOT NULL AUTO_INCREMENT,
  `subject_code` varchar(45) DEFAULT NULL,
  `std_count` varchar(45) DEFAULT NULL,
  `duration` varchar(45) DEFAULT NULL,
  `lecturer_id` int(11) NOT NULL,
  `subjects_id` int(11) NOT NULL,
  `tags_id` int(11) NOT NULL,
  `group_id` int(11) NOT NULL,
  `tags` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idlecture_sessions`),
  KEY `fk_lecture_sessions_lecturer1_idx` (`lecturer_id`),
  KEY `fk_lecture_sessions_subjects1_idx` (`subjects_id`),
  KEY `fk_lecture_sessions_tags1_idx` (`tags_id`),
  KEY `fk_lecture_sessions_student_groups1_idx` (`group_id`),
  CONSTRAINT `fk_lecture_sessions_lecturer1` FOREIGN KEY (`lecturer_id`) REFERENCES `lecturer` (`idlecturer`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_lecture_sessions_student_groups1` FOREIGN KEY (`group_id`) REFERENCES `student_groups` (`idstudent_groups`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_lecture_sessions_subjects1` FOREIGN KEY (`subjects_id`) REFERENCES `subjects` (`idsubjects`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_lecture_sessions_tags1` FOREIGN KEY (`tags_id`) REFERENCES `tags` (`idtags`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- Dumping data for table management_system.lecture_sessions: ~6 rows (approximately)
/*!40000 ALTER TABLE `lecture_sessions` DISABLE KEYS */;
INSERT INTO `lecture_sessions` (`idlecture_sessions`, `subject_code`, `std_count`, `duration`, `lecturer_id`, `subjects_id`, `tags_id`, `group_id`, `tags`, `status`) VALUES
	(1, 'test sub', '30', '50', 1, 1, 2, 2, NULL, NULL),
	(2, 'test sub', '20', '2', 1, 1, 2, 2, NULL, NULL),
	(3, '123456', '20', '4hr', 1, 1, 2, 2, NULL, 'Active'),
	(4, 'ITP', '20', '2HR', 3, 3, 2, 2, NULL, 'Active'),
	(5, 'itp202', '60', '2', 8, 3, 2, 4, NULL, 'Active'),
	(6, 'DSA', '12', 'test_final', 1, 6, 3, 2, NULL, 'deactive');
/*!40000 ALTER TABLE `lecture_sessions` ENABLE KEYS */;

-- Dumping structure for table management_system.level
DROP TABLE IF EXISTS `level`;
CREATE TABLE IF NOT EXISTS `level` (
  `idlevel` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `level` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idlevel`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- Dumping data for table management_system.level: ~6 rows (approximately)
/*!40000 ALTER TABLE `level` DISABLE KEYS */;
INSERT INTO `level` (`idlevel`, `name`, `level`, `status`) VALUES
	(1, 'Proffessor', '1', NULL),
	(2, 'Assistant Professor', '2', NULL),
	(3, 'Senior Lecturer(HG)', '3', NULL),
	(4, 'Senior Lecturer', '4', NULL),
	(5, 'Lecturer', '5', NULL),
	(6, 'Assistant Lecturer ', '6', NULL);
/*!40000 ALTER TABLE `level` ENABLE KEYS */;

-- Dumping structure for table management_system.non_overlapping
DROP TABLE IF EXISTS `non_overlapping`;
CREATE TABLE IF NOT EXISTS `non_overlapping` (
  `idnon_overlapping` int(11) NOT NULL AUTO_INCREMENT,
  `subjects1` int(11) NOT NULL,
  `subjects2` int(11) NOT NULL,
  `subjects3` int(11) NOT NULL,
  `subjects4` int(11) NOT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idnon_overlapping`),
  KEY `fk_non_overlapping_subjects1_idx` (`subjects1`),
  KEY `fk_non_overlapping_subjects2_idx` (`subjects2`),
  KEY `fk_non_overlapping_subjects3_idx` (`subjects3`),
  KEY `fk_non_overlapping_subjects4_idx` (`subjects4`),
  CONSTRAINT `fk_non_overlapping_subjects1` FOREIGN KEY (`subjects1`) REFERENCES `subjects` (`idsubjects`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_non_overlapping_subjects2` FOREIGN KEY (`subjects2`) REFERENCES `subjects` (`idsubjects`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- Dumping data for table management_system.non_overlapping: ~5 rows (approximately)
/*!40000 ALTER TABLE `non_overlapping` DISABLE KEYS */;
INSERT INTO `non_overlapping` (`idnon_overlapping`, `subjects1`, `subjects2`, `subjects3`, `subjects4`, `status`) VALUES
	(3, 1, 1, 1, 1, 'Active'),
	(4, 3, 1, 1, 1, 'Active'),
	(5, 6, 3, 6, 1, 'Active'),
	(6, 6, 3, 11, 12, 'Active'),
	(7, 3, 6, 9, 12, 'deactive');
/*!40000 ALTER TABLE `non_overlapping` ENABLE KEYS */;

-- Dumping structure for table management_system.not_available_rooms
DROP TABLE IF EXISTS `not_available_rooms`;
CREATE TABLE IF NOT EXISTS `not_available_rooms` (
  `notAvlRoom_id` int(11) NOT NULL AUTO_INCREMENT,
  `room` varchar(45) NOT NULL,
  `startTime` varchar(45) NOT NULL,
  `endTime` varchar(45) NOT NULL,
  `day` varchar(45) NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`notAvlRoom_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- Dumping data for table management_system.not_available_rooms: ~7 rows (approximately)
/*!40000 ALTER TABLE `not_available_rooms` DISABLE KEYS */;
INSERT INTO `not_available_rooms` (`notAvlRoom_id`, `room`, `startTime`, `endTime`, `day`, `status`) VALUES
	(1, 'A501', '8.30', '10.30', 'Monday', 1),
	(2, 'A402', '10.30', '12.30', 'Tuesday', 1),
	(3, 'A402', '10.30', '', 'Tuesday', 0),
	(4, 'A402', '10.30', '11.30', 'Tuesday', 0),
	(5, 'E3C', '12.20', '13.30', 'Monday', 1),
	(6, 'Pull', '12.20', '13.30', 'Monday', 1),
	(8, 'A501', '10.30', '12.30', 'Monday', 1),
	(9, 'A501', '12.30', '1.30', 'Tuesday', 0);
/*!40000 ALTER TABLE `not_available_rooms` ENABLE KEYS */;

-- Dumping structure for table management_system.not_available_time
DROP TABLE IF EXISTS `not_available_time`;
CREATE TABLE IF NOT EXISTS `not_available_time` (
  `notAvailbleTime_id` int(11) NOT NULL AUTO_INCREMENT,
  `lecturer_id` int(11) NOT NULL,
  `group_id` int(11) NOT NULL,
  `subGroup_id` int(11) NOT NULL,
  `session_id` int(11) NOT NULL,
  `time` varchar(45) NOT NULL,
  `notAvlRoom_id` int(11) NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`notAvailbleTime_id`),
  KEY `lecture_fk` (`lecturer_id`),
  KEY `groupid_fk` (`group_id`),
  KEY `sessionid_fk` (`session_id`),
  KEY `fk_not_available_time_not_available_rooms1_idx` (`notAvlRoom_id`),
  CONSTRAINT `fk_not_available_time_not_available_rooms1` FOREIGN KEY (`notAvlRoom_id`) REFERENCES `not_available_rooms` (`notAvlRoom_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `groupid_fk` FOREIGN KEY (`group_id`) REFERENCES `student_groups` (`idstudent_groups`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `lecture_fk` FOREIGN KEY (`lecturer_id`) REFERENCES `lecturer` (`idlecturer`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `sessionid_fk` FOREIGN KEY (`session_id`) REFERENCES `lecture_sessions` (`idlecture_sessions`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- Dumping data for table management_system.not_available_time: ~9 rows (approximately)
/*!40000 ALTER TABLE `not_available_time` DISABLE KEYS */;
INSERT INTO `not_available_time` (`notAvailbleTime_id`, `lecturer_id`, `group_id`, `subGroup_id`, `session_id`, `time`, `notAvlRoom_id`, `status`) VALUES
	(1, 3, 2, 0, 1, '', 2, 1),
	(2, 1, 2, 2, 1, '', 4, 1),
	(3, 3, 2, 2, 1, '8.30', 1, 1),
	(4, 3, 2, 2, 1, '12.30', 2, 1),
	(5, 1, 2, 2, 1, '', 2, 1),
	(6, 8, 2, 2, 1, '12.30', 5, 1),
	(7, 3, 2, 2, 1, '12.45', 2, 1),
	(8, 7, 2, 2, 2, '12.30', 1, 1),
	(9, 8, 2, 2, 2, '10.30', 1, 0),
	(10, 3, 2, 1, 2, '12', 2, 0);
/*!40000 ALTER TABLE `not_available_time` ENABLE KEYS */;

-- Dumping structure for table management_system.parallel
DROP TABLE IF EXISTS `parallel`;
CREATE TABLE IF NOT EXISTS `parallel` (
  `idparallel` int(11) NOT NULL AUTO_INCREMENT,
  `start_time` varchar(45) DEFAULT NULL,
  `date` varchar(45) DEFAULT NULL,
  `duration` varchar(45) DEFAULT NULL,
  `subjects1` int(11) NOT NULL,
  `subjects2` int(11) NOT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idparallel`),
  KEY `fk_parallel_subjects1_idx` (`subjects1`),
  KEY `fk_parallel_subjects2_idx` (`subjects2`),
  CONSTRAINT `fk_parallel_subjects1` FOREIGN KEY (`subjects1`) REFERENCES `subjects` (`idsubjects`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_parallel_subjects2` FOREIGN KEY (`subjects2`) REFERENCES `subjects` (`idsubjects`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Dumping data for table management_system.parallel: ~3 rows (approximately)
/*!40000 ALTER TABLE `parallel` DISABLE KEYS */;
INSERT INTO `parallel` (`idparallel`, `start_time`, `date`, `duration`, `subjects1`, `subjects2`, `status`) VALUES
	(2, '12', '12', '12', 1, 1, NULL),
	(3, '12.30', '2021.12.28', '12hr', 3, 6, 'Active'),
	(4, 'test_final', '2021.05.22', '12', 3, 6, 'deactive');
/*!40000 ALTER TABLE `parallel` ENABLE KEYS */;

-- Dumping structure for table management_system.session_rooms
DROP TABLE IF EXISTS `session_rooms`;
CREATE TABLE IF NOT EXISTS `session_rooms` (
  `idsession_rooms` int(11) NOT NULL AUTO_INCREMENT,
  `lecture_sessions` int(11) NOT NULL,
  `building` int(11) NOT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idsession_rooms`),
  KEY `fk_session_rooms_lecture_sessions1_idx` (`lecture_sessions`),
  KEY `fk_session_rooms_building1_idx` (`building`),
  CONSTRAINT `fk_session_rooms_building1` FOREIGN KEY (`building`) REFERENCES `building` (`idbuilding`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_session_rooms_lecture_sessions1` FOREIGN KEY (`lecture_sessions`) REFERENCES `lecture_sessions` (`idlecture_sessions`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Dumping data for table management_system.session_rooms: ~4 rows (approximately)
/*!40000 ALTER TABLE `session_rooms` DISABLE KEYS */;
INSERT INTO `session_rooms` (`idsession_rooms`, `lecture_sessions`, `building`, `status`) VALUES
	(1, 1, 2, 'Lecture Hall'),
	(2, 1, 2, 'Lecture Hall'),
	(3, 3, 1, 'Active'),
	(4, 6, 4, 'deactive');
/*!40000 ALTER TABLE `session_rooms` ENABLE KEYS */;

-- Dumping structure for table management_system.student_groups
DROP TABLE IF EXISTS `student_groups`;
CREATE TABLE IF NOT EXISTS `student_groups` (
  `idstudent_groups` int(11) NOT NULL AUTO_INCREMENT,
  `semester` varchar(45) DEFAULT NULL,
  `program` varchar(45) DEFAULT NULL,
  `groupno` varchar(45) DEFAULT NULL,
  `subgroupno` varchar(45) DEFAULT NULL,
  `groups_id` varchar(45) DEFAULT NULL,
  `sub_groups_id` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idstudent_groups`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- Dumping data for table management_system.student_groups: ~3 rows (approximately)
/*!40000 ALTER TABLE `student_groups` DISABLE KEYS */;
INSERT INTO `student_groups` (`idstudent_groups`, `semester`, `program`, `groupno`, `subgroupno`, `groups_id`, `sub_groups_id`, `status`) VALUES
	(2, '2020', 'IT', '2', '2', '2021.IT.5', '1', 'Active'),
	(3, '2021', 'IT', '2', '2', '2021.IT.2', '2', 'Active'),
	(4, '1', 'IT', '4', '1.IT.3', '2021.IT.7', '5', 'Active'),
	(5, 'test_final', 'CS', '1', '4', '2021.IT.8', '8', 'Active');
/*!40000 ALTER TABLE `student_groups` ENABLE KEYS */;

-- Dumping structure for table management_system.subjects
DROP TABLE IF EXISTS `subjects`;
CREATE TABLE IF NOT EXISTS `subjects` (
  `idsubjects` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `code` varchar(45) DEFAULT NULL,
  `semester` varchar(45) DEFAULT NULL,
  `lecture_hours` varchar(45) DEFAULT NULL,
  `lab_hours` varchar(45) DEFAULT NULL,
  `totorial_hours` varchar(45) DEFAULT NULL,
  `evolution_hours` varchar(45) DEFAULT NULL,
  `year` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idsubjects`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- Dumping data for table management_system.subjects: ~7 rows (approximately)
/*!40000 ALTER TABLE `subjects` DISABLE KEYS */;
INSERT INTO `subjects` (`idsubjects`, `name`, `code`, `semester`, `lecture_hours`, `lab_hours`, `totorial_hours`, `evolution_hours`, `year`, `status`) VALUES
	(1, 'test sub', 'IT2038', 'First', '50', '20', '20', '34', '1st year', 'Active'),
	(3, 'ITP', 'IT2033', 'First', '2', '2', '3', '4', '1st year', 'Active'),
	(6, 'DSA', 'IT2031', 'First', '3', '2', '2', '1', '1st year', 'Active'),
	(8, 'DSA', 'IT2010', 'First', '2', '2', '1', '1', '1st year', 'Active'),
	(9, 'MC', 'IT1011', 'First', '3', '2', '0', '1', '2st year', 'Active'),
	(10, 'CN', 'IT2030', 'Second', '2', '2', '1', '1', '1st year', 'Active'),
	(11, 'maths', 'IT2037', 'Second', '20', '5', '8', '3', '1st year', 'Active'),
	(12, 'not', 'IT2032', 'First', '1', '3', '2', '4', '2st year', 'Active');
/*!40000 ALTER TABLE `subjects` ENABLE KEYS */;

-- Dumping structure for table management_system.tags
DROP TABLE IF EXISTS `tags`;
CREATE TABLE IF NOT EXISTS `tags` (
  `idtags` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `code` varchar(45) DEFAULT NULL,
  `related_tag` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idtags`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- Dumping data for table management_system.tags: ~3 rows (approximately)
/*!40000 ALTER TABLE `tags` DISABLE KEYS */;
INSERT INTO `tags` (`idtags`, `name`, `code`, `related_tag`, `status`) VALUES
	(2, 'Lecture Tute Lab', 'maths22', 'Evolution', 'Active'),
	(3, 'Lecture Tute Lab', '1254', 'Tutorial', 'Active'),
	(4, 'Lab', '12533', 'Tutorial', 'Active');
/*!40000 ALTER TABLE `tags` ENABLE KEYS */;

-- Dumping structure for table management_system.workingdays
DROP TABLE IF EXISTS `workingdays`;
CREATE TABLE IF NOT EXISTS `workingdays` (
  `workingDaysID` int(11) NOT NULL AUTO_INCREMENT,
  `NoDays` int(11) NOT NULL,
  `monday` int(11) NOT NULL,
  `tuesday` int(11) NOT NULL,
  `wendnesday` int(11) NOT NULL,
  `thursday` int(11) NOT NULL,
  `friday` int(11) NOT NULL,
  `satureday` int(11) NOT NULL,
  `sunday` int(11) NOT NULL,
  `hour` int(11) NOT NULL,
  `minute` int(11) NOT NULL,
  PRIMARY KEY (`workingDaysID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- Dumping data for table management_system.workingdays: ~6 rows (approximately)
/*!40000 ALTER TABLE `workingdays` DISABLE KEYS */;
INSERT INTO `workingdays` (`workingDaysID`, `NoDays`, `monday`, `tuesday`, `wendnesday`, `thursday`, `friday`, `satureday`, `sunday`, `hour`, `minute`) VALUES
	(4, 2, 1, 1, 0, 0, 0, 0, 0, 2, 4),
	(5, 3, 1, 0, 0, 0, 1, 1, 0, 1, 4),
	(7, 5, 1, 1, 1, 0, 0, 0, 0, 7, 30),
	(8, 5, 1, 1, 1, 0, 0, 1, 1, 3, 5),
	(9, 7, 1, 1, 1, 1, 1, 1, 1, 7, 0),
	(10, 5, 1, 1, 1, 0, 0, 1, 1, 3, 5);
/*!40000 ALTER TABLE `workingdays` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
