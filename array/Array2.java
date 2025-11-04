public class Array2{

    public static void main(String[] args) {
        // int[] arr,arr1
        
        int arr[][]= new int[2][2];
        
        System.out.println(arr);

        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[1][0] = 30;
        arr[1][1] = 40; 
     /// i j 

        for(int i = 0; i < 2; i++ ){
            for(int j = 0; j < 2; j++){
                System.out.print(arr[i][j]);// 
            }
        }

        // rollno    1   2   3 
        //   31     



        // 1 2 
        // 3 4  

        // col * row  = 2 * 2 = 4 


    }
}