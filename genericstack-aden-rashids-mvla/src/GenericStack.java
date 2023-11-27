import java.util.ArrayList;
import java.util.EmptyStackException;

// TODO: Auto-generated Javadoc
/**
 * The Class GenericStack.
 *
 * @param <E> the element type
 */

/**
 * @author Your name here
 *
 */
public class GenericStack<E> {

	/** Using an ArrayList as the data structure for the stack */
	private ArrayList<E> stack;
	
	/**
	 * Instantiates a new generic stack.
	 */
	public GenericStack() {
		stack = new ArrayList<E>();
	}
	
	
	
	
	/**
	 * You need to implement the following functions
	 * 
	 */
	
	//a) empty() - returns true if the element is empty
	public boolean empty() {
		if(stack.size() == 0) {
			return true;
		}
		return false;
	}
	
	
	//b) size() - returns the size of the Stack
	public int size() {
		return stack.size();
	}
	
	
	//c) peek() - returns the object that is at the top of the stack. Must throw
	//             appropriate exception if attempt to peek empty stack
	public E peek() {
		if(size() == 0) {
			throw new EmptyStackException();
		}
		return stack.get(stack.size()-1);
		
	}
	
	
	//d) pop() - gets the object at the top of stack, then removes it from 
	//            the stack and returns the object. Must throw appropriate exception if
	//            attempt to pop from empty stack.
	public E pop() {
		if(size() == 0) {
			throw new EmptyStackException();
		}
		E topOfStack = peek();
		stack.remove(stack.size()-1);
		return topOfStack;
	}
	
	
	//e) push(o) - adds the object to the top of stack/
	public void push(E o) {
		stack.add(o);
	}
	
	
	
	/**
	 * 	 * To string
	 * 	 	 *
	 * 	 	 	 * @return the string
	 * 	 	 	 	 */
	@Override
   	public String toString() {
	   return("stack: "+stack.toString());
	}
}
