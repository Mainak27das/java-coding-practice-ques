import java.util.Scanner;

public class Largerst_Word_inString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence=sc.nextLine();
        sc.close();
       String words[]=sentence.split(" ");
       String largest_word="";
       for(int i=0;i<words.length;i++){
        if(words[i].length()>largest_word.length())
        largest_word=words[i];

       }
       System.out.println(largest_word);
       

    
   }
}
