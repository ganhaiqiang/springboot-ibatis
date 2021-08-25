package com.example.demo;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Main {
	public static void main(String[] args) {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("now", new Date());
		String aaaString=JSON.toJSONString(map, SerializerFeature.WriteDateUseDateFormat);
		System.out.println(aaaString);
	}
}
