
public class Cow {
	Cow()
	{
		System.out.println("l");
	}

	Cow(int i)
	{
		this(2.4);
		System.out.println("p");
	}

	Cow(double r)
	{
		this();
		System.out.println("j");
	}


}
