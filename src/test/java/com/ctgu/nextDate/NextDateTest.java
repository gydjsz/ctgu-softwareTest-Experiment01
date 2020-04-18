package com.ctgu.nextDate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class NextDateTest {

    private int year;
    private int month;
    private int day;
    private String nextDate;

    public NextDateTest(int year, int month, int day, String nextDate) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.nextDate = nextDate;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][] {
                {1900, 1, 1, "1900年1月2日"},
                {1900, 2, 30, "Invalid date"},
                {2008, 12, 31, "2009年1月1日"},
                {2004, 2, 28, "2004年2月29日"},
                {2017, 6, 30, "2017年7月1日"}
        });
    }

    @Test
    public void theNextDate() {
        assertEquals(nextDate, NextDate.theNextDate(year, month, day));
    }
}