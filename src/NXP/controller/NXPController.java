package NXP.controller;
import java.util.Scanner;

public class NXPController 
{
	public int playerPoints;
	public int enemyPoints;
	
	public Boolean playGame = true;


	private Scanner userInput;
	private String [] fanboys = {"Nintendo", "Xbox", "Playstation"};
	
	public void start()
	{
		userInput = new Scanner(System.in);
		System.out.println("WELCOME TO FANBOY HEAVEN, TODAY WE ARE PLAYING NINTENDO FANBOYS VS XBOX FANBOYS VS PLAYSTATON FANBOYS. BE READY TO PICK A SIDE, AND RNG THE WAY TO THE TOP!!!!");
	System.out.println("Type 'Quit' to quit");
		
	
		playerPoints = 0;
		enemyPoints = 0;
		
		while( playGame == true)
		{
			if(playGame == true)
			{
				RPSGame();
			}
		}
			
		
		
	}
	
	
	public void RPSGame()
	{
		
		
		System.out.println("\nYour turn- \n Type: 'Nintendo' 'Xbox' 'Playstation' to choose a side!\n");
		String playerChoice = userInput.nextLine();

		if(playerChoice.equalsIgnoreCase("Quit"))
		{
			setPlayGame(false);
		}
		
		int choice = (int) (Math.random() * 3);
		
		String enemyChoice = fanboys[choice];
		
		
		//RPS part
		if(playerChoice == enemyChoice)
		{
			
			System.out.println("'Tie' \n You both picked " + playerChoice);
		}
		
		
		
		if(playerChoice.equalsIgnoreCase("Nintendo"))
		{
			if(enemyChoice.equalsIgnoreCase("Xbox"))
			{
				
				System.out.println("\nYou win as nintendo");
				System.out.println("They lose as xbox");
				
				playerPoints++;
				
				
			}
		}
		
		if(playerChoice.equalsIgnoreCase("Xbox"))
		{
			if(enemyChoice.equalsIgnoreCase("Nintendo"))
			{
				
				System.out.println("\nYou lose as xbox");
				System.out.println("They win as nintendo");
				
				enemyPoints++;
				
				
			}
		}
		
		
		
		
		if(playerChoice.equalsIgnoreCase("Playstation"))
		{
			if(enemyChoice.equalsIgnoreCase("Nintendo"))
			{
				
				System.out.println("\nYou win as Playstation");
				System.out.println("They lose as Nintendo");
				
				
				playerPoints++;
			}
		}
		
		
		
		
		if(playerChoice.equalsIgnoreCase("Nintendo"))
		{
			if(enemyChoice.equalsIgnoreCase("Playstation"))
			{
				
				System.out.println("\nYou lose as Nintendo");
				System.out.println("They win as Playstation");
				
				enemyPoints++;
			}
		}
		
		
		if(playerChoice.equalsIgnoreCase("Xbox"))
		{
			if(enemyChoice.equalsIgnoreCase("Playstation"))
			{
				
				System.out.println("\nYou win as xbox");
				System.out.println("They lose as Playstation");
				
				playerPoints++;
			}
		}
		
		if(playerChoice.equalsIgnoreCase("Playstation"))
		{
			if(enemyChoice.equalsIgnoreCase("Xbox"))
			{
				
				System.out.println("\nYou lose as playstation");
				System.out.println("They win as xbox");
				
				enemyPoints++;
			}
		}
		
		if(playGame == false)
		{
			System.out.println("\n\n\n\nDont worry, your score doesnt really matter, your fight was trash anyways. \nAt least we got your ending score.");
		}
		
		
		System.out.println("Score:  You:" + playerPoints + "   Enemy:" + enemyPoints);
		
	}
	
	public Boolean getPlayGame() {
		return playGame;
	}


	public void setPlayGame(Boolean playGame) {
		this.playGame = playGame;
	}
}
