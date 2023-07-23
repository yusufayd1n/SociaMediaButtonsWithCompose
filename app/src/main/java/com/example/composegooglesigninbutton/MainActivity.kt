package com.example.composegooglesigninbutton

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composegooglesigninbutton.ui.theme.ComposeGoogleSignInButtonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeGoogleSignInButtonTheme {
                // A surface container using the 'background' color from the theme
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,

                    ) {
                    SocialButton(
                        text = "Sign Up with Google",
                        loadingText = "Creating Account...",
                        icon = R.drawable.ic_google_button,
                        borderColor = Color.LightGray,
                        progressIndicatorColor = MaterialTheme.colorScheme.primary,
                        backgroundColor = MaterialTheme.colorScheme.surface,
                        onClicked = {

                        }
                    )
                    Spacer(
                        modifier = Modifier
                            .width(32.dp)
                            .height(8.dp)
                    )

                    SocialButton(
                        text = "Sign Up with Facebook",
                        loadingText = "Creating Account...",
                        icon = R.drawable.ic_facebook_button,
                        borderColor = Color.LightGray,
                        progressIndicatorColor = MaterialTheme.colorScheme.primary,
                        backgroundColor = MaterialTheme.colorScheme.surface,
                        onClicked = {

                        }
                    )
                    Spacer(
                        modifier = Modifier
                            .width(32.dp)
                            .height(8.dp)
                    )

                    SocialButton(
                        text = "Sign Up with Instagram",
                        loadingText = "Creating Account...",
                        icon = R.drawable.ic_instagram_button,
                        borderColor = Color.LightGray,
                        progressIndicatorColor = MaterialTheme.colorScheme.primary,
                        backgroundColor = MaterialTheme.colorScheme.surface,
                        onClicked = {

                        }
                    )

                    Spacer(
                        modifier = Modifier
                            .width(32.dp)
                            .height(8.dp)
                    )

                    SocialButton(
                        text = "Sign Up with Twitter",
                        loadingText = "Creating Account...",
                        icon = R.drawable.ic_twitter_button,
                        borderColor = Color.LightGray,
                        progressIndicatorColor = MaterialTheme.colorScheme.primary,
                        backgroundColor = MaterialTheme.colorScheme.surface,
                        onClicked = {

                        }
                    )
                }
            }
        }
    }
}
