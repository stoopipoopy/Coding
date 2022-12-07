import java.io.*;
import java.util.*;
import java.lang.*;
public class daisyChains{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int total = 0;
        // for every i, j : nested loop

        // for every i in range 0, n-1
        //    for every j in range i, n-1
        //        given (i,j): we find sum and check for average flower
        //                          ^ requires another loop
        int[] petals = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i = 0; i < n; i++){
            int curPetals = 0;
            System.out.println("outside loop");
            for(int j = i; j < n; j++){
                // here we have determined (i, j)
                // here we find sum of petals i to j
                System.out.println("loop \n");
                curPetals = 0;
                for(int k = i; k <= j; k++){
                    curPetals += petals[k];
                    System.out.print(petals[k] + " - ");
                }
                // another loop for check the average'
                System.out.println();
                int length = 0;
                System.out.println(j + " = " + length + " - " + i);
                for(; length <= j; length++){
                    if(j == 0){
                        total++;
                        System.out.println("skipped");
                        break;
                    }
                    System.out.println("inside loop 2 - " + curPetals + " - " + (petals[j] * length));
                    if(curPetals == petals[j] * length){
                        
                        total++;
                        System.out.println("average flower");
                    }
                }
            
            }
        }
        System.out.println(total);
        scanner.close();
    }
}
