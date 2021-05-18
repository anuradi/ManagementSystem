-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 18, 2021 at 10:41 PM
-- Server version: 10.4.16-MariaDB
-- PHP Version: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `management_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `building`
--

CREATE TABLE `building` (
  `idbuilding` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `room_name` varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `capacity` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `building`
--

INSERT INTO `building` (`idbuilding`, `name`, `room_name`, `type`, `capacity`, `status`) VALUES
(1, 'New building', 'E3C', 'Lecture Hall', '100', 'Active'),
(2, 'D-block ', 'A501', 'Lecture Hall', '50', 'Active'),
(3, 'B -block', 'Pull', 'Lecture Hall', '75', 'Active'),
(4, 'Dimo', 'Push', 'Lecture Hall', '90', 'Active'),
(5, 'main', 'A402', 'Laboratory', '120', 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `campus`
--

CREATE TABLE `campus` (
  `idcampus` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `campus`
--

INSERT INTO `campus` (`idcampus`, `name`, `status`) VALUES
(1, 'Metro', NULL),
(2, 'Malabe', NULL),
(3, 'Kandy', NULL),
(4, 'kurunegala', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `consecutive`
--

CREATE TABLE `consecutive` (
  `idconsecutive` int(11) NOT NULL,
  `subject` int(11) NOT NULL,
  `group_id` varchar(45) DEFAULT NULL,
  `tag` varchar(45) DEFAULT NULL,
  `lecturer1` int(11) NOT NULL,
  `lecturer2` int(11) NOT NULL,
  `status` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `consecutive`
--

INSERT INTO `consecutive` (`idconsecutive`, `subject`, `group_id`, `tag`, `lecturer1`, `lecturer2`, `status`) VALUES
(1, 1, '2', NULL, 1, 1, NULL),
(3, 1, '2', NULL, 1, 1, NULL),
(4, 1, '2', NULL, 1, 1, NULL),
(5, 1, '2', NULL, 1, 1, NULL),
(6, 1, '2', NULL, 3, 1, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `iddepartment` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`iddepartment`, `name`, `status`) VALUES
(1, 'IT', NULL),
(2, 'SE', NULL),
(3, 'DS', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `faculty`
--

CREATE TABLE `faculty` (
  `idfaculty` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `faculty`
--

INSERT INTO `faculty` (`idfaculty`, `name`, `status`) VALUES
(1, 'Engineering', NULL),
(2, 'Computing', NULL),
(3, 'Business Management', NULL),
(4, 'HR', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `lecturer`
--

CREATE TABLE `lecturer` (
  `idlecturer` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `emp_id` varchar(45) DEFAULT NULL,
  `rank` varchar(45) DEFAULT NULL,
  `faculty_id` int(11) NOT NULL,
  `department_id` int(11) NOT NULL,
  `campus_id` int(11) NOT NULL,
  `building_id` int(11) NOT NULL,
  `level_id` int(11) NOT NULL,
  `status` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `lecturer`
--

INSERT INTO `lecturer` (`idlecturer`, `name`, `emp_id`, `rank`, `faculty_id`, `department_id`, `campus_id`, `building_id`, `level_id`, `status`) VALUES
(1, 'lec test11', '1234577', '546542', 1, 1, 2, 1, 3, NULL),
(3, 'Kamal Gunarathna SLIIT', '2001', '1.2001', 1, 1, 1, 1, 1, NULL),
(6, 'dewg', '000123', '1.000123', 3, 1, 3, 3, 1, NULL),
(7, 'Dalith', '2021', '2.2021', 1, 2, 2, 2, 2, 'deactive'),
(8, 'nelum', '000123', '1.000123', 1, 2, 1, 1, 1, 'deactive'),
(9, 'chamodi', '000122', '2.000122', 1, 1, 2, 2, 2, 'deactive'),
(10, 'chamodi', '000122', '2.000122', 1, 1, 2, 2, 2, 'deactive'),
(11, 'chamodi bandara', '000122', '2.000122', 3, 2, 2, 1, 2, 'deactive'),
(12, 'namal maitpe', '000133', '1.000133', 2, 1, 1, 2, 1, 'deactive'),
(13, 'anuradi', '000131', '2.000133', 4, 2, 1, 2, 2, 'deactive'),
(14, 'chamodi', '000122', '3.000222', 2, 1, 1, 1, 2, 'deactive'),
(15, 'chamodi', '000122', '2.000122', 2, 1, 1, 1, 2, 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `lecture_sessions`
--

CREATE TABLE `lecture_sessions` (
  `idlecture_sessions` int(11) NOT NULL,
  `subject_code` varchar(45) DEFAULT NULL,
  `std_count` varchar(45) DEFAULT NULL,
  `duration` varchar(45) DEFAULT NULL,
  `lecturer_id` int(11) NOT NULL,
  `subjects_id` int(11) NOT NULL,
  `tags_id` int(11) NOT NULL,
  `group_id` int(11) NOT NULL,
  `tags` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `lecture_sessions`
--

INSERT INTO `lecture_sessions` (`idlecture_sessions`, `subject_code`, `std_count`, `duration`, `lecturer_id`, `subjects_id`, `tags_id`, `group_id`, `tags`, `status`) VALUES
(1, 'test sub', '30', '50', 1, 1, 2, 2, NULL, NULL),
(2, 'test sub', '20', '2', 1, 1, 2, 2, NULL, NULL),
(3, '123456', '20', '4hr', 1, 1, 2, 2, NULL, 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `level`
--

CREATE TABLE `level` (
  `idlevel` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `level` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `level`
--

INSERT INTO `level` (`idlevel`, `name`, `level`, `status`) VALUES
(1, 'Proffessor', '1', NULL),
(2, 'Assistant Professor', '2', NULL),
(3, 'Senior Lecturer(HG)', '3', NULL),
(4, 'Senior Lecturer', '4', NULL),
(5, 'Lecturer', '5', NULL),
(6, 'Assistant Lecturer ', '6', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `non_overlapping`
--

CREATE TABLE `non_overlapping` (
  `idnon_overlapping` int(11) NOT NULL,
  `subjects1` int(11) NOT NULL,
  `subjects2` int(11) NOT NULL,
  `subjects3` int(11) NOT NULL,
  `subjects4` int(11) NOT NULL,
  `status` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `non_overlapping`
--

INSERT INTO `non_overlapping` (`idnon_overlapping`, `subjects1`, `subjects2`, `subjects3`, `subjects4`, `status`) VALUES
(3, 1, 1, 1, 1, NULL),
(4, 3, 1, 1, 1, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `not_available_rooms`
--

CREATE TABLE `not_available_rooms` (
  `notAvlRoom_id` int(11) NOT NULL,
  `room` varchar(45) NOT NULL,
  `startTime` varchar(45) NOT NULL,
  `endTime` varchar(45) NOT NULL,
  `day` varchar(45) NOT NULL,
  `status` int(11) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `not_available_rooms`
--

INSERT INTO `not_available_rooms` (`notAvlRoom_id`, `room`, `startTime`, `endTime`, `day`, `status`) VALUES
(1, 'A501', '8.30', '10.30', 'Monday', 1),
(2, 'A402', '10.30', '12.30', 'Tuesday', 1),
(3, 'A402', '10.30', '', 'Tuesday', 0),
(4, 'A402', '10.30', '11.30', 'Tuesday', 0);

-- --------------------------------------------------------

--
-- Table structure for table `not_available_time`
--

CREATE TABLE `not_available_time` (
  `notAvailbleTime_id` int(11) NOT NULL,
  `lecturer_id` int(11) NOT NULL,
  `group_id` int(11) NOT NULL,
  `subGroup_id` int(11) NOT NULL,
  `session_id` int(11) NOT NULL,
  `time` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `not_available_time`
--

INSERT INTO `not_available_time` (`notAvailbleTime_id`, `lecturer_id`, `group_id`, `subGroup_id`, `session_id`, `time`) VALUES
(1, 3, 2, 0, 1, ''),
(2, 1, 2, 2, 1, ''),
(3, 3, 2, 2, 1, '8.30');

-- --------------------------------------------------------

--
-- Table structure for table `parallel`
--

CREATE TABLE `parallel` (
  `idparallel` int(11) NOT NULL,
  `start_time` varchar(45) DEFAULT NULL,
  `date` varchar(45) DEFAULT NULL,
  `duration` varchar(45) DEFAULT NULL,
  `subjects1` int(11) NOT NULL,
  `subjects2` int(11) NOT NULL,
  `status` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `parallel`
--

INSERT INTO `parallel` (`idparallel`, `start_time`, `date`, `duration`, `subjects1`, `subjects2`, `status`) VALUES
(2, '12', '12', '12', 1, 1, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `session_rooms`
--

CREATE TABLE `session_rooms` (
  `idsession_rooms` int(11) NOT NULL,
  `lecture_sessions` int(11) NOT NULL,
  `building` int(11) NOT NULL,
  `status` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `session_rooms`
--

INSERT INTO `session_rooms` (`idsession_rooms`, `lecture_sessions`, `building`, `status`) VALUES
(1, 1, 2, 'Lecture Hall'),
(2, 3, 2, 'Lecture Hall');

-- --------------------------------------------------------

--
-- Table structure for table `student_groups`
--

CREATE TABLE `student_groups` (
  `idstudent_groups` int(11) NOT NULL,
  `semester` varchar(45) DEFAULT NULL,
  `program` varchar(45) DEFAULT NULL,
  `groupno` varchar(45) DEFAULT NULL,
  `subgroupno` varchar(45) DEFAULT NULL,
  `groups_id` varchar(45) DEFAULT NULL,
  `sub_groups_id` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `student_groups`
--

INSERT INTO `student_groups` (`idstudent_groups`, `semester`, `program`, `groupno`, `subgroupno`, `groups_id`, `sub_groups_id`, `status`) VALUES
(2, '2020', 'IT', '2', '2', '5', 'test.IT.2', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `subjects`
--

CREATE TABLE `subjects` (
  `idsubjects` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `code` varchar(45) DEFAULT NULL,
  `semester` varchar(45) DEFAULT NULL,
  `lecture_hours` varchar(45) DEFAULT NULL,
  `lab_hours` varchar(45) DEFAULT NULL,
  `totorial_hours` varchar(45) DEFAULT NULL,
  `evolution_hours` varchar(45) DEFAULT NULL,
  `year` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `subjects`
--

INSERT INTO `subjects` (`idsubjects`, `name`, `code`, `semester`, `lecture_hours`, `lab_hours`, `totorial_hours`, `evolution_hours`, `year`, `status`) VALUES
(1, 'test sub', '123456', 'First', '50', '20', '20', '34', '2021', NULL),
(3, 'ITP', 'itp202', 'First', '2', '2', '3', '4', '2020', NULL),
(6, 'DSA', '222', 'First', '3', '2', '2', '1', '2021', 'deactive'),
(8, 'DSA', 'IT2010', 'First', '2', '2', '1', '1', '1', 'deactive'),
(9, 'MC', 'IT1011', 'First', '3', '2', '0', '1', '1', 'Active'),
(10, 'CN', 'IT2030', 'Second', '2', '2', '1', '1', '2', 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `tags`
--

CREATE TABLE `tags` (
  `idtags` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `code` varchar(45) DEFAULT NULL,
  `related_tag` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tags`
