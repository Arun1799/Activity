package threads;

class PrintData2
{
	synchronized static void multi(int n) {
		
		synchronized(PrintData2.class) {
			
			for(int i=1; i<=5; i++) {
				System.out.println(n+"+ "+i+"= "+n*i);
				try {
					Thread.sleep(400);
				}
				catch(InterruptedException e) {
					System.out.println(e.getMessage());
				}
				
			}
		}
	}
}

class PrintData3{
	synchronized static void addition(int a,int b) {
		synchronized(PrintData2.class) {
			System.out.println("Addition:"+(a+b));
			try {
				Thread.sleep(400);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class SyanDemo2 {

	public static void main(String[] args) {
		PrintData2 pd2=new PrintData2();
		PrintData3 pd3=new PrintData3();
		
		Thread t1 =new Thread() {
			public void run() {
				pd2.multi(2);
			}
		};
		Thread t2 =new Thread() {
			public void run() {
				pd2.multi(3);
			}
		};
		Thread t3 =new Thread() {
			public void run() {
				pd3.addition(4,3);
			}
		};
		Thread t4 =new Thread() {
			public void run() {
				pd3.addition(43,36);
			}
		};
		t1.start();

		t2.start();
		t3.start();
		t4.start();
	}

}
