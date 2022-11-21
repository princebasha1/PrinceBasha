package SeleniumBasics;

import org.testng.annotations.Test;

public class TestCase {
	@Test(groups={"smoke","sanity"})
	public void test()  {
		System.out.println("test");
	}
	@Test(groups={"sanity","regression"})
	public void test1()  {
		System.out.println("test1");
	}
	@Test
	public void test2()  {
		System.out.println("test2");

	}
	 
}
