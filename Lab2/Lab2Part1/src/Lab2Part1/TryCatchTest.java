package Lab2Part1;

public class TryCatchTest {
    public static void main(String[] args) {
        String s = "Herdman";
        try{
            char c = s.charAt(7);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
            e.printStackTrace();
        } finally {
            System.out.println("Surname: " + s);
        }
        try{
            System.out.println("Test without catch");
        }finally{
            System.out.println("Finally! There is no catch!");
        }
    }
}
