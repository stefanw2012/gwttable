package com.swtools.gwttable.client.core.column;

import com.google.gwt.dom.client.Style.BorderStyle;
import com.google.gwt.dom.client.Style.Float;
import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.dom.client.Style.Unit;
import com.swtools.gwttable.client.core.header.HeaderCell;

public class ColumnController {

	private ColumnView view;

	public ColumnController(ColumnView view) {
		this.view = view;
		view.getElement().getStyle().setPosition(Position.RELATIVE);
		view.getElement().getStyle().setFloat(Float.LEFT);
		// TODO: SET FROM OUTSIDE
		view.setHeight("30px");
	}

	public void setHeaderCell(HeaderCell cell, double widthPC) {
		view.getElement().getStyle().setWidth(widthPC, Unit.PCT);
		
		cell.getElement().getStyle().setPosition(Position.ABSOLUTE);
		cell.getElement().getStyle().setBorderStyle(BorderStyle.SOLID);
		cell.getElement().getStyle().setBorderWidth(1, Unit.PX);
		cell.getElement().getStyle().setTop(0, Unit.PX);
		cell.getElement().getStyle().setLeft(0, Unit.PX);
		cell.getElement().getStyle().setRight(0, Unit.PX);
		cell.getElement().getStyle().setBottom(0, Unit.PX);
		view.add(cell);
	}

}
