//string dublicate character in string

import java.util.HashSet;
import java.util.Scanner;

public class PrintDuplicateCharacterInString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.next();
        HashSet<Character> characterSet = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (characterSet.contains(c)) {
                System.out.print(c + " ");
            }else {
                characterSet.add(c);
            }
        }
    }
}