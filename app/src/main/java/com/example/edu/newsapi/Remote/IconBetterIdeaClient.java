package com.example.edu.newsapi.Remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Edu on 27/03/2018.
 */

public class IconBetterIdeaClient {
    private static Retrofit retrofit=null;
    public static Retrofit getClient()
    {
        if (retrofit == null)
        {
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://http://icons.better-idea.org/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
