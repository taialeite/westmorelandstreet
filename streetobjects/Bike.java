package streetobjects;

import processing.core.PApplet;

public class Bike extends Vehicle  {

	
	public Bike(float xCoordinate, float yCoordinate, float width, float height, int speed,  PApplet p) {
		super(xCoordinate, yCoordinate, width, height, speed, p);
		this.setColour(p.color(43,27,255));//Color of all bikes will be blue
		
	}

	@Override
	public void createObject() {
		p.fill(this.getColour());
		p.rect(this.getxCoordinate(), this.getyCoordinate(), this.getWidth(), this.getHeight());
	}


	@Override
	public void changeLine() {
		// TODO Auto-generated method stub
		
	}

}
