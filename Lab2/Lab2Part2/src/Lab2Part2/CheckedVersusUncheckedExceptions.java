package Lab2Part2;

import java.io.File;
import java.io.IOException;

public class CheckedVersusUncheckedExceptions {
    public static void capitalizeString(String s){
        try{

        }catch(NullPointerException e){
            throw new NullPointerException();
        }
    }
    public static void openFile(String fileName) throws IOException {
        try{
            File file = new File(fileName);
            file.exists();
        }catch(IOException e){
            System.out.println("Cannot find file: " + e.getMessage());
        }
    }
    public static void main(String[] args) throws IOException {
        String s = "null";
        String fileName = "idea";
//        capitalizeString(s);
//        System.out.println(s);
        openFile(fileName);
    }
}
