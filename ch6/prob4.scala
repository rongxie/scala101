//定义一个Point类和一个伴生对象，使得我们可以不用new而直接用Point(3, 4)来构造Point实例
class Point {
	private var x, y = 0
	private def this(a: Int, b: Int) {
		this()
		x = a
		y = b
	}
}

object Point {
	def apply(a: Int, b: Int) = new Point(a, b)
}