package com.swtools.gwttable.client.core;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

import com.swtools.gwttable.client.core.column.Column;
import com.swtools.gwttable.client.core.header.HeaderCell;

public class TableController {

	private TableView view;

	public TableController(TableView view) {
		this.view = view;
	}

	public void setHeader(ArrayList<HeaderCell> header, int headerHeight) {
		Integer width = new Integer(0);
		for (HeaderCell cell : header) {
			width += cell.getFactorWidth() != null ? cell.getFactorWidth() : 50;
		}
		
		for(HeaderCell cell : header) {
			Column column = new Column();
			BigDecimal oneFactor = new BigDecimal(100).divide(new BigDecimal(width), 4, RoundingMode.HALF_UP);
			BigDecimal cellFactor = new BigDecimal(cell.getFactorWidth() != null ? cell.getFactorWidth() : 50);
			BigDecimal pc = oneFactor.multiply(cellFactor).setScale(2, RoundingMode.HALF_UP);
			
			column.setHeaderCell(cell, pc.doubleValue(), headerHeight);
			view.add(column);
		}
		
		
		
	}

}
