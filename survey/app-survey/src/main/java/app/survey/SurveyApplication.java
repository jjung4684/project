package app.survey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SurveyApplication {

    public static void main(String[] args) {

        System.setProperty("spring.config.location","classpath:/application-${spring.profiles.active}.yml,classpath:/application-${spring.profiles.active}.properties");
        SpringApplication.run(SurveyApplication.class, args);
    }

}
