package Triangle;
import java.util.Scanner;
public class Area {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
System.out.println("Enter the base of Triangle");
int base = sc.nextInt();
System.out.println("Enter the height of Triangle");
int height = sc.nextInt();
System.out.println("Area of the Triangle:" +(0.5*base*height));
}

}
