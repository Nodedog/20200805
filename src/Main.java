import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str1 = scanner.nextLine().split(" ");
        int count = 0;
        if (str1.length != 0){
            char[] ch = str1[str1.length - 1].toCharArray();
            count = ch.length;
        }
        System.out.println(count);
    }
}
