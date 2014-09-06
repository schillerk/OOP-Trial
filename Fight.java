import java.util.Scanner;

class Fight
{

	Scanner keyboard = new Scanner(System.in);

	public Fight()
	{

	}

	public Player battle(String n, int h, int a, int g, String[] i)
	{
		Player p = new Player(n, h, a, g, i);
		Enemy e = new Enemy("Wolf", 7, 3, 6);
		System.out.println("The battle has begun!");
		String command = "";

		while (p.getHealth() > 0 && e.getHealth() > 0)
		{
			command = "";
			System.out.println("Attack | Item");
			command = keyboard.next();

			if (command.equals("Attack"))
			{
				p.addDamage(e.getAttack());
				System.out.println("You have taken " + e.getAttack() + " damage!");
				e.addDamage(p.getAttack());
				System.out.println("The enemy has taken " + p.getAttack() + " damage!");
			}

			else if (command.equals("Item"))
			{
				System.out.println("\nInventory: ");
				for (int x = 0; x < i.length; x++)
				{
					System.out.println(i[x]);
				}
				boolean done = false;
				while (!done)
				{
					int y = -1;
					System.out.print("Use item: ");
					command = keyboard.next();
					for (int x = 0; x < i.length; x++)
					{
						if (i[x].equals(command))
						{
							y = x;
						}
					}
					done = true;
					if (y == -1)
					{
						System.out.println("You don't have that item.");
						done = false;
					}
					else
					{
						if (command.equals("Herb"))
						{
							p.addDamage(-10);
							if (p.getHealth() > 14)
							{
								p.setHealth(14);
							}
						}
						i[y] = "empty";
					}
				}
			}

			else
			{
				System.out.println("Please enter a valid command.");
			}

			
			if (p.getHealth() < 1)
			{
				System.out.println("Game Over!!! Game Over!!! Game Over!!!");
				System.out.println("Game Over!!! Game Over!!! Game Over!!!");
				System.out.println("Game Over!!! Game Over!!! Game Over!!!");
				System.exit(0);
			}
		}
		p.addGold(e.getGold());
		System.out.println("You won the battle!");
		System.out.println(p.getName() + "\n" + "Health: " + p.getHealth() + "   Gold: " + p.getGold());
		return p;
	}
}
