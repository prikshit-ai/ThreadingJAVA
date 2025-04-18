// CustomExceptions.java
// This file contains two custom exceptions that can be used across thread classes

// Custom exception for when thread data is invalid
class InvalidThreadDataException extends Exception {
    public InvalidThreadDataException(String message) {
        super(message);  // Pass custom error message to Exception class
    }
}

// Custom exception for thread timeout scenarios
class ThreadTimeoutException extends Exception {
    public ThreadTimeoutException(String message) {
        super(message);
    }
}
