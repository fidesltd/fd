package ltd.fdsa.demo.algorithm;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.ReentrantLock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
		// hello h = new hello("test");
		// h.start();
		// MessageQueue mq = new MessageQueue();
		// mq.demo(args);
		ArrayList<String> s = new ArrayList<String>();
		s.add(" Hi");
		s.add(" 您好");
		s.add(" Hey");
		s.add("Hi");
		s.add(" Hello");
		s.add(" 你好");
		s.stream().filter(m -> m.startsWith(" ")).peek(m->m=m.trim() + " test").forEach(m -> System.out.println(m));
 
		// TopNSearch fs = new TopNSearch();
		// fs.demo(args);
		// PrintMatrix matrix = new PrintMatrix();
		// matrix.demo(args);

		// SumTree sumTree = new SumTree();
		// sumTree.demo(args);

		// BFS bfs = new BFS();
		// bfs.demo(args);
		// DynamicPrograming dp = new DynamicPrograming();
		// dp.demo(args);
		// DijkstraAlgorithm da = new DijkstraAlgorithm();
		// da.demo(args);
		// SpringApplication.run(DemoApplication.class, args);
		/*
		 * RandomAccessFile accessFile = new RandomAccessFile("d:\\test\\abc.txt",
		 * "rw"); FileChannel fileChannel = accessFile.getChannel(); byte[] array =
		 * "test".getBytes(); ByteBuffer buffer = ByteBuffer.wrap(array); //
		 * buffer.flip(); fileChannel.write(buffer); fileChannel.close();
		 * accessFile.close(); // stack_over_flow(0, 1); mytask task = new mytask();
		 * FutureTask<Integer> futureTask = new FutureTask<Integer>(task);
		 * futureTask.run(); Integer i = futureTask.get();
		 * 
		 * System.out.println("运行     " + i);
		 */

		return;
		/*
		 * Scanner input = new Scanner(System.in); System.out.println("请输入m:"); int m =
		 * input.nextInt(); System.out.println("请输入n:"); int n = input.nextInt();
		 * System.out.printf("%d*%d的矩阵的路线共有:%d条!\n", m, n, f(m - 1, n - 1));
		 * input.close(); System.out.printf("%d*%d的矩阵的路线共有:%d条!\n", m, n, (n - m) * 2);
		 * 
		 * static int f(int m, int n) { if (m <= 0 || n <= 0) return 1; else return f(m
		 * - 1, n) + f(m, n - 1); }
		 */
	}

}

class mytask implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		Thread.sleep(6000);
		return 6000;
	}

}

class hello extends Thread {

	private String name;

	public hello() {

	}

	public hello(String name) {
		this.name = name;
	}

	public void run() {
		synchronized (this) {
		}

		ReentrantLock lock = new ReentrantLock();
		try {
			lock.lock();

		} finally {
			lock.unlock();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(name + "运行     " + i);

		}

		try {
			Thread.sleep(12);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
