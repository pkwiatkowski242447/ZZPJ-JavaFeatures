package com.example.transform;

public class PalindromeChecker {

    boolean isPalindrome(String text) {
        // TIP: you can use StringBuilder.reverse method

        StringBuilder stringBuilder = new StringBuilder();
        return text.contentEquals(stringBuilder.append(text).reverse());
    }
}
