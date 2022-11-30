package com.example.travenor.presentation.screen.auth.components



import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.example.travenor.presentation.theme.InputBoxColor
import com.example.travenor.presentation.theme.LightPrimaryBlue

@Composable
fun AuthLoginFieldComponent(
    label:String,
    placeholder:String
) {

    val loginState = remember {
        mutableStateOf(TextFieldValue(""))
    }

    OutlinedTextField(
        value = loginState.value,
        onValueChange = {
            loginState.value = it
        },
        label = { Text(text = label) },
        placeholder = { Text(text = placeholder) },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        modifier = Modifier.fillMaxWidth(),
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = InputBoxColor,
            cursorColor = Color.Black,
            unfocusedIndicatorColor = Color.Transparent,
            focusedIndicatorColor = LightPrimaryBlue,
            focusedLabelColor = LightPrimaryBlue
        ),
        shape = RoundedCornerShape(14.dp)
    )

}