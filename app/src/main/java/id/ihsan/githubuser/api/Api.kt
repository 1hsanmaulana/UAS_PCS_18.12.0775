package id.ihsan.githubuser.api

import id.ihsan.githubuser.data.model.DetailUserResponse
import id.ihsan.githubuser.data.model.User
import id.ihsan.githubuser.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token e8eb991a9d084146a2525bc5095921ee1392301f")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token e8eb991a9d084146a2525bc5095921ee1392301f")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token e8eb991a9d084146a2525bc5095921ee1392301f")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token e8eb991a9d084146a2525bc5095921ee1392301f")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}