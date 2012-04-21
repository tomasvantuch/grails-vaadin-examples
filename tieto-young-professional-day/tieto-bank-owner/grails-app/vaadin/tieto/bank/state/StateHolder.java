package tieto.bank.state;

import sun.security.jca.GetInstance.Instance;
import tieto.bank.AccountDetailForm;
import tieto.bank.OwnerApp;

public class StateHolder {
	
	
	public static EmptyState EMPTY_STATE = new EmptyState();
	public static PrivateState PRIVATE_STATE = new PrivateState();
	public static CorporateState CORPORATE_STATE = new CorporateState();
	
	
	private AccountDetailForm form;
	private Istate state;
	
	
	
	public StateHolder(AccountDetailForm form, Istate state) {
		super();
		this.form = form;
		this.state = state;
		applyState();
	}

	public void setState(Istate state){
		this.state = state;
		applyState();
	}
	
	private void applyState() {
		state.initBtnRemove(form);
		state.initBtnSave(form);
		state.initTxtAccountBalance(form);
	}
}
