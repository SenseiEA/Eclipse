package com.test;
import com.animal.*;
public class TestAnimal {
	public static void doAnimalStuff(Animal a) {
		a.eat();
		a.breathe();
		a.sleep();
		a.play();
		if(a instanceof Mammal) {
			//Mammal m=(Mammal)a;
			//m.feedYoung();
			((Mammal) a).feedYoung();
		}
		else if(a instanceof Bird) {
			//Bird b=(Bird)a;
			//b.layEggs();
			//b.buildNests();
			((Bird) a).layEggs();
			((Bird) a).buildNests();
			((Bird) a).takeOff();
			((Bird) a).fly();
			((Bird) a).flyHigh();
			((Bird) a).land();
			
		}
		
	}
	
	public static void main(String[] args) {
		Mammal dog=new Mammal();
		Bird duck=new Bird();
		doAnimalStuff(dog);
		doAnimalStuff(duck);
		

	}

}
