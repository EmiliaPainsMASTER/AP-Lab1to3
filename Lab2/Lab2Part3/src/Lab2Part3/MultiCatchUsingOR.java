package Lab2Part3;
import java.util.concurrent.ThreadLocalRandom;
//program that can catch one exception or another exception in the same catch block using the OR operator
public class MultiCatchUsingOR {
    public static void main(String[] args) {
        // add a bit of random, so I don't have to comment out code myself, love automation
        int randomNum = ThreadLocalRandom.current().nextInt(1, 2 + 1);
        //for String out of bounds
        String sA = "Herdman";
        //for null pointer
        String sB = null;
        try{
            if(randomNum == 1){
                //in Java 0 is the starting index not 1 so while outside of coding this would make sense in this case it doesn't
                sA.charAt(7);
            }
            if(randomNum == 2){
                // sB is null so it won't check
                sB.charAt(4);
            }
            //catch statement which will catch NullPointer or OutOfBounds then print error
        }catch (NullPointerException | StringIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
