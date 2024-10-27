import java.util.Scanner;

public class closesest_rhymig_word {
     public static void main (String[] args) {  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string array size");
        int size=sc.nextInt();
        sc.nextLine();
        String str[]= new String[size];
        for(int i=0;i<size;i++){
            str[i]=sc.nextLine();
        }
         System.out.println("Enter the word you want to rhyme");
        String word=sc.nextLine();
            sc.close();
           
        System.out.print(shortest_and_Closest_Rhyming_word(str,word));
    } 
    public static String shortest_and_Closest_Rhyming_word(String str[], String word){
        String rhymed_word="no rhyming words found";
        int max_Count=0;
        String smallest_word=str[0];
        
        for(int i=0;i<str.length;i++){
            int count=0;
            for(int j=0;j<Math.min(str[i].length(), word.length());j++){
                if(str[i].charAt(str[i].length()-j-1)==word.charAt(word.length()-j-1)){
                    count++;
                }
                else
                break;
                   
            }
            if((count>=max_Count)&&(str[i].length()<=smallest_word.length())&&(count!=0)){
                max_Count=count;
                smallest_word=str[i];
                rhymed_word=str[i];
            }
        }
      

       

        return rhymed_word;
    }
    
}
