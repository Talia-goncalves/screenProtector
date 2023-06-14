package classes;

import java.awt.*;

public class Circle extends Ellipse{
	public Circle(Color color, int posX, int posY, int width, int height) {
		super(color, posX, posY, width, height);
	}
	
	@Override //substituição 
	public void setWidth(int size) {
		super.setWidth(size);
		super.setHeight(size);
	}
	
	@Override
	public void setHeight(int size) {
		super.setWidth(size);
		super.setHeight(size);
	}
}
