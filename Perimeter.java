package Triangle;
import java.util.Scanner;
public class Perimeter {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter side1 of Triangle");
	int side1 = sc.nextInt();
	System.out.println("Enter side2 of Triangle");
	int side2 = sc.nextInt();
	System.out.println("Enter side3 of Triangle");
	int side3 = sc.nextInt();
	System.out.println("Perimeter of Triangle:" + (side1+side2+side3));
		
	}

}
