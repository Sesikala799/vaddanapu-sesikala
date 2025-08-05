import java.util.Scanner;
class Palindrome{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the String:");
String str = sc.nextLine();
str = str.toLowerCase();
String rev ="";
for (int i = 0; i < str.length();i++){
rev=str.charAt(i)+rev;
}
if(str.equals(rev)){
System.out.println("It is palindrome.");
}
else{
System.out.println("it is not a palindrome.");
}
}
}
