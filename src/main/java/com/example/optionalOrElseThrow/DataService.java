package com.example.optionalOrElseThrow;

import java.util.NoSuchElementException;

public class DataService {
    DataProvider dataProvider = new DataProvider();

    String getUsername(int id) {
        // get username from DataProvider.
        // Return value or throw exception if there is no value

        return dataProvider.getUsername(id).orElseThrow(NoSuchElementException::new);
    }
}
