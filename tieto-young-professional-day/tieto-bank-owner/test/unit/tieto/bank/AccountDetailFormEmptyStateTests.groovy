package tieto.bank

import static org.junit.Assert.*

import grails.test.mixin.*
import grails.test.mixin.support.*
import org.junit.*

import tieto.bank.AccountDetailForm
import tieto.bank.admin.Account

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class AccountDetailFormEmptyStateTests {
	
	AccountDetailForm form

    void setUp() {
        form = AccountDetailForm()
		Account acc = new Account()
		form.account = acc
    }

    void tearDown() {
        // Tear down logic here
    }

    void testEmptyState_txtAccountBalance_isEnabled() {
		boolean enabled = form.txtAccountBalance.isEnabled()
		assertEquals(false, enabled)
    }
	
	void testEmptyState_txtAccountBalance_getValue() {
		int value = form.txtAccountBalance.getValue()
		assertEquals(0, value)
	}
}
