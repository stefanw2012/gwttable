package com.swtools.gwttable.client.core;

import java.util.ArrayList;

import com.swtools.gwttable.client.core.header.HeaderCell;

public class TableController {

	private TableView view;

	public TableController(TableView view) {
		this.view = view;
	}

	public void setHeader(ArrayList<HeaderCell> header) {
		Integer width = new Integer(0);
		for (HeaderCell cell : header) {
			width += cell.getFactorWidth() != null ? cell.getFactorWidth() : 50;
		}
		
		
		
		
	}

}
