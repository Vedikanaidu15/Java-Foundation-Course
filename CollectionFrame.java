import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Java");
		linkedList.add("Python");
		linkedList.add("C++");
		linkedList.add("DBMS");  
		System.out.println(linkedList);
		System.out.println(linkedList.get(0));
		

	}

}

import java.util.Stack;

public class StackExample {
        public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("Java");
		stack.push("Python");
		stack.push("C++");
		stack.push("DBMS");
		System.out.println(stack);
		System.out.println(stack.peek());
	    stack.pop();
	    System.out.println(stack);
	}            

}
