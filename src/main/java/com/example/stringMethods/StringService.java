package com.example.stringMethods;

import java.util.List;

public class StringService {

    List<String> getOnlyNotBlankStrings(List<String> input) {
        return input.stream()
                .filter((s) -> !s.isBlank())
                .toList();
    }

    List<String> getStrippedTextLines(String text) {
        // split text to lines and strip
        return text.lines()
                .map(String::strip)
                .toList();
    }

    List<String> extendFoundStringByRepeatSomeTimes(List<String> list, String searchedText, int nTimesRepeat) {
        // search for searchedText in a list. Change this string by repeat n times if found
        return list.stream()
                .map((s) -> {
                    if (s.equals(searchedText)) {
                        for (int i = 0; i < nTimesRepeat - 1; i++) {
                            s += searchedText;
                        }
                    }
                    return s;
                })
                .toList();
    }
}
