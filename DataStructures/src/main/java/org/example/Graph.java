package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Graph {
    private final ArrayList<ArrayList<Integer>> graph;

    private final int v;

    private final boolean[] visited;
    private final boolean[] parents;


    Graph(int nodes){
        v =nodes;
        visited = new boolean[v];
        parents = new boolean[v];

        graph = new ArrayList<>();
        for(int i =0;i<v;i++){
            graph.add(new ArrayList<>());
        }
    }

    void addEdge(int v, int u){
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    void addDirectedEdge(int from, int to){
        graph.get(from).add(to);
    }

    void printGraph(){
        for(int i =0;i<v;i++){
            System.out.print("Node "+ i+ " -> ");
            System.out.println(graph.get(i));
        }
    }

    void BFS(int v){
        QueueListBased toBeVisited = new QueueListBased();
        ArrayList<Integer> visited = new ArrayList<>();
        if (v >= graph.size()){
            throw new IndexOutOfBoundsException("this node doesn't exist");
        }else{
            toBeVisited.enqueue(v);
            visited.add(v);
            while(!toBeVisited.isEmpty()){
                int list = toBeVisited.dequeue();
                System.out.println(list);
                    for (int i = 0; i < graph.get(list).size(); i++) {
                        int currentElement= graph.get(list).get(i);
                        if (visited.contains(currentElement)) continue;
                        visited.add(currentElement);
                        toBeVisited.enqueue(currentElement);
                    }

            }
        }
    }



    void DFS(int v){
        if(visited[v]) return;
        visited[v] = true;
        System.out.println(v);
        ArrayList<Integer> list = graph.get(v);
        for (Integer integer : list) {
            DFS(integer);
        }
    }



    List<Integer> getShortestPath(int node,int end){

        int[] prev= new int[graph.size()];
        Arrays.fill(prev,-1);
        boolean[] visited = new boolean[graph.size()];
        Queue waiting = new Queue(graph.size());

        waiting.enqueue(node);
        visited[node] = true;
        while(!waiting.isEmpty()){
            int currentNode = waiting.dequeue();
            ArrayList<Integer> neighbours = graph.get(currentNode);
            for(int next: neighbours ){
                if(!visited[next]){
                    waiting.enqueue(next);
                    visited[next] = true;
                    prev[next]=currentNode;

                }
            }
        }

        return reconstructPath(node,end, prev);
    }


    ArrayList<Integer> reconstructPath(int start, int end, int[] prev){
        ArrayList<Integer> path = new ArrayList<>(graph.size());
        for (int i = end; i != -1 ; i = prev[i]) {
            path.add(i);
        }
        Collections.reverse(path);
        if (path.getFirst() == start) return path;
        return new ArrayList<>();
    }



    boolean isCyclic(int node){
        if(parents[node]) return true;
        visited[node] = true;
        parents[node] = true;
        ArrayList<Integer> nodes =graph.get(node);
        for(int n: nodes){
            if(!visited[n] && isCyclic(n)) return true;
            else if(parents[n]) return true;
        }
        parents[node] = false;
        return false;


    }

    public boolean isCyclicUndirected(int node){
        return isCyclic(node, visited,-1);
    }

    private boolean isCyclic(int node, boolean[] visited, int parent) {
        visited[node] = true;

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                if (isCyclic(neighbor, visited, node))
                    return true;
            } else if (neighbor != parent) {
                return true;
            }
        }
        return false;
    }



}


