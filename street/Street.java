package street;

import java.util.ArrayList;
import java.util.List;

import processing.core.PApplet;
import streetobjects.Bike;
import streetobjects.Bus;
import streetobjects.Car;
import streetobjects.MovableObjects;
import streetobjects.People;
import streetobjects.Taxi;
/**
 * 
 * @author TaiaLeite
 * Class street will be responsible for creating all objects that belongs to the Street Set up.
 * It will create five black roads, dotted lines inside each road, cars, buses, bikes and taxi on the 
 * road and people on the footpath. 
 */
public class Street {

	private List <MovableObjects> objectInMoviment = new ArrayList<MovableObjects>(); //ArrayList to hold the objects
	private PApplet p;
	private int speedCar;//Speed for the cars on the road
	private int speedBus;//Speed for the buses on the road
	private int speedBike;//Speed for the bike on the road
	private int speedTaxi;//Speed for the taxi on the road
	private int speedPeople;//Speed for the people on the road

	public Street(PApplet p) {
		super();
		this.p = p;

	}
	/**
	 * This method will create five black road.
	 * @param streets - street parameter will determine how many streets will be created.
	 */
	public void street(int streets){//How many streets should be created.
		int positionRoad = 0;
		for(int i = 0; i < streets; i++){//Making * different roads in black
			p.fill(0);
			p.strokeWeight(3);
			p.strokeCap(p.ROUND);
			p.stroke(255, 255, 255);
			p.rect(0, 135 + positionRoad, 1000, 92);
			positionRoad += 90; //will define the position of each road on the screen, one bellow each other
		}
	}
	/**
	 * This method will create white dotted lines in each road.
	 * @param y1
	 * @param y2
	 */
	public void linesInTheStreet(int y1){

		int positionLine = 0;//Lines for the road in white 
		for(int x = 0; x < 15; x++){//Creating 15 lines to represent the white lines on the road.
			p.strokeWeight(5);
			p.strokeCap(p.ROUND);
			p.line(0 + positionLine, y1, 50 + positionLine, y1);
			positionLine += 90;
		}
	}
	/**
	 * Method test - TODO method not being used.
	 * @param move
	 * @param numberOfObjects 
	 */
	public void objectInTheStreet(MovableObjects move, int numberOfObjects){
		for(int i = 0; i < numberOfObjects; i++){
			objectInMoviment.add(move);
		}

	}
	/**
	 * This method will create people on the footpath walking randomly.  
	 * It will create objects of people to create black dotes representing people.
	 * @param numberOfPeople - number of people to be created in each object
	 * @param speed - speed of the people
	 */
	public void peopleOnTheStreet(int numberOfPeople, int speed){//setup //TODO

		this.speedPeople =	speed;
		int positionX = 15;

		for(int i = 0; i < numberOfPeople; i++){
			objectInMoviment.add(new People(positionX, 50,10,10, speed,p));
			objectInMoviment.add(new People(positionX, 30,10,10, speed,p));
			objectInMoviment.add(new People(positionX, 60,10,10, speed,p));
			objectInMoviment.add(new People(positionX, 120,10,10, speed,p));
			objectInMoviment.add(new People(positionX, 600,10,10, speed,p));
			objectInMoviment.add(new People(positionX, 630,10,10, speed,p));
			objectInMoviment.add(new People(positionX, 650,10,10, speed,p));
			objectInMoviment.add(new People(positionX, 660,10,10, speed,p));
			positionX +=50;
		}

	}
	/**
	 * Method used to create vehicles on the road.
	 * @param positionX
	 * @param positionY
	 * @param numberOfObjects
	 * @param speedCar
	 * @param speedTaxi
	 * @param speedBus
	 * @param speedBike
	 */
	public void vehicleOnTheStreet(int positionX, int positionY, int numberOfObjects, int speedCar, int speedTaxi, int speedBus, int speedBike){
		this.speedCar = speedCar;
		this.speedBus = speedBus;
		this.speedBike = speedBike;
		this.speedTaxi = speedTaxi;

		for(int i = 0; i < numberOfObjects; i++){//First Array of objects
			objectInMoviment.add(new Car(positionX, positionY,30,30, speedCar,p));
			objectInMoviment.add(new Taxi(positionX + 75, positionY - 3,35,35, speedTaxi,p));
			objectInMoviment.add(new Bus(positionX + 125, positionY - 1,55,30,speedBus,p));
			objectInMoviment.add(new Bike(positionX + 185, positionY +10,20,10,speedBike,p));
			positionX +=250;	
		}
	}
	/**
	 * This method will draw the objects into the street. 
	 * It speed will be according to each object.
	 */
	public void show(){//Iterate through the array to show the objects

		for(MovableObjects objects: objectInMoviment){
			p.noStroke();
			objects.createObject();
			if(objects instanceof Car){
				objects.move(speedCar);
			}else if(objects instanceof Bike){
				objects.move(speedBike);
			}else if(objects instanceof Bus){
				objects.move(speedBus);
			}else if(objects instanceof Taxi){
				objects.move(speedTaxi);
			}else if(objects instanceof People){
				objects.move(speedPeople);

			}

		}
	}
}
