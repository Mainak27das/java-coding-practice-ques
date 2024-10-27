import java.util.Scanner;

public class Reverse_A_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println(Reversed(str));
    }

    public static String Reversed(String str) {
        
        //use stringbuilder and usse inbuilt function then convert back to string
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());
         
        // Convert the string to a character array
        // Reverse the array in place
        char[] chars = str.toCharArray();
        char temp;
        for (int i = 0; i < chars.length / 2; i++) {
            temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }

        // Convert the character array back to a string using String.valueOf
        return String.valueOf(chars);
    }
}
