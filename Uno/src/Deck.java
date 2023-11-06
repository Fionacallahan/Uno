import java.util.ArrayList;
import java.util.Collections;

//import java.util.Collections;

public class Deck
	{
	static ArrayList<Card> deck = new ArrayList<Card>();
		
		
		public static void fill()
			{
				deck.add(new Card("zero", "red", 0));
				deck.add(new Card("one", "red", 1));
				deck.add(new Card("one", "red", 1));
				deck.add(new Card("two", "red", 2));
				deck.add(new Card("two", "red", 2));
				deck.add(new Card("three", "red", 3));
				deck.add(new Card("three", "red", 3));
				deck.add(new Card("four", "red", 4));
				deck.add(new Card("four", "red", 4));
				deck.add(new Card("five", "red", 5));
				deck.add(new Card("five", "red", 5));
				deck.add(new Card("six", "red", 6));
				deck.add(new Card("six", "red", 6));
				deck.add(new Card("seven", "red", 7));
				deck.add(new Card("seven", "red", 7));
				deck.add(new Card("eight", "red", 8));
				deck.add(new Card("eight", "red", 8));
				deck.add(new Card("nine", "red", 9));
				deck.add(new Card("nine", "red", 9));
				
				deck.add(new Card("zero", "yellow", 0));
				deck.add(new Card("one", "yellow", 1));
				deck.add(new Card("one", "yellow", 1));
				deck.add(new Card("two", "yellow", 2));
				deck.add(new Card("two", "yellow", 2));
				deck.add(new Card("three", "yellow", 3));
				deck.add(new Card("three", "yellow", 3));
				deck.add(new Card("four", "yellow", 4));
				deck.add(new Card("four", "yellow", 4));
				deck.add(new Card("five", "yellow", 5));
				deck.add(new Card("five", "yellow", 5));
				deck.add(new Card("six", "yellow", 6));
				deck.add(new Card("six", "yellow", 6));
				deck.add(new Card("seven", "yellow", 7));
				deck.add(new Card("seven", "yellow", 7));
				deck.add(new Card("eight", "yellow", 8));
				deck.add(new Card("eight", "yellow", 8));
				deck.add(new Card("nine", "yellow", 9));
				deck.add(new Card("nine", "yellow", 9));

				deck.add(new Card("zero", "blue", 0));
				deck.add(new Card("one", "blue", 1));
				deck.add(new Card("one", "blue", 1));
				deck.add(new Card("two", "blue", 2));
				deck.add(new Card("two", "blue", 2));
				deck.add(new Card("three", "blue", 3));
				deck.add(new Card("three", "blue", 3));
				deck.add(new Card("four", "blue", 4));
				deck.add(new Card("four", "blue", 4));
				deck.add(new Card("five", "blue", 5));
				deck.add(new Card("five", "blue", 5));
				deck.add(new Card("six", "blue", 6));
				deck.add(new Card("six", "blue", 6));
				deck.add(new Card("seven", "blue", 7));
				deck.add(new Card("seven", "blue", 7));
				deck.add(new Card("eight", "blue", 8));
				deck.add(new Card("eight", "blue", 8));
				deck.add(new Card("nine", "blue", 9));
				deck.add(new Card("nine", "blue", 9));
				
				deck.add(new Card("zero", "green", 0));
				deck.add(new Card("one", "green", 1));
				deck.add(new Card("one", "green", 1));
				deck.add(new Card("two", "green", 2));
				deck.add(new Card("two", "green", 2));
				deck.add(new Card("three", "green", 3));
				deck.add(new Card("three", "green", 3));
				deck.add(new Card("four", "green", 4));
				deck.add(new Card("four", "green", 4));
				deck.add(new Card("five", "green", 5));
				deck.add(new Card("five", "green", 5));
				deck.add(new Card("six", "green", 6));
				deck.add(new Card("six", "green", 6));
				deck.add(new Card("seven", "green", 7));
				deck.add(new Card("seven", "green", 7));
				deck.add(new Card("eight", "green", 8));
				deck.add(new Card("eight", "green", 8));
				deck.add(new Card("nine", "green", 9));
				deck.add(new Card("nine", "green", 9));
				
				deck.add(new Card("+2", "red", 10));
				deck.add(new Card("+2", "red", 11));
				deck.add(new Card("+2", "yellow", 12));
				deck.add(new Card("+2", "yellow", 13));
				deck.add(new Card("+2", "blue", 14));
				deck.add(new Card("+2", "blue", 15));
				deck.add(new Card("+2", "green", 16));
				deck.add(new Card("+2", "green", 17));
				
				deck.add(new Card("reverse", "red", 18));
				deck.add(new Card("reverse", "red", 19));
				deck.add(new Card("reverse", "yellow", 20));
				deck.add(new Card("reverse", "yellow", 21));
				deck.add(new Card("reverse", "blue", 22));
				deck.add(new Card("reverse", "blue", 23));
				deck.add(new Card("reverse", "green", 24));
				deck.add(new Card("reverse", "green", 25));
				
				deck.add(new Card("skip", "red", 26));
				deck.add(new Card("skip", "red", 27));
				deck.add(new Card("skip", "yellow", 28));
				deck.add(new Card("skip", "yellow", 29));
				deck.add(new Card("skip", "blue", 30));
				deck.add(new Card("skip", "blue", 31));
				deck.add(new Card("skip", "green", 32));
				deck.add(new Card("skip", "green", 33));
				
				deck.add(new Card("wild", "", 34));
				deck.add(new Card("wild", "", 35));
				deck.add(new Card("wild", "", 36));
				deck.add(new Card("wild", "", 37));
				
				deck.add(new Card("+4", "wild", 38));
				deck.add(new Card("+4", "wild", 39));
				deck.add(new Card("+4", "wild", 40));
				deck.add(new Card("+4", "wild", 41));
			}
			
		public static void shuffle()
		{
			Collections.shuffle(deck);
		}

	}
