package com.nit.type_parameter;



class Accept<T>  //Type parameter
{
	private T data;
	
	public Accept(T data)  //Student data->
	{
		super();
		this.data=data;
	}
	
	public T getData()
	{
		return this.data;
	}
}

public class TypeParameterDemo {

	public static void main(String[] args) 
	{
		Accept<Integer> intType = new Accept<Integer>(12);
		System.out.println("Integer Type is :"+intType.getData());
		
		Accept<Double> doubleType = new Accept<Double>(12.90);
		System.out.println("Double Type is :"+doubleType.getData());
		
		Accept<Character> CharType = new Accept<Character>('A');
		System.out.println("Character Type is :"+CharType.getData());
		
		Accept<Student> studentType = new Accept<Student>(new Student(111, "scott"));
		System.out.println("Student type is :" + studentType.getData());
		
	}
}

class Student
{
	private int id;
	private String name;
	
	public Student(int id, String name)
	{
		super();
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
