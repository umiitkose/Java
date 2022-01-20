package com.umiitkose.java.basic.regex;


import com.umiitkose.java.basic.regex.utils.Utils;

/*
*
* https://regex101.com/ denemeler için..
* */
public class Main {

    public static void main(String[] args) {

        Utils utils = new Utils();
        String email = "umiitkose@gmail.com";
        System.out.println(utils.isValidEmail(email));

        String isIncludingTextColor = "Text is including Color.";
        System.out.println(utils.isIncludingTextColor(isIncludingTextColor));

        String isTextUmitKose="Ümit KÖSE";
        System.out.println(utils.isTextUmitKOSE(isTextUmitKose));

        String isValidIpAdres = "192.168.1.1";
        System.out.println(utils.isValiIPAddress(isValidIpAdres));




    }


}
