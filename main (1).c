// Online C compiler to run C program online
#include <stdio.h>
int top=-1;
int matrix[4][4];
int newnode[10];
int DFS[10];

void Making_matrix(int row,int column)
{
	printf("Making a matrix: ");

	for(int i=0; i<row; i++)
	{
		for(int j=0; j<column; j++)
		{
			scanf("%d",&matrix[i][j]);
		}
	}
	for(int i=0; i<row; i++)
	{
		for(int j=0; j<column; j++)
		{
			printf("%d",matrix[i][j]);
		}
		printf("\n");
	}
}
void Visited_Graph(int Starting_node,int row,int column)
{
	DFS[top++]=Starting_node;
	newnode[Starting_node]=1;
	while(top!=1)
	{
		int team=DFS[top];
		printf("%d",team);
		top--;
		for(int i=0; i<column; i++)
		{
			if(matrix[team][i] == 1 && newnode[i] != 1)
			{
				DFS[top++]= i;
				newnode[i]=1;
			}
		}
	}
}


int main() {
	int row;
	int column;
	printf("Enter the number of rows: ");
	scanf("%d",&row);
	column=row;
	Making_matrix(row, column);
	int starting_node;
	printf("Enter Starting node: ");
	scanf("%d",&starting_node);
	Visited_Graph(starting_node,row,column);

	return 0;
}