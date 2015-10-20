package Sandbox;

public class Increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Increment().incremental();
	}

	public void incremental() {
		String dateArray[] = { "10/15/2015 00:00:00", "10/15/2015 00:00:01", "10/15/2015 00:00:02" };
		long actualEPOCH[] = { 1444847400, 1444847401 };

		for (int i = 0; i < dateArray.length; i++) {

			System.out.println(dateArray[i]);

			for(int j=i;j<i;j++)
			{
				System.out.println(actualEPOCH[i]);
			}

		}

	}

}
