//编写一个Person类，提供一个主构造器，将负年龄转换为0
class Person (private var age: Int = 0){
	if (age < 0) age = 0
	//private var age = 0
}