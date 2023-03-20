import org.omg.Messaging.SyncScopeHelper;

import java.util.*;
public class CalculateAverageMarksOfFiveSubjects {
    public static void main(String[] args) {
        int Physics,Maths,Chemistry,English,SocialScience;
        System.out.println("Enter marks of five subjects");
        Scanner r = new Scanner(System.in);
        Physics=r.nextInt();
        Maths=r.nextInt();
        Chemistry=r.nextInt();
        English=r.nextInt();
        SocialScience=r.nextInt();

        int sum=Physics+Maths+Chemistry+English+SocialScience;
        System.out.println("Total marks"+ sum);
        double avg=sum/5.0;
        System.out.print("Average marks"+ avg);
    }
}
