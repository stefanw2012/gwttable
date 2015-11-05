package com.swtools.gwttable.client.core;

import com.google.gwt.dom.client.Style.BorderStyle;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.FlowPanel;

public class TableView extends FlowPanel {

	public TableView() {
		setWidth("100px");
		setHeight("100px");
		getElement().getStyle().setBorderStyle(BorderStyle.SOLID);
		getElement().getStyle().setBorderWidth(1, Unit.PX);
	}
	
	public void setController(TableController controller) {
		
	}

}
