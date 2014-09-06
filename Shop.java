import java.util.Scanner;

class Shop
{

	Scanner keyboard = new Scanner(System.in);
	
	public Shop()
	{

	}

	public Player buy(String n, int h, int a, int g, String[] i)
	{
		Player p = new Player(n, h, a, g, i);
		String command = "";
		while (!command.equals("Exit")){
			System.out.println("You have " + p.getGold() + " gold.");
			System.out.println("Herb     8 gold");
			System.out.println("Exit");
			System.out.print("Select an item: ");
			command = keyboard.next();
			if (command.equals("Herb"))
			{
				if (p.getGold() > 7)
				{
					p.addInventory("Herb");
					p.addGold(-8);
				}
				else
				{
					System.out.println("You can't afford that.");
				}
			}
			else if (!command.equals("Exit"))
			{
				System.out.println("Enter the name of the item you want to buy.");
			}
		}
		return p;
	}
}
