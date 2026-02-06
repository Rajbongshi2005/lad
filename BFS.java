import java.util.Scanner;
public class BFS {
	static int[][] matrix = new int[10][10];
	static int [] visited = new int[10];
	static int[] BFS = new int[10];
	static int head=-1,tail=-1;
	static Scanner in = new Scanner(System.in);
	public static void making_matrix(int row, int column) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
					matrix[i][j] = in.nextInt();
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}
	}
	public static void Visited_Graph(int start_node, int row, int column) {
		if(head==-1)
		{
			BFS[++head] =start_node;
		}
		BFS[++tail] = start_node;
		visited[start_node] = 1;

		while (head <= tail) {
			int team = BFS[head++];
			System.out.print( team+ "  ");

			for (int i = 0; i < column; i++) {
				if (matrix[team][i] == 1 && visited[i] != 1) {
					BFS[++tail] = i;
					visited[i] = 1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the adjacency matrix:");
        int column;
        int row;
        System.out.println("Enter the number of rows:");
        row = in.nextInt();
		column = row;
		making_matrix(row,column);
		int start_node;
		System.out.println("Enter the starting node:");
		start_node = in.nextInt();
		System.out.println("BFS Traversal:");
		Visited_Graph(start_node, row, column);

	}
}