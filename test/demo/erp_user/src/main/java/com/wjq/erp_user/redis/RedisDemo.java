package com.wjq.erp_user.redis;

import com.wjq.erp_user.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("redis")
public class RedisDemo {

    @Autowired
    private RedisUtils<Map<String,Object>> redis;

    @GetMapping("testRedis")
    public Map<String,Object> testRedis(){
        System.out.println("进入方法");
        Map<String, Object> map = new HashMap<>();
//        map.put("1",1);
//        map.put("2",2);
//        map.put("3",3);
//        redis.setHash("demo","test",map);
        Map<String, Object> redisHash = redis.getHash("demo", "test");
        return redisHash;
    }
}
