package com.example.transform;

public class ImportedCSVTextProcessor {

    String process(String line) {
        // 1. replace "," with space
        // 2. remove "none"
        // 3. remove white spaces from start and end
        // 4. add "-done" at the end
        // 5. to uppercase

        return line.replaceAll(",", " ")
                .replaceAll("none", "")
                .strip()
                .concat("-done")
                .toUpperCase();
    }
}
