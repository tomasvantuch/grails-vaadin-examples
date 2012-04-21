package tieto.bank.payment

import tieto.bank.admin.User;

class UserController {

    def index() { }
	
	
	def login(){
		String par = params.login
		User user = User.findByName(par)
		session.user = user
		redirect(controller: 'payment', view:'index')
		
	}
}
