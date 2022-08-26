package Lex_Courses.Programming_Fundamentals_using_Java;

public class ExchangeNotesEx {

	
	public static void main(String args[])
	{
		    //Sample inputs:3, 3, 19
			//Expected Output:-1
			final int five$NoteValue=5;
			//inputs
			int one$Coins=3;
			int five$Notes=3;
			int amountToBePaid=19;
			
			int noOfOne$CoinsNeeded=0;
			int noOfFive$NotesNeeded=0;
			int valueOf5DollerNotes=five$Notes*5;
			
			if((amountToBePaid%5>0) || (amountToBePaid<=valueOf5DollerNotes)) {
			noOfOne$CoinsNeeded=amountToBePaid%five$NoteValue;
			noOfFive$NotesNeeded=amountToBePaid/five$NoteValue;
			if(noOfOne$CoinsNeeded<(one$Coins*1)) {
				if(noOfOne$CoinsNeeded<=one$Coins && noOfFive$NotesNeeded<=five$Notes)
			        System.out.println("1$ coins needed:"+noOfOne$CoinsNeeded+" 5$ notes needed: "+noOfFive$NotesNeeded);
				else
					System.out.println("-1");
			}
			else
			{
			System.out.println(" -1 ");
			}
			}
		}

}




