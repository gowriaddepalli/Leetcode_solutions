# use of self joins

SELECT * 
FROM   Weather 
       JOIN Weather AS w 
         ON w.RecordDate = SUBDATE(Weather.RecordDate, 1) 
WHERE  Weather.Temperature > w.Temperature 
