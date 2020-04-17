package assignment3;

public class Tester3 {
	
	public static void main(String[] args) {
		RoundThing circle = new RoundThing(12.0, 3.14);
		circle.DisplayArea();
		
		Chocolate milka = new Chocolate(1521512, "Milka", 100, 1);
		System.out.println(milka.getBarcode());		
	}
}