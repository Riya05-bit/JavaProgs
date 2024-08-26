import java.util.Scanner;
public class LargestEle{
public static int[] Meth(int a){
    int arr[]=new int[a];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<a.length;i++){
    System.out.println("Enter the index");
    arr=sc.nextInt();
    }
    return arr;
}
    public static int[] check(array[]){
        for(int i=0;i<array[i].length;i++){
            System.out.println(array[i]);
        }
    }
    public static int maxa(){
        int max=arr[0];
        for(int i=0;i<array[i].length;i++){
            if(arr[i]>arr[0]){
            System.out.println(arr[i]);
            }
            return max;
        }
    }

    public static void main(String args[]){
        int ar=Meth(5);
        check(ar);
        maxa();
    }
    }
