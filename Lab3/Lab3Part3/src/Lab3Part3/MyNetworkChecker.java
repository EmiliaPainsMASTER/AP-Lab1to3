package Lab3Part3;

import exception.*;

/**
 * The class MyNetworkChecker will check if the user's network and balance is correct
 */
public class MyNetworkChecker {
    /**
     * Main method to try/catch exceptions when dealing with the network and balance of the user
     * @param args used for CLI arguments
     */
    public static void main(String[] args) {
        String network = "Eircom";
        int balance = 0;
        try {
            CheckMyMobileNetwork(network);
        } catch (WrongNetworkException e) {
            e.printStackTrace();
        }

        try {
            CheckMyBalance(balance);
        } catch (BalanceBelowLimitException e) {
            e.printStackTrace();
        }
    }

    /**
     * Checks if network is correct
     * @param inputNetwork takes the user's network and check if it's a correct network
     * @throws WrongNetworkException if not "Three", this exception will be thrown with the message
     */
    public static void CheckMyMobileNetwork(String inputNetwork) throws WrongNetworkException {
        String validNetwork = "Three";
        if(inputNetwork.equals(validNetwork)){
            System.out.println("Network is valid");
        }
        else{
            throw new WrongNetworkException("The inputted network: " + inputNetwork + " is invalid, correct network: " + validNetwork);
        }

    }

    /**
     * Checks if balance is greater/equal to 1
     * @param balance takes user's balance and checks if it is a correct balance
     * @throws BalanceBelowLimitException if not greater/equal to one, this exception will be thrown with the message
     */
    public static void CheckMyBalance(int balance) throws BalanceBelowLimitException{
        int minimumBalance = 1;
        if(balance <= minimumBalance){
            throw new BalanceBelowLimitException("The minimum balance is " + minimumBalance);
        }
        else{
            System.out.println("Your balance is within limits: " + balance);
        }
    }
}
