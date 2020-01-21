package tommy.spring.web.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class UserServiceClient {

	public static void main(String[] args) {
		//1. 스프링 컨테이너 구동
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		//2. 스프링 컨테이너로부터 UserServiceImpl 객체 Lookup
		UserService userService = (UserService)container.getBean("userService");
		//3. 로그인 기능테스트
		UserVO vo = new UserVO();
		vo.setId("tommy");
		vo.setPassword("spring");
		UserVO user = userService.getUser(vo);
		if(user != null) {
			System.out.println(user.getName() + "님 환영합니다.");
		} else {
			System.out.println("로그인 실패");
		}
		container.close();
	}

}
