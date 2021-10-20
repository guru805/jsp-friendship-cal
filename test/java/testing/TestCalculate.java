//package testing;
//
//import static org.junit.Assert.*;
//import org.junit.Test;
//
//import controller.MainController;
//
//public class TestCalculate {
//
//	@Test
//	public void testCalculateMethod() {
//		int result1 = MainController.calculate("John","Alice");
//		System.out.println(result1);
//		int result2= MainController.calculate("John","George");
//		assertEquals(77, result1);
//		assertEquals(61, result2);
//		try {
//			MainController.calculate(null,null);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	@Test
//	public void testFindSumMethod() {
//		int result1 = MainController.findSum(250);
//		int result2 = MainController.findSum(550);
//		assertEquals(7, result1);
//		assertEquals(10, result2);
//		try {
//			MainController.findSum(0);
//			MainController.findSum(-250);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
//
