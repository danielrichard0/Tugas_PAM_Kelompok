import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class StoreUserData(private val context: Context) {

    // to make sure there is only one instance
    companion object {
        private val Context.dataStore: DataStore<Preferences> by preferencesDataStore("firstName")
        val USER_NAME_KEY = stringPreferencesKey("firstName")
        val USER_LNAME_KEY = stringPreferencesKey("lastName")
    }


    val getName: Flow<String?> = context.dataStore.data
        .map { preferences ->
            preferences[USER_NAME_KEY] ?: ""
        }
    val getLName: Flow<String?> = context.dataStore.data
        .map { preferences ->
            preferences[USER_LNAME_KEY] ?: ""
        }

    // to save the email
    suspend fun saveName(name: String) {
        context.dataStore.edit { preferences ->
            preferences[USER_NAME_KEY] = name
        }
    }
    suspend fun saveLName(name: String) {
        context.dataStore.edit { preferences ->
            preferences[USER_LNAME_KEY] = name
        }
    }
}