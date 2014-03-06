package com.github.micouz.gwtp.showcase.client.ui.sample.main;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class SampleHomeView extends ViewImpl implements SampleHomePresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, SampleHomeView> {
	}

	@Inject
	public SampleHomeView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}
