//Create a Food parent class
//Create Pizza child class extends food
//        canEat()
//

public class Food {
    public int size;
    public double price;
    public void canEat(){
        System.out.println("I am eating.");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
