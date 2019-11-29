import java.util.Scanner;
/*Программа, которая по введенной строке вычисляет последнее слово максимальной длины.*/
public class MaksDlina {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку для поиска последнего слова, имеющего максимальную длину => ");
        String k = in.nextLine();
        int n = 0;
        String r = "";
        String[] b = k.split(" ");
        for (int i = 0; i < b.length; i++) {
            if (b[i].length() >= n) {
                n = b[i].length();
                System.out.println("Последнее слово максимальной длины равно => " + b[i]);
            }
        }
    }
}
