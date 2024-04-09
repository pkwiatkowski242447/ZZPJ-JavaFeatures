package com.example.fileMismatch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileEqualsChecker {

    boolean isFileEquals(Path path1, Path path2) throws IOException {
        String file1Content = Files.readString(path1);
        String file2Content = Files.readString(path2);

        return file1Content.equals(file2Content);
    }
}
