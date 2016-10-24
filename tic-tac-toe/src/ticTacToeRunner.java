
public class ticTacToeRunner
	{
		static boolean keepPlaying = true;
		
		public static void main(String[] args)
			{
				Board.fillEmptySpaces();
				
				Game.greeting();
				
				while (keepPlaying)
					{
						Game.takeMovePlayer();
						Game.checkIfWon();
						ai.opponentDialogue();
						Game.checkIfWon();
					}
				
			}


	}
