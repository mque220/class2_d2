import java.util.Scanner;
import java.util.ArrayList;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        ArrayList<String> list = new ArrayList<>();
        while (!n.equals("0")) {
            String[] arr = n.split("");
            boolean is_palindrome = true;
            int len = arr.length - 1;
            for (int i = 0; i <= len / 2 ; i++) {
                if (!arr[i].equals(arr[len - i])) {
                    list.add("no");
                    is_palindrome = false;
                    break;
                }
            }
            if (is_palindrome) {
                list.add("yes");
            }
            n = sc.nextLine();
        }
        for (String data : list) {
            System.out.println(data);
        }
        sc.close();
    }
}
