package com.github.micouz.gwtp.showcase.client.ui.search;

import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.github.micouz.gwtp.showcase.client.place.NameTokens;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.google.inject.Inject;
import com.google.gwt.event.shared.EventBus;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.github.micouz.gwtp.showcase.client.ui.main.MainPresenter;

public class SearchResultPresenter extends Presenter<SearchResultPresenter.MyView, SearchResultPresenter.MyProxy> {

	public interface MyView extends View {
	}

	@ProxyCodeSplit
	@NameToken(NameTokens.searchResult)
	public interface MyProxy extends ProxyPlace<SearchResultPresenter> {
	}

	@Inject
	public SearchResultPresenter(final EventBus eventBus, final MyView view, final MyProxy proxy) {
		super(eventBus, view, proxy);
	}

	@Override
	protected void revealInParent() {
		RevealContentEvent.fire(this, MainPresenter.CONTENT_SLOT, this);
	}
}
