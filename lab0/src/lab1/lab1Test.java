package lab1;
//import lab1.Pain;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;

class lab1Test {
	
	Pain ob = new Pain();
	
	@org.junit.jupiter.api.Test
	void testfindTones() {
		assertEquals(235, ob.findTones(235100));
	}
	
	@org.junit.jupiter.api.Test
	void testIsOdd() {
		assertEquals(false, ob.isOdd(8));
	}
	
	@org.junit.jupiter.api.Test
	void testIsOdd2() {
		assertEquals(true, ob.isOdd(9));
	}
	
	@org.junit.jupiter.api.Test
	void testPlusMinus() {
		assertEquals(9, ob.plusMinus(8));
	}
	
	@org.junit.jupiter.api.Test
	void testGrade() {
		assertEquals("Excellent", ob.Grade(5));
	}
	
	@org.junit.jupiter.api.Test
	void testLoop() {
		int arr[]= {5,6,7,8,9};
		int check[]=ob.loop(5,9);
		Arrays.equals(arr, check);
	}
	
	@org.junit.jupiter.api.Test
	void testSquare()
	{
		assertEquals(4, ob.square());
	}
	
	@org.junit.jupiter.api.Test
	void testArray()
	{
		int arr[] = {2,4,8,16,32,64};
		Arrays.equals(arr, ob.array(6));
	}
	
	@org.junit.jupiter.api.Test
	void testMatrix()
	{
		int matr[][]={{0,5,10},{0,5,10}};
		Arrays.equals(matr, ob.matrix(2,3));
		
	}
}
