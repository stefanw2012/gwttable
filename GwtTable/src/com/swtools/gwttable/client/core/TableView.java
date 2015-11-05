package com.swtools.gwttable.client.core;

import com.google.gwt.user.client.ui.FlowPanel;
import com.swtools.gwttable.client.core.resources.TableResources;

public class TableView extends FlowPanel {

	public TableView() {
		
		setWidth("100px");
		setHeight("100px");
//		getElement().getStyle().setBorderStyle(BorderStyle.SOLID);
//		getElement().getStyle().setBorderWidth(1, Unit.PX);
		
		addStyleName("tableborder");
		
	}
	
	public void setController(TableController controller) {
		
	}

}
