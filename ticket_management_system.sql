-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th7 18, 2023 lúc 02:48 PM
-- Phiên bản máy phục vụ: 10.4.28-MariaDB
-- Phiên bản PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `ticket_management_system`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tickets`
--

CREATE TABLE `tickets` (
  `id` int(11) NOT NULL,
  `time` datetime NOT NULL,
  `price` double(12,2) NOT NULL,
  `type` varchar(100) NOT NULL,
  `detail` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `tickets`
--

INSERT INTO `tickets` (`id`, `time`, `price`, `type`, `detail`) VALUES
(2, '2023-08-05 10:00:00', 20.00, 'Student', 'Event: Museum Exhibition, Student ID: 1234'),
(3, '2023-09-02 19:00:00', 150.00, 'VIP', 'Event: Theatre Play, Seat: A2'),
(4, '2023-10-12 18:00:00', 75.00, 'Senior Citizen', 'Event: Symphony Orchestra, Seat: B5'),
(5, '2023-08-05 14:30:00', 20.00, 'Student', 'Event: Museum Exhibition, Student ID: 1224'),
(11, '2023-07-20 19:45:00', 33.00, 'vip', 'adult');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `users`
--

CREATE TABLE `users` (
  `username` varchar(100) NOT NULL,
  `password` char(68) NOT NULL,
  `enabled` tinyint(1) NOT NULL DEFAULT 1,
  `isAdmin` tinyint(4) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `users`
--

INSERT INTO `users` (`username`, `password`, `enabled`, `isAdmin`) VALUES
('admin', '$2a$10$w2W8zdPgUEHE0njg1lguBe7M9u2PpG2ymYqO18tlQoYQ9iZKlfgte', 1, 1),
('user90', '$2a$10$WrwP7QJ4qFbVkwXu1PoametWytTH5qsbY.WgFQDYphIG372k9M2Be', 1, 0),
('user900', '$2a$10$5X8ppO3vEFT1vRGSpCtD8OIG4NUnwxlHfTDE.N7mfDhMTuCGsv4TK', 1, 0);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `tickets`
--
ALTER TABLE `tickets`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `tickets`
--
ALTER TABLE `tickets`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
