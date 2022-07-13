import java.util.*;
import java.util.Queue;


public class main {

    public static void main(String[] args) {
        char[][] grid = {{'S', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
                         {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
                         {'0', '0', '0', '0', '1', '0', '0', '0', '0', '0'},
                         {'0', '0', '0', '0', '0', '1', '1', '0', '0', '0'},
                         {'0', '1', '0', '0', '0', '0', '0', '0', '1', '0'},
                         {'1', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
                         {'0', '0', '1', '0', '1', '1', '0', '0', '0', '0'},
                         {'0', '1', '0', '0', '0', '0', '0', '1', '1', '1'},
                         {'0', '0', '0', '1', '0', '0', '0', '1', '0', '0'},
                         {'0', '1', '1', '0', '0', '0', '0', '0', '0', 'D'}};

       path Path = new path();
        List<int[]> Path_ = Path.shortestPath(grid);

         System.out.println("Distance:" + (Path_.size() - 1));
         System.out.print("Direction: ");
            Path_.stream().forEach(i -> {
                System.out.print("{" + i[0] + "," + i[1] + "}");
            });
            
    }

  

}