# Start the application
## BACKEND
- with Maven and Java
- Execute command:
``` mvn clean package ```

-Go to folder "target"
-Execute command:
``` java -jar msgApp-0.0.1-SNAPSHOT.jar ```


## Environment
---
### Docker Compose
- Execute the command in the file *./docker/*

    ``` docker-compose up -d ```

Or you can upload the service by plugin: https://plugins.jetbrains.com/plugin/7724-docker


#### [pgAdmin (PostgreSQL)](https://www.pgadmin.org)
- Open interface web: http://localhost:5050/
- User: admin@admin.com
- Senha: root

Starter configs:
After login in pgAdmin:

- Create database:
  - Open pgAdmin
  - Open the window SQL and execute:
    ```sql
    create database plantsmtldb;
    ```
- Open Servers > Create > Server
  - General:
    - Name: plantsmtldb-serverdocker
  - Connection:
    - Host name/address: plantsmtldb / name of dockerservice
    - Port: 5432
    - Maintenance database: postgres
    - Username: postgres
    - Password: postgres

---



