package com.company.java11to16.java15;

import static com.company.common.Utils.print;

/**
 * Use cases for TextBlocks (What's New in Java 15 > Text Blocks in Practice)
 * - Blocks of text using markdown
 * - Testing, defining hard-coded JSON strings
 * - Simple templating
 */
public class TextBlocks {

    public static void main(String[] args) {
        oldStyle();
        emptyBlock();
        jsonBlock();
        jsonMovedEndQuoteBlock();
        jsonMovedBracketsBlock();
    }

    private static void oldStyle() {
        print("******** Old style ********");

        String text = "{\n" +
                "  \"name\": \"John Doe\",\n" +
                "  \"age\": 45,\n" +
                "  \"address\": \"Doe Street, 23, Java Town\"\n" +
                "}";
        print(text);
    }

    private static void emptyBlock() {
        print("******** Empty Block ********");
        String text = """ 
                """;
        print("|" + text + "|");
    }

    private static void jsonBlock() {
        print("******** JSON Block ********");

        String text = """
                {
                  "name": "John Doe",
                  "age": 45,
                  "address": "Doe Street, 23, Java Town"
                }
                """; // <-- no indentation if char is aligned with first "
        print(text);
    }

    private static void jsonMovedEndQuoteBlock() {
        print("******** Json Moved End Quote Block ********");

        String text = """
                  {
                    "name": "John Doe",
                    "age": 45,
                    "address": "Doe Street, 23, Java Town"
                  }
                       """;
        print(text);
    }

    private static void jsonMovedBracketsBlock() {
        print("******** Json Moved Brackets Block ********");

        String text = """
                  {
                    "name": "John Doe",
                    "age": 45,
                    "address": "Doe Street, 23, Java Town"
                  }
                """; // <-- indented by 2 spaces as it is aligned with third "
        print(text);
    }
}
