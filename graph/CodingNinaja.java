package graph;

public class CodingNinaja {
	 static char codingNinja[] = {'C', 'O', 'D', 'I', 'N', 'G', 'N', 'I', 'N', 'J', 'A'};

	    public static int solve(String[] graph, int N, int M) {
	        boolean visited[][] = new boolean[N][M];
	        for (int i = 0; i < graph.length; i++) {
	            for (int j = 0; j < graph[i].length(); j++) {
	                if (graph[i].charAt(j) == 'C') {
	                    int present = solveHelper(graph, N, M, i, j, 0, visited);
	                    if (present == 1) {
	                        return 1;
	                    }
	                }
	            }
	        }
	        return 0;
	    }

	    private static int solveHelper(String[] graph, int n, int m, int i, int j, int currentChar, boolean visited[][]) {
	        if (currentChar >= codingNinja.length){
	            return 1;
	        }
	        if (i < 0 || j < 0 || i >= graph.length || j >= graph[0].length() || visited[i][j] == true) {
	            return 0;
	        }
	        visited[i][j] = true;
	        if (graph[i].charAt(j) == codingNinja[currentChar]) {
	            int up = solveHelper(graph, n, m, i - 1, j, currentChar + 1, visited);
	            if (up == 1) {
	                return 1;
	            }
//	            visited[i-1][j] = false;
//	            visited[i+1][j] = true;
	            int down = solveHelper(graph, n, m, i + 1, j, currentChar + 1, visited);
	            if (down == 1) {
	                return 1;
	            }
//	            visited[i+1][j] = false;
//	            visited[i][j-1] = true;
	            int left = solveHelper(graph, n, m, i, j - 1, currentChar + 1, visited);
	            if (left == 1) {
	                return 1;
	            }
//	            visited[i][j-1] = false;
//	            visited[i][j+1] = true;
	            int right = solveHelper(graph, n, m, i, j + 1, currentChar + 1, visited);
	            if (right == 1) {
	                return 1;
	            }
//	            visited[i][j+1] = false;
//	            visited[i-1][j-1] = true;
	            int upleft = solveHelper(graph, n, m, i - 1, j - 1, currentChar + 1, visited);
	            if (upleft == 1) {
	                return 1;
	            }
//	            visited[i-1][j-1] = false;
//	            visited[i-1][j+1] = true;
	            int upright = solveHelper(graph, n, m, i - 1, j + 1, currentChar + 1, visited);
	            if (upright == 1) {
	                return 1;
	            }
//	            visited[i-1][j+1] = false;
//	            visited[i+1][j+1] = true;
	            int downright = solveHelper(graph, n, m, i + 1, j + 1, currentChar + 1, visited);
	            if (downright == 1) {
	                return 1;
	            }
//	            visited[i+1][j+1] = false;
//	            visited[i+1][j-1] = true;
	            int downleft = solveHelper(graph, n, m, i + 1, j - 1, currentChar + 1, visited);
	            if (downleft == 1) {
	                return 1;
	            }
//	            visited[i+1][j-1] = false;
	        }
	        visited[i][j] = false;
	        return 0;
	    }

}
