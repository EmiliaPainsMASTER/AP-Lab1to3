package exception;

/**
 * thrown when Balance is below minimum Balance
 */
public class BalanceBelowLimitException extends RuntimeException {
    /**
     * @param message takes message when thrown and prints out to interface
     */
    public BalanceBelowLimitException(String message) {
        super(message);
    }
}
