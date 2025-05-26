import com.example.simple_movie_app.MovieCardModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface MoviesApi {
    @Headers(
        "x-rapidapi-key: 2492c2e135mshc5b5ffb76d7229dp11789ejsn27d36ea685cd",
        "x-rapidapi-host: imdb-top-100-movies.p.rapidapi.com"
    )
    @GET("/") // Don't put the full URL here
    suspend fun getMovies(): Response<List<MovieCardModel>>
}
