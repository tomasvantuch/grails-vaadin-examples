package tieto.bank.state;

import tieto.bank.AccountDetailForm;

public interface Istate {
	
	public void initTxtAccountBalance(AccountDetailForm form);
	public void initBtnRemove(AccountDetailForm form);
	public void initBtnSave(AccountDetailForm form);
	

}
