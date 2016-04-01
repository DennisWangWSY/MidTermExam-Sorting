import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SortingTest {

	private Sorting sort = null;
	@Before
	public void setUp() throws Exception {
		sort = new Sorting();
	}

	@Test
	public void testInsertionSort() {
		int [] a = {5,3,2,8};
		sort.insertionSort(a);
	}

	@Test
	public void testIsSorted() {
		int [] a = {2,3,4};
		assertEquals(true,sort.isSorted(a));
	}
	@Test
	public void testIsSorted2() {
		int [] a = {4,3,2};
		assertEquals(false,sort.isSorted(a));
	}
	@Test
	public void testQuicksort() {
		int [] a = {100,3,4,21,6,28,61,0,15,33,10};
		sort.quicksort(a);
	}
	@Test
	public void testswapReferences(){
		Integer [] a = {10,8};
		sort.swapReferences(a, 0, 1);
	}

}
