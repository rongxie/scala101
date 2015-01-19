//编写一个Time类，加入只读属性hours和minutes, 和一个检查某一时刻是否早于另一时刻的方法before (other: Time): Boolean.Time对象应该以new Time(hrs, min)方式构建，其中hrs小时数以军用时间格式呈现
class Time {
	private var hours = 0
	private var minutes = 0 

	def this(h:Int, m:Int) {
		this()
		this.hours = h
		this.minutes = m
	}

	def before (other: Time) {
		if (this.hours == other.hours) {
			this.minutes - other.minutes < 0
		}
		this.hours - other.hours < 0
	}
}