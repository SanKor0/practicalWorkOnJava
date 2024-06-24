import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPalindrome = true;

        while (isPalindrome) {
            System.out.println("Введите строку: ");
            String input = scanner.nextLine();
            String processed = input.replaceAll("\\s+", "").toLowerCase();

            char[] characters = processed.toCharArray();
            int i = 0;
            int j = characters.length - 1;

            while (i < j) {
                if (characters[i] != characters[j]) {
                    isPalindrome = false;
                    break;
                }
                i++;
                j--;
            }

            if (isPalindrome) {
                System.out.println("Строка является палиндромом.");
            } else {
                System.out.println("Строка не является палиндромом. Программа завершена.");
            }
        }
        scanner.close();
    }
}
