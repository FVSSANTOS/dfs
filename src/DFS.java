import java.util.LinkedList;

public class DFS {

    private static final int WHITE = -1;
    private static final int GREY = 0;
    private static final int BLACK = 1;

    private int[] color;
    private int start;
    private int end;

    private String[] cities = {
            "Foz do Iguaçu",
            "Cascavel",
            "Pato Branco",
            "Campo Mourão",
            "Guarapuava",
            "União da Vitória",
            "Maringá",
            "Irati",
            "Londrina",
            "Ponta Grossa",
            "Curitiba"
    };

    private LinkedList< LinkedList<Integer> > graph;

    public DFS(LinkedList< LinkedList<Integer> > graph, int start, int end){
        this.color = new int[graph.size()];
        this.graph = graph;
        this.start = start;
        this.end = end;
    }

    private final void showVariables() {
        System.out.println("Iniciando por: " + this.cities[this.start]);
        System.out.println("Procurando por: " + this.cities[this.end]);
    }

    public void dfs_start(){
        showVariables();
        for(int i=0; i<this.graph.size(); i++){
            this.color[i] = WHITE;
         }
        dfs_visit(this.start, this.end);
    }

    private void dfs_visit(int u, int end){
        this.color[u] = GREY;
        System.out.print(" -> " + this.cities[u]);
        for(int i = 0; i<this.graph.get(u).size();i++){
            if(this.color[this.graph.get(u).get(i)] == WHITE){
                dfs_visit(this.graph.get(u).get(i), end);
                if(this.color[end]== BLACK) return;
            }
        }
        this.color[u] = BLACK;
    }

}
