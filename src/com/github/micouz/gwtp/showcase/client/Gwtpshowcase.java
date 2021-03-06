package com.github.micouz.gwtp.showcase.client;

import com.google.gwt.core.client.EntryPoint;
import com.github.micouz.gwtp.showcase.client.gin.ClientGinjector;
import com.github.micouz.gwtp.showcase.client.resource.Resources;
import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.DelayedBindRegistry;

public class Gwtpshowcase implements EntryPoint {

	private final ClientGinjector ginjector = GWT.create(ClientGinjector.class);

	@Override
	public void onModuleLoad() {
		
		// Inject Style resources into the DOM
		Resources.INSTANCE.style().ensureInjected();
		
		// This is required for Gwt-Platform proxy's generator
		DelayedBindRegistry.bind(ginjector);
	
		ginjector.getPlaceManager().revealCurrentPlace();
	}
}
