package com.tutorial.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class DriverLite {
    public static void main(String[] args) {
        try {
            DriverLite driver = new DriverLite();
            //create object mapper
            ObjectMapper objectMapper = new ObjectMapper();
            //read JSON file and convert it to POJO
            Student student =
                    objectMapper.readValue( driver.getFile("data/sample-lite.json"), Student.class);
            System.out.println(student);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private File getFile(String fileName){
        return new File(getClass().getClassLoader().getResource(fileName).getFile());
    }
}
