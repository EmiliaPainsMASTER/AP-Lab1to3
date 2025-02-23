package Lab2Part3;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        int[] multipleCatchBlocks = {0,5,7,5,0};
        try{
            //ArithmeticException
//            int i = multipleCatchBlocks[3] /0;
            //ArrayIndexOutOfBounds
//            multipleCatchBlocks[5] = 6;
            //file not found exception
            new FileReader("MultipleCatchBlocks.txt");
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
            e.printStackTrace();
        }
        catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
            e.printStackTrace();
        }
    }

}
