// Find Shortest and Longest Names
// Find and print both the shortest and longest strings in the 2D array. If tie, choose the
// first encountered for each.
// Sample Input:
        // Ram  Krishna
        // Hari Om
// Expected Output:
    // Shortest name: Om
    // Longest name: Krishna


public class StringTask9 {
    public static void main(String[] args) {
        
        String[][] name={
            {"Ram", "Krishna"},
            {"Hari", "Om"}
        };

        String longest= new String();
        String shortest = name[0][0];

        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                // System.out.println("\n\nName : "+name[i][j]+"\nLength : "+name[i][j].length());        

                if(longest.length() < name[i][j].length()){
                    longest = name[i][j];
                }
                
                if(shortest.length() > name[i][j].length()){
                    shortest = name[i][j];
                }

                
            }
        }

System.out.println("Longest : "+ longest);
System.out.println("Shortest : "+ shortest);

        


    }
}
