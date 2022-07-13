import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;


public class bfs{
	public void Bfs(char[][] grid, Index start, List<int[]> path) {

         int[] xDirections = new int[] {0,0,1, -1};
          int[] yDirections = new int[] {1,-1, 0, 0};

            Queue<Index> Queue = new LinkedList<>();
            Queue.add(start);
            HashMap<Index, Index> parentMap = new HashMap<>();
            boolean[][] visited = new boolean[grid.length][grid[0].length];
            Index endCell = null;
            while(!Queue.isEmpty()) {
                boolean flag = false;
                Index from = Queue.poll();

                for (int k = 0; k < xDirections.length; ++k) {
                    int nextX = from.row + xDirections[k];
                    int nextY = from.col + yDirections[k];

                    if (nextX < 0 || nextX >= grid.length || nextY < 0 
                            || nextY >= grid[0].length || grid[nextX][nextY] == '1' 
                            || visited[nextX][nextY]) {
                        continue;
                    }

                    visited[nextX][nextY] = true;
                    Index nextCell = new Index(nextX, nextY);
                    Queue.add(nextCell);
                   
                    parentMap.put(nextCell, from);
                   
                    if (grid[nextX][nextY] == 'D') {
                        endCell = new Index(nextX, nextY);
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    break;
                }
                
            }
            Stack<Index> stack = new Stack<>();
            stack.push(endCell);

         
            while (true) {
            	Index fromCell = parentMap.get(endCell);
                stack.push(fromCell);
                if (fromCell == start) break;
                endCell = fromCell;
            }

            while (!stack.isEmpty()) {
            	Index p = stack.pop();
                path.add(new int[] {p.row, p.col});
            }
    }

   
}
