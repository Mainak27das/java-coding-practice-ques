import java.util.*;
public class dlete_dublicate_words {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
  String str=sc.nextLine();
  sc.close();

unque_word_string(str);

    }
   public static void unque_word_string(String str){
    String words[]=str.split("\\s+");
    HashSet<String>set=new HashSet<>();
    for(int i=0;i<words.length;i++){
        set.add(words[i]);
    }
    String words1[]=new String[set.size()];
    int idx=0;
    for(String s: set){
       words1[idx++]=s;
    }
    Arrays.sort(words1);
    for(int i=0;i<words1.length;i++){
        System.out.print(words1[i]+" ");
    }

    
   }
    
}
