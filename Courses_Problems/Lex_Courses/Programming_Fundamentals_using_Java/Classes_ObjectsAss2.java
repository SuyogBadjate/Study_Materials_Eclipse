package Lex_Courses.Programming_Fundamentals_using_Java;

class BookMyMovie {
	private int movieId;
	private int noOfTickets;
	private double discount;
	private double totalAmount;

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public BookMyMovie(int movieId, int noOfTickets) {
		super();
		this.movieId = movieId;
		this.noOfTickets = noOfTickets;
	}

	public void calculateDiscount() {
		if ((movieId == 101 || movieId == 102 || movieId == 103) && noOfTickets < 5)
			discount = 0;
		else if ((movieId == 101 || movieId == 103) && (noOfTickets >= 5 && noOfTickets < 10))
			discount = 15;
		else if ((movieId == 101 || movieId == 103) && (noOfTickets >= 10 && noOfTickets <= 15))
			discount = 20;
		else if ((movieId == 102) && (noOfTickets >= 5 && noOfTickets < 10))
			discount = 10;
		else if ((movieId == 102) && (noOfTickets >= 10 && noOfTickets <= 15))
			discount = 15;
		else
			System.out.println("Sorry! Invalid movie Id!");
	}

	public double calculateTicketAmount() {
		calculateDiscount();
		int baseFare=0;
		if(movieId==101) {
			baseFare=120;
		    totalAmount = baseFare * noOfTickets - (baseFare * noOfTickets * (discount/100));
			System.out.println("Total amount for booking : "+totalAmount);
		}
		else if(movieId==102) {
			baseFare=170;
		    totalAmount = baseFare * noOfTickets - (baseFare * noOfTickets * (discount/100));
			System.out.println("Total amount for booking : "+totalAmount);
		}
		else if(movieId==103) {
			baseFare=150;
		    totalAmount = baseFare * noOfTickets - (baseFare * noOfTickets * (discount/100));
			System.out.println("Total amount for booking : "+totalAmount);
		}
		else {
			totalAmount = baseFare * noOfTickets - (baseFare * noOfTickets * (discount/100));
			System.out.println("Total amount for booking : "+totalAmount);
		}
		return totalAmount;
	}

}

public class Classes_ObjectsAss2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookMyMovie booking1 = new BookMyMovie(109, 5);
		booking1.calculateTicketAmount();
		BookMyMovie booking2 = new BookMyMovie(102, 4);
		booking2.calculateTicketAmount();
		BookMyMovie booking3 = new BookMyMovie(103, 8);
		booking3.calculateTicketAmount();
	}

}
