package com.tae.dagger2withmvp.model.api.retrofit;

import com.tae.dagger2withmvp.model.itunesmodel.Itunes;

import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * Connect to the RestApi
 */
public interface ItunesApiService {

    @GET(NetworkConstants.GENDER_ENDPOINT)
    Observable<Itunes> search(@Query(NetworkConstants.QUERY_TERM) String query);
//    Call<Itunes> search(@Query(NetworkConstants.QUERY_TERM) String query);
}
