-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 17, 2022 at 08:20 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `aforismi`
--

-- --------------------------------------------------------

--
-- Table structure for table `aforismi`
--

CREATE TABLE `aforismi` (
  `id` int(11) NOT NULL,
  `testo` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `aforismi`
--

INSERT INTO `aforismi` (`id`, `testo`) VALUES
(1, 'Ciò che il bruco chiama fine del mondo, il resto del mondo chiama farfalla'),
(2, 'Ci sono 350 varietà di squali, senza contare gli addetti ai prestiti e ai fondi comuni.'),
(3, 'Vi sono due cose durevoli che possiamo sperare di lasciare in eredità ai nostri figli: le radici e le ali'),
(4, 'Quando piove lo stolto impreca contro gli dei, il saggio si procura un ombrello'),
(28, 'Durante i miei nove anni alle scuole superiori non sono riuscito a insegnare niente ai miei professori.'),
(36, 'Dietro ogni uomo di successo c\'è una suocera sorpresa.'),
(37, 'Fa così caldo che il condizionatore mi ha denunciato per sfruttamento.');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `aforismi`
--
ALTER TABLE `aforismi`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `aforismi`
--
ALTER TABLE `aforismi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
