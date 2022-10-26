import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


       int no= (int)(10*Math.random());

        Scanner sc= new Scanner(System.in);
       int guess;
do {

    guess= sc.nextInt();

    if (no == guess) {
        System.out.println("Congratulations your guess is correct the no was "+no);


    } else if (no > guess) {
        System.out.println("Your guess is less than the no");

    } else if (no < guess) {
        System.out.println("Your guess is more than the no");

    } else if (guess == -1) {
        System.out.println("The no was" + no);
        break;
    } else
        System.out.println("Please enter a valid integer");
}while(no!=guess);
       }
    }
