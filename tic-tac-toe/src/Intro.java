import java.util.Scanner;
	
public class Intro
{	
		static int row,column;	
		
		
	public static void greeting()
	{
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		print("What is your name?");
		String name = userInput.nextLine();
		print("Hello " + name + " and welcome to tic-tac-toe!");
		Board.display();
	}
	
	public static void print(String s)  
			{
				for(int i = 0; i < s.length(); i++)
					{
						System.out.print(s.substring(i, i+1));
						try
							{
								Thread.sleep(5);
							}
								catch (InterruptedException e)
							{
								e.printStackTrace();
							}
					}
			}

	public static void takeMove()
		{
			@SuppressWarnings("resource")
			Scanner userInput = new Scanner(System.in);
			print(" Please type in the first coordinates of your first move (e.g. a1)");
			String move = userInput.nextLine();
			switch (move.substring(0,1))
					{
						case "A":
						case "a":
								{
									row = 0;
									break;
								}
						case "B":
						case "b":
								{
									row = 1;
									break;
								}
						case "C":
						case "c":
								{
									row = 2;
									break;
								}
					}
			column = Integer.parseInt(move.substring(1)) - 1;
			Board.board[row][column]="X";
				
			Board.display();
			
		}
}
