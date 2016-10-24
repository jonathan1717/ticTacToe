public class ai
{
	static int row = 0;
	static int column = 0;
		public static void opponentMove() 
			{
				Game.print("It is your opponent's move.");
				generateOpponentMove();
				Board.display();
			}
		
		public static void generateOpponentMove() 
			{
				int row=(int) (Math.random()*3);
				int column=(int) (Math.random()*3);
					if (Board.board[row][column].equals(" "))
							{
								placePiece(row,column);
							}
					else
						{
							generateOpponentMove();
						}
			}
		public static void placePiece(int r, int c) 
			{
				Board.board[r][c]="O";
			}
} 