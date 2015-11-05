package com.swtools.gwttable.client.demo;

import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;

public class DemoScreen extends Composite {

	private FlowPanel masterPanel;

	public DemoScreen() {
		 masterPanel = new FlowPanel();
		masterPanel.getElement().getStyle().setPosition(Position.ABSOLUTE);
		masterPanel.getElement().getStyle().setLeft(0, Unit.PX);
		masterPanel.getElement().getStyle().setRight(0, Unit.PX);
		masterPanel.getElement().getStyle().setTop(0, Unit.PX);
		masterPanel.getElement().getStyle().setBottom(0, Unit.PX);
		initWidget(masterPanel);
	}
	
	public void add(Widget w) {
		masterPanel.add(w);
	}
	
}
