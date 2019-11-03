
public class runnable {
	public static void main(String[] args) {
		MyThread3 myThread=new MyThread3();
		Thread thread=new Thread(myThread);
		thread.start();
		 int number1=100;
		while(true){
			if(number1>0&&number1<101){
				System.out.println("main");
				number1--;
			}
		}
	}

}
class MyThread3 implements Runnable{
	private int number=50;
	public void run(){
		while(true){
			if(number>0&&number<51){
				System.out.println("new");
				number--;
			}
		}
	}
}