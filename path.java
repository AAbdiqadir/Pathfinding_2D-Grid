import java.util.ArrayList;
import java.util.List;

public class path {
	
	

	public  List<int[]> shortestPath(char[][] grid) {
		
		bfs Bfs = new bfs();
        ArrayList<int[]> path = new ArrayList<>();
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (grid[i][j] == 'S') {
                    Bfs.Bfs(grid, new Index(i, j), path);
                }
            }
        }
        return path;
    }
}
