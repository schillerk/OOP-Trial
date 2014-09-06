class Player
{
	private String name;
	private int health;
	private int attack;
	private int gold;
	private String[] inventory;

	public Player()
	{
		name = "nameless";
		health = 0;
		attack = 0;
		gold =0;
		inventory = null;
	}

	public Player(String n, int h, int a, int g, String[] i)
	{
		name = n;
		health = h;
		attack = a;
		gold = g;
		inventory = i;
	}

	public void addDamage(int damage)
	{
		health -= damage;
	}

	public void setHealth(int h)
	{
		health = h;
	}

	public void addGold(int g)
	{
		gold += g;
	}

	public void addInventory(String i)
	{
		for (int x = 0; x < inventory.length; x++)
		{
			if (inventory[x].equals("empty"))
			{
				inventory[x] = i;
				x += 10;
			}
		}
		System.out.println(i + " was added to inventory.");
	}

	public String getName()
	{
		return name;
	}

	public int getHealth()
	{
		return health;
	}

	public int getAttack()
	{
		return attack;
	}

	public int getGold()
	{
		return gold;
	}

	public String[] getInventory()
	{
		return inventory;
	}
}