package tieto.bank.state;

import tieto.bank.AccountDetailForm;

public class PrivateState extends LoadedState{


	@Override
	public void initBtnSave(AccountDetailForm form) {
		form.btn_save.setEnabled(true);
	}
	

}
