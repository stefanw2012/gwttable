package com.swtools.gwttable.client.core;

import java.util.ArrayList;

import com.google.gwt.user.client.ui.Composite;
import com.swtools.gwttable.client.core.header.HeaderCell;


public class Table extends Composite {

	private TableController controller;

	public Table() {
		TableView view = new TableView();
		controller = new TableController(view);
		view.setController(controller);
		initWidget(view);
	}

	public void setHeader(ArrayList<HeaderCell> header) {
		controller.setHeader(header);
	}
	
	
}
