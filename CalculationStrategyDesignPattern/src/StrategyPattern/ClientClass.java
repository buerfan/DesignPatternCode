package StrategyPattern;

public class ClientClass {

	public static void main(String[] args) {
		
		
		Context context=new Context(new SubtractionStrategy());
		
		context.executeCalculation(4, 5);
	}
}
