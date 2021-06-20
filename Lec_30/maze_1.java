package Lec_30;

public class maze_1 {
	public static void main(String[] args) {
//		int[][] maze = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };
//		maze_bl(maze, 0, 0, "", new boolean[4][4]);
		char[][] maze = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word = "SEE";
		for(int i=0;i<maze.length;i++) {
			for(int j=0;j<maze[0].length;j++) {
				if(maze[i][j]==word.charAt(0)) {
//					System.out.println(i+ " : "+ j);
//					word_maze(maze, i, j, 0, word, new boolean [maze.length][maze[0].length]);
//					System.out.println();
					findWord(maze, i, j, new boolean [maze.length][maze[0].length], "", word);
				}
			}
		}
	
	}

	public static void maze_bl(int[][] maze, int row, int col, String ans, boolean[][] visited) {
		if (row == maze.length - 1 && col == maze[0].length - 1) { // +ve BC
			System.out.println(ans);

			return;
		}

		if (row == -1 || row == maze.length || col == -1 || col == maze[0].length || maze[row][col] == 1
				|| visited[row][col]) {
			// -ve BC
			return;
		}
//		System.out.println("("+row+","+col+")" );
		visited[row][col] = true;
		// U
		maze_bl(maze, row - 1, col, ans + "U", visited);
		// D
		maze_bl(maze, row + 1, col, ans + "D", visited);
		// L
		maze_bl(maze, row, col - 1, ans + "L", visited);
		// R
		maze_bl(maze, row, col + 1, ans + "R", visited);
		visited[row][col] = false;
	}

	public static void word_maze(char[][] maze, int row, int col, int index, String word, boolean[][] visited) {

		if (row == -1 || row == maze.length || col == -1 || col == maze[0].length
				|| maze[row][col] != word.charAt(index) || visited[row][col]) {
			// -ve BC
			
			return;
		}
//		System.out.println(maze[row][col] + " : "+ word.charAt(index));
		// index == word.lenght -1;
		if(index==word.length()-1) {
			System.out.println("TRUE");
			return;
		}
		
		visited[row][col] = true;
		// U
		word_maze(maze, row - 1, col, index+1, word, visited);
		// D
		word_maze(maze, row + 1, col, index+1, word, visited);
		// L
		word_maze(maze, row, col - 1, index+1, word, visited);
		// R
		word_maze(maze, row, col + 1, index+1, word, visited);

		visited[row][col] = false;
	}
	
	public static void findWord(char arr[][], int row, int col, boolean visited[][], String ans, String word){
	   
	    if(row==arr.length || row==-1 || col==arr[0].length || col==-1 || visited[row][col]==true){
	        return ;
	    }
	    char ch =  word.charAt(0);
	    
	    if(arr[row][col]==ch){
	    	 if(word.length()==1){
	 	    	System.out.println(ans+ch);
	 	    	
	 	        return;
	 	    }
	    	 
		    visited[row][col]=true;
	    	findWord(arr, row-1, col, visited, ans+ch, word.substring(1));
	        findWord(arr, row+1, col, visited, ans+ch, word.substring(1));
	        findWord(arr, row, col-1, visited, ans+ch, word.substring(1));
	        findWord(arr, row, col+1, visited, ans+ch, word.substring(1));
	        visited[row][col] = false;
	       
	        return ;
	    }
	    else{
	        
	        return ;
	    }
	}
}
