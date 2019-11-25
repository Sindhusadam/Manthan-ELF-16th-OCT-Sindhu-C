
public class TestH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThirdGen n = new ThirdGen();
		n.call();
		n.cam();
		n.msg();
		n.radio();


		SecondGen f = new SecondGen();
		f.call();
		f.msg();
		f.radio();
		

		FirstGen g = new FirstGen();
		g.call();
		g.msg();
	}

}
