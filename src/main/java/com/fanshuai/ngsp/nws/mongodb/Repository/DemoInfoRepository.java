package com.fanshuai.ngsp.nws.mongodb.Repository;

import com.fanshuai.ngsp.nws.mongodb.dto.DemoInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.io.Serializable;

/**
 * Created by fanshuai on 2017/9/22.
 */

public interface DemoInfoRepository<T, ID extends Serializable> extends MongoRepository<DemoInfo, String> {

    DemoInfo findByName(String name);

}
