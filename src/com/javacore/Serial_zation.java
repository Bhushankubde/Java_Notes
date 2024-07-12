package com.javacore;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial_zation {
    public static void main(String[] args) {
       try{
           Student student = new Student("Kartik","kartik@gamil.com",20,"Pithampur");
           FileOutputStream fios = new FileOutputStream("obj.txt");
           ObjectOutputStream oos = new ObjectOutputStream(fios);
           oos.writeObject(student);
           oos.close();
           fios.close();
           System.out.println("Object state is tranfered into Byte Stream");

       }catch (IOException e){
           e.printStackTrace();
       }

    }
}
