//no inheritance from shape
public class Rectangle {

    private int xPosition;
    private int yPosition;
    private int width;
    private int height;

    /* Correct way to do constructors overload */
    /* Constructor Chaining */
    //fist constructor calls second (this has default values for these variables)
    public Rectangle(){
        this(0,0);
    }
    //second constructor calls third (this has default values for these variables)
    public Rectangle(int width, int height){
        this(0, 0, width, height);
    }
    //third constructor is the one which initialises all variables
    public Rectangle(int xPosition, int yPosition, int width, int height){

        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.width = width;
        this.height = height;
    }

    public void displayInfo(){
        System.out.println(xPosition + " " + yPosition + " " + width + " " + height);
    }

}
