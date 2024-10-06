import java.util.Scanner;

class RecAreaPeriConst {
	public RecAreaPeriConst(float length, float breadth) {
		float area, perimeter;
		perimeter = (2f*length)+(2f*breadth);
		System.out.println("Perimeter of the rectangle = "+ perimeter);
		area = length*breadth;
		System.out.println("Area of the rectangle = " + area);
	}
	
	public static void main(String args[]) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter Length of the rectangle: ");
		float l = s1.nextFloat();
		System.out.println("Enter Breadth of the rectangle: ");
		float b = s1.nextFloat();
				
		RecAreaPeriConst r1 = new RecAreaPeriConst(l, b);
	}
}