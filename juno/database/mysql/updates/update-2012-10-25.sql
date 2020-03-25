CREATE TABLE `formPositionHazard` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `demographic_no` int(11),
  `formCreated` date,
  `formEdited`  timestamp NOT NULL,
  `supervisor` varchar(100),
  `formCreatedBy` varchar(6),
  `Acrylonitrile` varchar(1),
  `JobReclassify` tinyint(1),
  `NewHire` tinyint(1),
  `ProcedureChange` tinyint(1),
  `staffName` varchar(500),
  `staffPosition` varchar(500),
  `staffPhone` varchar(500),
  `staffJobSite` varchar(500),
  `staffDept` varchar(500),
  `staffEmail` varchar(500),
  `supervisorName` varchar(500),
  `supervisorEmail` varchar(500),
  `supervisorCampusAddress` varchar(500),
  `supervisorPhone` varchar(500),
  `staffFaculty` varchar(500),
  `Asbestos` varchar(1),
  `EthyleneOxide` varchar(1),
  `Lead` varchar(1),
  `Silica` varchar(1),
  `Arsenic` varchar(1),
  `Benzene` varchar(1),
  `Isocyanates` varchar(1),
  `Mercury` varchar(1),
  `VinylChloride` varchar(1),
  `CompressedGases` varchar(1),
  `MaterialsSeriousEffects` varchar(1),
  `ReactiveMaterials` varchar(1),
  `FlammableCombustible` varchar(1),
  `CorrosiveMaterials` varchar(1),
  `MaterialsOtherToxicEffects` varchar(1),
  `OxidizingMaterials` varchar(1),
  `AgricultureChemicals` varchar(1),
  `ChemicalNames` varchar(500),
  `ChemicalHowItsUsed` varchar(500),
  `ContainmentLevel1` varchar(1),
  `ContainmentLevel2` varchar(1),
  `ContainmentLevel3` varchar(1),
  `AnimalCareFacility` varchar(1),
  `SheepContainmentUnit` varchar(1),
  `NonHumanPrimate` varchar(1),
  `ContainmentLevel3Area` varchar(1),
  `PrimaryCulture` varchar(1),
  `Cadavers` varchar(1),
  `BloodProducts` varchar(1),
  `PrimaryPatientCare` varchar(1),
  `OtherHumanBiohazard` text,
  `Primates` varchar(1),
  `DogsCats` varchar(1),
  `Sheep` varchar(1),
  `WildMammals` varchar(1),
  `Rodents` varchar(1),
  `OtherAnimalBiohazard` varchar(500),
  `OtherBiohazard` varchar(500),
  `PathogenicParasites` varchar(500),
  `UltravioletEmitter` varchar(1),
  `InfraredEmitter` varchar(1),
  `Irradiators` varchar(1),
  `Vibration` varchar(1),
  `ExtremeHeat` varchar(1),
  `RadioactiveSubstance` varchar(1),
  `MicrowaveEmittingDevice` varchar(1),
  `XrayEmittingDevice` varchar(1),
  `RadioFrequency` varchar(1),
  `ExtremeCold` varchar(1),
  `Ultrasound` varchar(1),
  `Infrasound` varchar(1),
  `Gamma` varchar(1),
  `HighNoiseLevels` varchar(1),
  `Laser3B` varchar(1),
  `Laser4` varchar(1),
  `MagneticField` varchar(1),
  `Nanotechnology` text,
  `Driving` varchar(1),
  `HighVoltage` varchar(1),
  `ConfinedSpaceEntry` varchar(1),
  `Heights` varchar(1),
  `ComputerWork` varchar(1),
  `RepetitiveWork` varchar(1),
  `AwkwardPositions` varchar(1),
  `WasteManagement` tinyint(1),
  `RadiationSafety` tinyint(1),
  `EmployeeSafety` tinyint(1),
  `XrayTraining` tinyint(1),
  `AnimalHandling` tinyint(1),
  `BiosafetyTraining` tinyint(1),
  `FormCompletedBy` varchar(500),
  `AdditionalNotes` text,
  `WHIMS` tinyint(1),
  `OtherCode` varchar(500),
  `ProcedureName` text,
  `SubstanceForm` text,
  PRIMARY KEY (`ID`)
);

insert into encounterForm values ('Position Hazard', '../form/formPositionHazard.jsp?demographic_no=', 'formPositionHazard', '0');
