import java.util.*;
import java.io.*;
import java.lang.*;
public class whiteSheet{
    public static void main(String[] args) throws IOException{
        // BufferedReader br = new BufferedReader(new FileReader("whiteInput.in"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // get cordinates of rectangles
        String[] whiteSheet = br.readLine().split(" "
        );
        String[] sheet1 = br.readLine().split(" ");
        String[] sheet2 = br.readLine().split(" ");

        br.close();
        long wx1 = Integer.parseInt(whiteSheet[0]);
        long wy1 = Integer.parseInt(whiteSheet[1]);
        long wx2 = Integer.parseInt(whiteSheet[2]);
        long wy2 = Integer.parseInt(whiteSheet[3]);

        long ax1 = Integer.parseInt(sheet1[0]);
        long ay1 = Integer.parseInt(sheet1[1]);
        long ax2 = Integer.parseInt(sheet1[2]);
        long ay2 = Integer.parseInt(sheet1[3]);

        long bx1 = Integer.parseInt(sheet2[0]);
        long by1 = Integer.parseInt(sheet2[1]);
        long bx2 = Integer.parseInt(sheet2[2]);
        long by2 = Integer.parseInt(sheet2[3]);

        // 0  1  2  3  4  5  6  7  8  9  10  11
        // | -----------  |
        //       | --------------- |

        // amount of black overlapping with white sheet
        // 
        long overlap1 = calculateOverlap(ax1, wx1, ax2, wx2) * calculateOverlap(ay1, wy1, ay2, wy2);
        long overlap2 = calculateOverlap(bx1, wx1, bx2, wx2) * calculateOverlap(by1, wy1, by2, wy2);
        long overlapAll = overlap3(ax1, ax2, bx1, bx2, wx1, wx2)
                       * overlap3(ay1, ay2, by1, by2, wy1, wy2);

        // find overlap of rectangles by comparing cordinates
        long whiteSheetArea = (wx2 - wx1) * (wy2 - wy1);
        
        if(whiteSheetArea - overlap1 - overlap2 + overlapAll > 0){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }




        
    }

    public static long calculateOverlap(long x1, long x2, long x3, long x4){
        // what do we want to return if there's no overlap?
        // computing area by multiplyijng this by something else
        // 0 or Integer.MIN_VALUE?

        // amount of overlapping area
        long left = Math.max(x1,x2);
        long right = Math.min(x3,x4);
        // right - left? 
        return Math.max(0L, (long)right - left);
    }

    public static long overlap3(long a1, long a2, long b1, long b2, long c1, long c2) {
        long left = Math.max(Math.max(a1, b1), c1);
        long right = Math.min(Math.min(a2, b2), c2);
        return Math.max(0L, (long)right - left);
    }
    
}