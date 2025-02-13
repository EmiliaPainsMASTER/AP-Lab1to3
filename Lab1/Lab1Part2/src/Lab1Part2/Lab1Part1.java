package Lab1Part2;
public class Lab1Part1 {
    /**
     * This method is taking input from the user and returning their initials
     * @param name used to pass the user inputted name to the switch-case
     * @return returns the initials
     *
     * */
    public static String getMyNameFromMyName(String name){
        switch (name) {
            case "Albert Butler" -> {
                return "AB";
            }
            case "Cody Davis" -> {
                return "CD";
            }
            case "Fillip Gavin" -> {
                return "FG";
            }
            case "Emi Herdman" -> {
                return "EH";
            }
            case null, default -> {
                return "INPUT NAME NOT CORRECT";
            }
        }
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
                return "INPUT INITIAL NOT CORRECT";
            }
        }
    }
}
