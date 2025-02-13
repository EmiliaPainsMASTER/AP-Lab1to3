package Lab1Part1;

import java.util.Scanner;

public class Lab1Part1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String fullName;
        String initialsName;
        System.out.print("Enter an initial: ");
        initialsName = userInput.nextLine();
        fullName = getMyNameFromMyInitial(initialsName);
        System.out.println(fullName);
    }
    /**
     * This method is taking input from the user and returning a full name
     * @param initial used to pass the user inputted initials  to the switch-case
     * @return returns the full name
     *
     * */
    public static String getMyNameFromMyInitial(String initial){
        switch (initial) {
            case "AB" -> {
                return "Albert Butler";
            }
            case "CD" -> {
                return "Cody Davis";
            }
            case "FG" -> {
                return "Fillip Gavin";
            }
            case "EH" -> {
                return "Emi Herdman";
            }
            case null, default -> {
                return "Unknown Initial";
            }
        }
    }
}
