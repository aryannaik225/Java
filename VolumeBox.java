import java.util.Scanner;

class VolumeBox {
    public static void volume(float l, float b, float h) {
        float volume = l*b*h;
        System.out.println("Volume of the Box is " + volume);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VolumeBox b1 = new VolumeBox();
        System.out.println("Enter Length of the Box: ");
        float length = sc.nextFloat();
        System.out.println("Enter Breadth of the Box");
        float breadth = sc.nextFloat();
        System.out.println("Enter Height of the Box");
        float height = sc.nextFloat();
        
        b1.volume(length, breadth, height);
    }
}
