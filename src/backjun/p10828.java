package backjun;

import java.util.Scanner;

public class p10828 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack myStack = new MyStack();

        int input = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < input; i++) {
            String commandLine = sc.nextLine();

            String[] split = commandLine.split(" ");

            String command = split[0];

            switch (command) {
                case "push" :
                    myStack.push(Integer.parseInt(split[1]));
                    break;
                    
            }
        }

    }


    static class MyStack {

        private static final int DEFAULT_CAPACITY = 10;
        private int capacity;
        private int size;
        private int[] data;

        public MyStack() {
            this.capacity = DEFAULT_CAPACITY;
            this.size = 0;
            this.data = new int[capacity];
        }

        // 정수 X를 스택에 넣는 연산이다.
        public void push(int x) {
            if (size == capacity) {
                int[] newData = new int[capacity * 2];
                System.arraycopy(data, 0, newData, 0, size);
                data = newData;
            }
            data[size++] = x;
        }

        // empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
        public int isEmpty() {
            if (size == 0) {
                return 1;
            } else {
                return 0;
            }
        }

         // 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        public int pop() {
            if (isEmpty() == 1) {
                return -1;
            }
            return data[--size];
        }

        // 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        public int top() {
            if (isEmpty() == 1) {
                return -1;
            }
            return data[size - 1];
        }

        // 스택에 들어있는 정수의 개수를 출력한다.
        public int size() {
            return size;
        }


    }

}
