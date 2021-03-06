package com.nytimes.articles.data.remote;

import com.nytimes.articles.data.remote.model.PopularArticleResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * The APIService interface which will contain the semantics of all the REST calls.
 * Author: PRAMOD K P
 * Email: pramodpnckr@gmail.com
 * Created: 3/28/2019
 * Modified: 3/28/2019
 */
public interface ApiService {

    //http://api.nytimes.com/svc/mostpopular/v2/viewed/{period}.json?api-key=sample-key
    @GET("https://api.nytimes.com/svc/mostpopular/v2/viewed/{period}.json")
    Call<PopularArticleResponse> loadPopularArticles(@Path("period") int period);
}
