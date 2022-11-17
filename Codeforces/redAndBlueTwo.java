import java.util.Arrays;
public class redAndBlueTwo {
    public static String solve(String input, int n){
        /*
         * 7
         * ?R???BR
         *    
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

         char[] inputArr = input.toCharArray();
        for(int i = 1; i < n; i++){
            
            if(inputArr[i] == '?'){
                if(inputArr[i - 1] == 'R'){
                    inputArr[i] = 'B';
                } else if(inputArr[i - 1] == 'B'){
                    inputArr[i] = 'R';
                }
            } else if(inputArr[i] == 'R'){
                if(inputArr[i - 1] == '?'){
                    inputArr[i - 1] = 'B';
                }
            } else if(inputArr[i] == 'B'){
                if(inputArr[i - 1] == '?'){
                    inputArr[i - 1] = 'R';
                }
            }
        }
        System.out.println(n);
        System.out.println(inputArr.length);
        for(int i = n - 1; i > 0; i--){
            System.out.println("in loop");
            if(inputArr[i] == '?'){
                if(inputArr[i + 1] == 'R'){
                    inputArr[i] = 'B';
                } else if(inputArr[i + 1] == 'B'){
                    inputArr[i] = 'R';
                }
            } else if(inputArr[i] == 'R'){
                System.out.println("hit this thing but R");
                if(inputArr[i - 1] == '?'){
                    inputArr[i -1] = 'B';
                }
            } else if(inputArr[i] == 'B'){
                System.out.println("hit this thing");
                if(inputArr[i - 1] == '?'){
                    inputArr[i - 1] = 'R';
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
        System.out.println(solve("??R", 3));
        System.out.println(solve("???RB",5));
    }
}
