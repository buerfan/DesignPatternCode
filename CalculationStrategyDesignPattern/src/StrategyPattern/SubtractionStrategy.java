package StrategyPattern;

public class SubtractionStrategy implements CalculationStrategyInterface{

	@Override
	public void doCalculation(int a, int b) {
		System.out.println(a-b);
	}

}
