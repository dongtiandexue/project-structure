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

    public static <S, D> List<D> mapList(Iterable<S> sourceList, Class<D> destinationClass) {
        if(null == sourceList){
            return null;
        }
        List<D> destinationList = new ArrayList<>();
        for (S source : sourceList) {
            destinationList.add(MAPPER.map(source, destinationClass));
        }
        return destinationList;
    }
    
    public static <S, D> D[] mapArray(final S[] sourceArray, final Class<D> destinationClass){
        if(null == sourceArray){
            return null;
        }
        
        D[] destinationArray = ArrayUtil.newArray(destinationClass, sourceArray.length());
        
        int i = 0;
        for (S source : sourceArray){
            if(null != source){
                destinationArray[i] = MAPPER.map(source, destinationClass);
                i++;
            }
        }
    }

}
