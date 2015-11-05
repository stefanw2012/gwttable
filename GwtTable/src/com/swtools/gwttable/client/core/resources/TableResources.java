package com.swtools.gwttable.client.core.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

public interface TableResources extends ClientBundle {
	
	  public static final TableResources INSTANCE =  GWT.create(TableResources.class);

	  @Source("gwttable.css")
	  public CssResource css();

}
