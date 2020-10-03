import editionCost.EditionCostDynamic;
import editionCost.EditionCostRecursive;

public class App {
    public static void main(String[] args) {
        long start;
        long elapsed;
        int [] listWeight1 = new int[] {23, 31, 29, 44, 53, 38, 63, 85, 89, 82};
        int [] listWeight2 = new int[] {56, 59, 80, 64, 75, 17};

        int [] listValue1 = new int[] {92, 57, 49, 68, 60, 43, 67, 84, 87, 72};
        int [] listValue2 = new int[] {50, 50, 64, 46, 50, 5};

        int capacity1 = 165;
        int capacity2 = 190;
        
        String strSource1 = "Casablanca";
        String strTarget1 = "Portentoso";

        String strSource2 = "Maven, a Yiddish word meaning accumulator of knowledge, began as an attempt to " +
        "simplify the build processes in the Jakarta Turbine project. There were several" + 
        " projects, each with their own Ant build files, that were all slightly different." +
        "JARs were checked into CVS. We wanted a standard way to build the projects, a clear "+ 
        "definition of what the project consisted of, an easy way to publish project information" +
        "and a way to share JARs across several projects. The result is a tool that can now be" +
        "used for building and managing any Java-based project. We hope that we have created " +
        "something that will make the day-to-day work of Java developers easier and generally help " +
        "with the comprehension of any Java-based project.";
        String strTarget2 = "This post is not about deep learning. But it could be might as well. This is the power of " +
        "kernels. They are universally applicable in any machine learning algorithm. Why you might" +
        "ask? I am going to try to answer this question in this article." + 
            "Go to the profile of Marin Vlastelica Pogančić" + 
            "Marin Vlastelica Pogančić Jun";

        System.out.println("------------Resultado da mochila com valores um------------");
        start = System.nanoTime();
        BackpackRecursive bp1r = new BackpackRecursive();
        bp1r.backpackRec(listWeight1, listValue1, listWeight1.length, capacity1);
        elapsed = System.nanoTime()-start;
        System.out.println("Numero de iteracoes do problema da mochila com modo recursivo dos valores um: " + bp1r.getIterations() + " Tempo de execucao em microsegundos: " + elapsed/1000);
        
        start = System.nanoTime();
        BackpackDynamic bp1d = new BackpackDynamic();
        bp1d.backpackDyn(listWeight1, listValue1, listWeight1.length, capacity1);
        elapsed = System.nanoTime()-start;
        System.out.println("Numero de iteracoes do problema da mochila com modo dinamico dos valores um: " + bp1d.getIterations() + " Tempo de execucao em microsegundos: " + elapsed/1000);


        System.out.println("------------Resultado da mochila com valores dois------------");
        start = System.nanoTime();
        BackpackRecursive bp2r = new BackpackRecursive();
        bp2r.backpackRec(listWeight2, listValue2, listWeight2.length, capacity2);
        elapsed = System.nanoTime()-start;
        System.out.println("Numero de iteracoes do problema da mochila com modo recursivo dos valores dois: " + bp2r.getIterations() + " Tempo de execucao em microsegundos: " + elapsed/1000);

        start = System.nanoTime();
        BackpackDynamic bp2d = new BackpackDynamic();
        bp2d.backpackDyn(listWeight2, listValue2, listWeight2.length, capacity2);
        elapsed = System.nanoTime()-start;
        System.out.println("Numero de iteracoes do problema da mochila com modo dinamico dos valores dois: " + bp2d.getIterations() + " Tempo de execucao em microsegundos: " + elapsed/1000);

        System.out.println("");
        System.out.println("------------Resultado da Distancia de edicao com valores um------------");

        start = System.nanoTime();
        EditionCostRecursive edRec1 = new EditionCostRecursive();
        edRec1.editionCostrecursive(strSource1, strTarget1, strSource1.length()-1, strTarget1.length()-1);
        elapsed = System.nanoTime()-start;
        System.out.println("Numero de iteracoes do problema da Distancia de edicao com modo recursivo dos valores um: " + edRec1.getIterations() + " Tempo de execucao em microsegundos: " + elapsed/1000);

        start = System.nanoTime();
        EditionCostDynamic edDyn1 = new EditionCostDynamic();
        edDyn1.editionCostDyn(strSource1, strTarget1);
        elapsed = System.nanoTime()-start;
        System.out.println("Numero de iteracoes do problema da Distancia de edicao com modo dinamico dos valores dois: " + edDyn1.getIterations() + " Tempo de execucao em microsegundos: " + elapsed/1000);
       
        System.out.println("------------Resultado da Distancia de edicao com valores dois------------");

        start = System.nanoTime();
        EditionCostDynamic edDyn2 = new EditionCostDynamic();
        edDyn2.editionCostDyn(strSource2, strTarget2);
        elapsed = System.nanoTime()-start;
        System.out.println("Numero de iteracoes do problema da Distancia de edicao com modo dinamico dos valores dois: " + edDyn2.getIterations() + " Tempo de execucao em microsegundos: " + elapsed/1000);

        start = System.nanoTime();
        EditionCostRecursive edRec2 = new EditionCostRecursive();
        edRec2.editionCostrecursive(strSource2, strTarget2, strSource2.length()-1, strTarget2.length()-1);
        elapsed = System.nanoTime()-start;
        System.out.println("Numero de iteracoes do problema da Distancia de edicao com modo recursivo dos valores dois: " + edDyn1.getIterations() + " Tempo de execucao em microsegundos: " + elapsed/1000);
    }

    
}