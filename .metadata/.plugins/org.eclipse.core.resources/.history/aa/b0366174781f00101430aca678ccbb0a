package com.string;

public class String {

	public static void main(java.lang.String[] args) {
		 // Single-threaded: StringBuilder is preferable
        StringBuilder sb = new StringBuilder("Count: ");
        for (int i = 0; i < 5; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString());  // Output: Count: 0 1 2 3 4 

        // Thread-safe use case: StringBuffer
        StringBuffer shared = new StringBuffer("Shared: ");
        Runnable r = () -> {
            for (int i = 0; i < 3; i++) {
                shared.append(Thread.currentThread().getName()).append(" ");
                System.out.println(shared.toString());
            }
        };
        Thread t1 = new Thread(r, "A");
        Thread t2 = new Thread(r, "B");
        t1.start();
        t2.start();
        // join omitted for brevity

	}

}
