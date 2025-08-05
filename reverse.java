class reverse{
public static void main(String[]args){
String obj = new String("sesikala");
String rev = "";
for(int i=0;i<obj.length();i++){
rev = obj.charAt(i) + rev;
}
System.out.println(rev);
}
}
