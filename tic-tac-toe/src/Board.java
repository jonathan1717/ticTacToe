
public class Board
	{
		static String[][] board = new String [3][3];
		
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
				public static void display()
				{
					print("\n       1    2    3");      
					print("   |-----------------|");
					print("A  |  " + board[0][0] +  "  |  " + board[0][1] + "  |  " + board[0][2] + "  |");
					print("   |-----------------|");
					print("B  |  " + board[1][0] +  "  |  " + board[1][1] + "  |  " + board[1][2] + "  |");
					print("   |-----------------|");
					print("C  |  " + board[2][0] +  "  |  " + board[2][1] + "  |  " + board[2][2] + "  |");
					print("   |-----------------|");
					System.out.println();
				}
				
				public static void fillEmptySpaces()
					{
						for (int row =0; row< 3; row++)
							{
								for (int col =0; col< 3; col++)
									{
										board[row][col]=" ";
									}
							}
					}
	}

