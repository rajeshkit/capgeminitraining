package basicconcepts;

public class DemoFlowControl {
	public static void main(String[] args) {

		for (int j = 0; j < 3; j++) {
			
			System.out.println("Outer loop:"+j);
			
			for (int i = 0; i < 5; i++) {

				if (i == 3) {
					break;
				}

				System.out.println("Inner loop:"+i);

			}
		}
		ajay: for (int i = 0; i < 5; i++) {

			if (i == 3) {
				continue ajay;
			}

			System.out.println(i);

		}
	}

}
