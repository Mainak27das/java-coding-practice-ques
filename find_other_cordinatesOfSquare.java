import java.util.Scanner;

public class find_other_cordinatesOfSquare {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        sc.close();
        find_otherTwoCordinates_from_givenTwoCordinates(x1,y1,x2,y2);
    }

    

    public static void find_otherTwoCordinates_from_givenTwoCordinates(int x1,int y1,int x2,int y2) {
        if((x1!=x2)&&(y1!=y2))
        // Start checking from the number right after 'first'
        System.out.print( "the other 2 cordnates are "+"("+x1+","+y2+")"+"("+x2+","+y1+")");
        if(y1==y2)
        System.out.print( "the other 2 cordnates are"+x1+","+(y1+Math.abs(x2-x1))+","+x2+","+(y1+Math.abs(x2-x1)));
        if(x1==x2)
        System.out.print( "the other 2 cordnates are"+(x1+Math.abs(y2-y1))+","+y1+","+(x1+Math.abs(y2-y1))+","+y2);
    }
}
