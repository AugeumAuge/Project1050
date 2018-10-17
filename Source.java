import java.util.Scanner;
public class Source
{
	public static void adventure(String weapon, int damage)
	{
		//Dragon story goes here
		System.out.println("Dragon things"); //test
		damage *= 1.5;
	}
	
	public static void adventure(int damage, String weapon)
	{
		//Goblin story goes here
		System.out.println("Goblin things"); //test
	}
	
	
	public static void main(String[]args)
	{
		System.out.println("EXPOSITION");
		System.out.println("What is your name brave adventurer!");
		Scanner reader = new Scanner(System.in);
		String name = reader.nextLine();
		System.out.println("Welcome " + name + ", stuff");
		System.out.println("Now quickly, grab a weapon!");
		System.out.println("Before you lie a pile of weapons. Within the pile you");
		System.out.println("can see a Bow, a Sword, and a Staff. Which do you grab?");
		System.out.println("1. Bow");
		System.out.println("2. Sword");
		System.out.println("3. Staff");
		System.out.println("4. These Hands");
		String weapon = "x";
		int damage = 1;
		int choice;
		boolean test = true;
		while(test == true)
		{
		 choice = reader.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Good choice. Now we can begin!");
			weapon = "Bow";
			damage = 6;
			test = false;
			break;
		case 2:
			System.out.println("Good choice. Now we can begin!");
			weapon = "Sword";
			damage = 8;
			test = false;
			break;
		case 3:
			System.out.println("Good choice. Now we can begin!");
			weapon = "Staff";
			damage = 3;
			test = false;
			break;
		case 4:
			System.out.println("Okay... I guess we'll start.");
			weapon = "These Hands";
			damage = 4;
			test = false;
			break;
		default:
			System.out.println("wrong Entry, Try again.");
			
		}
		}
		test = true;
		System.out.println("We do not have much time, you will need to choose");
		System.out.println("what we do. Do we fight the dragon and save the princess");
		System.out.println("or defeat the goblin king and his relentless minions.");
		System.out.println("1. Dragon");
		System.out.println("2. Goblin King");
		
		while(test == true)
		{
		choice = reader.nextInt();
		if(choice == 1)
		{
			//Call Dragon Method
			adventure(weapon, damage);
			test = false;
		}
		else if(choice == 2)
		{
			//Call Goblin Method
			adventure(damage, weapon);
			test = false;
		}
		else
		{
			System.out.println("wrong Entry, Try again.");
		}
		}
		test = true;
		System.out.println("EXPOSITION");
		System.out.println("How do you plead to these charges?");
		System.out.println("1. Not Guilty");
		System.out.println("2. Guilty");
		System.out.println("3. I want my lawyer");
		System.out.println("4. Nothing");
		
		while(test == true)
		{
		choice = reader.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("JAIL");
			// exposition to be added later
			test = false;
			break;
		case 2:
			System.out.println("JAIL");
			// exposition to be added later
			test = false;
			break;
		case 3:
			System.out.println("JAIL");
			// exposition to be added later
			test = false;
			break;
		case 4:
			System.out.println("JAIL");
			// exposition to be added later
			test = false;
			break;
		default:
			System.out.println("wrong Entry, Try again.");
		}
		}
		test = true;
		
	}

}


