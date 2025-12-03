package com.streams.practice.reduction.aggregation;

public class Example4 {
    public static void main(String[] args) {
        String fileName = "AP_INV_PMT__TRAXE_102520_test.csv";
       String s = fileName.substring(0,fileName.lastIndexOf('.'));
        String[] fileNameArr = s.split("_");
       // System.out.println(fileNameArr.length);
       String ss = "STANDARDXMLIMPORT"+ "_" + fileNameArr[0] + "_" + fileNameArr[1] + "_"
                + fileNameArr[2];

        System.out.println(ss);

    }
}
