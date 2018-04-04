package com.example.edu.newsapi.Interface;

import com.example.edu.newsapi.Model.IconBetterIdea;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Edu on 03/04/2018.
 */

public interface IconBetterIdeaService {
    @GET
    Call<IconBetterIdea> getIconUrl(@Url String url);
}

