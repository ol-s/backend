# backend
Nombre de carpeta original creada con el spring initializr, el 'Yp-Portfolio-Backend' repo queda con los commits del proceso y los links localhost + dataportfolio en app properties para la bd en phpmyadmin local.


---------------------------------------------------
APPLICATION.PROPERTIES archivo, localhost, BEFORE DEPLOY

spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/dataportfolio?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect

---------------------------------------------------

---esto dio LIVE!       https://backols.onrender.com/

#intento 7. copia en carpeta github C:\YP\GITHUBbackend.  ''Closing JPA EntityManagerFactory for persistence unit 'default''  el CLEAN AND BUILD sale en verde, pero en render siempre ''failed''. pom java 1.8, pc jdk 17, inicializer lo cree con 8 creo.

#APP PROPERTIES
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://b1laqzqnlknygbkrrdnd-mysql.services.clever-cloud.com:3306/b1laqzqnlknygbkrrdnd?useSSL=false&serverTimezone=UTC
spring.datasource.username=ufaxzmtezgfypd3j
spring.datasource.password=3kEMQZ4uhdM3F9EfSxav
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.hikari.maximum-pool-size=2
server.port=10000
spring.jpa.open-in-view = false

#DOCKERFILE 
FROM amazoncorretto:8-alpine-jdk 
MAINTAINER sf
COPY target/backend-0.0.1-SNAPSHOT.jar backend-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/backend-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080

#OUTPUT clean and build
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::               (v2.7.10)

2023-05-03 19:09:41.793  INFO 12088 --- [           main] c.m.backend.BackendApplicationTests      : Starting BackendApplicationTests using Java 17.0.6 on laptop with PID 12088 (started by User in C:\YP\GITHUBbackend\backend)
2023-05-03 19:09:41.806  INFO 12088 --- [           main] c.m.backend.BackendApplicationTests      : No active profile set, falling back to 1 default profile: "default"
2023-05-03 19:09:44.205  INFO 12088 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2023-05-03 19:09:44.651  INFO 12088 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 401 ms. Found 10 JPA repository interfaces.
2023-05-03 19:09:47.328  INFO 12088 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2023-05-03 19:09:47.641  INFO 12088 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.6.15.Final
2023-05-03 19:09:48.267  INFO 12088 --- [           main] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2023-05-03 19:09:48.909  INFO 12088 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2023-05-03 19:09:51.587  INFO 12088 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2023-05-03 19:09:51.654  INFO 12088 --- [           main] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.MySQL8Dialect
2023-05-03 19:09:55.202  INFO 12088 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2023-05-03 19:09:55.240  INFO 12088 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2023-05-03 19:10:03.300  INFO 12088 --- [           main] c.m.backend.BackendApplicationTests      : Started BackendApplicationTests in 22.446 seconds (JVM running for 25.518)
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 30.353 s - in com.miportfolioyp.backend.BackendApplicationTests
2023-05-03 19:10:10.068  INFO 12088 --- [ionShutdownHook] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2023-05-03 19:10:10.084  INFO 12088 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2023-05-03 19:10:10.120  INFO 12088 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.

Results:

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0


--- maven-jar-plugin:3.2.2:jar (default-jar) @ backend ---
Building jar: C:\YP\GITHUBbackend\backend\target\backend-0.0.1-SNAPSHOT.jar

--- spring-boot-maven-plugin:2.7.10:repackage (repackage) @ backend ---
Replacing main artifact with repackaged archive

--- maven-install-plugin:2.5.2:install (default-install) @ backend ---
Installing C:\YP\GITHUBbackend\backend\target\backend-0.0.1-SNAPSHOT.jar to C:\Users\User\.m2\repository\com\miportfolioyp\backend\0.0.1-SNAPSHOT\backend-0.0.1-SNAPSHOT.jar
Installing C:\YP\GITHUBbackend\backend\pom.xml to C:\Users\User\.m2\repository\com\miportfolioyp\backend\0.0.1-SNAPSHOT\backend-0.0.1-SNAPSHOT.pom
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  58.904 s
Finished at: 2023-05-03T19:10:19-03:00
------------------------------------------------------------------------






---------------------------------------------------
Tambien cambie en los controlers 
@CrossOrigin("http://localhost:4200/") 
por
@CrossOrigin("https://sf-portfoliofrontend.web.app/") 