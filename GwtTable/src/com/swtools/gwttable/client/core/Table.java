package com.swtools.gwttable.client.core;

import java.util.ArrayList;

import com.google.gwt.user.client.ui.Composite;
import com.swtools.gwttable.client.core.header.HeaderCell;


public class Table extends Composite {

	private TableController controller;
	private int headerHeight;

	public Table() {
		TableView view = new TableView();
		controller = new TableController(view);
		view.setController(controller);
		initWidget(view);
	}

	/**
	 * Set the headeritems with a default height of 30px
	 * @param header
	 */
	public void setHeader(ArrayList<HeaderCell> header) {
		setHeader(header, 30);
	}
	
	/**
	 * Set the headeritems and set the headerheight
	 * @param header
	 * @param headerHeight
	 */
	public void setHeader(ArrayList<HeaderCell> header, int headerHeight) {
		controller.setHeader(header, headerHeight);
	}

	
	
}
