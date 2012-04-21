package tieto.bank

import static org.junit.Assert.*

import grails.test.mixin.*
import grails.test.mixin.support.*
import groovy.mock.interceptor.MockFor

import org.junit.*
import tieto.bank.AccountDetailForm
import tieto.bank.admin.Account
import tieto.bank.admin.AccountType
import tieto.bank.admin.User

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
@Mock([User,Account])
class AccountDetailFormPrivateStateTests {

    void setUp() {
        form = AccountDetailForm()
		Account acc = new Account()
		
		acc.balance = 1000
		acc.type = AccountType.Private
		User user = new User()
		user.name = "name"
		user.save(failOnError:true)
		acc.owner = user
		acc.save(failOnError:true)
		form.setAccount(acc)
    }

    void testEmptyState_txtAccountBalance_isEnabled() {
		boolean enabled = form.txtAccountBalance.isEnabled()
		assertEquals(true, enabled)
    }
	
	void testEmptyState_txtAccountBalance_getValue() {
		int value = form.txtAccountBalance.getValue()
		assertEquals(1000, value)
	}
}
