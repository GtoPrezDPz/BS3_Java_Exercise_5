package com.BS3.BeansLifeCycle;


import org.springframework.stereotype.Service;

@Service
public class FirstClassServiceImpl implements FirstClassService {

    @Override
    public String getMessage(){
      FirstClass firstclass = new FirstClass("Hello from First class");
      return firstclass.toString();

    }

}
