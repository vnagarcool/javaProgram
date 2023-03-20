import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        double a,b,c,sp,area;
        System.out.print("Enter value for sides of Triangle ");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        c=r.nextInt();

        sp=(a+b+c)/2;
        area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
        System.out.print("Area of Triangle " +area);

    }
}
