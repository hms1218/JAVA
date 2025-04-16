package test;

public class Student {
	String name;
    int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printInfo(){
        System.out.printf("이름: %s, 나이: %d세\n",this.name,this.age);
    }
}
