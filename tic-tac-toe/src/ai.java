
public class ai
	{
static int row = 0;
static int column = 0;
		public static void opponentDialogue()
			{
				Game.print("It is your opponent's move.");
				opponentPlacePiece();
				Board.display();
			}
		
		public static void opponentPlacePiece()
		{
			int row=(int) (Math.random()*3);
			int column=(int) (Math.random()*3);
			if (Board.board[row][column].equals(" "))
				{
				Board.board[row][column]="O";
				}
		}
}

