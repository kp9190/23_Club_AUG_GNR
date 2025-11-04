
import java.util.Scanner;

public class StringArr {

  public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            String std[][] = {
                {"abc","80"},
                {"xyz","75"}
            };

            int arr[][] = {
                {21,31},
                {41,51}
            };

            int scan[][] = new int[3][3];

for(int i=0; i<3; i++){
    for(int j=0; j<3; j++){
        System.out.print("scan["+ i +"]["+ j +"] : ");
        scan[i][j] = sc.nextInt();
    }
}

for(int i=0; i<3; i++){
    for(int j=0; j<3; j++){
        System.out.print(" "+ scan[i][j]);
    }
    System.out.println();
}

        // for(int i = 0; i < 2; i++ ){
        //     for(int j = 0; j < 2; j++){
        //         System.out.print(" " + arr[i][j]);
        //     }
        //     System.out.println();
        // }

        sc.close();
    }
    
}
