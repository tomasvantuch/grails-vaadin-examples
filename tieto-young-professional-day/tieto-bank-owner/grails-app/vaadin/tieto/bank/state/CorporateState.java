package tieto.bank.state;

import tieto.bank.AccountDetailForm;

public class CorporateState extends LoadedState {

	@Override
	public void initBtnRemove(AccountDetailForm form) {
		form.btn_save.setEnabled(true);
	}

	@Override
	public void initBtnSave(AccountDetailForm form) {
		form.btr_remove.setEnabled(true);
	}

	
	
}
