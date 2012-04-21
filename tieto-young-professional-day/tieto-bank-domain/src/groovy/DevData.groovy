import tieto.bank.admin.Account
import tieto.bank.admin.AccountType
import tieto.bank.admin.Payment
import tieto.bank.admin.User

/**
 * 
 */

/**
 * @author ondrejkvasnovsky
 *
 */
class DevData {
 
	void insert() {
		def saveparams = [failOnError:true, flush:true]
		
		User user1 = new User(name:"Kristyna Wasylkiwova");
		user1.save(saveparams)
		User user2 = new User(name:"Petra Karasova");
		user2.save(saveparams)

		Account a1 = new Account(balance:200, owner:user1, type:AccountType.Private)
		a1.save(saveparams)
		Account a2 = new Account(balance:2000, owner:user1, type:AccountType.Corporate)
		a2.save(saveparams)

		Account a3 = new Account(balance:-500, owner:user2, type:AccountType.Private)
		a3.save(saveparams)
		Account a4 = new Account(balance:-10000, owner:user2, type:AccountType.Corporate)
		a4.save(saveparams)
		Account a5 = new Account(balance:900, owner:user2, type:AccountType.Private)
		a5.save(saveparams)
		
		Payment p = new Payment()
		p.amount = 4000
		p.from = a1
		p.to = a2
		p.save(saveparams)
		
		Payment p1 = new Payment()
		p1.amount = 1000
		p1.from = a1
		p1.to = a2
		p1.save(saveparams)
		
		Payment p2 = new Payment()
		p2.amount = 2500
		p2.from = a2
		p2.to = a1
		p2.save(saveparams)

	}
}
