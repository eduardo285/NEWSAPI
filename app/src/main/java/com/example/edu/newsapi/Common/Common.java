package com.example.edu.newsapi.Common;

import com.example.edu.newsapi.Interface.IconBetterIdeaService;
import com.example.edu.newsapi.Interface.NewsService;
import com.example.edu.newsapi.Remote.IconBetterIdeaClient;
import com.example.edu.newsapi.Remote.RetrofitClient;

/**
 * Created by Edu on 22/03/2018.
 */

public class Common {
    private static final String BASE_URL = "https://newsapi.org/";

    public static final String API_KEY = "ebec935616874337b1d7979e84c2d4b2";


    public static NewsService getNewsService()
    {
        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);
    }

    public static IconBetterIdeaService getIconService()
    {
        return IconBetterIdeaClient.getClient().create(IconBetterIdeaService.class);
    }

    //https://newsapi.org/v1/articles?source=the-next-web&sortBy=latest&apiKey=a7072d9c2ad9495a8dd5cb58a7fd30df
    public static String getAPIUrl(String source,String sortBy,String apiKEY)
    {
        StringBuilder apiUrl = new StringBuilder("https://newsapi.org/v2/top-headlines?sources=");
        return apiUrl.append(source)
                .append("&apiKey=")
                .append(apiKEY)
                .toString();
    }


}
