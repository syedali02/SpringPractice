package org.ali;


//import java.util.List;

public class Triangle implements Shape {


	private Point pointA;
	private Point pointB;
	private Point pointC;




	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Drawing Triangle");
		System.out.println("points are :" +getPointA().getX()+","+getPointA().getY());
		System.out.println("points are :" +getPointB().getX()+","+getPointB().getY());	
		System.out.println("points are :" +getPointC().getX()+","+getPointC().getY());
	}

	/*@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean init method called for triangle");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean destroy method called for the triangle ");

	}*/
	/*public void init() {
		System.out.println("InitializingBean init method called for triangle");
	}

	public void destroy() {
		System.out.println("DisposableBean destroy method called for the triangle ");
	}*/
}
