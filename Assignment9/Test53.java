class CustomException extends Exception {
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class Test53 {
    public static void main(String[] args) {
        try {
            methodThatThrowsException();
        } catch (CustomException e) {
            System.out.println("Caught CustomException: " + e.getMessage());
            // Print the cause of the exception
            System.out.println("Cause: " + e.getCause());
        }
    }

    static void methodThatThrowsException() throws CustomException {
        try {
            // Simulate an exception
            throw new NullPointerException("This is a NullPointerException");
        } catch (NullPointerException e) {
            // Throw a custom exception while chaining the original exception
            throw new CustomException("A custom exception occurred", e);
        }
    }
}