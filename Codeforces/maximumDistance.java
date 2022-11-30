import java.util.*;
import java.io.*;
import java.lang.*;
public class maximumDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        int[] xVals = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] yVals = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int highestDistance = Integer.MIN_VALUE;
        // i takes on every value from 0 to n-1
        // j takes on every value from 0 to n-1
        // at some point i = 1, j = 3
        //               i = 3, j = 1
        // have some condition that we enforce
        // j >= i. 
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int xDiff = xVals[i] - xVals[j];
                int yDiff = yVals[i] - yVals[j];
                int distance = yDiff * yDiff + xDiff * xDiff;
                if(distance > highestDistance){
                    highestDistance = distance;
                } 
            }
            /*/
            int curDistance = (
                Math.pow(xVals[
                    ( i == cases - 1 ? 0 : i + 1)
                    ] - xVals[i], 2.0) + 
                Math.pow(yVals[
                    ( i == cases - 1 ? 0 : i + 1)
                    ] - yVals[i] ,2.0)
            );
            
            */
        }
        System.out.println(highestDistance);
    }
}
