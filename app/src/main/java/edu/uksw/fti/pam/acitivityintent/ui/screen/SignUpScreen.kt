package edu.uksw.fti.pam.acitivityintent.ui.screen

import StoreUserData
import android.content.Context
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.preferencesDataStore
import edu.uksw.fti.pam.acitivityintent.ui.theme.PAMAcitivityIntentTheme
import edu.uksw.fti.pam.acitivityintent.R
import kotlinx.coroutines.launch
import java.util.prefs.Preferences


@Composable
fun SignPage(
    btnOnClickAction: (String?) -> Unit,

) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val dataStore = StoreUserData(context)

    var savedFirstName = dataStore.getName.collectAsState(initial = "")
    var savedLastName = dataStore.getName.collectAsState(initial = "")
    var firstNameInput by remember { mutableStateOf("") }
    var lastNameInput by remember { mutableStateOf("") }
    var usernameInput by remember { mutableStateOf("") }
    var passwordInput by remember { mutableStateOf("") }
    var cPassword by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(start = 0.dp, top = 0.dp),
            horizontalArrangement = Arrangement.spacedBy(5.dp)
        ) {

            TextField(
                value = firstNameInput,
                onValueChange = { firstNameInput = it },
                label = { Text(text = stringResource(id = R.string.label_firstname)) },
                modifier = Modifier
                    .width(170.dp)
            )
            TextField(
                value = lastNameInput.toString(),
                onValueChange = { lastNameInput = it },
                label = { Text(text = stringResource(id = R.string.label_lastname)) },
                modifier = Modifier
                    .width(250.dp)
            )

        }
        TextField(
            value = usernameInput.toString(),
            onValueChange = { usernameInput = it },
            label = { Text(text = stringResource(id = R.string.label_username)) },
            modifier = Modifier.fillMaxWidth()
        )
        TextField(
            value = passwordInput.toString(),
            onValueChange = { passwordInput = it },
            label = { Text(text = stringResource(id = R.string.label_password)) },
            modifier = Modifier.fillMaxWidth(),
            visualTransformation = PasswordVisualTransformation()
        )
        TextField(
            value = cPassword.toString(),
            onValueChange = { cPassword = it },
            label = { Text(text = stringResource(id = R.string.label_confirmPassword)) },
            modifier = Modifier.fillMaxWidth(),
        )
        Row(
            modifier = Modifier
                .padding(start = 225.dp, top = 0.dp),
        ) {
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp),
                onClick = {
                    //launch the class in a coroutine scope
                    scope.launch {
                        dataStore.saveName(firstNameInput)
                        dataStore.saveLName(lastNameInput)
                        btnOnClickAction(usernameInput)
                    }
                },
            ) {
                Text(text = stringResource(id = R.string.btn_title_login))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SignUpFormPreview() {
    PAMAcitivityIntentTheme {
        SignPage ({})
    }
}