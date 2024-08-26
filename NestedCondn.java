import java.util.Scanner;
class NestedCondn{
	public static void main(String args[]){
	System.out.println("Enter you country name::");
	Scanner scan=new Scanner(System.in);
	String country=scan.next();
	if(country.equalsIgnoreCase("India")){
		System.out.println("Welcome to india");
}
	else{
		System.out.println("Invalid country");	
	}


}
}