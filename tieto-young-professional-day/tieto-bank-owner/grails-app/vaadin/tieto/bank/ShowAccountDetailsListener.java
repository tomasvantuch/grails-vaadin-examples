package tieto.bank;

import tieto.bank.admin.Account;

import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;

public class ShowAccountDetailsListener implements ValueChangeListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 669664419201788846L;
	OwnerApp app;
	
	public ShowAccountDetailsListener(OwnerApp app){
		this.app = app;
	}

	@Override
	public void valueChange(ValueChangeEvent event) {
		Property p = event.getProperty();
		Account account = (Account) p.getValue();
		if(account!= null){
			app.form.setAccountDetail(account);
			app.form.setVisible(true);
		}
	}

}
