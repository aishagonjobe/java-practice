public class Cars extends Vehicle {
    public String modelName = "Mustang";    // Cars attribute

    public static void main(String[] args) {

        // Create a myCars object
        Cars myCars = new Cars();

        // Call the honk() method (from the Vehicle class) on the myCars object
        myCars.honk();

        myCars.brake();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Cars class
        System.out.println(myCars.brand + " " + myCars.modelName + " " + myCars.year);
    }
}

