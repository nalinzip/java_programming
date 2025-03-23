package Sync;

class Producer implements Runnable {
	private final CarFactory factory;
	private final String partName;
	private final int produceCount;
	private final long interval;
	public Producer(CarFactory factory, String partName, int produceCount, long interval) {
		this.factory  = factory;
		this.partName = partName;
		this.produceCount = produceCount; 
		this.interval = interval;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=0; i< produceCount; i++) {
				Thread.sleep(interval);
				factory.produce(partName,1);
			}
			System.out.println(partName + " 생산 완료 후 스레드 종료.");
		} catch (InterruptedException e) {
			System.out.println(partName + " 생산 스레드가 중단되었습니다.");
		}
		
	}
	

}
