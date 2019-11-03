public class text01 {
	public static void main(String[] args){
		Passenger pg=new Passenger();
        new Thread(pg,"司机1").start();
		new Thread(pg,"司机2").start();
		new Thread(pg,"司机3").start();
		new Thread(pg,"司机4").start();
		new Thread(pg,"司机5").start();
	}
}
class Passenger implements Runnable{
	private int passengers=100;
	public void run(){
		while(true){
			if(passengers>0){
				Thread th=Thread.currentThread();
				String th_name=th.getName();
				System.out.println(th_name+"正在送第"+passengers--+"位乘客");
			}
		}
	}
}
