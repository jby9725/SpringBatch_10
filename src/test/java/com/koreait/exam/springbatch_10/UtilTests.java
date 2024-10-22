package com.koreait.exam.springbatch_10;

import com.koreait.exam.springbatch_10.util.Util;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class UtilTests {
    @Test
    @DisplayName("1) 특정 연 월의 마지막 날을 계산")
    void v1() {

        int endDayOf_2023_02 = Util.date.getEndDayOf(2023, 02);
        assertThat(endDayOf_2023_02).isEqualTo(28);
    }

    @Test
    @DisplayName("2) 특정 연 월의 마지막 날을 계산")
    void v2() {
        int endDayOf_2024_02 = Util.date.getEndDayOf(2024, 02);
        assertThat(endDayOf_2024_02).isEqualTo(29);
    }

    @Test
    @DisplayName("3) 특정 연 월의 마지막 날을 계산")
    void v3() {
        int endDayOf_2024_02x = Util.date.getEndDayOf(2024, 02);
        assertThat(endDayOf_2024_02x).isEqualTo(28);
    }

    @Test
    @DisplayName("4) 특정 연 월의 마지막 날을 계산")
    void v4() {
        int endDayOf_2024_04 = Util.date.getEndDayOf(2024, 04);
        assertThat(endDayOf_2024_04).isEqualTo(30);
    }

    @Test
    @DisplayName("날짜 문자열로 LocalDateTime 객체 만들기 1")
    void t4() {
        LocalDateTime localDateTime1 = Util.date.parse("yyyy-MM-dd HH:mm:ss.SSSSSS", "2024-10-22 23:59:59.999999");
        assertThat(localDateTime1.toString().length()).isEqualTo(26);
    }

    @Test
    @DisplayName("날짜 문자열로 LocalDateTime 객체 만들기 2")
    void t5() {
        LocalDateTime localDateTime1 = Util.date.parse("yyyy-MM-dd HH:mm:ss", "2024-10-22 23:59:59");
        assertThat(localDateTime1.toString().length()).isEqualTo(19);
    }
}