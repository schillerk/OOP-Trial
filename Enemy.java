class Enemy
{
	private String name;
	private int health;
	private int attack;
	private int gold;

	public Enemy()
	{
		name = "nameless";
		health = 0;
		attack = 0;
		gold = 0;
	}

	public Enemy(String n, int h, int a, int g)
	{
		name = n;
		health = h;
		attack = a;
		gold = g;
	}

	public void addDamage(int damage)
	{
		health -= damage;
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
}