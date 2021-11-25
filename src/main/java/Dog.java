public class Dog {
// Use this editor to write, compile and run your Java code online
// Write a dog class that has 3 states and 4 methods,
// states being color, name and gender,
// methods being fetch, eat, nap and info

    String color = "Red";
    String name = "Rupert";
    String gender = "Female";

    public String fetch() {
        return "The dog is playing fetch.";
    }

    public String eat() {
        return "The dog is eating.";
    }

    public String nap() {
        return "The dog is taking a nap.";
    }

    public String info() {
        return "The dog is " + color + ". It's name is " + name + ". It's gender is " + gender;
    }

    public static void main(String[] args) {
        Dog dog = new Dog();

        System.out.println(dog.info());
        System.out.println(dog.fetch());
        System.out.println(dog.nap());
        System.out.println(dog.eat());

    }
}
