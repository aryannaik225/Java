class Rectangle {
    int length, breadth;
    Rectangle(int l, int b) 
    {
        length = l;             
        breadth = b;
    }

    Rectangle getRectangleObject()
    {
        Rectangle rect = new Rectangle(10, 20);
        return rect;
    }

    void area(Rectangle r1)
    {
        int areaofRectangle = r1.length*r1.breadth;
        System.out.println("Area of Rectangle: "+areaofRectangle);
    }
}

class PassingObjArgument {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);  
        r1.area(r1); 
        Rectangle r2;
        r2 = r1.getRectangleObject();
        System.out.println("ob1 length: " +r1.length);
         System.out.println("ob1 breadth: " +r1.breadth);    
          System.out.println("ob2 length: " +r2.length);
           System.out.println("ob2 breadth: " +r2.breadth);
    }
}