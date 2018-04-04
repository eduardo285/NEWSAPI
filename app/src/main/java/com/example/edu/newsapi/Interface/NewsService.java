package com.example.edu.newsapi.Interface;

import com.example.edu.newsapi.Common.Common;
import com.example.edu.newsapi.Model.News;
import com.example.edu.newsapi.Model.WebSite;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Edu on 03/04/2018.
 */

public interface NewsService {
    @GET("v2/sources?language=en&apiKey="+ Common.API_KEY)
    Call<WebSite> getSources();

    @GET
    Call<News> getNewestArticles(@Url String url);
}
