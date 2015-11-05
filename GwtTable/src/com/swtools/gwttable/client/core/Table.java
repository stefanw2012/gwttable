package com.swtools.gwttable.client.core;

import com.google.gwt.user.client.ui.Composite;


public class Table extends Composite {

	public Table() {
		TableView view = new TableView();
		initWidget(view);
		TableController controller = new TableController(view);
		view.setController(controller);
	}
	
	
}
