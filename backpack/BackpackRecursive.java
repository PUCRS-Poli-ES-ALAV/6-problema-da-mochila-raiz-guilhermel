public class BackpackRecursive { 
    int iterations = 0;


    public int backpackRec(int[] weigth, int[] value, int nProducts, int capacity) {
        if (nProducts <= 0) { 
            return 0; 
        } else if (weigth[nProducts - 1] > capacity) {
            iterations++;
            return backpackRec(weigth, value, nProducts - 1, capacity);
        } else {
            iterations++;
            return Math.max(backpackRec(weigth, value, nProducts - 1, capacity), value[nProducts - 1] 
              + backpackRec(weigth, value, nProducts - 1, capacity - weigth[nProducts - 1]));
        }
    }

    public int getIterations(){
        return iterations;
    }
}