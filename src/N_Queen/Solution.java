package N_Queen;

import java.util.Scanner;

public class Solution {
//	public static int inputRow = 0;
//	public static int inputCol = 0;
//	public static int[][] pos = new int[10][10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int inputRow = sc.nextInt();
//		int inputCol = sc.nextInt();
		int n = sc.nextInt();
		
		System.out.println(solveNQueen(n));
		
		
	}
	
	class Position{
		int row, col;
		Position(int row, int col){
			this.row = row;
			this.col = col;
		}
	}
	
	public static Position[] solveNQueen(int n) {
		Position[] positions = new Position[n];
		boolean hasSolution = DFS(n, 0, positions);
		if(hasSolution) {
			return positions;
		} else {
			return new Position[0];
		}
	}
	
	public static boolean DFS(int n, int row, Position[] positions) {
		if(n == row) {
			return true;
		}
		int col;
		for(col = 0; col< n; col++) {
			boolean foundSafe = true;
			
			//check if this row and col is not under attack from any previous queen
			for(int queen=0; queen<row; queen++) {
				if(positions[queen].row == col ||  
						positions[queen].row - positions[queen].col == row - col ||
						positions[queen].row + positions[queen].col == row + col) {
					foundSafe = false;
					break;
					
				}
			}
			if(foundSafe) {
				positions[row] = new Position(row, col);
				if(DFS(n,row+1, positions)) {
					return true;
				}
			}
		}
		return false;
	}
}
