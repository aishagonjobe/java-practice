public class StaticMethod {

    public int value(int value) {
        return value;
    }

    public static void noValue() {
        int x = 6;
        System.out.println(x);
    }

    public static void main(String[] args) {

        StaticMethod method = new StaticMethod();
        System.out.println(method.value(7));
        noValue();

    }
}