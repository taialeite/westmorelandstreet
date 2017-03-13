package streetobjects;
import processing.core.PApplet;
/**
 * 
 * @author TaiaLeite
 * This class will be responsible for creating objects that moves in the street.
 * Each object has a different height, weight, color, position and speed.		
 * We will create cars, buses, bikes, taxis and people from this class
 */
public abstract class MovableObjects{
	
	private int colour;				// what colour is my robot
	private float width;			// how wide is the base of the triangle
	private float height;	
	private int speed;// how tall is the triangle
	//double speed;			// how many pixels per iteration it moves
	PApplet p;
	
	/**
	 * 
	 * @param colour give color for each object created corresponding to each type
	 * @param width give width for each object created corresponding to each type
	 * @param height give height for each object created corresponding to each type
	 * @param speed give speed for each object created corresponding to each type
	 * @param p access PApplet
	 * 
	 */
	
	public MovableObjects(float width, float height, int speed, PApplet p) {
		super();
		this.width = width;
		this.height = height;
		this.speed = speed;
		this.p = p;
	}

	public abstract void createObject();//Has to be implemnted by all subclasses

	public abstract void move(int speed);//Has to be imoplemnted by all subclasse - VEhicles can only drive forwards

	public int getColour() {
		return colour;
	}

	public void setColour(int colour) {
		this.colour = colour;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public PApplet getP() {
		return p;
	}

	public void setP(PApplet p) {
		this.p = p;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	/**
	 * 	Car in lane 1
		= y value = lane1_height/2
   		x value += speed;	
	 */
	

}
