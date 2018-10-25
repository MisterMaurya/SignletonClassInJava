package beans;

public class Singleton {

	static Singleton singleton = null;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
			return singleton;
		}
		return singleton;
	}

	public static void main(String[] args) {
		Singleton singleton = getInstance();
		Singleton singleton2 = getInstance();
		System.out.println(singleton.hashCode());
		System.out.println(singleton2.hashCode());
	}
}
