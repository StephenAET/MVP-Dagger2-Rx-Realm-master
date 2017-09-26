package com.tae.dagger2withmvp.model.api.callback;

/**
 * Callback used to communicate Presenter and Interactor with the data needed in Presenter
 *
 */
public interface ApiCallback {

    void onNetworkError();
    void onApiError();
}
