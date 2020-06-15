public class Circle extends Shape {

    private int radius;
    private int circumference;

    /* Constructor Chaining with Inheritance*/

    public Circle() {
        this(1, 2);
    }

    public Circle(int xPosition, int yPosition) {
        this(xPosition, yPosition, 0, 0);
    }

    //since the above constructors are calling this one, we need to tell which are the parent field
    public Circle(int xPosition, int yPosition,int radius, int circumference) {
        //using inheritance
        super(xPosition, yPosition);
        radius = radius;
        circumference = circumference;

    }

    //the problem with this override is we can display x and y position
    @Override
    public void displayInfo(){
        System.out.println("Radius value: " + radius + " Circumference value: " + circumference);
    }

    //to get access to fields in parent class call the method either by getters/setters or methods with the super
    public void displayCircle(){
        int xPosition = super.displayPosition()[0];
        int yPosition  = super.displayPosition()[1];
        System.out.println("Position x is " + xPosition + " and position y is " + yPosition);
    }
    //note can also pass args in the super.<method> eg: int current = super.calculateSpeed(hours, distance);
}