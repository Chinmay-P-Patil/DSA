import java.util.*;

public class graph {

    static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }


    public static void creategraph(ArrayList<Edge> graph[]){
        //when we create a arralist with prdefined length it stores null vales in all the indexex to temove that null value and make it empty we do this 
        //we cant store data where null is already stored 
        for(int i=0; i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));


    }

    public static void main(String[] args){

        int v=4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        creategraph(graph);

        //print 2's naigh

        for(int i=0;i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.print(e.dest + " ");
        }

    }
}
