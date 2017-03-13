package streetobjects;

import processing.core.PApplet;

public class Taxi extends Vehicle {


	public Taxi(float xCoordinate, float yCoordinate, float width, float height, int speed, PApplet p) {
		super(xCoordinate, yCoordinate, width, height, speed, p);
		this.setColour(p.color(255,255,255));//Color of all taxis will be white
		
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
