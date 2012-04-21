package tieto.bank.state;

import java.util.List;

import tieto.bank.AccountDetailForm;
import tieto.bank.OwnerApp;
import tieto.bank.admin.Account;

public class EmptyState extends Astate{

	@Override
	public void initTxtAccountBalance(AccountDetailForm form) {
		
		super.initTxtAccountBalance(form);
		form.txtAccountBalance.setValue(0);
	}

	
}
