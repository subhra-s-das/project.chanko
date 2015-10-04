package StringHelper;

public class StrinhHelper01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		new StrinhHelper01().workWithString();
	}

	
	public void workWithString()
	{	String string = "Subhra S Das";
		String string1 ="This	is	a	TAB	created	line";
		//let me see if I can remove the spaces
		
		String modifiedString = string.replace(" ", "");
		System.out.println(modifiedString);
		
		// removing spaces by regular expression  \\s is space
		System.out.println(string.replaceAll("\\s", ""));
		
		// removing spaces by regular expression  \\t is tab
		System.out.println(string1.replaceAll("\\t", ""));
		
	}
}
