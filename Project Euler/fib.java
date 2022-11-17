public class fib {
    /**
     * public static int f(int input) {
     * if (input == 0) {
     * return 1;
     * }
     * if (input == 1) {
     * return 1;
     * }
     * return f(input - 1) + f(input - 2);
     * }
     * 
     * public static void main(String[] args) {
     * int sum = 0;
     * int curNum = 0;
     * int counter = 0;
     * while (curNum < 4000000) {
     * counter++;
     * if (curNum % 2 == 0) {
     * sum += curNum;
     * }
     * curNum = f(counter);
     * 
     * }
     * System.out.println(sum);
     * }
     **/
    public static void main(String[] args) {
        int curNum1 = 0;
        int curNum2 = 1;
        int sum = 0;
        while (curNum2 <= 4000000) {
            int curNum = curNum1 + curNum2;
            if (curNum % 2 == 0) {
                sum += curNum;
            }
            curNum1 = curNum2;
            curNum2 = curNum;
        }
        System.out.println(sum);
    }
}