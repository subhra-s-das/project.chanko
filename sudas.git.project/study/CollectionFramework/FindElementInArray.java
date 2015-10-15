package CollectionFramework;

public class FindElementInArray {

	public static void main(String[] args) {
		try {
			FindElementInArray element = new FindElementInArray();
			element.dataCollector();

		}

		catch (UserException u) {
			System.out.println(u.getMessage());
		}
	}

	public void dataCollector() throws UserException {
		String actual[] = { "ddd", "Banana", "Orange", "Grapes" };
		String expected[] = { "Apple", "Banana", "Orange" ,""};

		if (actual.length == expected.length) {
		for (int i = 0; i < actual.length; i++) {
			if (actual[i].equalsIgnoreCase(expected[i])) {
				System.out.println("contains " + actual[i]);
			} else if (!(actual[i].equalsIgnoreCase(expected[i]))) {
				System.out.println("does not contain " + actual[i]);
			}
		}

	
		}

		if (actual.length != expected.length) {
			throw new UserException("Array length differ");
		}

	}

}

class UserException extends IndexOutOfBoundsException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}