package com.example.restex.service;

import com.example.restex.dto.Info;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String myName(String name){
        if(name != null){
            return "my name is" + name;
        }else{
            return "no name param";
        }
    }

    public String myAge(Integer age){
        if(age != null){
            return "my age is" + age;
        }else{
            return "no age param";
        }
    }

    public String myInfo(Info info){
        return myName(info.getName())+ "/" +myAge(info.getAge());
    }

    public String myInfoWithRole(String role, Info info){
        return role + "/" +myInfo(info);
    }
}
