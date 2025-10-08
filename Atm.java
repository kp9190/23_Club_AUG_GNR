import java.util.Scanner;

public class Atm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int defPin=1234,attem=3,balance = 5000,loop=1;
        
        while(attem > 0)
        {   
            System.out.print("Enter your ATM pin : ");
            int pin = sc.nextInt();
            
            if(defPin == pin){
                while(loop != 0)
                {
                System.out.println("\n1) --> Deposit\n2) --> Withdraw\n3) --> Balance\n4)  -->Exit");
                System.out.println("\nEnter your choice : ");
                int ch = sc.nextInt();
                switch(ch){
                        case 1 : System.out.println("Enter your Deposit Amount : "); 
                                int depo = sc.nextInt();
                                balance += depo; // balane = balane + deposit
                                System.out.println("Updated Balance : " + balance);
                            break;
                        case 2 : 
                                System.out.println("Enter your Withdraw Amount : "); 
                                int with = sc.nextInt();
                                balance -= with; // balane = balane + deposit
                                System.out.println("Updated Balance : " + balance);

                            break;
                        case 3 : System.out.println("\nBalance : "+ balance);
                            break;
                        case 4 : System.out.println("\nExit...");
                                attem=0;
                                loop =0;
                                // exit(0)
                            break;
                        default : System.out.println("Invelid Choice !!");
                }// end of switch 
            }// end of while                   
            }else{
                attem--;
                System.out.println("worng Pin");
            }
        }// end of while
            
        sc.close();
    }
}

// task : - Deposit limie(10000) and withdrow limit (10000) 
//        - Balance cannot become zero or negative
