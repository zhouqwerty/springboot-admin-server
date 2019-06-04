package com.qwerty.springboot.admin.server.feignclient;

import com.qwerty.springboot.admin.server.entity.DemoEntity2;
import com.qwerty.springboot.admin.server.entity.DemoEntity2;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="admin-client")
@RequestMapping("/test")
public interface TestRemote {
    @RequestMapping("/test4")
    DemoEntity2 test4();
}
