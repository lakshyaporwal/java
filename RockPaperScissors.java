# java
import java.util.Random;
import java.util.Scanner;
class RockPaperScissors {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random rd=new Random();
        int ub=3;
        int cp=rd.nextInt(ub);
        int userp=0;                                                           //for counting the score of the user
        int comp=0;                                                            //for counting the score of computer         
        String cb="";                                                          // will store the input of computer
        if(cp==0){
            cb="rock";
        }
        else if(cp==1){
            cb="scissors";
        }
        else{
            cb="paper";
        }
        System.out.println("Enter the number of rounds :");
        int t=sc.nextInt();                                                      //for number of rounds
        while(t!=0){
        String ab=sc.next();                                                     //Will store the user's value
        System.out.println("Computer's move :"+cb);
        System.out.println("Your move :"+ab);
        if(ab.equalsIgnoreCase("paper")){
            if(cb.equalsIgnoreCase("rock")){
                System.out.println("You won");
                userp++;
            }
            else if(cb.equalsIgnoreCase("paper")){
                System.out.println("It is a tie");
            }
            else {
                System.out.println("Computer won");
                comp++;
            }
            t--;
        }
        else if(ab.equalsIgnoreCase("rock")){
            if(cb.equalsIgnoreCase("paper")){
                System.out.println("Computer won");
                comp++;
            }
            else if(cb.equalsIgnoreCase("rock")){
                System.out.println("It is a tie");
            }
            else {
                System.out.println("You won");
                userp++;
            }
            t--;
        }
        else {
            if (cb.equalsIgnoreCase("rock")) {
                System.out.println("Computer won");
                comp++;
            } else if (cb.equalsIgnoreCase("scissors")) {
                System.out.println("It is a tie");
            } else {
                System.out.println("You won");
                userp++;
            }
            t--;
        }

    }                                                                                          //Printing the result
        System.out.println("Final scores are : ");
        System.out.println("You : "+userp+" Computer : "+comp);
        if(userp>comp){
            System.out.println("You won !");
        }
        else if(userp<comp){
            System.out.println("Computer won !");
        }
        else {
            System.out.println("It is a tie !");
        }

   }

}
