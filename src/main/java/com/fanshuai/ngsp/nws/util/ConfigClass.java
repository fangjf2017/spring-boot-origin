package com.fanshuai.ngsp.nws.util;

/**
 * Created by fanshuai on 2017/9/18.
 */

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * classpath路径：locations={"classpath:application-bean1.xml","classpath:application-bean2.xml"}
 * file路径： locations = {"file:d:/test/application-bean1.xml"};
 */

@Configuration
@ImportResource(locations = {"classpath:application-bean.xml"})
public class ConfigClass {

}