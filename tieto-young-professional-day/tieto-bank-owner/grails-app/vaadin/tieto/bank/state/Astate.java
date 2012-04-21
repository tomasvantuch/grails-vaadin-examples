package tieto.bank.state;

import tieto.bank.AccountDetailForm;

public abstract class Astate implements Istate{

	@Override
	public void initTxtAccountBalance(AccountDetailForm form) {
		form.txtAccountBalance.setEnabled(false);
		
	}

	@Override
	public void initBtnRemove(AccountDetailForm form) {
		form.btr_remove.setEnabled(false);
	}

	@Override
	public void initBtnSave(AccountDetailForm form) {
		form.btn_save.setEnabled(false);
	}

	
}
