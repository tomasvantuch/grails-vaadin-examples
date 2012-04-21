package tieto.bank

import tieto.bank.admin.Account;
import tieto.bank.admin.User
import tieto.bank.state.StateHolder

import com.vaadin.data.Property
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener

class ShowBalanceListener implements ValueChangeListener {

	OwnerApp app

	@Override
	public void valueChange(ValueChangeEvent event) {
		Property p = event.getProperty()
		User u = p?.getValue()
		if(u) {
			Integer balance = Account.findAllByOwner(u).balance.sum()
			app.lblUserBalance.setCaption(u.name + "'s: " + balance)
			app.table2.removeAllItems()
			List accounts = Account.findAllByOwner(u)
			for(Account a : accounts){
				Object [] cells = new Object[3]
				cells[0] = a.id
				cells[1] = a.balance
				cells[2] = a.type
				app.table2.addItem(cells,a)
			}
			
			app.form.setVisible(false)
			
		}
	}
}
