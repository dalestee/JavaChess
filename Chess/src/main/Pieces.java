package main;

public class Pieces {
	protected boolean alive;
	protected int color;
	protected int coordinates;
	protected String name;
	
	public void Piece (boolean alive, int color,int coordinates, String name) {
		this.alive = true;
		this.color = color;
		this.coordinates = coordinates;
		this.name = name;
	}
	
	public void kill() {
		this.alive = false;
	}
	
	public void changeCoordinates(int coordinates) {
		this.coordinates = coordinates;
	}

}

class Pawn extends Pieces{
	
	private boolean FirstMove;
	
	public Pawn (boolean alive, int color, int coordinates) {
		this.alive = true;
		this.color = color;
		this.coordinates = coordinates;
		this.FirstMove = true;
		this.name = "pawn";
	}
}

class Knight extends Pieces{
	
	public Knight (boolean alive, int color, int coordinates) {
		this.alive = true;
		this.color = color;
		this.coordinates = coordinates;
		this.name = "knight";
		}
}

class Bishop extends Pieces{
	
	public Bishop (boolean alive, int color, int coordinates) {
		this.alive = true;
		this.color = color;
		this.coordinates = coordinates;
		this.name = "bishop";
		}
}

class King extends Pieces{
	
	private boolean FirstMove;
	
	public King (boolean alive, int color, int coordinates) {
		this.alive = true;
		this.color = color;
		this.coordinates = coordinates;
		FirstMove = true;
		this.name = "king";
		}
}

class Queen extends Pieces{
	
	public Queen (boolean alive, int color, int coordinates) {
		this.alive = true;
		this.color = color;
		this.coordinates = coordinates;
		this.name = "queen";
		}
}

class Rook extends Pieces{
	
	private boolean FirstMove;
	
	public Rook (boolean alive, int color, int coordinates, boolean firstMove) {
		this.alive = true;
		this.color = color;
		this.coordinates = coordinates;
		FirstMove = firstMove;
		this.name = "rook";
		}
}
