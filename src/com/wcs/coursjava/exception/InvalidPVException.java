package com.wcs.coursjava.exception;

public class InvalidPVException extends Exception {

    public InvalidPVException(String message) {
        super(message);
    }

    public InvalidPVException() {
        this("Perso doit avoir des PV positifs !");
    }
}
