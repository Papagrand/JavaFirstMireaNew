package ru.mirea.task25;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

    public static void main(String[] args) {
        System.out.println(checkExpression("(4+((3+5)–9×4))"));
        System.out.println(checkExpression("(5)–9×4)"));
        System.out.println(checkExpression(")5)–9×4)"));
    }

    private static boolean checkExpression(String input) {
        Pattern pattern = Pattern.compile("\\([\\d+/*-]*\\)");
        Matcher matcher = pattern.matcher(input);
        System.out.println(matcher);
        do {
            input = matcher.replaceAll("");
            matcher = pattern.matcher(input);
        } while (matcher.find());
        return input.matches("[\\d+/*-]*");
    }
}
