
public class ticTacToeBoard
	{

		public static void main(String[] args)
			{
				displayBoard();
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
						System.out.println();
					}
				public static void displayBoard()
				{
					print("\n      1    2    3");      
					print("   |--------------|");
					print("A  |    |    |    |");
					print("   |--------------|");
					print("B  |    |    |    |");
					print("   |--------------|");
					print("C  |    |    |    |");
					print("   |--------------|");
				}
				
	}
	

	

