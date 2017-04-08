package com.Section_15;

import java.awt.*;

public class ToolkitTest {
	public static void main(String[] args) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		
		System.out.println("My screen width: " + d.getWidth());
		System.out.println("My screen height: " + d.getHeight());
		
		GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();
		Rectangle rectangle = environment.getMaximumWindowBounds();
		System.out.println("Centered width: " + rectangle.getCenterX());
		System.out.println("Centered height: " + rectangle.getHeight());
		System.out.println("My Screen dimension: " + rectangle);
		
		Point point = environment.getCenterPoint();
		System.out.println("Center of screenL: " + point);
		
		point = rectangle.getLocation();
		System.out.println("Location of my screen: " + point);
	}
	
	
	
}
