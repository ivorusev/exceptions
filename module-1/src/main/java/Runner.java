/**
 * Created by irusev on 2.2.2017 г..
 */
public class Runner {

	public static void main(String[] args) {

		try {
			Class1.doSomething();
		} catch (IllegalArgumentException e) {
			throw new MyException("Greshka", e);
		}
	}
}
