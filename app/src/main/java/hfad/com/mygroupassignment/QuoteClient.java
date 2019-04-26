package hfad.com.mygroupassignment;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface QuoteClient {
    @GET("posts?filter[orderby]=rand&filter[posts_per_page]=1")
    Call<List<Quote>> getData();
}
