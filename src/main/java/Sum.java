// Polymorphism --
// Method overloading - methods with same name but different parameters
// Example:

public class Sum {
    public int sum1(int int1, int int2){
        int sum = int1 + int2;
        return sum;
    }
    public int sum1(){
        int int1 = 1;
        int int2 = 2;
        int sum = int1 + int2;
        return sum;
    }

    public static void main(String[] args) {
        Sum calc = new Sum();
        System.out.println(calc.sum1());
        System.out.println(calc.sum1(2,2));
    }
}
