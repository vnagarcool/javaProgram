import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        final double PI=3.14,area;
        int r;
        System.out.print("Radius of circle ");
        Scanner ref=new Scanner(System.in);
        r=ref.nextInt();

        area=PI*r*r;
        System.out.print("Area of circle " +area);
    }
}
