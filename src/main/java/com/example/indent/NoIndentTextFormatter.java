package com.example.indent;

import java.util.Arrays;
import java.util.stream.Collectors;

public class NoIndentTextFormatter {

    String noIndentText(String text) {
        // remove indent

        return Arrays.stream(text.split("\n")).toList().stream().map(
                string -> {
                    return string.strip() + "\n";
                }
        ).collect(Collectors.joining());
    }
}