--

INSERT INTO `tags` (`idtags`, `name`, `code`, `related_tag`, `status`) VALUES
(2, 'nop', 'maths22', 'Evolution', NULL),
(3, 'Melex', '1254', 'Tutorial', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `workingdays`
--

CREATE TABLE `workingdays` (
  `workingDaysID` int(11) NOT NULL,
  `NoDays` int(11) NOT NULL,
  `monday` int(11) NOT NULL,
  `tuesday` int(11) NOT NULL,
  `wendnesday` int(11) NOT NULL,
  `thursday` int(11) NOT NULL,
  `friday` int(11) NOT NULL,
  `satureday` int(11) NOT NULL,
  `sunday` int(11) NOT NULL,
  `hour` int(11) NOT NULL,
  `minute` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `workingdays`
--

INSERT INTO `workingdays` (`workingDaysID`, `NoDays`, `monday`, `tuesday`, `wendnesday`, `thursday`, `friday`, `satureday`, `sunday`, `hour`, `minute`) VALUES
(1, 2, 1, 1, 0, 0, 0, 0, 0, 8, 30);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `building`
--
ALTER TABLE `building`
  ADD PRIMARY KEY (`idbuilding`);

--
-- Indexes for table `campus`
--
ALTER TABLE `campus`
  ADD PRIMARY KEY (`idcampus`);

--
-- Indexes for table `consecutive`
--
ALTER TABLE `consecutive`
  ADD PRIMARY KEY (`idconsecutive`),
  ADD KEY `fk_consecutive_subjects2_idx` (`subject`),
  ADD KEY `fk_consecutive_lecturer1_idx` (`lecturer1`),
  ADD KEY `fk_consecutive_lecturer2_idx` (`lecturer2`);

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`iddepartment`);

--
-- Indexes for table `faculty`
--
ALTER TABLE `faculty`
  ADD PRIMARY KEY (`idfaculty`);

--
-- Indexes for table `lecturer`
--
ALTER TABLE `lecturer`
  ADD PRIMARY KEY (`idlecturer`),
  ADD KEY `fk_lecturer_faculty1_idx` (`faculty_id`),
  ADD KEY `fk_lecturer_department1_idx` (`department_id`),
  ADD KEY `fk_lecturer_campus1_idx` (`campus_id`),
  ADD KEY `fk_lecturer_building1_idx` (`building_id`),
  ADD KEY `fk_lecturer_level1_idx` (`level_id`);

--
-- Indexes for table `lecture_sessions`
--
ALTER TABLE `lecture_sessions`
  ADD PRIMARY KEY (`idlecture_sessions`),
  ADD KEY `fk_lecture_sessions_lecturer1_idx` (`lecturer_id`),
  ADD KEY `fk_lecture_sessions_subjects1_idx` (`subjects_id`),
  ADD KEY `fk_lecture_sessions_tags1_idx` (`tags_id`),
  ADD KEY `fk_lecture_sessions_student_groups1_idx` (`group_id`);

--
-- Indexes for table `level`
--
ALTER TABLE `level`
  ADD PRIMARY KEY (`idlevel`);

--
-- Indexes for table `non_overlapping`
--
ALTER TABLE `non_overlapping`
  ADD PRIMARY KEY (`idnon_overlapping`),
  ADD KEY `fk_non_overlapping_subjects1_idx` (`subjects1`),
  ADD KEY `fk_non_overlapping_subjects2_idx` (`subjects2`),
  ADD KEY `fk_non_overlapping_subjects3_idx` (`subjects3`),
  ADD KEY `fk_non_overlapping_subjects4_idx` (`subjects4`);

--
-- Indexes for table `not_available_rooms`
--
ALTER TABLE `not_available_rooms`
  ADD PRIMARY KEY (`notAvlRoom_id`);

--
-- Indexes for table `not_available_time`
--
ALTER TABLE `not_available_time`
  ADD PRIMARY KEY (`notAvailbleTime_id`),
  ADD KEY `lecture_fk` (`lecturer_id`),
  ADD KEY `groupid_fk` (`group_id`),
  ADD KEY `sessionid_fk` (`session_id`);

--
-- Indexes for table `parallel`
--
ALTER TABLE `parallel`
  ADD PRIMARY KEY (`idparallel`),
  ADD KEY `fk_parallel_subjects1_idx` (`subjects1`),
  ADD KEY `fk_parallel_subjects2_idx` (`subjects2`);

--
-- Indexes for table `session_rooms`
--
ALTER TABLE `session_rooms`
  ADD PRIMARY KEY (`idsession_rooms`),
  ADD KEY `fk_session_rooms_lecture_sessions1_idx` (`lecture_sessions`),
  ADD KEY `fk_session_rooms_building1_idx` (`building`);

--
-- Indexes for table `student_groups`
--
ALTER TABLE `student_groups`
  ADD PRIMARY KEY (`idstudent_groups`);

--
-- Indexes for table `subjects`
--
ALTER TABLE `subjects`
  ADD PRIMARY KEY (`idsubjects`);

--
-- Indexes for table `tags`
--
ALTER TABLE `tags`
  ADD PRIMARY KEY (`idtags`);

--
-- Indexes for table `workingdays`
--
ALTER TABLE `workingdays`
  ADD PRIMARY KEY (`workingDaysID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `building`
--
ALTER TABLE `building`
  MODIFY `idbuilding` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `campus`
--
ALTER TABLE `campus`
  MODIFY `idcampus` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `consecutive`
--
ALTER TABLE `consecutive`
  MODIFY `idconsecutive` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `department`
--
ALTER TABLE `department`
  MODIFY `iddepartment` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `faculty`
--
ALTER TABLE `faculty`
  MODIFY `idfaculty` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `lecturer`
--
ALTER TABLE `lecturer`
  MODIFY `idlecturer` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `lecture_sessions`
--
ALTER TABLE `lecture_sessions`
  MODIFY `idlecture_sessions` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `level`
--
ALTER TABLE `level`
  MODIFY `idlevel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `non_overlapping`
--
ALTER TABLE `non_overlapping`
  MODIFY `idnon_overlapping` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `not_available_rooms`
--
ALTER TABLE `not_available_rooms`
  MODIFY `notAvlRoom_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `not_available_time`
--
ALTER TABLE `not_available_time`
  MODIFY `notAvailbleTime_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `parallel`
--
ALTER TABLE `parallel`
  MODIFY `idparallel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `session_rooms`
--
ALTER TABLE `session_rooms`
  MODIFY `idsession_rooms` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `student_groups`
--
ALTER TABLE `student_groups`
  MODIFY `idstudent_groups` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `subjects`
--
ALTER TABLE `subjects`
  MODIFY `idsubjects` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `tags`
--
ALTER TABLE `tags`
  MODIFY `idtags` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `workingdays`
--
ALTER TABLE `workingdays`
  MODIFY `workingDaysID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `consecutive`
--
ALTER TABLE `consecutive`
  ADD CONSTRAINT `fk_consecutive_lecturer1` FOREIGN KEY (`lecturer1`) REFERENCES `lecturer` (`idlecturer`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_consecutive_lecturer2` FOREIGN KEY (`lecturer2`) REFERENCES `lecturer` (`idlecturer`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_consecutive_subjects2` FOREIGN KEY (`subject`) REFERENCES `subjects` (`idsubjects`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `lecturer`
--
ALTER TABLE `lecturer`
  ADD CONSTRAINT `fk_lecturer_building1` FOREIGN KEY (`building_id`) REFERENCES `building` (`idbuilding`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_lecturer_campus1` FOREIGN KEY (`campus_id`) REFERENCES `campus` (`idcampus`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_lecturer_department1` FOREIGN KEY (`department_id`) REFERENCES `department` (`iddepartment`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_lecturer_faculty1` FOREIGN KEY (`faculty_id`) REFERENCES `faculty` (`idfaculty`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_lecturer_level1` FOREIGN KEY (`level_id`) REFERENCES `level` (`idlevel`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `lecture_sessions`
--
ALTER TABLE `lecture_sessions`
  ADD CONSTRAINT `fk_lecture_sessions_lecturer1` FOREIGN KEY (`lecturer_id`) REFERENCES `lecturer` (`idlecturer`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_lecture_sessions_student_groups1` FOREIGN KEY (`group_id`) REFERENCES `student_groups` (`idstudent_groups`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_lecture_sessions_subjects1` FOREIGN KEY (`subjects_id`) REFERENCES `subjects` (`idsubjects`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_lecture_sessions_tags1` FOREIGN KEY (`tags_id`) REFERENCES `tags` (`idtags`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `non_overlapping`
--
ALTER TABLE `non_overlapping`
  ADD CONSTRAINT `fk_non_overlapping_subjects1` FOREIGN KEY (`subjects1`) REFERENCES `subjects` (`idsubjects`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_non_overlapping_subjects2` FOREIGN KEY (`subjects2`) REFERENCES `subjects` (`idsubjects`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `not_available_time`
--
ALTER TABLE `not_available_time`
  ADD CONSTRAINT `groupid_fk` FOREIGN KEY (`group_id`) REFERENCES `student_groups` (`idstudent_groups`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `lecture_fk` FOREIGN KEY (`lecturer_id`) REFERENCES `lecturer` (`idlecturer`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `sessionid_fk` FOREIGN KEY (`session_id`) REFERENCES `lecture_sessions` (`idlecture_sessions`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `parallel`
--
ALTER TABLE `parallel`
  ADD CONSTRAINT `fk_parallel_subjects1` FOREIGN KEY (`subjects1`) REFERENCES `subjects` (`idsubjects`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_parallel_subjects2` FOREIGN KEY (`subjects2`) REFERENCES `subjects` (`idsubjects`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `session_rooms`
--
ALTER TABLE `session_rooms`
  ADD CONSTRAINT `fk_session_rooms_building1` FOREIGN KEY (`building`) REFERENCES `building` (`idbuilding`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_session_rooms_lecture_sessions1` FOREIGN KEY (`lecture_sessions`) REFERENCES `lecture_sessions` (`idlecture_sessions`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
