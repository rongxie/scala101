class Car {
	private var mkr = ''
	private var mdl = ''
	private var year = 0
	private var plt = ''

	def this (mkr: String, mdl: String, year: Int = 0, plt: String = '') {
		this()
		this.mkr = mkr
		this.mdl = mdl
		this.year = year
		this.plt = plt
	}
}