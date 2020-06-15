public class Main {
    public static void main(String[] args) {

        Rectangle rectangle1  = new Rectangle();
        //This will display all 0 because the chain constructors have been initialised in sets
        rectangle1.displayInfo();

        Circle circle1 = new Circle();
        circle1.displayInfo();
        circle1.displayCircle();
    }
}
