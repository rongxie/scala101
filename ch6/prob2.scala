//提供一个通用的超类UnitConversion并定义扩展该超类的InchesToCentimeters、GallonsToLiters和MilesToKilometers对象
abstract class UnitConversion {
	def convert(x: Double): Double
}

object InchesToCentimeters extends UnitConversion {
	override def convert(x: Double): Double = {
		x * 2.54
	}
}

object GallonsToLiters extends UnitConversion {
	override def convert(x: Double): Double = {
		x * 3.78541
	}
}

object MilesToKilometers extends UnitConversion {
	override def convert(x: Double): Double = {
		x * 1.60934
	}
}