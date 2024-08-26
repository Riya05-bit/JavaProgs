import java.util.Scanner;
class NestedCondn2{
	public static void main(String args[]){
	System.out.println("Enter you country name::");
	Scanner scan=new Scanner(System.in);
	String country=scan.next();
	
	System.out.println("Enter you age::");
	int age=scan.nextInt();

	if(country.equalsIgnoreCase("India") && age>=18){
		System.out.println("Welcome to india and voting");
}
	else{
		System.out.println("Invalid country and age");	
	}


}
}