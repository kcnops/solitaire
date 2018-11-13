import java.awt.Color;


public enum Suit {

	CLUBS (Color.BLACK, "C", 1),
	SPADES (Color.BLACK, "S", 2),
	HEARTS (Color.RED, "H", 3),
	DIAMONDS (Color.RED, "D", 4);
	
	private Color color;
	private String name;
	private int code;

	Suit(Color color, String name, int code){
		this.color = color;
		this.name = name;
		this.code = code;
	}
	
	public Color getColor(){
		return color;
	}
	
	public String getName(){
		return name;
	}
	
	public int getCode(){
		return code;
	}
	
}
