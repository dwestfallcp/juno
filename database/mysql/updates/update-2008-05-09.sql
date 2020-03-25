--Added column country of origin to demographic table

alter table demographic add column country_of_origin char (4);
create index country_of_origin on demographic (country_of_origin);


--Added Country ISO codes table.

CREATE TABLE `country_codes` (
  `id` int(10) NOT NULL auto_increment,
  `country_name` varchar(255) default NULL,
  `country_id` char(4) default NULL,
  `c_locale` char(10) default NULL,
  PRIMARY KEY  (`id`),
  KEY `country_id` (`country_id`),
  KEY `c_locale` (`c_locale`)
);


INSERT INTO `country_codes` VALUES (1,'AFGHANISTAN','AF','en'),(2,'LAND ISLANDS','AX','en'),(3,'ALBANIA','AL','en'),(4,'ALGERIA','DZ','en'),(5,'AMERICAN SAMOA','AS','en'),(6,'ANDORRA','AD','en'),(7,'ANGOLA','AO','en'),(8,'ANGUILLA','AI','en'),(9,'ANTARCTICA','AQ','en'),(10,'ANTIGUA AND BARBUDA','AG','en'),(11,'ARGENTINA','AR','en'),(12,'ARMENIA','AM','en'),(13,'ARUBA','AW','en'),(14,'AUSTRALIA','AU','en'),(15,'AUSTRIA','AT','en'),(16,'AZERBAIJAN','AZ','en'),(17,'BAHAMAS','BS','en'),(18,'BAHRAIN','BH','en'),(19,'BANGLADESH','BD','en'),(20,'BARBADOS','BB','en'),(21,'BELARUS','BY','en'),(22,'BELGIUM','BE','en'),(23,'BELIZE','BZ','en'),(24,'BENIN','BJ','en'),(25,'BERMUDA','BM','en'),(26,'BHUTAN','BT','en'),(27,'BOLIVIA','BO','en'),(28,'BOSNIA AND HERZEGOVINA','BA','en'),(29,'BOTSWANA','BW','en'),(30,'BOUVET ISLAND','BV','en'),(31,'BRAZIL','BR','en'),(32,'BRITISH INDIAN OCEAN TERRITORY','IO','en'),(33,'BRUNEI DARUSSALAM','BN','en'),(34,'BULGARIA','BG','en'),(35,'BURKINA FASO','BF','en'),(36,'BURUNDI','BI','en'),(37,'CAMBODIA','KH','en'),(38,'CAMEROON','CM','en'),(39,'CANADA','CA','en'),(40,'CAPE VERDE','CV','en'),(41,'CAYMAN ISLANDS','KY','en'),(42,'CENTRAL AFRICAN REPUBLIC','CF','en'),(43,'CHAD','TD','en'),(44,'CHILE','CL','en'),(45,'CHINA','CN','en'),(46,'CHRISTMAS ISLAND','CX','en'),(47,'COCOS (KEELING) ISLANDS','CC','en'),(48,'COLOMBIA','CO','en'),(49,'COMOROS','KM','en'),(50,'CONGO','CG','en'),(51,'CONGO, THE DEMOCRATIC REPUBLIC OF THE','CD','en'),(52,'COOK ISLANDS','CK','en'),(53,'COSTA RICA','CR','en'),(54,'CïTE D IVOIRE','CI','en'),(55,'CROATIA','HR','en'),(56,'CUBA','CU','en'),(57,'CYPRUS','CY','en'),(58,'CZECH REPUBLIC','CZ','en'),(59,'DENMARK','DK','en'),(60,'DJIBOUTI','DJ','en'),(61,'DOMINICA','DM','en'),(62,'DOMINICAN REPUBLIC','DO','en'),(63,'ECUADOR','EC','en'),(64,'EGYPT','EG','en'),(65,'EL SALVADOR','SV','en'),(66,'EQUATORIAL GUINEA','GQ','en'),(67,'ERITREA','ER','en'),(68,'ESTONIA','EE','en'),(69,'ETHIOPIA','ET','en'),(70,'FALKLAND ISLANDS (MALVINAS)','FK','en'),(71,'FAROE ISLANDS','FO','en'),(72,'FIJI','FJ','en'),(73,'FINLAND','FI','en'),(74,'FRANCE','FR','en'),(75,'FRENCH GUIANA','GF','en'),(76,'FRENCH POLYNESIA','PF','en'),(77,'FRENCH SOUTHERN TERRITORIES','TF','en'),(78,'GABON','GA','en'),(79,'GAMBIA','GM','en'),(80,'GEORGIA','GE','en'),(81,'GERMANY','DE','en'),(82,'GHANA','GH','en'),(83,'GIBRALTAR','GI','en'),(84,'GREECE','GR','en'),(85,'GREENLAND','GL','en'),(86,'GRENADA','GD','en'),(87,'GUADELOUPE','GP','en'),(88,'GUAM','GU','en'),(89,'GUATEMALA','GT','en'),(90,'GUERNSEY','GG','en'),(91,'GUINEA','GN','en'),(92,'GUINEA-BISSAU','GW','en'),(93,'GUYANA','GY','en'),(94,'HAITI','HT','en'),(95,'HEARD ISLAND AND MCDONALD ISLANDS','HM','en'),(96,'HOLY SEE (VATICAN CITY STATE)','VA','en'),(97,'HONDURAS','HN','en'),(98,'HONG KONG','HK','en'),(99,'HUNGARY','HU','en'),(100,'ICELAND','IS','en'),(101,'INDIA','IN','en'),(102,'INDONESIA','ID','en'),(103,'IRAN, ISLAMIC REPUBLIC OF','IR','en'),(104,'IRAQ','IQ','en'),(105,'IRELAND','IE','en'),(106,'ISLE OF MAN','IM','en'),(107,'ISRAEL','IL','en'),(108,'ITALY','IT','en'),(109,'JAMAICA','JM','en'),(110,'JAPAN','JP','en'),(111,'JERSEY','JE','en'),(112,'JORDAN','JO','en'),(113,'KAZAKHSTAN','KZ','en'),(114,'KENYA','KE','en'),(115,'KIRIBATI','KI','en'),(116,'KOREA, DEMOCRATIC PEOPLES REPUBLIC OF','KP','en'),(117,'KOREA, REPUBLIC OF','KR','en'),(118,'KUWAIT','KW','en'),(119,'KYRGYZSTAN','KG','en'),(120,'LAO PEOPLES DEMOCRATIC REPUBLIC','LA','en'),(121,'LATVIA','LV','en'),(122,'LEBANON','LB','en'),(123,'LESOTHO','LS','en'),(124,'LIBERIA','LR','en'),(125,'LIBYAN ARAB JAMAHIRIYA','LY','en'),(126,'LIECHTENSTEIN','LI','en'),(127,'LITHUANIA','LT','en'),(128,'LUXEMBOURG','LU','en'),(129,'MACAO','MO','en'),(130,'MACEDONIA, THE FORMER YUGOSLAV REPUBLIC OF','MK','en'),(131,'MADAGASCAR','MG','en'),(132,'MALAWI','MW','en'),(133,'MALAYSIA','MY','en'),(134,'MALDIVES','MV','en'),(135,'MALI','ML','en'),(136,'MALTA','MT','en'),(137,'MARSHALL ISLANDS','MH','en'),(138,'MARTINIQUE','MQ','en'),(139,'MAURITANIA','MR','en'),(140,'MAURITIUS','MU','en'),(141,'MAYOTTE','YT','en'),(142,'MEXICO','MX','en'),(143,'MICRONESIA, FEDERATED STATES OF','FM','en'),(144,'MOLDOVA','MD','en'),(145,'MONACO','MC','en'),(146,'MONGOLIA','MN','en'),(147,'MONTENEGRO','ME','en'),(148,'MONTSERRAT','MS','en'),(149,'MOROCCO','MA','en'),(150,'MOZAMBIQUE','MZ','en'),(151,'MYANMAR','MM','en'),(152,'NAMIBIA','NA','en'),(153,'NAURU','NR','en'),(154,'NEPAL','NP','en'),(155,'NETHERLANDS','NL','en'),(156,'NETHERLANDS ANTILLES','AN','en'),(157,'NEW CALEDONIA','NC','en'),(158,'NEW ZEALAND','NZ','en'),(159,'NICARAGUA','NI','en'),(160,'NIGER','NE','en'),(161,'NIGERIA','NG','en'),(162,'NIUE','NU','en'),(163,'NORFOLK ISLAND','NF','en'),(164,'NORTHERN MARIANA ISLANDS','MP','en'),(165,'NORWAY','NO','en'),(166,'OMAN','OM','en'),(167,'PAKISTAN','PK','en'),(168,'PALAU','PW','en'),(169,'PALESTINIAN TERRITORY, OCCUPIED','PS','en'),(170,'PANAMA','PA','en'),(171,'PAPUA NEW GUINEA','PG','en'),(172,'PARAGUAY','PY','en'),(173,'PERU','PE','en'),(174,'PHILIPPINES','PH','en'),(175,'PITCAIRN','PN','en'),(176,'POLAND','PL','en'),(177,'PORTUGAL','PT','en'),(178,'PUERTO RICO','PR','en'),(179,'QATAR','QA','en'),(180,'RƒUNION','RE','en'),(181,'ROMANIA','RO','en'),(182,'RUSSIAN FEDERATION','RU','en'),(183,'RWANDA','RW','en'),(184,'SAINT BARTHƒLEMY','BL','en'),(185,'SAINT HELENA','SH','en'),(186,'SAINT KITTS AND NEVIS','KN','en'),(187,'SAINT LUCIA','LC','en'),(188,'SAINT MARTIN','MF','en'),(189,'SAINT PIERRE AND MIQUELON','PM','en'),(190,'SAINT VINCENT AND THE GRENADINES','VC','en'),(191,'SAMOA','WS','en'),(192,'SAN MARINO','SM','en'),(193,'SAO TOME AND PRINCIPE','ST','en'),(194,'SAUDI ARABIA','SA','en'),(195,'SENEGAL','SN','en'),(196,'SERBIA','RS','en'),(197,'SEYCHELLES','SC','en'),(198,'SIERRA LEONE','SL','en'),(199,'SINGAPORE','SG','en'),(200,'SLOVAKIA','SK','en'),(201,'SLOVENIA','SI','en'),(202,'SOLOMON ISLANDS','SB','en'),(203,'SOMALIA','SO','en'),(204,'SOUTH AFRICA','ZA','en'),(205,'SOUTH GEORGIA AND THE SOUTH SANDWICH ISLANDS','GS','en'),(206,'SPAIN','ES','en'),(207,'SRI LANKA','LK','en'),(208,'SUDAN','SD','en'),(209,'SURINAME','SR','en'),(210,'SVALBARD AND JAN MAYEN','SJ','en'),(211,'SWAZILAND','SZ','en'),(212,'SWEDEN','SE','en'),(213,'SWITZERLAND','CH','en'),(214,'SYRIAN ARAB REPUBLIC','SY','en'),(215,'TAIWAN, PROVINCE OF CHINA','TW','en'),(216,'TAJIKISTAN','TJ','en'),(217,'TANZANIA, UNITED REPUBLIC OF','TZ','en'),(218,'THAILAND','TH','en'),(219,'TIMOR-LESTE','TL','en'),(220,'TOGO','TG','en'),(221,'TOKELAU','TK','en'),(222,'TONGA','TO','en'),(223,'TRINIDAD AND TOBAGO','TT','en'),(224,'TUNISIA','TN','en'),(225,'TURKEY','TR','en'),(226,'TURKMENISTAN','TM','en'),(227,'TURKS AND CAICOS ISLANDS','TC','en'),(228,'TUVALU','TV','en'),(229,'UGANDA','UG','en'),(230,'UKRAINE','UA','en'),(231,'UNITED ARAB EMIRATES','AE','en'),(232,'UNITED KINGDOM','GB','en'),(233,'UNITED STATES','US','en'),(234,'UNITED STATES MINOR OUTLYING ISLANDS','UM','en'),(235,'URUGUAY','UY','en'),(236,'UZBEKISTAN','UZ','en'),(237,'VANUATU','VU','en'),(238,'VATICAN CITY STATE','VA','en'),(239,'VENEZUELA','VE','en'),(240,'VIET NAM','VN','en'),(241,'VIRGIN ISLANDS, BRITISH','VG','en'),(242,'VIRGIN ISLANDS, U.S.','VI','en'),(243,'WALLIS AND FUTUNA','WF','en'),(244,'WESTERN SAHARA','EH','en'),(245,'YEMEN','YE','en'),(246,'ZAMBIA','ZM','en'),(247,'ZIMBABWE','ZW','en');

 