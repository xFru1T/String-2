import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print the string for delete vowel letters: ");
        String str = scanner.nextLine();
        String newStr = str.replaceAll("[аоуэыяеёюиАОУЭЫЯЕЁЮИaeiouAEIOU]+", "");
        System.out.println(newStr);
    }
}
