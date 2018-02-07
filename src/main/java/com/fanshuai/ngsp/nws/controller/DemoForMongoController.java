package com.fanshuai.ngsp.nws.controller;

import com.fanshuai.ngsp.nws.mongodb.Repository.DemoInfoRepository;
import com.fanshuai.ngsp.nws.mongodb.dto.DemoInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by fanshuai on 2017/9/22.
 * 操作mongo的demo
 */
@RestController
public class DemoForMongoController {

    @Autowired
    private DemoInfoRepository demoInfoRepository;
    @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping("save")
    public String save() {
        DemoInfo demoInfo = new DemoInfo();
        demoInfo.setName("张三");
        demoInfo.setAge(20);
        demoInfoRepository.save(demoInfo);
        demoInfo = new DemoInfo();
        demoInfo.setName("李四");
        demoInfo.setAge(30);
        demoInfoRepository.save(demoInfo);
        return "ok";
    }


    @RequestMapping("find")
    public List<DemoInfo> find() {
        return demoInfoRepository.findAll();
    }


    @RequestMapping("findByName")
    public DemoInfo findByName() {
        return demoInfoRepository.findByName("张三");
    }

    //访问地址：http://127.0.0.1:8080/find2
    @RequestMapping("find2")
    public List<DemoInfo> find2() {
        return mongoTemplate.findAll(DemoInfo.class);
    }
}
