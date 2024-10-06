class Rectangle{
    int length, breadth;

    void area(int length, int breadth)
    {
        int areaofRectangle = length*breadth;
        System.out.println("Area of Rectangle: " +areaofRectangle);
    }
}

class PassInstanceVarArgument {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        r1.length = 20;
        r1.breadth = 10;
        r2.area(r1.length, r1.breadth);
    }  
}
