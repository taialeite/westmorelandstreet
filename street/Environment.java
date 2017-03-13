package street;

import processing.core.PApplet;
/**
 * Environment class is responsible for holding all the objects created from classes
 * Car, Bus, Bike, Taxi and Street.
 * It also set up the Processing environment 
 * @author TaiaLeite
 * 
 */
public class Environment extends PApplet{

	Street streetOne ;//Creating objects for each road.
	Street streetTwo ;
	Street streetThree ;
	Street streetFour ;
	Street streetFive ;
	Street people ;//Creating a object that will hold people

	public void settings() {
		size(1000,690);
	}
	/**
	 * Method will set up the size, speed and position for each array of MovableObjectsand it objects.
	 * It will populate a arrayList called objectInMoviment type MovableObjects with Car, Taxi, Bus and Bike objects.
	 */
	public void setup(){
		streetOne = new Street(this);//Creating objects for each road.
		streetTwo = new Street(this);
		streetThree = new Street(this);
		streetFour = new Street(this);
		streetFive = new Street(this);
		people = new Street(this);//Creating a object that will hold people
		
		streetOne.vehicleOnTheStreet(40, 160, 50,1,2,3,4);
		streetTwo.vehicleOnTheStreet(60, 250, 50,6,3,2,3);
		streetThree.vehicleOnTheStreet(80, 340, 50, 2, 2, 2, 2);
		streetFour.vehicleOnTheStreet(100, 430, 50, 1, 2, 1, 2);
		streetFive.vehicleOnTheStreet(120, 520, 50, 1, 1, 1, 2);
		people.peopleOnTheStreet(200, 1);
	}
	/**
	 * Draw the objects in the road.
	 */
	public void draw(){
		background(155);
		makeStreet(new Street(this));//Call method makeStreet and create the roads and lines in the screen
		streetOne.show();//Show street One with movable objects
		streetTwo.show();//Show street Two with movable objects
		streetThree.show();//Show street Three with movable objects
		streetFour.show();//Show street Four with movable objects
		streetFive.show();//Show street Five with movable objects
		people.show();
	}
	/*
	 * Drawing the streets. This method will call street method to create black roads
	 * @see Street Class. 
	 */
	public void makeStreet(Street s){
		//Drawing the street
		s.street(5);//Drawing 5 black streets
		s.linesInTheStreet(180);//TODO Drawing white dotted lines in the middle of the street
		s.linesInTheStreet(270);
		s.linesInTheStreet(360);
		s.linesInTheStreet(450);
		s.linesInTheStreet(540);
		//Finishing drawing the street

	}

	public static void main(String[] args) {

		PApplet.main(Environment.class);//Class reflection 
	}
}
