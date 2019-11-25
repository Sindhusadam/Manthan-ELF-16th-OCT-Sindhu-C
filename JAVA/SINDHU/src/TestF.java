
public class TestF {
	public static void main(String[] args) {
		Card r =new Card();
		Card J =new Card();
		Card K =new Card();
		
		r.swipe();
		J.swipe();
		K.swipe();
		r.swipe();
		J.swipe();
		K.swipe();
		
		System.out.println(Card.orgcount);
		
	}
}
