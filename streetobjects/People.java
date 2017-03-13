package streetobjects;

import java.util.Random;

import processing.core.PApplet;

public class People extends MovableObjects  {
	
	private float xCoordinate;
	private float yCoordinate;
	private float xDelta;
	private float yDelta;
	private Random random;

	public People(float xCoordinate, float yCoordinate,float width, float height, int speed, PApplet p) {
		super(width, height, speed, p);
//		this.xCoordinate = p.random(150);
//		this.yCoordinate = p.random(150);
		this.xDelta = p.random(-1,2);
		this.yDelta = p.random(-1,2);
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;	
		this.setColour(p.color(0));//Color of all people will be black by default

		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(int speed) {//Draw
		this.xCoordinate -=this.xDelta;
		this.yCoordinate -= this.yDelta;
	
		//or xCoordinate -= speed;
		//yCoordinate -= 0;
//
		if((this.xCoordinate > 1050 ) || (xCoordinate < -10)){
			this.xDelta = -this.xDelta;
		} 
		
		if((this.yCoordinate > 93 - 10) || (yCoordinate < -15)){
			this.yDelta *= this.yDelta;;
		}
	}

	@Override
	public void createObject() {//Draw
		
		p.fill(this.getColour());
		p.ellipse(xCoordinate, yCoordinate, this.getWidth(), this.getHeight());

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

	public float getxDelta() {
		return xDelta;
	}

	public void setxDelta(float xDelta) {
		this.xDelta = xDelta;
	}

	public float getyDelta() {
		return yDelta;
	}

	public void setyDelta(float yDelta) {
		this.yDelta = yDelta;
	}

	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}
	
	

}
