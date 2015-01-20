//编写一个Conversions对象，加入inchesToCentimenters、gallonsToLiters和milesToKilometers方法

object Conversions {
	def inchesToCentimeters(inches: Double) {
		inches * 2.54
	}

	def gallonsToLiters(gallons: Double) {
		gallons * 3.78541
	}

	def milesToKilometers(miles: Double) {
		miles * 1.60934
	}
}