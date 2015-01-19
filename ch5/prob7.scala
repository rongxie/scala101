//编写一个Person类，其主构造器接受一个字符串，该字符串包含名字、空格和姓，如new Person("Fred Smith")。提供只读属性firstName, lastName
class Person (str: String){
	private val firstName = str.split(' ')(0)
	private val lastName = str.split(' ')(1)
}