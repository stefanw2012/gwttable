package com.swtools.gwttable.client.core.column;

import com.google.gwt.dom.client.Style.Float;
import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.FlowPanel;
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

	public void setHeaderCell(HeaderCell cell, double widthPC, int headerHeight) {
		view.getElement().getStyle().setWidth(widthPC, Unit.PCT);
		view.setHeight(headerHeight+"px");
		
		FlowPanel headerBorder = new FlowPanel();
		headerBorder.getElement().getStyle().setPosition(Position.ABSOLUTE);
		headerBorder.getElement().getStyle().setTop(0, Unit.PX);
		headerBorder.getElement().getStyle().setLeft(0, Unit.PX);
		headerBorder.getElement().getStyle().setRight(0, Unit.PX);
		headerBorder.getElement().getStyle().setBottom(0, Unit.PX);
		headerBorder.add(cell);
		
		cell.getElement().getStyle().setLineHeight(headerHeight, Unit.PX);
		
		view.add(headerBorder);
	}

}
