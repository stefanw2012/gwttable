package com.swtools.gwttable.client.core.column;

import com.google.gwt.user.client.ui.Composite;

public class Column extends Composite {
	
	public Column() {
		ColumnView view = new ColumnView();
		initWidget(view);
	}
	
}
