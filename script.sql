SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `credit`
--
CREATE DATABASE IF NOT EXISTS `credit` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `credit`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `city`
--

CREATE TABLE IF NOT EXISTS `city` (
  `id_city` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL COMMENT 'Nombre de la ciudad',
  PRIMARY KEY (`id_city`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `city`
--

INSERT INTO `city` (`id_city`, `name`) VALUES
(1, 'Itagui');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `credit`
--

CREATE TABLE IF NOT EXISTS `credit` (
  `id_credit` int(11) NOT NULL,
  `total_cost` varchar(45) NOT NULL COMMENT 'Valor total',
  `total_fee` varchar(45) NOT NULL COMMENT 'Total de cuota',
  `id_person` int(11) NOT NULL,
  PRIMARY KEY (`id_credit`),
  KEY `FK_ID_person_credit_idx` (`id_person`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `credit`
--

INSERT INTO `credit` (`id_credit`, `total_cost`, `total_fee`, `id_person`) VALUES
(1, '21', '3', 1),
(2, '222222', '11', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `person`
--

CREATE TABLE IF NOT EXISTS `person` (
  `id_person` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `number_phone` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `number_identification` varchar(45) NOT NULL,
  `id_type_identification` int(11) NOT NULL,
  `address` varchar(45) DEFAULT NULL,
  `id_city_location` int(11) NOT NULL,
  `id_suburb_location` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_person`),
  UNIQUE KEY `number_identification_UNIQUE` (`number_identification`),
  KEY `FK_ID_type_identification_person_idx` (`id_type_identification`),
  KEY `FK_id_city_location_person_idx` (`id_city_location`),
  KEY `FK_id_suburb_location_person_idx` (`id_suburb_location`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `person`
--

INSERT INTO `person` (`id_person`, `name`, `last_name`, `number_phone`, `email`, `number_identification`, `id_type_identification`, `address`, `id_city_location`, `id_suburb_location`) VALUES
(1, 'Alexander', 'Potosi Imbachi', '3193688511', 'alexanderpotsi@gmail.com', '1061756488', 1, 'Calle 58 # 58 - 50', 1, 1),
(2, 'Jairo', 'Juev Orien', '31569/4712', 'correo@gmail.com', '456789', 1, 'direccion', 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `suburb`
--

CREATE TABLE IF NOT EXISTS `suburb` (
  `id_suburb` int(11) NOT NULL,
  `name` varchar(45) NOT NULL COMMENT 'Nombre que corresonde al barrio',
  `id_city` int(11) NOT NULL,
  PRIMARY KEY (`id_suburb`),
  KEY `FK_ID_city_location_City_idx` (`id_city`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tabla que corresponde a la ubicación';

--
-- Volcado de datos para la tabla `suburb`
--

INSERT INTO `suburb` (`id_suburb`, `name`, `id_city`) VALUES
(1, 'Viviendas del Sur', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `type_identification`
--

CREATE TABLE IF NOT EXISTS `type_identification` (
  `id_type_identification` int(11) NOT NULL,
  `name` varchar(45) NOT NULL COMMENT 'nombre del tipo de identificación',
  PRIMARY KEY (`id_type_identification`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `type_identification`
--

INSERT INTO `type_identification` (`id_type_identification`, `name`) VALUES
(1, 'CC');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `credit`
--
ALTER TABLE `credit`
  ADD CONSTRAINT `FK_ID_person_credit` FOREIGN KEY (`id_person`) REFERENCES `person` (`id_person`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `person`
--
ALTER TABLE `person`
  ADD CONSTRAINT `FK_ID_type_identification_person` FOREIGN KEY (`id_type_identification`) REFERENCES `type_identification` (`id_type_identification`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_id_city_location_person` FOREIGN KEY (`id_city_location`) REFERENCES `city` (`id_city`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_id_suburb_location_person` FOREIGN KEY (`id_suburb_location`) REFERENCES `suburb` (`id_suburb`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `suburb`
--
ALTER TABLE `suburb`
  ADD CONSTRAINT `FK_ID_city_location_City` FOREIGN KEY (`id_city`) REFERENCES `city` (`id_city`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
