import java.util.Scanner;

class Menu
{

	Scanner keyboard = new Scanner(System.in);


	public Menu()
	{

	}

	public void startGame()
	{
		/// This comment is meaningless
		System.out.print("Enter your name: ");
		String pName = keyboard.next();
		String[] i = new String[8];
		for (int x = 0; x < i.length; x++)
		{
			i[x] = "empty"; 
		}
		Player p = new Player(pName, 14, 4, 10, i);
		while (1 > 0)	
		{	
			System.out.println("Battle | Shop | Quit");
			String command = keyboard.next();
			if (command.equals("Battle"))
			{
				Fight test = new Fight();
				p = test.battle(p.getName(), p.getHealth(), p.getAttack(), p.getGold(), p.getInventory());
			}
			else if (command.equals("Shop"))
			{
				Shop test = new Shop();
				p = test.buy(p.getName(), p.getHealth(), p.getAttack(), p.getGold(), p.getInventory());
			}
			else if (command.equals("Quit"))
			{
				System.exit(0);
			}
			else
			{
				System.out.println("Please enter a valid command.");
			}
		}
	}

}
