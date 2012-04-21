package tieto.bank.admin


class Payment {
	

	Date date

	Integer amount

	Account from

	Account to

	static constraints = {
		//amount must be higher than 0
		amount min: 50
		date nullable:true
		from nullable:true
		to nullable:true
	}

	def beforeValidate(){
		date = new Date()
	}
}
