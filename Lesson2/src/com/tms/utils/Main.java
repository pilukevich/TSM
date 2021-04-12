package com.tms.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import static com.tms.utils.Constants.DateUtils.HH_MM_SS;


public class Main {
    public static void main(String[] args) {
//        System.out.println(HH_MM_SS);
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(HH_MM_SS);
        simpleDateFormat.format(date);
        System.out.println(simpleDateFormat.format(date));
    }
}
