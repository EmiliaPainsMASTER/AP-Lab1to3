package exception;

/**
 * thrown when Network is incorrect
 */
public class WrongNetworkException extends RuntimeException {
    /**
     * @param message takes message when thrown and prints out to interface
     */
    public WrongNetworkException(String message) {
        super(message);
    }
}
