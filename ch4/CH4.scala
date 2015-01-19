import scala.collection.JavaConversions.mapAsScalaMap

object Chapter4 {
	//1. 设置一个映射，其中包含你想要的一些装备，以及它们的价格，然后构建另一个映射，采用同一组健，但在价格上打9折
	def prob1 () {
		println("This is problem 1:")
		val map = Map("cup"->7, "cap"->9, "lamp"->20)
		val newMap = new scala.collection.mutable.HashMap[String, Double]
		for ((k, v) <- map) {
			newMap(k) = v * 0.9
		}
		for ((k, v) <- newMap) {
			println(k + ":" + v)
		}
	}

	//2. 编写一段程序，从文件中读取单词。用一个可变打映射来清点每个单词出现的频率
	def prob2 () {
		println("This is problem 2:")
		val f = Array("cat", "dog", "apple", "cat", "cat", "dog", "apple", "pair", "apple", "apple", "apple")
		val map = new scala.collection.mutable.HashMap[String, Int]
		for (elem <- f) {
			if (map.contains(elem)) map(elem) = map(elem) + 1
			else map(elem) = 1
		}
		for ((k, v) <- map) {
			println(k + ":" + v)
		}
	}

	//3. 重复前一个练习，这次用不可变的映射
	def prob3 () {
		println("This is problem 3:")
		val map = scala.collection.immutable.Map("apple"->5, "cat"->3, "dog"->2, "pair"->1)
		for ((k, v) <- map) {
			println(k + ":" + v)
		}
	}

	//4. 重复前一个练习，这次用已排序的映射
	def prob4 () {
		println("This is problem 4:")
		val map = scala.collection.immutable.SortedMap("apple"->5, "cat"->3, "dog"->2, "pair"->1)
		for ((k, v) <- map) {
			println(k + ":" + v)
		}
	}

	//5. 重复前一个练习，用java.util.TreeMap并使之适用于Scala API 
	def prob5 () {
		println("This is problem 5:")
		val f = Array("cat", "dog", "apple", "cat", "cat", "dog", "apple", "pair", "apple", "apple", "apple")
		val rs: scala.collection.mutable.Map[String,Int] = new java.util.TreeMap[String, Int]
		for (elem <- f) {
			if (rs.contains(elem)) rs(elem) = rs(elem) +1
			else rs(elem) = 1
		}
		for ((k, v) <- rs) {
			println(k + ":" + v)
		}
	}

	//8. 找出数组中最小值和最大值的对偶
	def prob8 () {
		println("This is problem 8:")
		val map = Map("a"->19, "b"->8, "c"->20, "d"->7)
		for ((k, v) <- map if ((v == map.values.max) ||(v == map.values.min))) yield println(v)
	}

	//9. 返回数组中小于v,等于v，大于v的数量
	def prob9 () {
		println("This is problem 9:")
		val arr = Array(23, 44, 65, 30, 17, 90)
		val map = scala.collection.mutable.Map("<"->0, "="->0, ">"->0)
		for (elem <- arr) {
			if (elem < 30) map("<") = map("<") + 1
			else if (elem == 30) map("=") = map("=") + 1
			else map(">") = map(">") + 1
		}
		for ((k, v) <- map) println(k + ":" + v)
	}


	def main(args: Array[String]) {
		println("This is chapter4!")
		prob1()
		prob2()
		prob3()
		prob4()
		prob5()
		prob8()
		prob9()
	}
}