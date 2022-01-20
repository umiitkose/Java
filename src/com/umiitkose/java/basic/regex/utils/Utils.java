package com.umiitkose.java.basic.regex.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.umiitkose.java.basic.regex.utils.Const.*;

public class Utils {
    private Pattern pattern;

    public boolean isValidEmail(String email) {
        //https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html#CASE_INSENSITIVE
        pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
        return pattern.matcher(email).matches();
    }

    public boolean isIncludingTextColor(String isIncludingColor) {
        return Pattern.compile(INCLUDING_TEXT_COLOR_PATTERN, Pattern.CASE_INSENSITIVE).matcher(isIncludingColor).matches();
    }

    public boolean isTextUmitKOSE(String isTextUmitKose) {
        return Pattern.compile(TEXT_UMIT_KOSE_PATTERN, Pattern.CASE_INSENSITIVE).matcher(isTextUmitKose).matches();
    }

    public boolean isValiIPAddress(String isValidIpAdres) {
        return Pattern.compile(IS_VALID_IP_ADDRESS_PATTERN, Pattern.CASE_INSENSITIVE).matcher(isValidIpAdres).matches();
    }
}
