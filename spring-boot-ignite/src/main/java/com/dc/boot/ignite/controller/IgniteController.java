package com.dc.boot.ignite.controller;

import java.util.Collection;

import javax.cache.Cache.Entry;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.cache.QueryEntity;
import org.apache.ignite.configuration.CacheConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ignite")
public class IgniteController {

	@Autowired
	private Ignite ignite;
	
	@RequestMapping("/entity")
	public void igniteEntities() {
		System.out.println("###############");
		Collection<String> caches = ignite.cacheNames();
		for (String cacheName : caches) {
			IgniteCache<Object, Object> cacheItem = ignite.cache(cacheName);
			CacheConfiguration<Object, Object> cacheConfig = cacheItem.getConfiguration(CacheConfiguration.class);
			
			// Gets a collection of configured query entities.
			Collection<QueryEntity> queryEntities = cacheConfig.getQueryEntities();
			for (QueryEntity entityToQueryItem : queryEntities) {
				
				System.out.println("=========== Query Details Start =============");
				System.out.println(" entityToQueryItem " + entityToQueryItem);
				System.out.println(" getTableName " + entityToQueryItem.getTableName());
				System.out.println(" getIndexes " + entityToQueryItem.getIndexes());
				System.out.println(" getFields " + entityToQueryItem.getFields());
				System.out.println(" getKeyFields " + entityToQueryItem.getKeyFields());
				
				for (Entry<Object, Object> cacheData : cacheItem) {
					System.out.println(" Data >> " + cacheData);
				}
				
				System.out.println("=========== Query Details End =============");
			}
		}
	}
}
