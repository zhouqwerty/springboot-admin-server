package com.qwerty.springboot.admin.server;

import com.qwerty.springboot.admin.server.feignclient.TestRemote;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServerApplicationTests {

	@Autowired
	private TestRemote testRemote;

	@Test
	public void contextLoads() {
		System.out.println("------------------result--------------------"+testRemote.test4());
	}

}
