package com.kob.kackend.cotroller.pk;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pk/")
public class BotinfoController {

    @RequestMapping("getbotinfo/")
    public Map<String,String> getBotInof(){
        Map<String,String> map = new HashMap<>();
        map.put("name", "tiger");
        return map;
    }
}
