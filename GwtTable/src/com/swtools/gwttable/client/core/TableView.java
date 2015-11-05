package com.swtools.gwttable.client.core;

import com.google.gwt.user.client.ui.FlowPanel;
import com.swtools.gwttable.client.core.resources.TableResources;
import com.swtools.gwttable.client.core.style.StyleTable;

public class TableView extends FlowPanel {

	public TableView() {
		addStyleName(StyleTable.TABLE_BORDER);
	}
	
	public void setController(TableController controller) {
		
	}

}
