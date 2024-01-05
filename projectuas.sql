-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 05, 2024 at 06:54 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `projectuas`
--

-- --------------------------------------------------------

--
-- Table structure for table `laporan`
--

CREATE TABLE `laporan` (
  `Kode_Transaksi` varchar(20) NOT NULL,
  `No Polisi` varchar(30) DEFAULT NULL,
  `Jenis Kendaraan` varchar(20) DEFAULT NULL,
  `Jam Masuk` varchar(20) DEFAULT NULL,
  `Harga Per Jam` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `laporan`
--

INSERT INTO `laporan` (`Kode_Transaksi`, `No Polisi`, `Jenis Kendaraan`, `Jam Masuk`, `Harga Per Jam`) VALUES
('P21071', 'hdjfjjf', 'Motor', '10:03:14', 2000);

-- --------------------------------------------------------

--
-- Table structure for table `riwayat`
--

CREATE TABLE `riwayat` (
  `Kode_Transaksi` varchar(20) NOT NULL,
  `No Polisi` varchar(20) NOT NULL,
  `Jenis Kendaraan` varchar(20) NOT NULL,
  `Jam Masuk` varchar(20) NOT NULL,
  `Jam Keluar` varchar(20) NOT NULL,
  `Lama Parkir` int(20) NOT NULL,
  `Total Bayar` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `riwayat`
--

INSERT INTO `riwayat` (`Kode_Transaksi`, `No Polisi`, `Jenis Kendaraan`, `Jam Masuk`, `Jam Keluar`, `Lama Parkir`, `Total Bayar`) VALUES
('P20061', 'F 1234 LKJ', 'Motor', '23:50:18', '23:56:58', 1, 2000),
('P20062', 'B 0987 KMN', 'Motor', '23:50:36', '23:57:40', 5, 10000),
('P20063', 'F 3442 LOJ', 'Mobil', '23:50:58', '23:58:38', 3, 15000),
('P20064', 'H 9978 KIH', 'Bus', '23:52:00', '23:59:04', 1, 12000),
('P23062', 'F 1223 LKL', 'Mobil', '01:01:09', '01:19:39', 1, 5000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `laporan`
--
ALTER TABLE `laporan`
  ADD PRIMARY KEY (`Kode_Transaksi`);

--
-- Indexes for table `riwayat`
--
ALTER TABLE `riwayat`
  ADD PRIMARY KEY (`Kode_Transaksi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
