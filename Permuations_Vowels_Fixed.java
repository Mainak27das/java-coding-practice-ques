import java.util.Scanner;

public class Permuations_Vowels_Fixed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  str=sc.nextLine();
        sc.close();
        System.out.println(Find_max_Permutaions_Vowel_fixed(str));   
        

        
     }

     public static int factorial(int n){
        if(n<=1)
        return 1;
        else
        return n*factorial(n-1);
     }

           public static int Find_max_Permutaions_Vowel_fixed(String str) {
                     String Consonant_str="";
                     for(int i=0;i<str.length();i++){
                        if(str.charAt(i)!='a'&&str.charAt(i)!='e'&&str.charAt(i)!='i'&&str.charAt(i)!='o'&&str.charAt(i)!='u')
                        Consonant_str=Consonant_str+str.charAt(i);
                     }
                     int  total_Consonat_permutaion=factorial(Consonant_str.length());
                     
                     for(int j=0;j<Consonant_str.length();j++){
                        if (Consonant_str.indexOf(Consonant_str.charAt(j)) != j) {
                            continue;
                        }
            
                        int freq = 0; // Initialize frequency count
            
                        // Count occurrences of the current character
                        for (int k = 0; k < Consonant_str.length(); k++) {
                            if (Consonant_str.charAt(j) == Consonant_str.charAt(k)) {
                                freq++;
                            }
                        }
            
                        total_Consonat_permutaion= total_Consonat_permutaion/factorial(freq);
                     }
               return  total_Consonat_permutaion;
            }
}