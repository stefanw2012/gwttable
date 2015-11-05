package com.swtools.gwttable.client.core.column;

import com.google.gwt.user.client.ui.Composite;
import com.swtools.gwttable.client.core.header.HeaderCell;

public class Column extends Composite {
	
	private ColumnController controller;

	public Column() {
		ColumnView view = new ColumnView();
		controller = new ColumnController(view);
		initWidget(view);
	}

	public void setHeaderCell(HeaderCell cell, double doubleValue) {
		controller.setHeaderCell(cell, doubleValue);
	}
	
}
