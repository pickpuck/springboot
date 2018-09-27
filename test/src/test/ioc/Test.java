package test.ioc;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OneInterface onif = new Interface();
		String out = onif.hello("wtf");
		System.out.println(out);
		
	}

}
