import java.util.Scanner;

public class PrintCharacter {
    public static void main(String[] args) {
        char ch;
        System.out.print("Please Enter Character ");
        Scanner r=new Scanner(System.in);
        ch=r.next().charAt(0);
        System.out.print(ch);
    }
}
