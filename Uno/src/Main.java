import java.util.ArrayList;
import java.util.Scanner;

public class Main
	{
		//making a comment 
		//making another comment for homework 
		
		static Scanner userStringInput = new Scanner(System.in);
	    static Scanner userIntInput = new Scanner(System.in);
	    
	    static ArrayList<Card> oneDeck = new ArrayList<Card>();
		static ArrayList<Card> twoDeck = new ArrayList<Card>();
		static ArrayList<Card> threeDeck = new ArrayList<Card>();
		static ArrayList<Card> fourDeck = new ArrayList<Card>();
		static ArrayList<Card> discard = new ArrayList<Card>(); 
		static int currentPlayerNumber = 1;
		static boolean clockwise = true;
		
		static String playerName;
		static String playerOne;
		static String playerTwo;
		static String playerThree;
		static String playerFour;
		

		public static void main(String[] args)
			{
				
				

				
				System.out.println("Hello!! Let us play some uno! The amount of people to play is 4 ");
				System.out.println("What is player 1's name?");
				playerOne = userStringInput.nextLine();
				System.out.println("What is player 2's name?");
				playerTwo = userStringInput.nextLine();
				System.out.println("What is player 3's name?");
				playerThree = userStringInput.nextLine();
				System.out.println("What is player 4's name?");
				playerFour = userStringInput.nextLine();
				
				Deck.fill();
				Deck.shuffle();
				deal();
				start();
				while (oneDeck.size() > 1)
					{
						if (currentPlayerNumber == 1 || currentPlayerNumber == 5)
							{
								playerName = playerOne;
								play(oneDeck);
							}
						else if (currentPlayerNumber == 2 || currentPlayerNumber == 6)
							{
								playerName = playerTwo;
								play(twoDeck);
							}
						else if (currentPlayerNumber == 3 || currentPlayerNumber == -1)
							{
								playerName = playerThree;
								play(threeDeck);
							}
						else if (currentPlayerNumber == 4 || currentPlayerNumber == 0)
							{
								playerName = playerFour;
								play(fourDeck);
							}
						
					seeIfWin();
						
					}
				
				

			}
		public static void deal()
			{
				for (int i = 6; i >= 0; i --)
					{
						oneDeck.add(Deck.deck.get(0));
						Deck.deck.remove(0);
						twoDeck.add(Deck.deck.get(0));
						Deck.deck.remove(0);
						threeDeck.add(Deck.deck.get(0));
						Deck.deck.remove(0);
						fourDeck.add(Deck.deck.get(0));
						Deck.deck.remove(0);
					}
			}
	
		public static void start()
			{
				discard.add(Deck.deck.get(0));
				System.out.println("The top card in the deck is " + discard.get(discard.size() - 1).getColor() + " " + discard.get(discard.size() - 1).getIcon());
			}
		
		
		public static void play(ArrayList <Card> player) 
			{
				System.out.println("Top card in deck: " + discard.get(discard.size() - 1).getColor() + " " + discard.get(discard.size() - 1).getIcon());
				System.out.println();
				System.out.println(playerName + ", its your turn. Here is your deck. Type the number next to the card you would like to play. If you cannot play, and would like to draw, press an 8");
				for (int i = 0; i <= player.size() - 1; i ++)
					{
						System.out.println(i + 1 + ") " + player.get(i).getColor() + " " +  player.get(i).getIcon());
					}
				int card = userIntInput.nextInt();
				
				if (card == 8)
					{
						player.add(Deck.deck.get(0));
						Deck.deck.remove(0);
						//play(player);
					}
				else if (player.get(card - 1).getIcon().equals("reverse")) // REVERSE
					{
						discard.add(player.get(card - 1));
						if (clockwise == false) {
							clockwise = true;
							currentPlayerNumber += 1;
							}
						else if (clockwise == true) {
							clockwise = false;
							currentPlayerNumber -= 1;
						}
					}
				else if (player.get(card - 1).getIcon().equals("+2")) //PLUS TWO
					{
						if (currentPlayerNumber == 1 || currentPlayerNumber == 5)
							{
								if (clockwise == true)
									{
										for (int i = 0; i <= 1 ; i ++)
											{
												twoDeck.add(Deck.deck.get(i));
												Deck.deck.remove((i));
											}
									}
								else
									{
										for (int i = 0; i <= 1 ; i ++)
											{
												fourDeck.add(Deck.deck.get(i));
												Deck.deck.remove((i));
											}
									}
							}
						else if (currentPlayerNumber == 2 || currentPlayerNumber == 6)
							{
								if (clockwise == true)
									{
										for (int i = 0; i <= 1 ; i ++)
											{
												threeDeck.add(Deck.deck.get(i));
												Deck.deck.remove((i));
											}
									}
								else
									{
										for (int i = 0; i <= 1 ; i ++)
											{
												oneDeck.add(Deck.deck.get(i));
												Deck.deck.remove((i));
											}
									}
								
							}
						else if (currentPlayerNumber == 3 || currentPlayerNumber == -1)
							{
								if (clockwise == true)
									{
										for (int i = 0; i <= 1 ; i ++)
											{
												fourDeck.add(Deck.deck.get(i));
												Deck.deck.remove((i));
											}
									}
								else if (clockwise == false)
									{
										for (int i = 0; i <= 1 ; i ++)
											{
												twoDeck.add(Deck.deck.get(i));
												Deck.deck.remove((i));
											}
									}
								
							}
						else if (currentPlayerNumber == 4 || currentPlayerNumber == 0)
							{
								if (clockwise == true)
									{
										for (int i = 0; i <= 1 ; i ++)
											{
												oneDeck.add(Deck.deck.get(i));
												Deck.deck.remove((i));
											}
									}
								else {
									for (int i = 0; i <= 1 ; i ++)
										{
											threeDeck.add(Deck.deck.get(i));
											Deck.deck.remove((i));
										}
								}
						
							}
						discard.add(player.get(card - 1));
						if (clockwise == false)
							{
								currentPlayerNumber -= 2;
							}
						else if (clockwise == true)
							{
								currentPlayerNumber += 2;
							}
						
					}
				else if (player.get(card - 1).getIcon().equals("wild +4")) // PLUSFOUR
					{
						
						if (currentPlayerNumber == 1 || currentPlayerNumber == 5)
							{
								if (clockwise == true)
									{
										for (int i = 0; i <= 3; i ++)
											{
												twoDeck.add(Deck.deck.get(i));
												Deck.deck.remove((i));
											}
									}
								else
									{
										for (int i = 0; i <= 3; i ++)
											{
												fourDeck.add(Deck.deck.get(i));
												Deck.deck.remove((i));
											}
									}
							}
						else if (currentPlayerNumber == 2 || currentPlayerNumber == 6)
							{
								if (clockwise == true)
									{
										for (int i = 0; i <= 3; i ++)
											{
												threeDeck.add(Deck.deck.get(i));
												Deck.deck.remove((i));
											}
									}
								else
									{
										for (int i = 0; i <= 3; i ++)
											{
												oneDeck.add(Deck.deck.get(i));
												Deck.deck.remove((i));
											}
									}
								
							}
						else if (currentPlayerNumber == 3 || currentPlayerNumber == -1)
							{
								if (clockwise == true)
									{
										for (int i = 0; i <= 3; i ++)
											{
												fourDeck.add(Deck.deck.get(i));
												Deck.deck.remove((i));
											}
									}
								else if (clockwise == false)
									{
										for (int i = 0; i <= 3; i ++)
											{
												twoDeck.add(Deck.deck.get(i));
												Deck.deck.remove((i));
											}
									}
								
							}
						else if (currentPlayerNumber == 4 || currentPlayerNumber == 0)
							{
								if (clockwise == true)
									{
										for (int i = 0; i <= 3; i ++)
											{
												oneDeck.add(Deck.deck.get(i));
												Deck.deck.remove((i));
											}
									}
								else {
									for (int i = 0; i <= 3; i ++)
										{
											threeDeck.add(Deck.deck.get(i));
											Deck.deck.remove((i));
										}
								}
						
							}
						System.out.println("What color would you like to change the card to?");
						String colorPlusFour = userStringInput.nextLine();
						System.out.println("The color is now " + colorPlusFour + ".");
						discard.add(player.get(card - 1));
						if (clockwise == false)
							{
								currentPlayerNumber -= 2;
							}
						else if (clockwise == true)
							{
								currentPlayerNumber += 2;
							}
					}
				
				else if (player.get(card - 1).getIcon().equals("skip")) //SKIP
					{
						discard.add(player.get(card - 1));
						if (clockwise == false)
							{
								currentPlayerNumber -= 2;
							}
						else if (clockwise == true)
							{
								currentPlayerNumber += 2;
							}
					}
					
				else if (player.get(card - 1).getIcon().equals("wild")) // WILD
					{
						System.out.println("What color would you like to change the card to?");
						String colorPlusFour = userStringInput.nextLine();
						System.out.println("The color is now " + colorPlusFour + ".");
						discard.add(player.get(card - 1));
						if (clockwise == false)
							{
								currentPlayerNumber--;
							}
						else if (clockwise == true)
							{
								currentPlayerNumber++;
							}
					}
				else
					{
						if (clockwise == false)
							{
								currentPlayerNumber -= 1;
							}
						else if (clockwise == true)
							{
								currentPlayerNumber += 1;
							}
						discard.add(player.get(card - 1));
						player.remove(card - 1);
						
					}
				
				//discard.add(oneDeck.get(card - 1));
				//oneDeck.remove(card - 2); 
				
				System.out.println("The new topcard in the deck is " + discard.get(discard.size() - 1).getColor() + " "  + discard.get(discard.size() - 1).getIcon());
				
				
			}
		
		
		
		public static void seeIfWin()
		{
			if (oneDeck.size() == 1)
				{
					System.out.println(playerOne + " has UNO!");
				}
			else if (twoDeck.size() == 1)
				{
					System.out.println(playerTwo + " has UNO!");
				}
			else if (threeDeck.size() == 1)
				{
					System.out.println(playerThree + " has UNO!");
				}
			else if (fourDeck.size() == 1)
				{
					System.out.println(playerFour + " has UNO!");
				}
		}
		
		
		
		
		
		
		
	
			}
		