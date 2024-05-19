package assignment3;

public class q5 {

    public static class Stack {
        private int arr[];
        private int top;
        private final int SIZE;
        public Stack(int size) {
            SIZE = size;
            arr = new int[SIZE];
            top = -1;
        }

        public void push(int value) {
            top++;
            arr[top] = value;
        }

        public int pop() {
            return arr[top--];
        }

        public int peek() {
            return arr[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == SIZE - 1;
        }
    }

    public static int calculate(int op1, char opr, int op2) {
        switch(opr) {
            case '+': return op1 + op2;
            case '-': return op1 - op2;
            case '/': return op1 / op2;
            case '*': return op1 * op2;
            case '%': return op1 % op2;
            case '$': return (int)Math.pow(op1, op2);
        }
        return 0;
    }

    public static int postfixEvaluate(String postfix) {
        Stack st = new Stack(10);
        for(int i = 0 ; i < postfix.length() ; i++) {
            char ele = postfix.charAt(i);
            if(Character.isDigit(ele))
                st.push(ele - '0');
            else {
                int op2 = st.pop();
                int op1 = st.pop();
                int res = calculate(op1, ele, op2);
                st.push(res);
            }
        }
        if(!st.isEmpty())
            return st.peek();
        return 0;
    }

    public static int prefixEvaluate(String prefix) {
        Stack st = new Stack(10);
        for(int i = prefix.length()-1 ; i >= 0 ; i--) {
            char ele = prefix.charAt(i);
            if(Character.isDigit(ele))
                st.push(ele - '0');
            else {
                int op1 = st.pop();
                int op2 = st.pop();
                int res = calculate(op1, ele, op2);
                st.push(res);
            }
        }
        if(!st.isEmpty())
            return st.peek();
        return 0;
    }

    public static void main(String[] args) {
        String postfix = "456*3/+9+7-";
        System.out.println("Postfix : " + postfix);
        int result = postfixEvaluate(postfix);
        System.out.println("Result : " + result);

        String prefix = "-++4/*56397";
        System.out.println("Prefix  : " + prefix);
        result = prefixEvaluate(prefix);
        System.out.println("Result : " + result);
    }
}
