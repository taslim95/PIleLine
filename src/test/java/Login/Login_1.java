package Login;

import org.testng.annotations.Test;

public class Login_1 {

	@Test(groups = "smoke")
	public void test01() {
		System.out.println("login -> Smoke testing");
	}

	@Test(groups = "regression")
	public void test02() {
		System.out.println("login -> regression testing");
	}
}
