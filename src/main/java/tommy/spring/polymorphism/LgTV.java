package tommy.spring.polymorphism;

public class LgTV implements TV {
	
	public LgTV() {
		System.out.println("LgTV 객체 생성");
	}
	@Override
	public void powerOn() {
		System.out.println("LgTV 전원을 켠다.");
		
	}
	@Override
	public void powerOff() {
		System.out.println("LgTV 전원을 끈다.");
		
	}
	@Override
	public void volumeUp() {
		System.out.println("LgTV 볼륨을 올린다.");
		
	}
	@Override
	public void volumeDown() {
		System.out.println("LgTV 볼륨을 내린다.");
		
	}
}
