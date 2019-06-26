package snippet;

public class Snippet {
	public static void main(String[] args) {
		<dependencies>
		        <dependency>
		            <groupId>org.springframework.boot</groupId>
		            <artifactId>spring-boot-starter-data-jpa</artifactId>
		        </dependency>
		        <dependency>
		            <groupId>org.springframework.boot</groupId>
		            <artifactId>spring-boot-starter-web</artifactId>
		        </dependency>
		        <dependency>
		            <groupId>org.springframework.boot</groupId>
		            <artifactId>spring-boot-starter-web-services</artifactId>
		        </dependency>
		
		        <dependency>
		            <groupId>org.springframework.boot</groupId>
		            <artifactId>spring-boot-starter-test</artifactId>
		            <scope>test</scope>
		        </dependency>
		        <dependency>
		            <groupId>org.springframework.boot</groupId>
		            <artifactId>spring-boot-starter-web</artifactId>
		            <exclusions>
		                <exclusion>
		                    <groupId>org.springframework.boot</groupId>
		                    <artifactId>spring-boot-starter-tomcat</artifactId>
		                </exclusion>
		            </exclusions>
		        </dependency>
		
		        <dependency>
		            <groupId>org.springframework.boot</groupId>
		            <artifactId>spring-boot-starter-data-jpa</artifactId>
		        </dependency>
		
		        <dependency>
		            <groupId>mysql</groupId>
		            <artifactId>mysql-connector-java</artifactId>
		        </dependency>
		
		        <!-- https://mvnrepository.com/artifact/com.alibaba/druid -->
		        <dependency>
		            <groupId>com.alibaba</groupId>
		            <artifactId>druid</artifactId>
		            <version>1.1.10</version>
		        </dependency>
		
		        <dependency>
		            <groupId>org.springframework.boot</groupId>
		            <artifactId>spring-boot-starter-jetty</artifactId>
		            <scope>provided</scope>
		        </dependency>
		
		        <dependency>
		            <groupId>org.springframework.boot</groupId>
		            <artifactId>spring-boot-starter-test</artifactId>
		            <scope>test</scope>
		        </dependency>
		
		        <!-- https://mvnrepository.com/artifact/io.springfox/springfox-swagger2 -->
		        <dependency>
		            <groupId>io.springfox</groupId>
		            <artifactId>springfox-swagger2</artifactId>
		            <version>2.8.0</version>
		        </dependency>
		
		        <!-- https://mvnrepository.com/artifact/io.springfox/springfox-swagger-ui -->
		        <dependency>
		            <groupId>io.springfox</groupId>
		            <artifactId>springfox-swagger-ui</artifactId>
		            <version>2.8.0</version>
		        </dependency>
		
		        <!-- https://mvnrepository.com/artifact/com.alibaba/fastjson -->
		        <dependency>
		            <groupId>com.alibaba</groupId>
		            <artifactId>fastjson</artifactId>
		            <version>1.2.47</version>
		        </dependency>
		    </dependencies>
		
		    <build>
		        <plugins>
		            <plugin>
		                <groupId>org.springframework.boot</groupId>
		                <artifactId>spring-boot-maven-plugin</artifactId>
		            </plugin>
		        </plugins>
		    </build>
		
	}
}

