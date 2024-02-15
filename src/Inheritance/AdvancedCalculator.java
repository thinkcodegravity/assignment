package Inheritance;

public class AdvancedCalculator extends Calculator{

    public int areaOfSquare(int side){
        return mul(side,side);
    }

    public int areaOfRectangle(int length, int breadth){
        return mul(length,breadth);
    }
}
