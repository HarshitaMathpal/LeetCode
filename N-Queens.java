class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
		N_Queen(board, n, 0,list);
        return list;
		// System.out.println();
		// System.out.println(c);
	}

	public static void N_Queen(boolean[][] board, int tq, int row,List<List<String>> list) {
		if (tq == 0) {
			Display(board,list);
			// c++;
			return;
		}
		for (int col = 0; col < board.length; col++) {
			if (issafe(board, row, col) == true) {
				board[row][col] = true;
				N_Queen(board, tq - 1, row + 1,list);
				board[row][col] = false;
			}

		}

	}

	public static boolean issafe(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub

		int r = row;
		// vertical
		while (r >= 0) {
			if (board[r][col] == true) {
				return false;
			}
			r--;
		}

		// left Diagonal
		r = row;
		int c = col;
		while (r >= 0 && c >= 0) {
			if (board[r][c] == true) {
				return false;
			}
			c--;
			r--;
		}
		// left Diagonal
		r = row;
		c = col;
		while (r >= 0 && c < board.length) {
			if (board[r][c] == true) {
				return false;
			}
			c++;
			r--;
		}
		return true;
	}

	private static void Display(boolean[][] board,List<List<String>> list) {
		// TODO Auto-generated method stub
		// int c =0;
        List<String> l = new ArrayList<>();
        
		for (int i = 0; i < board.length; i++) {
            String temp = "";
			for (int j = 0; j < board.length; j++) {
				if(board[i][j]){
					temp += "Q";
				}
                else{
                    temp += ".";
                }
			}
			// System.out.println();
            l.add(temp);
		}
        
        list.add(l);

    }
}
