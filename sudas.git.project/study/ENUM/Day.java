package ENUM;

public class Day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Days d = Days.MONDAY;
		System.out.println(d);

		switch (d) {
		case MONDAY:
			System.out.println("today is Monday");
			break;

		default:
			break;
		}
	}

}
