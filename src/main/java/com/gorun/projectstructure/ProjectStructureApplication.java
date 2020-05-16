package com.gorun.projectstructure;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gorun.projectstructure.dao")
public class ProjectStructureApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectStructureApplication.class, args);
    }

}
