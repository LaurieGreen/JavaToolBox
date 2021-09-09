package design_patterns.singleton_pattern;

public class BPSingleton {

	private static class SingletonHelper {
		private static final BPSingleton singletonHelper = new BPSingleton();
	}


	public static BPSingleton getInstance(){
		return BPSingleton.getInstance();
	}


	public static void main( String[] args ) {

	}
}
