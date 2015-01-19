import scala.util.Random
import scala.collection.mutable.ArrayBuffer

object Chapter3 {
	// 1. 编写一段代码，将a设置成为一个n个随机整数的数组，要求随机数介于0和n之间
	def prob1(n: Int) {
		val rd = new Random()
		val arr = new Array[Int](10)
		for (i <- 0 until n) {
			arr(i) = rd.nextInt(n)
		}
		println(arr.mkString("<",",",">"))
	}

	// 2. 编写一个循环，将整数数组中的相邻元素互换。例如（1，2，3，4，5）经过置换后，变成（2， 1， 4， 3， 5）
	def prob2(arr: ArrayBuffer[Int]) {
		for (i <- 0 until (arr.length, 2) if i+1 < arr.length) {
			val tmp = arr(i)
			arr(i) = arr(i+1)
			arr(i+1) = tmp
		}
		println(arr.mkString("<",",",">"))
	}

	// 3. 重复前一个练习，不过这一次，生成一个新的值交换过的数组
	def prob3(arr: Array[Int]) {
		val rs = new Array[Int](arr.length)
		for (i <- 0 until (arr.length, 2) if i+1 < arr.length) yield {rs(i+1) = arr(i); rs(i) = arr(i+1)}
		if (rs.length % 2 != 0) rs(arr.length-1) = arr(arr.length-1)
		println(rs.mkString("<",",",">"))
	}

	// 4. 给定一个整数数组，产生一个新的数组，包含元素组中的所有正值。用for/yield
	def prob4(arr: Array[Int]) {
		var rs = new ArrayBuffer[Int]()
		for (elem <- arr if elem > 0) yield {rs += elem}
		println(rs.mkString("<",",",">"))
	}

	// 5. 如何计算Array[Double]的平均值
	def prob5(arr: Array[Double]) {
		println(arr.sum/arr.length)
	}

	// 6. 如何重新组织Array[Int]的元素将他们以反序排列？对于ArrayBuffer[Int]你又会怎么做？
	// (1) for () yield
    // (2) swap	

	def main(args:Array[String]) {
		println("This is Chapter3!")
		println("This is problem 1:")
		prob1(10)
		var arr = ArrayBuffer(1, 2, 3, 4, 5)
		println("This is problem 2:")
		prob2(arr)
		println("This is problem 3:")
		val array = Array(1, 2, 3, 4, 5)
		prob3(array)
		println("This is problem 4:")
		val array4 = Array(23, 44, -10, 39, -2, 28)
		prob4(array4)
		println("This is problem 5:")
		val array5 = Array(10.1, 10.1, 10.1)
		prob5(array5)

	}
}
