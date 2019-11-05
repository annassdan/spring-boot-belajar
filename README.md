# spring-boot-belajar
Belajar Spring Boot

### Development Stack   
#### Backend Dependencies 
* [Java 1.8](http://openjdk.java.net/projects/jdk8/ "Download JDK 1.8")
* [Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
* [Spring Data JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)
* [Lombok](https://projectlombok.org/api/)


### Database
* [PostgreSQL](https://www.postgresql.org/)
### Other Library
* [Swagger](https://swagger.io/) for Documenting Rest API
### Tools
* [Maven](https://maven.apache.org/) for library management & Build Tools
### Web Container
* [Tomcat 8](https://tomcat.apache.org/tomcat-8.0-doc/index.html) (Embedded in Spring Boot)
### Build Production
* Jalankan perintah `mvn clean install` pada root direktori projek



### Instalasi
* Pastikan di komputer sudah terpasang software [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html "Download JDK 1.8"), [Maven](https://maven.apache.org/), dan database [PostgreSQL](https://www.postgresql.org/).
* Jika ketiga software tersebut belum terpasang ikuti langkah petunjuk instalasi
 * Instalasi [JDK 1.8](https://docs.oracle.com/javase/8/docs/technotes/guides/install/windows_jdk_install.html#A1097936)
 * Instalasi [PostgreSQL](https://www.labkey.org/Documentation/wiki-page.view?name=installPostgreSQLWindows)
* Instalasi [Maven](https://maven.apache.org/install.html)
* Dapat menggunakan Intellij IDEA atau Netbeans sebagai IDE.
* Pastikan Plugin [Lombok](https://projectlombok.org/api/), terpasang pada IDE yang digunakan
* Open project melalui IDE yang digunakan
* Buka file `application.properties` pada folder `src\main\resources` ganti username dan password sesuai dengan user postgres di komputer
* Buka Command Prompt, kemudian arahkan ke root directory project (tempat file pom.xml berada)
* Untuk menjalankan project, ketik perintah berikut `mvn clean spring-boot:run `

Default running at [localhost:8080](http://localhost:8000)


