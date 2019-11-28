import java.util.Scanner;
/*Программа, которая по введенной сроке вычисляет число слов, начинающихся с гласной буквы.*/
public class Glasnaya {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку для поиска слов, начинающихся с гласной буквы => ");
        String a = in.nextLine();
        int n = 0;
        for (int k = 0; k < 1; k++) {
            if ((a.charAt(k) == 'а') || (a.charAt(k) == 'я') || (a.charAt(k) == 'о') || (a.charAt(k) == 'у') || (a.charAt(1) == 'и') || (a.charAt(k) == 'ы') || (a.charAt(k) == 'е') || (a.charAt(k) == 'ё') || (a.charAt(k) == 'ю') || (a.charAt(k) == 'э') || (a.charAt(k) == 'А') || (a.charAt(k) == 'Я') || (a.charAt(k) == 'О') || (a.charAt(k) == 'У') || (a.charAt(k) == 'И') || (a.charAt(k) == 'Ы') || (a.charAt(k) == 'Е') || (a.charAt(k) == 'Е') || (a.charAt(k) == 'Ю') || (a.charAt(k) == 'Э')) {
                n += 1;
            }
            if (n == 1) {
                System.out.println("Первое слово начинается с гласной. Количество слов, начинающихся с гласной равно => " + n);
            }
            else {
                System.out.println("Первое слово не начинается с гласной.");
            }
        }
        for (int i = 0; i < a.length(); i++) {
            if ((a.charAt(i) == ' ') && ((a.charAt(i + 1) == 'а') || (a.charAt(i + 1) == 'я') || (a.charAt(i + 1) == 'о') || (a.charAt(i + 1) == 'у') || (a.charAt(i + 1) == 'и') || (a.charAt(i + 1) == 'ы') || (a.charAt(i + 1) == 'е') || (a.charAt(i + 1) == 'ё') || (a.charAt(i + 1) == 'ю') || (a.charAt(i + 1) == 'э') || (a.charAt(i + 1) == 'А') || (a.charAt(i + 1) == 'Я') || (a.charAt(i + 1) == 'О') || (a.charAt(i + 1) == 'У') || (a.charAt(i + 1) == 'И') || (a.charAt(i + 1) == 'Ы') || (a.charAt(i + 1) == 'Е') || (a.charAt(i + 1) == 'Е') || (a.charAt(i + 1) == 'Ю') || (a.charAt(i + 1) == 'Э'))) {
                n += 1;
                System.out.println("Количество слов, начинающихся с гласной равно => " + n);
            }
        }
    }
}
