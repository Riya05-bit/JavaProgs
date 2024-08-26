// public class Practice{
// public static void main(String args[]){
// int arr[]=new int[]{10,20,30,40,50};
// // arr[5]={10,20,30,40,50};
// System.out.println("This is array" + arr[1]);
// }
// }
// import java.util.Scanner;
import java.util.Scanner;
public class practice{
    public static void main(String args[]){
        System.out.println("Hello World");
    //     Scanner s =new Scanner(System.in);
    //     System.out.println("Number Bolo??? ");
    //     int b=(Int)s.nextInt();
    //     System.out.println("Number Yelo---> "+b);
    //    int a=23_00_00_00;
    //    System.out.println(a);
        // byte b = (byte) 257;  // Explicit cast to byte
        // int a=9;
        // int b=89;
        // System.out.println(a*b);
        // if(true){
        //     System.out.println("HIJI");
        // }
        // int i=0;
        // while(i<=10){
        //     System.out.println("Krishna");
        //     i++;
        // }
        // for(int i=0;i<=10;i++){
        //     System.out.println("Kanhiyan");
        // }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary");
        float salary=sc.nextFloat();
        if(salary>1000){
            System.out.println("Bonus of 2000 means "+(salary+2000));
        }
        else{
            System.out.println("Bonus of 1000 means "+(salary+1000));

        }

        
    }
}
