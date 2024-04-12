package Day17;

public class Assginment {

	
	private double rahius;
	private  double pi;
	
	public void setAreaCircle(int rahius , double pi) {
		this.rahius = rahius;
		this.pi= pi;
	}
	public double getAreaCricle() {
		double area = pi * (rahius*rahius);
		System.out.println("The area of the circle : " + area);
		return area;
	}
	
	
}
