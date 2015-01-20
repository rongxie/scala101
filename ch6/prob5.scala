//编写一个scala程序，使用App特质，以反序打印命令行参数，用空格隔开
//scala Reverse Hello World应该打印出World Hello
object Reverse extends App {
	if (args.length > 0) {
		for (i <- 0 until args.length) {
			print(args(args.length-1-i) + ' ')
		}
	}
	println()
}