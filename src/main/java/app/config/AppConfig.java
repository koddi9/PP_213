package app.config;

import app.model.Animal;
import app.model.AnimalsCage;
import app.model.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app.model")
public class AppConfig {

//    @Bean(name="animalsCage")
//    public AnimalsCage getDog(){
//        AnimalsCage animalsCage=new AnimalsCage();
//        return animalsCage;
//    }

}
