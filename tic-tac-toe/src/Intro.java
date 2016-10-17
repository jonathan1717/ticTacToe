import java.util.Scanner;

public class Intro
	{

		
public static void greeting()
	{
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		print("What is your name?");
		String name = userInput.nextLine();
		print("Hello " + name + " and welcome to tic-tac-toe!");
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
	}
