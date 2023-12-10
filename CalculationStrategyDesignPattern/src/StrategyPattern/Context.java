package StrategyPattern;

public class Context {
	
	private CalculationStrategyInterface calculationStrategyInterface;

	
	public Context(CalculationStrategyInterface calculationStrategyInterface) {
		super();
		this.calculationStrategyInterface = calculationStrategyInterface;
	}
	
	public void executeCalculation(int a, int b) {
		calculationStrategyInterface.doCalculation(a, b);
	}
}
