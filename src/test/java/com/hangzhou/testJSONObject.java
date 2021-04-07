package com.hangzhou;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class testJSONObject {
    public static void main(String[] args) {
        /**
         * {"code":"200","message":"","body":[{"id":"0000aace8ac041f7bffac80a9d1f2024","user_name":"叶燕丹","mobile":"13655707744","idNumber":"330825198210060014"}]}
         */
        JSONObject param = JSONObject.parseObject("{\"code\":\"200\",\"message\":\"\",\"body\":[{\"id\":\"0000aace8ac041f7bffac80a9d1f2024\",\"user_name\":\"叶燕丹\",\"mobile\":\"13655707744\",\"idNumber\":\"330825198210060014\"}]}");
        String body = param.getString("body");
        List<Person> people = JSONArray.parseArray(body, Person.class);
        System.out.println(people.get(0).toString());

    }
}

@Data
class Person{
    public String user_name;
    public String mobile;
    public String id;
    public String idNumber;
}