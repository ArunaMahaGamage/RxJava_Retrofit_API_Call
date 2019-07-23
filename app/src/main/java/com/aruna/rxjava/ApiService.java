package com.aruna.rxjava;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by ravi on 20/02/18.
 */

public interface ApiService {

    // Create note
    @FormUrlEncoded
    @POST("android/readContact.php")
    Single<List<Name>> callNames(@Field("note") String note);

}
