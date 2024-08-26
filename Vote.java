import java.util.Scanner;
class Age{
public static void main(String args[]){
Scanner scan =new Scanner(System.in);
System.out.println("Enter an age ");
int age=scan.nextInt();
if(age<18){
System.out.println("you can't vote!!");
}
else{
System.out.println("You can vote!!");
}
}
}