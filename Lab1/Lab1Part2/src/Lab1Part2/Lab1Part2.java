package Lab1Part2;

import java.util.Scanner;

import static Lab1Part2.Lab1Part1.getMyNameFromMyInitial;
import static Lab1Part2.Lab1Part1.getMyNameFromMyName;

public class Lab1Part2 {
    public static void main(String[] args) {
        //vars
        Scanner userInput = new Scanner(System.in);
        String initialsToFullName;
        String initials;
        String fullName;
        String fullNameToInitials;

        //initials to full name
        System.out.print("Enter an initial: ");
        initials = userInput.nextLine();
        initialsToFullName = getMyNameFromMyInitial(initials);
        System.out.println(initialsToFullName);
        //Full name to initials
        System.out.print("Enter a full name: ");
        fullName = userInput.nextLine();
        fullNameToInitials = getMyNameFromMyName(fullName);
        System.out.println(fullNameToInitials);
    }
}
