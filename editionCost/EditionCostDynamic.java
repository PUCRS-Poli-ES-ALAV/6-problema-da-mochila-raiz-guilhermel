package editionCost;

public class EditionCostDynamic {
    int iterations = 0;

    public int editionCostDyn(String strSource, String stringTarget) {
        int sourceSize = strSource.length();
        int targerSize = stringTarget.length();
        int matrix[][] = new int [sourceSize+1][sourceSize+1];
        int custo = 0;

        for(int i = 1; i< sourceSize+1; i++) {
            matrix[i][0] = matrix[i-1][0] + 1;
        }

        for(int i = 1; i< sourceSize+1; i++) {
            matrix[0][i] = matrix[0][i-1] + 1;
        }

        for (int i = 1; i <= sourceSize; i++) {
            for (int j = 1; j <= targerSize; j++) {
                if(strSource.charAt(i-1) == stringTarget.charAt(j-1)){
                    custo = 0;
                }else{
                    custo = 1;
                }
                iterations++;
                matrix[i][j] = Math.min(matrix[i-1][j] + 1, Math.min(matrix[i][j-1] + 1, matrix[i-1][j-1] + custo));
            }
        }
        return matrix[sourceSize][targerSize];
    }

    public int getIterations(){
        return iterations;
    }
}
