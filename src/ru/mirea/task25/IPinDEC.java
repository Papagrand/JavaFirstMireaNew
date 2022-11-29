package ru.mirea.task25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class IPinDEC {
    private Pattern pattern;
    private Matcher matcher;

    private static final String IPPattern
            = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    public IPinDEC() {
        pattern = Pattern.compile(IPPattern);
    }

    public boolean validate(final String ip) {
        matcher = pattern.matcher(ip);
        return matcher.matches();
    }

    public static void main(String[] args) {

        IPinDEC ip = new IPinDEC();
        System.out.println(ip.validate("127.0.0.1"));
        System.out.println(ip.validate("255.255.255.0"));
        System.out.println(ip.validate("1300.6.7.8"));
        System.out.println(ip.validate("abc.def.gha.bcd"));
    }

}