import java.util.Scanner;
class Multi{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number a: ");
	int a=sc.nextInt();
	System.out.println("Enter number b: ");
	int b=sc.nextInt();
	int c= a*b;
	System.out.println("The multiplication is: "+c);
}
}