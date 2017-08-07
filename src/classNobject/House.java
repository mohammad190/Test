package classNobject;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class House {
	public static void main(String[] args)  {
		Testhouse myTesthouse  = new Testhouse();
		myTesthouse.kitchen();
		myTesthouse.rooms();
		System.out.println(myTesthouse.address);
		System.out.println(myTesthouse.houseName); 
		
		
		Testhouse yourHouse = new Testhouse();
		yourHouse.kitchen();
		yourHouse.rooms();
		System.out.println(yourHouse.subtract(50, 40)); 
			
		
		Testhouse yourHouse1 = new Testhouse();
		yourHouse1.kitchen();
		yourHouse1.rooms();
		System.out.println(yourHouse1.addition(30, 20));
	}
	
	
}
