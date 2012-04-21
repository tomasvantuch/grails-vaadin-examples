



import java.security.spec.PSSParameterSpec;

import org.apache.ivy.core.module.descriptor.ExtendsDescriptor;

import tieto.bank.admin.Account;
import tieto.bank.admin.Payment;


import com.vaadin.Application;
import com.vaadin.ui.*;

public class PaymentApp extends Application{

	@Override
	public void init() { 
		Window w = new Window("Payment Application")
		
		Label label = new Label("Payment history:")
		Table table = new Table()
		
		table.addContainerProperty("Id", Long.class, null)
		table.addContainerProperty("Date", Date.class, null)
		table.addContainerProperty("Transfered", Integer.class, null)
		table.addContainerProperty("From", String.class, null)
		table.addContainerProperty("To", String.class, null)
		
		w.addComponent(table)
		
		List payments = Payment.list()
		
		for(Payment p : payments){
			Object [] value = {p.id; p.date; p.amount; p.from.owner.name; p.to.owner.name}
			
			table.addItem(value, value[0])
		}
		Label label1 = new Label(""+payments.size())
		w.addComponent(label1)
		setMainWindow(w)
		
	}

}
