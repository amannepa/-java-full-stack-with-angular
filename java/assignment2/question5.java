package javaoops;

abstract class shape{
    void draw(){
 	   
    }
}
class Line extends shape{
	void draw() {
		System.out.println("This is Line");
	}
}
class Rectangle extends shape{
	void draw() {
		System.out.println("This is  Rectangle");
	}
}
class Cube extends shape{
	void draw() {
		System.out.println("This is Cube");
	}
}
class Square extends shape{
	void draw() {
		System.out.println(" Square");
	}
}

public class question5 {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	 Line o=new Line();
  o.draw();
  
  Rectangle o1=new Rectangle();
  o1.draw();
  
  Cube o2=new Cube();
  o2.draw();
  
  Square o3=new Square();
  o3.draw();
	
	

}

}
