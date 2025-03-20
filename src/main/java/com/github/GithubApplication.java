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

            int x=30;
            System.out.printf("welcome");
        }
    }
    public void findUserId(String userid){
        System.out.print(userid);
    }

}
