public class BackpackDynamic {
    int iterations = 0;

    int backpackDyn(int[] weight, int[] value, int nProducts, int capacity) {
        if (nProducts <= 0 || capacity <= 0) {
            return 0;
        }
     
        int[][] maxTab = new int[nProducts + 1][capacity + 1];
        for (int j = 0; j <= capacity; j++) {
            maxTab[0][j] = 0;
        }
     
        for (int i = 1; i <= nProducts; i++) {
            for (int j = 1; j <= capacity; j++) { 
                if (weight[i - 1] > j) {
                    iterations++;
                    maxTab[i][j] = maxTab[i - 1][j];
                } else {
                    iterations++;
                    maxTab[i][j] = Math.max(
                    maxTab[i - 1][j], 
                    maxTab[i - 1][j - weight[i - 1]] + value[i - 1]);
                }
            }
        }
        return maxTab[nProducts][capacity];
    }

    public int getIterations(){
        return iterations;
    }
}