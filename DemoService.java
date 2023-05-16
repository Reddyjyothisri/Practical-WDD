package com.example.demo;
import org.springframework.stereotype.Service;
@Service
public class DemoService {
public String getStudent(String name, Integer age)
{
return name+",your age is "+ age;
}
}



com.example.demo
