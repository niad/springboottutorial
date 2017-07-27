#View Resolver

##JSP Engine


##Thymeleaf
기본설정 디렉토리 이용 /src/main/resources/templates, /src/main/resources/static

application.properties

    # auto reload resources
    spring.thymeleaf.cache=false

pom.xml
    
    <plugin>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-maven-plugin</artifactId>
        <configuration>
            <addResources>true</addResources>
        </configuration>
    </plugin>


##Thymeleaf 2
메이븐 웹프로젝트와 동일하게 src/main/webapp 디렉토리 이용

application.properties

    # auto reload resources
    spring.thymeleaf.cache=false
    # disable check
    spring.thymeleaf.check-template-location=false
    
    # override default thymeleaf configuration
    spring.thymeleaf.prefix=/WEB-INF/templates/
    spring.thymeleaf.suffix=.html
    spring.thymeleaf.mode=HTML5
    spring.thymeleaf.encoding=UTF-8
    spring.thymeleaf.content-type=text/html
    

##Thymeleaf 3
db 연동


##Handlebars