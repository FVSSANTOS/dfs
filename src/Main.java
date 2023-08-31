import java.util.LinkedList;

public class Main {
    
    public static LinkedList<LinkedList<Integer>> initGraph() {

        int size = 12;

        LinkedList<LinkedList<Integer>> graph = new LinkedList<>();
        for(int i=0;i<size;i++){
            graph.add(new LinkedList<>());
        }

        /*
             * __TABELA INDICES GRAFO__
             * Foz do Iguaçu = 0
             * Cascavel = 1
             * Pato Branco = 2
             * Campo Mourão = 3
             * Guarapuava = 4
             * União da Vitoria = 5
             * Maringá = 6
             * Irati = 7
             * Londrina = 8
             * Ponta Grossa = 9
             * Curitiba = 10
        */

        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(0);
        graph.get(1).add(3);
        graph.get(1).add(4);
        graph.get(1).add(5);

        graph.get(2).add(4);
        graph.get(2).add(0);

        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(6);

        graph.get(4).add(8);
        graph.get(4).add(3);
        graph.get(4).add(1);
        graph.get(4).add(2);
        graph.get(4).add(7);
        graph.get(4).add(9);

        graph.get(5).add(1);
        graph.get(5).add(7);
        graph.get(5).add(10);

        graph.get(6).add(3);
        graph.get(6).add(8);

        graph.get(7).add(4);
        graph.get(7).add(10);
        graph.get(7).add(5);

        graph.get(8).add(9);
        graph.get(8).add(6);
        graph.get(8).add(4);

        graph.get(9).add(10);
        graph.get(9).add(4);
        graph.get(9).add(8);

        return graph;
    }
    
    public static void main(String[] args) {

        // Initialization graph
        LinkedList<LinkedList<Integer>> graph = initGraph();

        int start = 0;
        int end = 10;
        DFS dfs = new DFS(graph, start, end);

        dfs.dfs_start();
    }
}
