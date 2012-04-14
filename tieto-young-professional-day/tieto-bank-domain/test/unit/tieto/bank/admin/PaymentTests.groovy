package tieto.bank.admin



import grails.test.mixin.*
import grails.validation.ValidationException;

import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Payment)
class PaymentTests {

	//test na pozadovane spravanie
	void testAmountConstraintint() {
		Payment payment = new Payment()
		payment.amount = 5000
		payment.save(failOnError:true)
	}

	//test na pozadovany pad
	void testAmountConstraintfail() {
		//oznacim tu ma spadnut na tuto exception
		shouldFail(ValidationException) {
			Payment payment = new Payment()
			payment.amount = -5000
			payment.save(failOnError:true)
		}
	}

	//TODO dopis test
}
