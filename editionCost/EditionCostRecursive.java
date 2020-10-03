package editionCost;

public class EditionCostRecursive {
    int iterations = 0;

    public int editionCostrecursive(String source, String target, int i, int j){
        if(i == 0){
            return j;
        }
        else if(j == 0){
            return i;
        }
        else if(source.charAt(i) == target.charAt(j)){
            return editionCostrecursive(source, target, i-1, j-1);
        }
        else{
            iterations++;
            int substitution = editionCostrecursive(source, target, i-1, j-1) +1;
            int insertion = editionCostrecursive(source, target, i, j-1) +1;
            int remove = editionCostrecursive(source, target, i-1, j) +1;
            return Math.min(substitution, Math.min(insertion, remove));
        }
    }

    public int getIterations(){
        return iterations;
    }
}
