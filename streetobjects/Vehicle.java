package streetobjects;

import processing.core.PApplet;
/**
 * 
 * @author TaiaLeite
 * Vehicle will be implemented only from Vehicle type classes
 * It will contain methods such changeLines and move. Move method is overridden from MovableObjects.
 * Vehicles can only driveForward
 *
 */
public abstract class Vehicle extends MovableObjects {
	
	private float xCoordinate;
	private float yCoordinate;
	
	public Vehicle(float xCoordinate, float yCoordinate,float width, float height, int speed, PApplet p) {
		super(width, height,speed, p);
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;		
		}
	
	public abstract void changeLine();//Will be implemented by all classes type VEhicle. Each Vehicle have it own way of moving lines.

	@Override
	public void move(int speed) {//Vehicles can only driveForwards
		xCoordinate += speed;
		yCoordinate += 0;		
	}

	public float getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(float xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public float getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(float yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
}
