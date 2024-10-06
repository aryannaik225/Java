class Rectangle {
    int length, breadth;
    Rectangle(int l, int b) //Constructor
    {
        length = l;             
        breadth = b;
    }

    void area(Rectangle r1)
    {
        int areaofRectangle = r1.length*r1.breadth;
        System.out.println("Area of Rectangle: "+areaofRectangle);
    }
}

class PassingObjArgument {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);  //Constructor ko object ke madat se call kiya
        r1.area(r1); //woh class ke object se uss class ke method ko call kiya by passing the object
        //this works cause we called a constructor using an object...so woh object ko pass karne pe 
        //constructor ke values pass hue
    }
}
