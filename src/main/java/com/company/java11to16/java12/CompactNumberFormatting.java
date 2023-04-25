package com.company.java11to16.java12;

import java.text.NumberFormat;
import java.util.Locale;

import static com.company.common.Utils.print;
import static java.text.NumberFormat.Style;
import static java.text.NumberFormat.getCompactNumberInstance;

public class CompactNumberFormatting {

    public static void main(String[] args) {
        NumberFormat fmt = getCompactNumberInstance(Locale.ENGLISH, Style.SHORT);
        print(fmt.format(100000));  // 100k
        print(fmt.format(1000000)); // 1M

        fmt = getCompactNumberInstance(Locale.FRENCH, Style.LONG);
        print(fmt.format(1000));    // 1 millier
        print(fmt.format(1000000)); // 1 million

        fmt = getCompactNumberInstance(Locale.forLanguageTag("RU"), Style.LONG);
        print(fmt.format(1000));
        print(fmt.format(2000));
        print(fmt.format(5000));
    }
}
