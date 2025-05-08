-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 08 Bulan Mei 2025 pada 06.41
-- Versi server: 10.4.28-MariaDB
-- Versi PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_mpwkel4`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_booking`
--

CREATE TABLE `tb_booking` (
  `id_booking` int(11) NOT NULL,
  `kode_bookingan` varchar(20) NOT NULL,
  `nama_pemesan` varchar(100) NOT NULL,
  `alamat_pemesan` text NOT NULL,
  `notelp` varchar(15) NOT NULL,
  `kode_mpw` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `tb_booking`
--

INSERT INTO `tb_booking` (`id_booking`, `kode_bookingan`, `nama_pemesan`, `alamat_pemesan`, `notelp`, `kode_mpw`) VALUES
(1, '5ZJ9WB11OB', 'Haryanto Nugroho', 'Tasikmalaya', '087876054968', 'E43VV3'),
(2, 'YWKTA93U3R', 'Ade Amung Nugraha', 'Cisaga', '087654524311', 'E43VV3'),
(5, 'BH3JE3T77B', 'Hani Riani', 'Rajadesa', '087667895342', 'GR45RE'),
(6, 'ESC033QV8A', 'Haryanto Nugroho', 'Tasikmalaya', '087876054968', 'D64E13'),
(7, 'LLI4K1BE1W', 'Ade Amung Nugraha', 'Banjar', '0987665331', 'GR45RE'),
(8, 'X5HUCOLOH0', 'Hani Riani', 'Kawali', '0987763562', 'E43VV3'),
(9, 'QTKFZOO8PY', 'Haryanto Nugroho', 'Manonjaya', '087876054968', 'E43VV3'),
(10, 'YU6GO9DONA', 'Intan Regita Cahyani', 'Lumbung', '087665648392', 'D64E13'),
(11, '4YGAHCCW3U', 'Intan Regita Cahyani', 'Kawali', '08756783832', 'GR45RE'),
(12, 'CJSERR8JSQ', 'Intan Regita Cahyani', 'Kawali', '0987688766', 'E43VV3'),
(13, 'ZGXVINQWY6', 'Intan Regita', 'Bandung', '0858432135', 'E43VV3'),
(14, 'AN432WSTLD', 'Ade Amung Nugraha', 'Cisaga Kota', '08697654557', 'E43VV3'),
(15, 'XM3PM0UTOF', 'Ade Amung', 'Cisaga City', '0859745634', 'D64E13');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_data`
--

CREATE TABLE `tb_data` (
  `id_mpw` int(11) NOT NULL,
  `kode_mpw` varchar(20) NOT NULL,
  `tema_mpw` varchar(50) NOT NULL,
  `lokasi_mpw` varchar(50) NOT NULL,
  `tgl_mpw` date NOT NULL,
  `biaya_mpw` decimal(10,0) NOT NULL,
  `kegiatan_mpw` text NOT NULL,
  `image_mpw` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `tb_data`
--

INSERT INTO `tb_data` (`id_mpw`, `kode_mpw`, `tema_mpw`, `lokasi_mpw`, `tgl_mpw`, `biaya_mpw`, `kegiatan_mpw`, `image_mpw`) VALUES
(1, 'D64E13', 'Libur Panjang Sekolah', 'Bali', '2024-06-30', 1500000, '- Kunjungan Nusa Penida\n- Kunjungan Pantai Seminyak\n- Menonton Tari Kecak Uluwatu', '7xm127460-1024x694.jpg'),
(3, 'E43VV3', 'Tahun Baruan Ngedaki', 'Bromo', '2024-12-31', 1000000, '- Camping\n- Petualangan Jip\n- Sunrise di Bukit Mentigen', '63fdb9789cf09.jpg'),
(6, 'GR45RE', 'Libur Panjang tanggal Merah', 'Raja Ampat', '2024-08-18', 2000000, '- Keliling diantara tebing pulau Raja Ampat', 'download.jpeg');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_pengguna`
--

CREATE TABLE `tb_pengguna` (
  `id_pengguna` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `role` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `tb_pengguna`
--

INSERT INTO `tb_pengguna` (`id_pengguna`, `username`, `password`, `email`, `nama`, `role`) VALUES
(1, 'admin', '827ccb0eea8a706c4c34a16891f84e7b', 'admin123@gmail.com', 'Admin WacanawehelA', 'admin'),
(2, 'haryanto', '5d347461fef2060cacfa445eb828b790', 'haryanto@gmail.com', 'Haryanto Nugroho', 'user'),
(3, 'Amung', '6531401f9a6807306651b87e44c05751', 'amung@gmail.com', 'Ade Amung Nugraha', 'user'),
(4, 'Hani', 'c9a140d1a756e793ea9a6927c070b6c7', 'hani@gmail.com', 'Hani Riani', 'user'),
(5, 'Intan', 'b1098cab9c2db3eb9f576eb66c33449c', 'intan@gmail.com', 'Intan Regita Cahyani', 'user'),
(6, 'intan', '46a7357b0b816cb9dd56d70d2a385cfd', 'intanrc123@gmail.com', 'Intan Regita', 'user'),
(7, 'Apung', '827ccb0eea8a706c4c34a16891f84e7b', 'Apung@gmail.com', 'Ade Amung Nugraha', 'user'),
(8, 'Ade', 'baa978d57c6941b4fe8e1a09841f00ec', 'Ade@gmail.com', 'Ade Amung', 'user');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tb_booking`
--
ALTER TABLE `tb_booking`
  ADD PRIMARY KEY (`id_booking`),
  ADD KEY `kode_mpw` (`kode_mpw`);

--
-- Indeks untuk tabel `tb_data`
--
ALTER TABLE `tb_data`
  ADD PRIMARY KEY (`kode_mpw`),
  ADD UNIQUE KEY `id_mpw` (`id_mpw`);

--
-- Indeks untuk tabel `tb_pengguna`
--
ALTER TABLE `tb_pengguna`
  ADD PRIMARY KEY (`id_pengguna`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tb_booking`
--
ALTER TABLE `tb_booking`
  MODIFY `id_booking` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT untuk tabel `tb_data`
--
ALTER TABLE `tb_data`
  MODIFY `id_mpw` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT untuk tabel `tb_pengguna`
--
ALTER TABLE `tb_pengguna`
  MODIFY `id_pengguna` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `tb_booking`
--
ALTER TABLE `tb_booking`
  ADD CONSTRAINT `tb_booking_ibfk_1` FOREIGN KEY (`kode_mpw`) REFERENCES `tb_data` (`kode_mpw`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
