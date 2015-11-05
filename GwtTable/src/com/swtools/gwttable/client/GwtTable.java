package com.swtools.gwttable.client;


import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.swtools.gwttable.client.demo.DemoEasyTable;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GwtTable implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		Log.info("- onModuleLoad -");
		
		DemoEasyTable demo = new DemoEasyTable();
		RootPanel.get().add(demo);
		
	}
}
