package try_catch;

class TestClass05{
	public void test1() {
		System.out.println("test111");
		test2();
	}
	public void test2() {
		System.out.println("test222");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
public class MainClass05 {
public static void main(String[] args)  {
	TestClass05 t = new TestClass05();
	t.test1();
	
}
}
