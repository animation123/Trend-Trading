package cn.how2j.trend.service;

import java.util.List;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import cn.how2j.trend.pojo.IndexData;
import cn.hutool.core.collection.CollUtil;

@Service
@CacheConfig(cacheNames="index_datas")
public class IndexDataService {

    @Cacheable(key="'indexData-code-'+ #p0")
    public List<IndexData> get(String code){
    	return CollUtil.toList();
    }
}
