package com.streams.practice.sorting.distinct;
import java.util.Arrays;
import java.util.List;
import java.time.LocalDate;

public class Example6 {
    public static void main(String[] args) {
        List<LocalDate> dates = Arrays.asList(LocalDate.of(1999,8,16),
                LocalDate.of(2000,9,20),
                LocalDate.of(1998,1,25));
        dates.sort(LocalDate::compareTo);
        dates.forEach(System.out::println);
    }
}
