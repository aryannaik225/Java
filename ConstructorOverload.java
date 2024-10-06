class Box {
    int height, width, length;
    
    Box() {
        System.out.println("No Parameters");
    }

    Box(int x){
        height = width = length = x;
    }

    Box(int x, int y, int z)
    {
        height = x;
        width = y;
        length = z;
    }

    int vol() {
        return length*width*height;
    }
}
class ConstructorOverload {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(2);
        int v2 = b2.vol();
        System.out.println("Volume = " +v2);

        Box b3 = new Box(20, 10, 30);
        System.out.println("Volume = " +b3.vol());

    }
}
