import java.io.*;
import java.util.*;
import java.lang.*;
class diamondCollector{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("diamonds.in"));
        String firstLine = br.readLine();
        int n = Integer.parseInt(Character.toString(firstLine.charAt(0)));
        int k = Integer.parseInt(Character.toString(firstLine.charAt(2)));

        int[] diamonds = new int[n];
		for(int i = 0; i < n; i++) {
			diamonds[i] = Integer.parseInt(br.readLine());

		}
        int largestAmt = 0;
        for(int diamond : diamonds){
            int curLargestAmt = 0;
            for(int loopDiamonds : diamonds){
                if(loopDiamonds >= diamond && loopDiamonds <= diamond + k) {
					curLargestAmt++;
				}
            }
            if(curLargestAmt > largestAmt){
                largestAmt = curLargestAmt;
            }
        }
        System.out.println(largestAmt);
        br.close();
    }
}