package abstraction;

public class Gmail extends Google{
	@Override
	void shareFile() {
		System.out.println("share 25mb");
	}

}
