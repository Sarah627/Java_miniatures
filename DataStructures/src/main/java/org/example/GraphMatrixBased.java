package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class GraphMatrixBased {

    public class Cell{
    int r, c;
    int value;
    boolean wall;

    ArrayList<Cell> neighbors = new ArrayList<>();

        Cell(int r, int c, int value, boolean wall) {
            this.r = r;
            this.c = c;
            this.value = value;
            this.wall = wall;
        }

        Cell(int r, int c, boolean wall) {
            this.r = r;
            this.c = c;
            this.wall = wall;
        }

    }



    private final Cell[][] grid;
    private final int rows, cols;



    public GraphMatrixBased(int rows, int cols, int[][] map) {
        this.rows = rows;
        this.cols = cols;
        grid = new Cell[rows][cols];



        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                boolean isWall = map[r][c] == 1;
                grid[r][c] = new Cell(r, c, map[r][c], isWall);
            }
        }


        buildNeighbors();
    }


    private void buildNeighbors() {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                Cell cur = grid[r][c];
                if (cur.wall) continue;

                if (r > 0 && !grid[r - 1][c].wall)
                    cur.neighbors.add(grid[r - 1][c]);

                if (r < rows - 1 && !grid[r + 1][c].wall)
                    cur.neighbors.add(grid[r + 1][c]);

                if (c > 0 && !grid[r][c - 1].wall)
                    cur.neighbors.add(grid[r][c - 1]);

                if (c < cols - 1 && !grid[r][c + 1].wall)
                    cur.neighbors.add(grid[r][c + 1]);
            }
        }
    }

     Cell getCell(int r, int c){
        return grid[r][c];
    }

    public void DFS(Cell start){
        boolean[][] visited=new boolean[rows][cols];
        DFS(start,visited);
    }

    private void DFS(Cell start, boolean[][] visited){
        if(visited[start.r][start.c]) return;
        visited[start.r][start.c]=true;
        System.out.println("Cell ( "+start.r+" , "+start.c+" )");
        visited[start.r][start.c]=true;
        for(Cell neighbor :start.neighbors){
            DFS(neighbor,visited);
        }

    }



    public List<Cell> getShortestPath(Cell start, Cell end){

        Cell[][] prev= new Cell[rows][cols];
        boolean[][] visited = new boolean[rows][cols];
        GenericArrayBasedQueue<Cell> waiting = new GenericArrayBasedQueue<>(rows * cols);

        waiting.enqueue(start);
        visited[start.r][start.c]=true;
        while(!waiting.isEmpty()){
            Cell currentNode = waiting.dequeue();
            if (currentNode == end) break;
            for(Cell next: currentNode.neighbors ){
                if(!visited[next.r][next.c]){
                    waiting.enqueue(next);
                    visited[next.r][next.c] = true;
                    prev[next.r][next.c]=currentNode;

                }
            }
        }

        return reconstructPath(start,end, prev);
    }


    ArrayList<Cell> reconstructPath(Cell start, Cell end, Cell[][] prev){
        ArrayList<Cell> path = new ArrayList<>(grid.length);
        for (Cell i = end; i != null; i = prev[i.r][i.c]) {
            path.add(i);
        }
        Collections.reverse(path);
        if (!path.isEmpty() && path.getFirst() == start)
            return path;
        return new ArrayList<>();
    }

}
