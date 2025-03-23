package Sync;

import java.util.Scanner;

public class CarAssemblyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		//각 부품을 생산하는 스레드 생성 
		System.out.println("과제#9 이화여대 2371001 HEIMVICHIT NUNNALIN");
		System.out.println("\nRunnable Interface 사용한 스레드");
		System.out.print("\n생산 자동차 대수(바퀴4, 몸체1,문3): ");
		int carNum = key.nextInt();
		CarFactory factory = new CarFactory();
	
		
		Thread wheelProducer = new Thread(new Producer(factory, "Wheel", carNum*4, 1000));
		Thread doorProducer = new Thread(new Producer(factory, "Door", carNum*3, 1500));
		Thread bodyProducer = new  Thread(new Producer(factory, "Body", carNum*1, 2000));
		
		Thread assembler = new Thread(factory::assembleCar);
		
		wheelProducer.start();
		doorProducer.start();
		bodyProducer.start();
		assembler.start();
		
	}

}
