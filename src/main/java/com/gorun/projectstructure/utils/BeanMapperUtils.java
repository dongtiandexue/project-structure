package com.gorun.projectstructure.utils;

import org.dozer.DozerBeanMapperBuilder;
import org.dozer.Mapper;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author go run
 * @Description: 实体类之间快速转换赋值工具类
 * @date 2020/5/10 22:39
 */
public class BeanMapperUtils {

    private static Mapper MAPPER = DozerBeanMapperBuilder.buildDefault();

    public static <T> T map(Object source, Class<T> destinationClass) {
        if (source == null) {
            return null;
        }
        return MAPPER.map(source, destinationClass);
    }

    /**
     * 将源对象source中的属性值赋值给目标对象destination
     * @param source 源对象
     * @param destination 目标对象
     */
    public static void map(Object source, Object destination) {
        MAPPER.map(source, destination);
    }

    public static <T> List<T> mapList(Collection sourceList, Class<T> destinationClass) {
        List<T> destinationList = new ArrayList<>();
        for (Object sourceObject : sourceList) {
            destinationList.add(MAPPER.map(sourceObject, destinationClass));
        }
        return destinationList;
    }

}
