package tieto.bank.state;

import tieto.bank.AccountDetailForm;

public class LoadedState extends Astate {

	@Override
	public void initTxtAccountBalance(AccountDetailForm form) {
		form.txtAccountBalance.setEnabled(true);
		form.txtAccountBalance.setValue(form.account.getBalance());
	}


	
}
