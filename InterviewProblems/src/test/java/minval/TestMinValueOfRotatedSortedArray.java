//package test.java.minval;
//
//import static org.junit.Assert.*;
//
//import org.junit.Test;
//
//import main.java.minval.MinValueOfRoatatedSortedArray;
//import main.java.minval.MinValueOfRoatatedSortedArrayException;
//
//public class TestMinValueOfRotatedSortedArray {
//
//	MinValueOfRoatatedSortedArray<Integer> min = new MinValueOfRoatatedSortedArray<>();
//
//	@Test
//	public void test() throws MinValueOfRoatatedSortedArrayException {
//		Integer[] a = new Integer[]{3,4,5,6,7,1,2};
//		int result = min.findMin(a);
//		assertEquals(1, result);
//	}
//
//	@Test
//	public void testOneValue() throws MinValueOfRoatatedSortedArrayException {
//		Integer[] a = new Integer[]{3};
//		int result = min.findMin(a);
//		assertEquals(3, result);
//	}
//
//	@Test
//	public void testTwoValues() throws MinValueOfRoatatedSortedArrayException {
//		Integer[] a = new Integer[]{3,4};
//		int result = min.findMin(a);
//		assertEquals(3, result);
//	}
//
//	@Test
//	public void testThreeValues() throws MinValueOfRoatatedSortedArrayException {
//		Integer[] a = new Integer[]{3,4,2};
//		int result = min.findMin(a);
//		assertEquals(2, result);
//	}
//
//	@Test (expected=MinValueOfRoatatedSortedArrayException.class)
//	public void testNull() throws MinValueOfRoatatedSortedArrayException {
//		int result = min.findMin(null);
//	}
//
//	@Test (expected=MinValueOfRoatatedSortedArrayException.class)
//	public void testEmpty() throws MinValueOfRoatatedSortedArrayException {
//		Integer[] a = new Integer[]{};
//		int result = min.findMin(a);
//	}
//}
