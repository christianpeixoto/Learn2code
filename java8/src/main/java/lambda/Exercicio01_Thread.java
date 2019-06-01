package lambda;

public class Exercicio01_Thread {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Interna 1");				
			}
		});
		
		
		Thread t2 = new Thread(() -> System.out.println("Interna 2"));
		
		t1.start();
		t2.start();
		
		System.out.println("Principal");	
	}
}
