package com.skyfirst.library_borrowing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableRetry
public class LibraryBorrowingApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryBorrowingApplication.class, args);
    }

}
