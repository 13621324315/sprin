package com.duing.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "vegetable")
@PropertySource("classpath:vegetables.properties")
public class VegetableConfig {
    private String photo;
    private String eggplant;
    private String greenpapper;

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getEggplant() {
        return eggplant;
    }

    public void setEggplant(String eggplant) {
        this.eggplant = eggplant;
    }

    public String getGreenpapper() {
        return greenpapper;
    }

    public void setGreenpapper(String greenpapper) {
        this.greenpapper = greenpapper;
    }
}
