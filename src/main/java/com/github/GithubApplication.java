package com.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubApplication.class, args);
    }

    public void addData(String data) {
        if (data.equals(Constant.DATA_Type)) {
            System.out.printf("welcome");
        }
    }
    public void findUserByEmail(String email){
        System.out.printf(email);
    }
     public void email(String email){
        System.out.printf(email);
    }

}
