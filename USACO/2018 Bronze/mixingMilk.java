import java.io.*;
import java.util.*;
public class mixingMilk {
    public static void fillBucket(int[] bucket1, int[] bucket2){
        int b2diffrence = bucket2[1] - bucket2[0];
        bucket2[0] += Math.min(bucket1[0],b2diffrence);
        bucket1[0] -= Math.min(bucket1[0],b2diffrence);
        return;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new BufferedReader(new FileReader("mixmilk.in")));
        PrintWriter pw = new PrintWriter("mixmilk.out");
        // [curent amount of milk, max milk]
        int[] bucket1 = new int[2];
        bucket1[1] = input.nextInt();
        bucket1[0] = input.nextInt();
        int[] bucket2 = new int[2];
        bucket2[1] = input.nextInt();
        bucket2[0] = input.nextInt();
        int[] bucket3 = new int[2];
        bucket3[1] = input.nextInt();
        bucket3[0] = input.nextInt();
        /*
         * 0: 3,1
         * 1: no pour
         * 2: 1,2
         * 3: 2,3
         * 4  3,1
         * 5: no pour
         * 6: 1,2
         * 7: no pour
         * 8: 3,2
         * 9: 2,3
         * 10: no pour
         */
        for(int i = 0; i < 100; i++){
            if(i % 3 == 0){
                fillBucket(bucket1, bucket2);
                
            } else if(i % 3 == 1){
                fillBucket(bucket2, bucket3);
            } else if(i % 3 == 2){
                fillBucket(bucket3, bucket1);
            }
        }
        
        pw.println(bucket1[0] +"\n"+ bucket2[0] +"\n"+ bucket3[0]);
        pw.close();
    }
}
