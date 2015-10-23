package CollectionFramework;

public class EntryList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create an object of the class
		GetterSetters gs = new GetterSetters("sudas", 30);
		String name = gs.getName();

		GetterSetters gs1 = new GetterSetters();
		gs1.setName("sudas");
		String name1 = gs1.getName();

	}

}

class GetterSetters {
	String name;
	int age;

	// i can even create a constructor equivalent to setter method
	public GetterSetters() {

	}

	public GetterSetters(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

class abcd<A, B> {
	A key;
	B value;

	public A getKey() {
		return key;
	}

	public void setKey(A key) {
		this.key = key;
	}

	public B getValue() {
		return value;
	}

	public void setValue(B value) {
		this.value = value;
	}

}

class MyEntry<K, V> implements java.util.Map.Entry<K, V> {
	K key;
	V value;
	String a;

	public MyEntry(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public V setValue(V value) {
		V old = this.value;
		this.value = value;

		return null;
	}

}