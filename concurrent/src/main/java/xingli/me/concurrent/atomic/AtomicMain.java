package xingli.me.concurrent.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author xingli13
 * @date 2018/11/14
 */
public class AtomicMain {
		private static AtomicInteger i = new AtomicInteger(0);
//	private static int i = 0;

	public static void main(String[] args) {
		Runnable runnable = () -> {
			for (int k = 0; k < 5000; k++) {
//				System.out.println(Thread.currentThread().getName() + ":" + i++);
				System.out.println(i.addAndGet(1));
			}
		};
		for (int j = 0; j < 30; j++) {
			new Thread(runnable).start();
		}
		System.out.println("finish");
	}
}
