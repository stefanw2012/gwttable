package com.swtools.gwttable.client.core.header.item;

import com.google.gwt.user.client.ui.Label;
import com.swtools.gwttable.client.core.header.HeaderCell;
import com.swtools.gwttable.client.core.style.StyleTable;

public class TableHeader extends HeaderCell  {

	private String text, tooltip;
	private Integer factorWidth;
	
	public TableHeader(String text) {
		this(text, null, null);
	}

	public TableHeader(String text, String tooltip) {
		this(text, tooltip, null);
	}

	public TableHeader(String text, Integer factorWidth) {
		this(text, null, factorWidth);
	}

	public TableHeader(String text, String tooltip, Integer factorWidth) {
		this.text = text;
		this.tooltip = tooltip;
		this.factorWidth = factorWidth;
		init();
	}

	public void init() {
		if (tooltip != null) {
			setTitle(tooltip);
		}
		Label lbl = new Label(text);
		add(lbl);
		
		
		addStyleName(StyleTable.HEADER_PANEL);
		lbl.addStyleName(StyleTable.HEADER_LABEL);
		
	}

	@Override
	public Integer getFactorWidth() {
		return factorWidth;
	}

}
