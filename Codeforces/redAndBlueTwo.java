import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
public class redAndBlueTwo {
    public static String solve(Scanner scan){
        /*
         * 7
         * ?R???BR
         *   BRB
         * BRBRBBR
         * 
         * BRRBRBR
         *
         * ?R????BR
         * B BRBR  
         * 
         * 
         * R?????B
         *  
         * 
         * R???B???B
         * 
         * 
         *   
         * 
         */
        int n = scan.nextInt();
        String input = scan.next();
        char[] inputArr = input.toCharArray();
        if(n == 1){
            if(inputArr[0] == '?'){
                return "B";
            } else{
                return input;
            }
        }
        for(int i = 1; i < n; i++){
            
            if(inputArr[i] == '?'){
                if(inputArr[i - 1] == 'R'){
                    inputArr[i] = 'B';
                } else if(inputArr[i - 1] == 'B'){
                    inputArr[i] = 'R';
                }
            }
        }
        for(int i = n - 2; i >= 0; i--){
            if(inputArr[i] == '?'){
                if(inputArr[i + 1] == 'R'){
                    inputArr[i] = 'B';
                } else if(inputArr[i + 1] == 'B'){
                    inputArr[i] = 'R';
                }
                
            }
        }
        /*
         * after first loop, this is what the second loop does
         * Starting
         * ?, B, R
         * 1: sees R, nothing to change
         * 2: sees B, 
         * 
         */
        
        return String.valueOf(inputArr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        for(int i = 0; i < cases; i++){
            System.out.println(solve(scanner));
        }
    }
}
