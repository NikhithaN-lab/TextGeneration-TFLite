package com.example.mytensorflowapplication

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize TensorFlow Lite Helper with the context (this)
        val tfLiteHelper = TensorFlowLiteHelper(this)

        // Set the content view with Composables
        setContent {
            MaterialTheme {
                Surface {
                    MainScreen(tfLiteHelper)  // Passing tfLiteHelper to Composable
                }
            }
        }
    }

    // Run model inference (add your own model logic)
    fun runModel(tfLiteHelper: TensorFlowLiteHelper) {
        // Example of running inference
        val inputData = floatArrayOf(1.0f, 2.0f)  // Example input data
        val outputData = tfLiteHelper.runInference(inputData)
        // Use the output as needed
    }
}

// TensorFlowLiteHelper class
class TensorFlowLiteHelper(context: Context) {
    fun runInference(inputData: FloatArray): FloatArray {
        // Placeholder for running inference
        return floatArrayOf(0.0f)  // Dummy output
    }
}

// MainScreen Composable
@Composable
fun MainScreen(tfLiteHelper: TensorFlowLiteHelper) {
    // Your UI code here
}

// Preview for MainScreen Composable
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MaterialTheme {
        Surface {
            MainScreen(TensorFlowLiteHelper(LocalContext.current))
        }
    }
}
