public class mixingMilk {
    public static int[][] fillBucket(int[] bucket1, int[] bucket2){
        for(int milk : bucket1){
            if(bucket2[0] == bucket2[1]){
                // bucket is full
                break;
            } else if(bucket1[0] == 0){
                break;
                // bucket 1 is empty
            }
            else{
                // exchange 1 unit of milk from bucket 1 to bucket2
                bucket2[0]++;
                bucket1[0]--;
            }
            
        }
        return {bucket1, bucket2};
    }
    public static void main(String[] args) {
        // [curent amount of milk, max milk]
        int[] bucket1 = new int[2];
        int[] bucket2 = new int[2];
        int[] bucket3 = new int[2];
    }
}
