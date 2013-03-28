package com.example.exception;

public class DisplayableException extends Exception {
    //a place to gather other exception to show then on the form.

    public DisplayableException(String s) {
        super(s);
    }
}
