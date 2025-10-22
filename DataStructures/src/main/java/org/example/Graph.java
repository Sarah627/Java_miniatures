package org.example;

import java.util.ArrayList;

public class Graph {
    private ArrayList<ArrayList<Integer>> graph;

    int v;


    Graph(int nodes){
        v =nodes;
        graph = new ArrayList<>();
        for(int i =0;i<v;i++){
            graph.add(new ArrayList<>());
        }
    }

    void addEdge(int v, int u){
        graph.get(u).add(v);
        graph.get(v).add(u);
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

}
