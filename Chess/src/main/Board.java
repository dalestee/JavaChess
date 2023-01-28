package main;

public class Board {

	public String boardString;
	
	public Board() {
		this.boardString = "rkbQKbkrpppppppp/32pppppppprkbKQbkr";
	}
	
	public void printBoard() {
		System.out.println(this.boardString);
	}
}
