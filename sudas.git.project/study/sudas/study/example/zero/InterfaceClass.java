package sudas.study.example.zero;

public class InterfaceClass implements TestInterface {
	String name;
	String info;

	public static void main(String[] args) {
InterfaceClass intf = new InterfaceClass();
intf.setinfo("This is interface class for info");
intf.setname("This is the name for interface");
intf.getinfo();
intf.getname();
	}

	// public InterfaceClass(String name, String info) {
	//
	// this.name=name;
	// this.info=info;
	// }

	@Override
	public void setinfo(String info) {
		this.info = info;

	}

	@Override
	public void getinfo() {
		System.out.println(info);
	}

	@Override
	public void setname(String name) {
this.name=name;

	}

	@Override
	public void getname() {
System.out.println(name);

	}

}
