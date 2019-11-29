import java.util.Scanner;
/*Программа, которая по введенной строке вычисляет номера слов, имеющих длину 3.*/
public class DlinaTri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку для поиска номера слов, имеющих длину 3 => ");
        String k = in.nextLine();
        int n = 0;
        String[] b = k.split(" ");
        for (int i = 0; i < b.length; i++) {
            if (b[i].length() == 3) {
                n += 1;
                System.out.println("Номер слова, имеющего длину 3, равен => " + n);
            }
            else {
                n += 1;
            }
        }
    }
}
