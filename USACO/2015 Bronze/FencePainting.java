import java.util.*;
import java.io.*;

public class FencePainting {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new BufferedReader(new FileReader("paint.in")));
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt(); 
        int d = input.nextInt();

        if(d < a || b < c){
            
        } else{
            int maximum = Math.max(b, d);
            int minimum = Math.min(a, c);
            System.out.println(maximum - minimum);
        }

        
        
        /* 
         a=7, b=10, c=4, d=8
         0    1    2    3    4    5    6    7    8    9   10   11   12
                                            c------------  d
                        a---------b
        */
        
        

    }
}