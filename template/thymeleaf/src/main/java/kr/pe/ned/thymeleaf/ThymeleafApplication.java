package kr.pe.ned.thymeleaf;

import kr.pe.ned.thymeleaf.config.AppConfig;
import kr.pe.ned.thymeleaf.web.config.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 *
 */
@SpringBootApplication
@Import({WebConfig.class, AppConfig.class})
public class ThymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafApplication.class, args);
    }

}

