//three classes 
/*
 * Box
 * BoxWeight
 * Shipment
 * shipment me we add costs
 * box has constructor width, height, depth
 */

import java.util.*;

public class DemoShipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of the Box: ");
        System.out.println("Width: ");
        double w = sc.nextDouble();
        System.out.println("Height: ");
        double h = sc.nextDouble();
        System.out.println("Depth: ");
        double d = sc.nextDouble();

        System.out.println(" ");
        
        System.out.println("Enter the weight of the box: ");
        double weight = sc.nextDouble();
        
        System.out.println(" ");
        
        System.out.println("Enter the rate per cu.unit: ");
        double r = sc.nextDouble();

        System.out.println(" ");
        
        Shipment s1 = new Shipment(w, h, d, weight, r);
        System.out.println("Dimensions of the box ==> "+s1.width+"x"+s1.height+"x"+s1.depth);
        System.out.println("Weight of the box ==> " +s1.weight);
        System.out.println("Volume of the box ==> "+s1.volume);
        System.out.println("Cost of the box ==> " +s1.cost);

        sc.close();       
    }
}

class Box {
    double width, height, depth; //as boxweight extends box..the defined terms here can be accessed there...ig

    public Box(double w, double h, double d)
    {
        this.width = w;
        this.height = h;
        this.depth = d; 
    }
}

class BoxWeight extends Box{
    double weight;
    public BoxWeight(double width, double height, double depth, double w) {
        super(width, height, depth);
        this.weight = w;
    }
}

class Shipment extends BoxWeight {
    double cost, volume;
    public Shipment(double width, double height, double depth, double w, double c) {
        super(width, height, depth, w);
        volume  = width*height*depth;
        this.cost = c*volume;
    }

}

