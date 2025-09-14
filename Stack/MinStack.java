package Stack;
import java.util.*;
public class MinStack {
    

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push element x onto stack
    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    // Removes the top element from stack
    public void pop() {
        if (stack.isEmpty()) return;
        int removed = stack.pop();
        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

    // Returns the top element of stack
    public int peek() {
        if (stack.isEmpty()) return -1;
        return stack.peek();
    }

    // Retrieves the minimum element in stack
    public int getMin() {
        if (minStack.isEmpty()) return -1;
        return minStack.peek();
    }

    // Function to process queries
    public static List<Integer> processQueries(int q, int[][] queries) {
        List<Integer> result = new ArrayList<>();
        MinStack minStack = new MinStack();

        for (int i = 0; i < q; i++) {
            int[] query = queries[i];
            if (query[0] == 1) {
                minStack.push(query[1]);
            } else if (query[0] == 2) {
                minStack.pop();
            } else if (query[0] == 3) {
                result.add(minStack.peek());
            } else if (query[0] == 4) {
                result.add(minStack.getMin());
            }
        }
        return result;
    }

    // Example usage
    public static void main(String[] args) {
        int q = 7;
        int[][] queries = {{1, 2}, {1, 3}, {3}, {2}, {4}, {1, 1}, {4}};
        System.out.println(processQueries(q, queries)); // Output: [3, 2, 1]
    }
}


