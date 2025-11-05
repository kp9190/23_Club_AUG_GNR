// Display Names in Diagonal Order
// For a 3×3 array, print the diagonal elements where row index equals column index (topleft to bottom-right).
// Sample Input:
        // Kenil    Raj     Dev        00     01      02
        // Riya     Meera   Nia        10     11      12
        // Jay      Siya    Yash       20     21      22 
// Expected Output:
// Kenil
// Meera
// Yash


public class StringTask7 {

    public static void main(String[] args) {
        
        String[][] name = {
        {"Kenil", "Raj", "Dev"},      
        {"Riya", "Meera", "Nia"},       
        {"Jay", "Siya", "Yash"}       
        };

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i==j){
                    System.out.print(" "+ name[i][j]);
                }
            }
            System.out.println();
        }





    }
}