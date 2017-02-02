import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Created by irusev on 2.2.2017 г..
 */
public class Class3 {

	public static void doSomething() {
		System.out.println("Calling Class3");
		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
		List<StackTraceElement> elements = Arrays.asList(stackTrace);
		System.out.println("The stack trace is : ");
//		for (StackTraceElement element : elements) {
//			System.out.println("ClassName [" +
//									   element.getClassName() + "] Method name: [" + element.getMethodName()
//									   + "] Line number [" + element.getLineNumber() + "]");
//		}
		if (true) {
			throw new IllegalArgumentException();
		}
	}

}
