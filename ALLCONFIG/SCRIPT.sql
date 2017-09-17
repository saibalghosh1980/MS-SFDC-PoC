DELETE FROM `sfdc-poc-location`.`location`;
DELETE FROM `sfdc-poc-location`.`locationconfig`;
UPDATE `sfdc-poc-enrollment`.`enrollment`
SET `LOCATIONID`=NULL
AND `STATUS`='UNTOUCHED';
COMMIT;