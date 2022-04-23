package practice.collections.codes;

import org.testng.annotations.Test;

public class breakAndContinueStatement {

	@Test
	public static void breakStatement() {
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(i);
		}
	}

	@Test
	public static void continueStatement() {
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				continue;
			}
			System.out.println(i);
		}
	}
}