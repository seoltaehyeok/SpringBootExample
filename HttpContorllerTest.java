package com.cos.blog.test;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// 사용자가 요청 -> 응답(HTML파일)
// @Controller

// 사용자가 요청 -> 응답(Data)
@RestController
public class HttpContorllerTest {
	
	//인터넷 브라우저 요청은 무조건 get요청만 가능
	//http://localhost:8000/http/get (select)
	@GetMapping("/http/get")
	public String getTest(Member m) { //id=1&username=ssar&password=1234&email=ssar@nate.com (get요청은 querryString 으로만 가능)
		return "get 요청 : " + m.getId() + ", " + m.getUsername() + ", " + m.getPassword() +", " + m.getEmail();
	}
	
	//http://localhost:8000/http/post (insert)
	@PostMapping("/http/post")
	public String postTest(@RequestBody Member m) {
		return "post 요청 : " + m.getId() + ", " + m.getUsername() + ", " + m.getPassword() +", " + m.getEmail();
	}
	
	//http://localhost:8000/http/put (update)
	@PutMapping("/http/put")
	public String putTest(@RequestBody Member m) {
		return "put 요청 : "+ m.getId() +", "+ m.getPassword();
	}
	
	//http://localhost:8000/http/delete (delete)
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete 요청";
	}
	
	
}
