# Spring Batch
- Read csv file(e.g. from ftp) and transform(if neccesary) then write in to database
- Example to get list of employee from csv file and transorm some data then save data to db
- In this example it manual processing using api endpoint call(auto trigger disable)

## Read from CSV and write into DB
- Batch trigger point: `http://localhost:8080/rtl`
- H2 Console: `http://localhost:8080/h2-console` - For querying the in-memory tables( using devtool dependency in pom).

## H2(check properties file)
- Database: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: `password`


## Queries
- `select * from EMPLOYEE;`
- `select * from BATCH_JOB_EXECUTION;`
- `select * from BATCH_JOB_EXECUTION_CONTEXT;`
- `select * from BATCH_STEP_EXECUTION;`
- `select * from BATCH_STEP_EXECUTION_CONTEXT;`
- `select * from BATCH_JOB_INSTANCE;`