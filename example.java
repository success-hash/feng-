
public class example {
	public static void main(String[] args){
		MyThread2 myThread=new MyThread2();
		myThread.start();
		while(true){
			System.out.println("main()����������");
		}
	}

}
class MyThread2 extends Thread{
	public void run(){
		while (true){
			System.out.println("MyThread���run()����������");
		}
	}
}
