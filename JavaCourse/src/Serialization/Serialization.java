package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Serialization:
//It is the conversion of a java object into a static stream (sequence) of bytes, which we can then save to a database or transfer over a network.
//Classes that are eligible for serialization need to implement a special marker interface,Seralizable.The JVM allows special privilages to the class which implememnts  the serializable inteface.
//Byte stream is platfrom-independent.but the java object is platform dependent.This means that once you have a stream of bytes you can convert it into an object nad run  it on any kind of environment.
//A class to be serializable successfully,two conditions must be met--
//1-The class must implement the java.io.Serializable.
//2-All of the f

class Student implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setId(01);
		s.setName("Sandeep");
		FileOutputStream fileOutputStream = new FileOutputStream(
				"C:\\Users\\sanje\\Desktop\\SerializationDemo\\Sandeep.file");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(s);
		objectOutputStream.close();
		fileOutputStream.close();
		
		//Deserialize
		//Deserialization is precisely the opposite of serialization.With deserialization, youn start with a byte stream and recreated the object you previously serialized in its original state.however you must have the defination of the object to successfully recreate it.
		FileInputStream fileInputStream=new FileInputStream("C:\\Users\\sanje\\Desktop\\SerializationDemo\\Sandeep.file");
        ObjectInputStream inputStream=new ObjectInputStream(fileInputStream);
        Student reCreatedObj=(Student) inputStream.readObject();
        System.out.println(reCreatedObj.getName());
        inputStream.close();
        fileInputStream.close();
	}

}
