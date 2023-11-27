import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * @author Your name here
 *
 */
@TestMethodOrder(OrderAnnotation.class)
class GenericStackTest {
	
	int[] testData = {1, 20, 35, 90, 50};
	
	
	
	
	/**
	 * Tests proper behavior of empty() and size() methods when the stack actually is empty.
	 */
	@Test
	@Order(1)
	void test_EmptyStack() {
		GenericStack gs = new GenericStack();
		System.out.println("Error Checking Test: detect if stack is empty");
		assertEquals(0, gs.size());
		assertEquals(true, gs.empty());
		System.out.println("Error Checking for empty stack PASSED");
	}
	
	/**
	 * Test that stack exceptions are appropriately thrown by peek and pop methods.
	 */
	@Test
	@Order(2)
	void test_StackExceptions() {
		GenericStack gs = new GenericStack();
		System.out.println("Error Checking Test: detect stack exceptions");
		assertThrows(EmptyStackException.class, () -> gs.peek());
		assertThrows(EmptyStackException.class, () -> gs.pop());
		System.out.println("Error Checking for throwing stack exceptions PASSED");
	}
	
	/**
	 * Test push and peek methods. Must actually check:
	 * a) size(), empty() behave correctly
	 * b) data is correctly stored in LIFO order.
	 */
	@Test
	void test_PushPeek() {	
		GenericStack gs = new GenericStack();
		System.out.println("Error Checking Test: push and peek");
		for(int i = 0; i < testData.length; i++) {
			gs.push(testData[i]);
		}
		assertEquals(5, gs.size());
		assertEquals(false, gs.empty());
		assertEquals(50, gs.peek());
		System.out.println(gs);
		System.out.println("Error Checking for push and peek PASSED");
	}

	/**
	 * Test pop - tests that 
	 * a)  data is retrieved from the stack in LIFO order, and
	 * b)  that size(), empty() behave as expected.
	 */
	@Test
	void test_Pop() {
		GenericStack gs = new GenericStack();
		System.out.println("Error Checking Test: pop");
		for(int i = 0; i < testData.length; i++) {
			gs.push(testData[i]);
		}
		assertEquals(5, gs.size());
		assertEquals(false, gs.empty());
		assertEquals(50, gs.pop());
		assertEquals(4, gs.size());
		System.out.println(gs);
		System.out.println("Error Checking for pop PASSED");
	}

}
