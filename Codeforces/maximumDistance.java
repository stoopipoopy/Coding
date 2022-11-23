import java.util.*;
import java.io.*;
import java.lang.*;
public class maximumDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.valueOf(scanner.nextLine());
        int[] xVals = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] yVals = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        double highestDistance = Double.MIN_VALUE;
        int x1;
        int y1;
        int x2;
        int y2;
        for(int i = 0; i < cases - 1; i++){
            double curDistance = Math.sqrt(  
                Math.pow(xVals[i + 1] - xVals[i], 2.0) + 
                Math.pow(yVals[i + 1] - yVals[i] ,2.0)
            );
            if(curDistance > highestDistance){
                highestDistance = curDistance;
            }
        }
        System.out.println(highestDistance);
    }
}
