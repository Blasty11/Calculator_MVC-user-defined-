package main;

import controller.CalculatorController;
import model.CalculatorModel;
import view.CalculatorView;

public class MyCalcApp 
{
	public static void main(String[] args) 
	{
		CalculatorModel m = new CalculatorModel();
		CalculatorView v1 = new CalculatorView();
		CalculatorView v2 = new CalculatorView();
		CalculatorView v3 = new CalculatorView();
		CalculatorView v4 = new CalculatorView();
		
		
	
		new CalculatorController(m, v1);
        new CalculatorController(m, v2);
        new CalculatorController(m, v3);
        new CalculatorController(m, v4);
        
        
		v1.setVisible(true);
		v2.setVisible(true);
		v3.setVisible(true);
		v4.setVisible(true);
	}
}