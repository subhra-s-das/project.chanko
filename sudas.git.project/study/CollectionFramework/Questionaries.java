package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class Questionaries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Questions q1 = new Questions();
	q1.setQuestion("What is your name ?");
	
	Answer a1 = new Answer();
	a1.setAnswer("sudas");
	
	Questions q2 = new Questions();
	q1.setQuestion("What do you do ?");
	
	Answer a2 = new Answer();
	a1.setAnswer("Java");
	
	Questions q3 = new Questions();
	q1.setQuestion("What is your age ?");
	
	Answer a3 = new Answer();
	a1.setAnswer("34");
	
Map<Questions, Answer> hashmap = new HashMap<Questions, Answer>();
	
	hashmap.put(q1, a1);
	hashmap.put(q2, a2);
	hashmap.put(q3, a3);
	}

	
	
}
