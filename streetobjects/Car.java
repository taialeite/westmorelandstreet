package streetobjects;

import processing.core.PApplet;
/**
 * 
 * @author TaiaLeite
 * This class is the Car factory. It will create cars in the street.
 * Every car will have the same color distinguishing from the other movable objects.
 * It will extend Vehicle class.
 * Vehicle class contain a method called move(), this method will be the same for all classes type Vehicle.
 * Vehicle can only driveForwards - move()
 */
public class Car extends Vehicle {
	/**
	 * Constructor will initialize all the parameters to create Car object.
	 * @param xCoordinate
	 * @param yCoordinate
	 * @param width
	 * @param height
	 * @param p
	 */
	public Car(float xCoordinate, float yCoordinate, float width, float height, int speed,PApplet p) {
		super(xCoordinate, yCoordinate, width, height, speed, p);
		this.setColour(p.color(200, 53, 124));//Color of all cars will be pink by default
		}

	/**
	 * Method will create the cars with color pink.
	 */
	@Override
	public void createObject() {
		p.fill(this.getColour());
		p.rect(this.getxCoordinate(), this.getyCoordinate(), this.getWidth(), this.getHeight());

	}
	/**
	 * Method will change car line.
	 */
	@Override
	public void changeLine() {
		// TODO Auto-generated method stub
		
	}
	
	

}
