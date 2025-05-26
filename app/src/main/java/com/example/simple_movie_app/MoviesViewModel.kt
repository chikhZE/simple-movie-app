import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.simple_movie_app.MovieCardModel
import kotlinx.coroutines.*
import retrofit2.Response

class MoviesViewModel : ViewModel() {
    val movies = MutableLiveData<List<MovieCardModel>>()

    fun getMovies() {
        CoroutineScope(Dispatchers.IO).launch {
            try {
                val response = RetrofitInstance.api.getMovies()
                if (response.isSuccessful && response.body() != null) {
                    withContext(Dispatchers.Main) {
                        movies.value = response.body()
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}
