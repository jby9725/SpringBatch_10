package com.koreait.exam.springbatch_10;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
@EnableBatchProcessing
@EnableJpaAuditing
public class test {

    public static void main(String[] args) {

        System.out.println("24년 2월 : " + showLastDate(2024, 2) + "일이 마지막 날입니다.");
        System.out.println("24년 10월 : " + showLastDate(2024, 10) + "일이 마지막 날입니다.");
    }

    public static int showLastDate(int year, int month) {
        int day = 0;

        day = LocalDate.of(year, month, 1).plusMonths(1).minusDays(1).getDayOfMonth();

        return day;
    }
}
