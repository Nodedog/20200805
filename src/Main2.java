import java.util.Scanner;

public class Main2 {
    public static int func(String string,char ch) {
        String[] strings = string.split(" ");
        char[] ch1 = new char[strings.length];
        for (int i = 0; i < strings.length ; i++) {
             ch1 = strings[i].toCharArray();
        }
        int count = 0;
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] == ch){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        char c = string2.toCharArray()[0];
        System.out.println(func(string1,c));
    }
}
