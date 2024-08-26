// import java.util.Scanner;
class Fab{
	public static void main(String args[]){
		// Scanner scan=new Scanner(System.in);
		// System.out.println("Enter a number");
		// int a=scan.nextInt();
		int a=1,b=0,c=0,i=1;
			// System.out.println(a);
		while(i<=10){
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			i++;
		}
	}
}