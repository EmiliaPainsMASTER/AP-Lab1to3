package Lab2Part2;

import java.io.File;
import java.io.IOException;

// class to check two exceptions one unchecked and one checked (although I couldn't get that working so ¯\_(ツ)_/¯)
public class CheckedVersusUncheckedExceptions {
    // meant to capitalize the string of s to uppercase however this won't happen due to s being null so an Null pointer
    // exception will be thrown
    public static void capitalizeString(String s)throws NullPointerException{
        try{
            s.toUpperCase();
        }catch(NullPointerException e){
            System.out.println(e);
        }
    }
    //This one I had some difficulty on, file doesn't exist so no problem there however, as mentioned in the brief
    //A catch is required for the compiler to compile so I threw this one in, when things go wrong nothing gets printed
    public static void openFile(String fileName) throws IOException {
        try{
            File file = new File(fileName);
            file.exists();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    // main method two var declarations which are designed to be null then calls on the static void methods
    public static void main(String[] args) throws IOException {
        String s = null;
        String fileName = "idea";
        capitalizeString(s);
        openFile(fileName);
    }
}
