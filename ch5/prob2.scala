//编写一个BankAccount类，加入deposit和withdraw方法，和一个只读的balance属性
class BankAccount {
	private var balance = 0
	def deposit (amount: Int) {
		if (balance <= Int.MaxValue - amount)
			balance += amount
	}
	def withdraw (amount: Int) {
		if (balance >= amount)
			balance -= amount
	}
}