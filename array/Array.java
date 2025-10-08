package array;
import java.util.Scanner;


public class Array {
    
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
        int arr[] =new int[5];

    // arr[0] =10;
    // arr[1] =20;
    // arr[2] =30;
    // arr[3] =40;
    // arr[4] =50;

        for(int i=0; i<5; i++){
            System.out.println("Enter the Array value :");
            arr[i]= sc.nextInt();
        }

        System.out.print("Array value :");
            
        for(int i=0; i<5; i++){
            System.out.print(" " +arr[i]);
        }

        sc.close();
    }
}
