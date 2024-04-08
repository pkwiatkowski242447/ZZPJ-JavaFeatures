package com.example.collectionFactoryMethods;

import java.util.*;

public class ImageConverter {
    private final String JPG_FILE_KEY = "jpg";
    private final String PNG_FILE_KEY = "png";
    private final String BMP_FILE_KEY = "bmp";


    public Set<String> getAvailableFileKeys() {
        // return immutable set of file keys
        return Collections.unmodifiableSet(
                new TreeSet<>(List.of(JPG_FILE_KEY, PNG_FILE_KEY, BMP_FILE_KEY))
        );
    }
}
