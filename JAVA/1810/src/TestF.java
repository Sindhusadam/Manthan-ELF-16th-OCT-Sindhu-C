
public class TestF {

	public static void main(String[] args) {
		Mouse M = new TouchPad();
		M.click();

		System.out.println(".....................");		

		Keyboard K = new TouchPad();
		K.press();

		System.out.println("...........................");

		TouchPad t = new TouchPad();
		t.click();
		t.press();
	}

}
                                                                                                                                                                        