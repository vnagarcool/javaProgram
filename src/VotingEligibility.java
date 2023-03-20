import java.util.Scanner;

public class VotingEligibility {

    public static void main(String[] args) {

        int age;
        System.out.print("Enter Your Age");
        Scanner r = new Scanner(System.in);
        age = r.nextInt();

        if(age>=18)
        {
            System.out.print("Eligible for votes ");
        }
        else
        {
            System.out.print("Not Eligible for Votes ");
        }
    }
}
