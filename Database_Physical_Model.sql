-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema vshelf
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema vshelf
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `vshelf` DEFAULT CHARACTER SET utf8 ;
USE `vshelf` ;

-- -----------------------------------------------------
-- Table `vshelf`.`User`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vshelf`.`User` (
  `idUser` INT NOT NULL,
  `Username` VARCHAR(45) NOT NULL,
  `Password` VARCHAR(45) NOT NULL,
  `NumBooks` INT NOT NULL,
  PRIMARY KEY (`idUser`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `vshelf`.`Type`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vshelf`.`Type` (
  `idType` INT NOT NULL,
  `Name` VARCHAR(100) NOT NULL,
  `Tags` TEXT NULL,
  PRIMARY KEY (`idType`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `vshelf`.`Book`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vshelf`.`Book` (
  `idBook` INT NOT NULL,
  `Name` VARCHAR(45) NOT NULL,
  `Year` INT NOT NULL,
  `Edition` INT NOT NULL,
  `Publisher` VARCHAR(45) NOT NULL,
  `Authors` VARCHAR(150) NOT NULL,
  `Added` DATE NOT NULL,
  `Type_idType` INT NOT NULL,
  PRIMARY KEY (`idBook`),
  INDEX `fk_Book_Type1_idx` (`Type_idType` ASC) VISIBLE,
  CONSTRAINT `fk_Book_Type1`
    FOREIGN KEY (`Type_idType`)
    REFERENCES `vshelf`.`Type` (`idType`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `vshelf`.`User_has_Book`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vshelf`.`User_has_Book` (
  `User_idUser` INT NOT NULL,
  `Book_idBook` INT NOT NULL,
  `Read` TINYINT NOT NULL,
  `ReadDate` DATE NULL,
  `Rating` INT NULL,
  `Obs` TEXT NULL,
  PRIMARY KEY (`User_idUser`, `Book_idBook`),
  INDEX `fk_User_has_Book_Book1_idx` (`Book_idBook` ASC) VISIBLE,
  INDEX `fk_User_has_Book_User_idx` (`User_idUser` ASC) VISIBLE,
  CONSTRAINT `fk_User_has_Book_User`
    FOREIGN KEY (`User_idUser`)
    REFERENCES `vshelf`.`User` (`idUser`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_User_has_Book_Book1`
    FOREIGN KEY (`Book_idBook`)
    REFERENCES `vshelf`.`Book` (`idBook`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
