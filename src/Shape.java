public class Shape {

    private int xPosition;
    private int yPosition;

    public Shape(){ this(0, 0); }

    public Shape(int xPosition, int yPosition){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    //Java has no virtual keyword like C# and CPP
    public void displayInfo(){
        System.out.println("Position X:" + xPosition + " Position Y:" + yPosition);
    }

    public int[] displayPosition(){
        int[] positionPair  = {xPosition, yPosition};
        return positionPair;
    }

}
