package com.tuniu.ngsp.nws.mongodb.service;

import com.tuniu.ngsp.nws.mongodb.Repository.DemoInfoRepository;
import com.tuniu.ngsp.nws.mongodb.dto.DemoInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import java.io.Serializable;
import java.util.List;

/**
 * Created by fanshuai on 2017/9/22.
 */
@Component
public class DemoInfoRepositoryImpl implements DemoInfoRepository {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public DemoInfo findByName(String name) {
        Query query=new Query(Criteria.where("name").is(name));
        return mongoTemplate.findOne(query,DemoInfo.class);
    }

    @Override
    public List save(Iterable iterable) {
        return null;
    }

    @Override
    public Object save(Object o) {
        return null;
    }

    @Override
    public Object findOne(Serializable serializable) {
        return null;
    }

    @Override
    public boolean exists(Serializable serializable) {
        return false;
    }

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public Iterable findAll(Iterable iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Serializable serializable) {

    }

    @Override
    public void delete(Object o) {

    }

    @Override
    public void delete(Iterable iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List findAll(Sort sort) {
        return null;
    }

    @Override
    public Page findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List findAll(Example example, Sort sort) {
        return null;
    }

    @Override
    public List findAll(Example example) {
        return null;
    }

    @Override
    public List insert(Iterable iterable) {
        return null;
    }

    @Override
    public Object insert(Object o) {
        return null;
    }

    @Override
    public Object findOne(Example example) {
        return null;
    }

    @Override
    public Page findAll(Example example, Pageable pageable) {
        return null;
    }

    @Override
    public long count(Example example) {
        return 0;
    }

    @Override
    public boolean exists(Example example) {
        return false;
    }
}
