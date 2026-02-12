import java.util.Scanner;
public class Main1 {
    static int top=-1;
    static  int[][] matrix= new int[4][4];
    static int[] newnode =new int[10];
    static int[] DFS =new int[10];
    static Scanner in= new Scanner(System.in);
    public static void Making_matrix(int row,int column)
    {
        System.out.println("Making a matrix: ");

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
            matrix[i][j]=in.nextInt();
            }
        }
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<column;j++)
        {
            System.out.print(matrix[i][j]);
        }
        System.out.println("");
    }
}

    public static void Visited_Graph(int Starting_node,int row,int column)
    {
        DFS[top++]=Starting_node;
        newnode[Starting_node]=1;
        while(top!=1)
        {
            int team=DFS[top];
            System.out.println(team);
            top--;
            for(int i=0;i<column;i++)
            {
                if(matrix[team][i] == 1 && newnode[i] != 1)
                {
                DFS[top++]= i;
                newnode[i]=1;
                }
            }
        }
    }

    public static void main(String[] args) {
        int row;
        int column;
        System.out.println("Enter the number of rows: ");
        row=in.nextInt();
        column=row;
        Making_matrix(row, column);
        int starting_node;
        System.out.println("Enter Starting node: ");
        starting_node=in.nextInt();
        Visited_Graph(starting_node,row,column);
    }

    
}
