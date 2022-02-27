package AnnotationAssignment;
@interface Test{
	
}
class UseTest
{
	@Test
	public int test_case(int a, int b) {
		return a*b;
	}
}
public class CustomTest{
	public static void main(String[] args) {
		UseTest obj=new UseTest();
		System.out.println(obj.test_case(5, 10));
	}
}