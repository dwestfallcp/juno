--
-- Table structure for table `formSelfAssessment`
--

CREATE TABLE `formSelfAssessment` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `demographic_no` int(10),
  `provider_no` int(10),
  `formCreated` date,
  `formEdited` timestamp,
  `name` varchar(255),
  `p_birthdate` varchar(255),
  `sex` varchar(255),
  `faculty` varchar(255),
  `AcademicYear` varchar(255),
  `PTFT` varchar(255),
  `Job` varchar(255),
  `Hours` varchar(255),
  `Residence` mediumtext,
  `Campus` mediumtext,
  `Home` mediumtext,
  `Roommates` mediumtext,
  `LivingSituationOther` mediumtext,
  `Depression` mediumtext,
  `helplessness` mediumtext,
  `ADHD` mediumtext,
  `Obsessions` mediumtext,
  `Bipolar` mediumtext,
  `Anxiety` mediumtext,
  `Esteem` mediumtext,
  `Relationship` mediumtext,
  `Eating` mediumtext,
  `Sexual` mediumtext,
  `Suicidal` mediumtext,
  `Psychosis` mediumtext,
  `Mania` mediumtext,
  `Grief` mediumtext,
  `Substance` mediumtext,
  `TraumaEmotional` mediumtext,
  `TraumaPhysical` mediumtext,
  `TraumaSexual` mediumtext,
  `Academic` mediumtext,
  `ReasonsOther` mediumtext,
  `Hospitalizations` mediumtext,
  `Surgery` mediumtext,
  `Medicalillnesses` mediumtext,
  `CurrentMedications` mediumtext,
  `CurrentMedicationsList` mediumtext,
  `psychiatricMedications` mediumtext,
  `psychiatricMedicationsList` mediumtext,
  `HospitalizationsOther` mediumtext,
  `PastSubstance` mediumtext,
  `PastAlcohol` mediumtext,
  `PastPrescribedDrugs` mediumtext,
  `PastCounterMedications` mediumtext,
  `PastStreetDrugs` mediumtext,
  `PastTobacco` mediumtext,
  `PastPSYCHIATRICTraumaEmotional` mediumtext,
  `PastPSYCHIATRICTraumaPhysical` mediumtext,
  `PastPSYCHIATRICTraumaSexual` mediumtext,
  `PastLegal` mediumtext,
  `PastGambling` mediumtext,
  `PastReactionsMedication` mediumtext,
  `PastReactionsMedicationList` mediumtext,
  `PastSuicideAttempts` mediumtext,
  `PastSuicideMany` mediumtext,
  `PastSuicideWhen` mediumtext,
  `PastCutting` mediumtext,
  `ptsd` mediumtext,
  `PastPASTPSYCHIATRICOther` mediumtext,
  `AgesMother` mediumtext,
  `AgesFather` mediumtext,
  `AgesSiblings` mediumtext,
  `AgesOthers` mediumtext,
  `Adopted` mediumtext,
  `FamilyDepression` mediumtext,
  `FamilyAnxiety` mediumtext,
  `FamilySubstance` mediumtext,
  `FamilyAlcohol` mediumtext,
  `FamilyDrugs` mediumtext,
  `FamilyEmotional` mediumtext,
  `FamilyPhysical` mediumtext,
  `FamilySexual` mediumtext,
  `FamilySuicide` mediumtext,
  `FamilyEating` mediumtext,
  `FamilyBipolar` mediumtext,
  `FamilyPsychosis` mediumtext,
  `FamilySchizophrenia` mediumtext,
  `FamilyADHD` mediumtext,
  `FamilyPsychiatricOther` mediumtext,
  `Smoker` mediumtext,
  `SmokeQty` mediumtext,
  `StreetDrugs` mediumtext,
  `DrinkAlcohol` mediumtext,
  `DrinkAlcoholMany` mediumtext,
  `DrinkAlcoholWeekly` mediumtext,
  `Exercise` mediumtext,
  `Meals` mediumtext,
  `InRelationship` mediumtext,
  `AcademicPerformance` mediumtext,
  `SexualOrientation` mediumtext,
  `ReligiousAffiliation` mediumtext,
  `GeneralOther` mediumtext,
  PRIMARY KEY (`ID`)
);

