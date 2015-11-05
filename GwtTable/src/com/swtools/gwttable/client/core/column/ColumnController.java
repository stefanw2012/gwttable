package com.swtools.gwttable.client.core.column;

import com.google.gwt.dom.client.Style.Unit;
import com.swtools.gwttable.client.core.header.HeaderCell;

public class ColumnController {

	private ColumnView view;

	public ColumnController(ColumnView view) {
		this.view = view;
	}

	public void setHeaderCell(HeaderCell cell, double widthPC) {
		view.getElement().getStyle().setWidth(widthPC, Unit.PC);
	}

}
