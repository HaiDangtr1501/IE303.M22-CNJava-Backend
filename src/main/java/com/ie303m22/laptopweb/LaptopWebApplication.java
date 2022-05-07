package com.ie303m22.laptopweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ie303m22.laptopweb.model.User;
import com.ie303m22.laptopweb.repository.UserRepository;


@SpringBootApplication
public class LaptopWebApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(LaptopWebApplication.class, args);
	}
	
	@Autowired
	private UserRepository userrepository;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setUserName("HaiDang");
		user.setPassword("123456");
		user.setDisplayName("Hải Đăng");
		user.setEmail("abc@gmail.com");
		userrepository.save(user);
		
		User user1 = new User();
		user1.setUserName("KhanhDuy");
		user1.setPassword("123456");
		user1.setDisplayName("Khánh Duy");
		user1.setEmail("abcd@gmail.com");
		userrepository.save(user1);
		
		User user2 = new User();
		user2.setUserName("TuanNghia");
		user2.setPassword("123456");
		user2.setDisplayName("Tuấn Nghĩa");
		user2.setEmail("abcde@gmail.com");
		userrepository.save(user2);
		
		User user3 = new User();
		user3.setUserName("QuangKhai");
		user3.setPassword("123456");
		user3.setDisplayName("Quang Khải");
		user3.setEmail("abcdef@gmail.com");
		userrepository.save(user3);
	}

}
