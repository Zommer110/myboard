package tommy.spring.polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {
	@Autowired
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("LgTV °´Ã¼ »ý¼º");
	}
	@Override
	public void powerOn() {
		System.out.println("LgTV Àü¿øÀ» ÄÒ´Ù.");
		
	}
	@Override
	public void powerOff() {
		System.out.println("LgTV Àü¿øÀ» ²ö´Ù.");
		
	}
	@Override
	public void volumeUp() {
		speaker.volumeUp();
		
	}
	@Override
	public void volumeDown() {
		speaker.volumeDown();
		
	}
}
