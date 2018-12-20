-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 20 Des 2018 pada 02.02
-- Versi server: 10.1.37-MariaDB
-- Versi PHP: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rentalmobil`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `mobil`
--

CREATE TABLE `mobil` (
  `id_mobil` int(11) NOT NULL,
  `no_polisi` varchar(35) DEFAULT NULL,
  `merk_mobil` varchar(35) DEFAULT NULL,
  `tahun_pembuatan` int(11) DEFAULT NULL,
  `harga_sewa` int(11) DEFAULT NULL,
  `kuota_mobil` int(11) DEFAULT NULL,
  `jenis` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `mobil`
--

INSERT INTO `mobil` (`id_mobil`, `no_polisi`, `merk_mobil`, `tahun_pembuatan`, `harga_sewa`, `kuota_mobil`, `jenis`) VALUES
(2, 'N 2223 VV', 'Avanza Veloz', 2016, 3000000, 3, 'Minibus'),
(3, 'N 3423 HH', 'Pajero', 2015, 4000000, 2, 'Jeep'),
(4, 'N 5644 GH', 'Hino Dutro', 2015, 4500000, 2, 'Truk');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pengembalian`
--

CREATE TABLE `pengembalian` (
  `id_pengembalian` int(11) NOT NULL,
  `id_penyewaan` int(11) NOT NULL,
  `tgl_kembali` date NOT NULL,
  `denda` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `penyewaan`
--

CREATE TABLE `penyewaan` (
  `id_penyewaan` int(11) NOT NULL,
  `nama_penyewa` varchar(35) NOT NULL,
  `alamat_penyewa` text NOT NULL,
  `no_telepon` varchar(15) NOT NULL,
  `tgl_sewa` date NOT NULL,
  `id_mobil` int(11) NOT NULL,
  `lama_sewa` int(11) NOT NULL,
  `total_biaya` int(11) NOT NULL,
  `nama_supir` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `penyewaan`
--

INSERT INTO `penyewaan` (`id_penyewaan`, `nama_penyewa`, `alamat_penyewa`, `no_telepon`, `tgl_sewa`, `id_mobil`, `lama_sewa`, `total_biaya`, `nama_supir`) VALUES
(1, 'andhika adjie', 'Jalan Jalan', '08956789789', '2018-12-11', 1, 4, 10000000, '-'),
(3, 'Adjie', 'Malang', '089681155971', '2018-12-18', 2, 4, 12000000, 'Agus'),
(4, 'dfghj', 'xdcfgvhbnj', '45678', '2018-12-20', 4, 2, 9000000, '-');

--
-- Trigger `penyewaan`
--
DELIMITER $$
CREATE TRIGGER `sewa` AFTER INSERT ON `penyewaan` FOR EACH ROW BEGIN
     UPDATE mobil SET kuota_mobil = kuota_mobil - 1 WHERE id_mobil = NEW.id_mobil;
END
$$
DELIMITER ;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `mobil`
--
ALTER TABLE `mobil`
  ADD PRIMARY KEY (`id_mobil`);

--
-- Indeks untuk tabel `pengembalian`
--
ALTER TABLE `pengembalian`
  ADD PRIMARY KEY (`id_pengembalian`),
  ADD KEY `id_penyewaan` (`id_penyewaan`);

--
-- Indeks untuk tabel `penyewaan`
--
ALTER TABLE `penyewaan`
  ADD PRIMARY KEY (`id_penyewaan`),
  ADD KEY `id_mobil` (`id_mobil`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `mobil`
--
ALTER TABLE `mobil`
  MODIFY `id_mobil` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT untuk tabel `pengembalian`
--
ALTER TABLE `pengembalian`
  MODIFY `id_pengembalian` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `penyewaan`
--
ALTER TABLE `penyewaan`
  MODIFY `id_penyewaan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
