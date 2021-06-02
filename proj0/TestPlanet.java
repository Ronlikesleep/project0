public class TestPlanet{
	public static void main(String[] args) {
		Planet sun = new Planet(0.0,0.0,1.0,2.0,500,"god sun");
		Planet moon = new Planet(3.0,4.0,3.0,5.0,500,"god moon");
		System.out.println("distance "+sun.calcDistance(moon));
	}
}
