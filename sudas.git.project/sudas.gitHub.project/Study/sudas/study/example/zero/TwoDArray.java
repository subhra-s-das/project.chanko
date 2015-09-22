package sudas.study.example.zero;

import java.util.Random;

class TwoDArray {
public static void main(String args[]) {
	

    String[] description = {"Keyboard failure need change",
            "Change laptop HDD",
            "Increase server RAM",
            "Increase internet speed",
            "replace battery",
            "CPU fan removal",
            "Increase space on server", 
            "Change server software"};

    String company[] =  {"Software Pursuits Inc.","Nexus Integration"};
    String siteGroup[] = {"AUS","AUS"};
    
 
    Description(description);

	
}

private static void Description(String[] description) {
	int value = new Random().nextInt(description.length);
//	System.out.println(value);
	System.out.println(description[new Random().nextInt(description.length)]);		// creating a random array index
}

}
