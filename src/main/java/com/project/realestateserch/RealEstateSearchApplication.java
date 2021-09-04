package com.project.realestateserch;

import com.project.realestateserch.service.RealEstateService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RealEstateSearchApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(RealEstateSearchApplication.class, args);

        RealEstateService service = context.getBean(RealEstateService.class);
        service.setRepositoryData();

    }
}