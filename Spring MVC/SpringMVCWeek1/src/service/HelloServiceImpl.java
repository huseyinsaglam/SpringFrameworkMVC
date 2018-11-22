package service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public String createMessage() {
		
		return "created message!";
	}

}
