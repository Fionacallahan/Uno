import java.util.ArrayList;
import java.util.Scanner;

public class Main
	{
		//making a comment 
		
		static Scanner userStringInput = new Scanner(System.in);
	    static Scanner userIntInput = new Scanner(System.in);
	    
	    static ArrayList<Card> oneDeck = new ArrayList<Card>();
		static ArrayList<Card> twoDeck = new ArrayList<Card>();
		static ArrayList<Card> threeDeck = new ArrayList<Card>();
		static ArrayList<Card> fourDeck = new ArrayList<Card>();
		static ArrayList<Card> discard = new ArrayList<Card>(); 
		
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
				firstTurn();
				

			}
		public static void deal()
			{
				for (int i = 7; i >= 1; i --)
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
		
		public static void firstTurn()
			{
				System.out.println();
				System.out.println(playerOne + ", its your turn. Here is your deck. Type the number next to the card you would like to play. If you cannot play, and would like to draw, press an 8");
				for (int i = 0; i <= oneDeck.size() - 1; i ++)
					{
						System.out.println(i + 1 + ") " + oneDeck.get(i).getColor() + " " +  oneDeck.get(i).getIcon());
					}
				int card = userIntInput.nextInt();
				if (card == 8)
					{
						oneDeck.add(Deck.deck.get(0));
						Deck.deck.remove(0);
						firstTurn();
					}
				else if (oneDeck.get(card - 2).getIcon() == "reverse") // REVERSE
					{
						discard.add(oneDeck.get(card - 2));
					}
				else if (oneDeck.get(card - 2).getIcon() == "+2") //PLUS TWO
					{
						twoDeck.add(Deck.deck.get(0));
						Deck.deck.remove((0));
						twoDeck.add(Deck.deck.get(0));
						Deck.deck.remove(0);
						discard.add(oneDeck.get(card - 2));
					}
				else if (oneDeck.get(card - 2).getIcon() == "wild +4") // PLUSFOUR
					{
						twoDeck.add(Deck.deck.get(0));
						Deck.deck.remove((0));
						twoDeck.add(Deck.deck.get(0));
						Deck.deck.remove(0);
						twoDeck.add(Deck.deck.get(0));
						Deck.deck.remove((0));
						twoDeck.add(Deck.deck.get(0));
						Deck.deck.remove(0);
						System.out.println("What color would you like to change the card to?");
						String colorPlusFour = userStringInput.nextLine();
						System.out.println("The color is now " + colorPlusFour + ".");
						discard.add(oneDeck.get(card - 2));
					}
				else if (oneDeck.get(card - 2).getIcon() == "wild") // WILD
					{
						System.out.println("What color would you like to change the card to?");
						String colorPlusFour = userStringInput.nextLine();
						System.out.println("The color is now " + colorPlusFour + ".");
						discard.add(oneDeck.get(card - 2));
					}
				else
					{
						discard.add(oneDeck.get(card - 2));
						oneDeck.remove(card - 2);
						
					}
				
				discard.add(oneDeck.get(card - 2));
				oneDeck.remove(card - 2); 
				
				System.out.println("The new topcard in the deck is " + discard.get(discard.size() - 1).getColor() + " "  + discard.get(discard.size() - 1).getIcon());
				
				
			}

	}
