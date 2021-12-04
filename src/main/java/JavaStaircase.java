
public class JavaStaircase {
    public static void staircase(int number) {
        String stairs = "";
        for (int i = 0; i<number; i++){
            stairs = stairs + "x";
            System.out.println(stairs);
        }
    }

    public static void main(String[] args) {
        staircase(6);
    }
}
