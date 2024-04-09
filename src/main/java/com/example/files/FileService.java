package com.example.files;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class FileService {

    boolean isFileContainsText(Path path, String searchingText) throws IOException {
        // read file content and return true if searchingText found

        Scanner sc = new Scanner(path);
        var foundLine = sc.findInLine(searchingText);

        return foundLine != null && foundLine.contains(searchingText);
    }
}
