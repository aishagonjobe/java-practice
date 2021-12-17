package SpotTests;// Polymorphism --
// operator overloading - using the same operator to do different things.
// Example:

public class Operator {
    public String addStrings(String string1, String string2){
        return string1 + string2;
    }

    public int addNumbers (int num1, int num2){
        return num1 + num2;
    }

    public static void main(String[] args) {
        Operator op = new Operator();
        System.out.println(op.addNumbers(1,2));
        System.out.println(op.addStrings("It's ", "winter."));

    }
}
