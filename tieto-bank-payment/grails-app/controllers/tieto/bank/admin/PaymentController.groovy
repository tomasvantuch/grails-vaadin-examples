package tieto.bank.admin



class PaymentController {

    def index() { 
		List payments = Payment.list()
		return [payments:payments, 'size':payments.size()]
		}
	
	
	def delete(){
		Long pid = params.id as Long
		def p = Payment.get(pid)
		p?.delete()
		redirect(view:'index')
	}
}
