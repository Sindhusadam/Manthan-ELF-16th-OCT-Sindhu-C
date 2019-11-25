
public class TestB {
	public static void main(String[] args) {
     Van v = new Van();
     v.cost = 23;
     v.model = 2;
     
     
     v.move();
     System.out.println(v.cost);
     System.out.println(v.model);
     v.stop();
     System.out.println(v.cost);
	}
}
