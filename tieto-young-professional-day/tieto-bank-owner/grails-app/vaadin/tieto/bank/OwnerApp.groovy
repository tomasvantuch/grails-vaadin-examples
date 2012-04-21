package tieto.bank

import tieto.bank.admin.Account
import tieto.bank.admin.User
import tieto.bank.admin.AccountType
import tieto.bank.state.StateHolder

import com.vaadin.Application
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label
import com.vaadin.ui.Table
import com.vaadin.ui.Window
import com.vaadin.ui.themes.Runo;

class OwnerApp extends Application {

    public Label lblUserBalance = new Label()
	public Table table = new Table()
	public Table table2 = new Table()
	public AccountDetailForm form = new AccountDetailForm()
    
    @Override
    public void init() {
        setTheme(Runo.themeName())
        
        Window w = new Window()
		HorizontalLayout layout = new HorizontalLayout()
        Integer bankBalance = Account.list().balance.sum()
        Label lblBankBalance = new Label("Bank balance: " + bankBalance)
        lblBankBalance.setStyleName(Runo.LABEL_H1)
        w.addComponent(lblBankBalance)
        w.addComponent(lblUserBalance)
        
        table.setWidth("20%")
        table.setSelectable(true)
        table.setImmediate(true)
        table.addContainerProperty("Id", Long.class, null)
        table.addContainerProperty("Name", String.class, null)
        
		table2.addContainerProperty("Id", Long.class, null)
		table2.addContainerProperty("Balance", Long.class, null)
		table2.addContainerProperty("Type", String.class, null)
		table2.setImmediate(true)
		table2.setSelectable(true)
		table2.addListener(new ShowAccountDetailsListener(this))
		List users = User.list()
        for(User u : users) {
            Object [] cells = new Object[2]
            cells[0] = u.id
            cells[1] = u.getName()
            table.addItem(cells, u)
        }
        
        table.addListener(new ShowBalanceListener(app:this))
        
		
		layout.addComponent(table)
		layout.addComponent(table2)
		layout.addComponent(form)
		w.addComponent(layout)
        setMainWindow(w)
    }
	
	
	
}
