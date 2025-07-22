import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    static class Edge{
        int src;
        int dst;
        public Edge(int s,int d){
            this.src = s;
            this.dst = d;
        }
    }

    public static void creategraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));

    }

    public static void bfs(ArrayList<Edge> graph[], int v/*boolean vis[], int start */){
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[v];
        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr] == false){
                System.out.print(curr+" ");
                vis[curr] = true;

                for(int i = 0;i<graph[curr].size();i++){
                    Edge e  = graph[curr].get(i);
                    q.add(e.dst);
                }
            }   
        }
    }



    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]){

        System.out.print(curr+" ");
        vis[curr] = true;

        for(int i =0; i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dst] == false){
                dfs(graph, e.dst, vis);
            }
        }
    }

    //leet
    public static void allpathsfromsorcetotarget(ArrayList<Edge> graph[], boolean vis[], int curr, String path, int tar){
         if(curr == tar){
            System.out.println(path);
            return;
         }

         vis[curr] = true;
         for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dst]){
                String newPath = path + " -> " + e.dst;
                allpathsfromsorcetotarget(graph,vis,e.dst,newPath,tar);  
            }
         }
         vis[curr] = false;
    }

    public static void main(String[] args){
        int v =7;
        @SuppressWarnings("unchecked")
        /*
            1-------3
          /         | \
        0           |   5 -- 6
          \         |  / 
            2 ----- 4 
         */
        ArrayList<Edge> graph[] = new ArrayList[v];
        creategraph(graph);

        //when graph sre unconnected


        boolean[] vis = new boolean[v];
        /* 
        for(int i =0;i<v;i++){
            if(vis[i] == false){
                bfs(graph,v,vis,i);
            }
        }*/

        bfs(graph, v);
        System.out.println();
        dfs(graph, 0, vis);
        System.out.println();


        vis = new boolean[v];
        int soc = 0, dest = 5;
        allpathsfromsorcetotarget(graph, vis, soc, String.valueOf(soc), dest);
    }
}
