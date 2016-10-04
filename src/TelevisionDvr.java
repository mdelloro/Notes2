
public class TelevisionDvr implements Remote{

	public void play(){
		System.out.println( "play");
	}

	public void stop(){
		System.out.println("stop");
	}

	public void fastFoward(){
		System.out.println("fastfoward");
	}
	public void rewind(){
		System.out.println("rewind");
	}
	public void pause(){
		System.out.println("pause");
	}
	@Override
	public void power(){
		System.out.println("power");
	}
	
	public static void main(String[] args) {
		TelevisionDvr m = new TelevisionDvr();
		m.play();
		m.pause();
		m.power();
		m.stop();
		m.rewind();
		m.fastFoward();
		
	}


}
