package com.swtools.gwttable.client.demo;

import java.util.ArrayList;

import com.swtools.gwttable.client.core.Table;
import com.swtools.gwttable.client.core.header.HeaderCell;
import com.swtools.gwttable.client.core.header.item.TableHeader;

public class DemoEasyTable extends DemoScreen {

	public DemoEasyTable() {
		
		Table table = new Table();
		
		ArrayList<HeaderCell> header = new ArrayList<HeaderCell>();
		header.add(new TableHeader("Column1",25));
		header.add(new TableHeader("Column with Tooltip", "Yes it is a tooltip", 75));
		table.setHeader(header);
		
		add(table);
	}
}
