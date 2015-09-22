package CollectionFramework;

import java.util.ArrayList;

public class ArrayListExample01 {

	public static void main(String[] args) {

		MobilePhone iPhone = new MobilePhone("iPhone", "6");

				
				
				ArrayList<MobilePhone> mobileList = new ArrayList<MobilePhone>();
		mobileList.add(iPhone);
	}

	}


class MobilePhone
{
	String name;
	String model;
	
	public MobilePhone(String name, String model)
	{
	this.name=name;
	this.model=model;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	
}