package pl.wojtczak.lesson10.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ValidatorURL {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^(https?://)?(www\\.)?([\\w]+\\.)+[\\w]{2,3}$");
        Matcher matcher1 = pattern.matcher("http://www.onet.pl");
        Matcher matcher2 = pattern.matcher("https://mail.google.com");
        Matcher matcher3 = pattern.matcher("http://wiadmosci.onet.pl");
        Matcher matcher4 = pattern.matcher("http://onet.pl");

        System.out.println(matcher1.matches());
        System.out.println(matcher2.matches());
        System.out.println(matcher3.matches());
        System.out.println(matcher4.matches());

}}
