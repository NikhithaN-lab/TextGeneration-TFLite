# Text Generation Model Optimization & Mobile Deployment (TensorFlow Lite, RNN)

## Project Overview
This project focuses on optimizing a character-level text generation model for efficient inference on mobile and edge devices. Using TensorFlow Lite (TFLite), the LSTM-based model is converted for lightweight deployment, enabling real-time text generation with minimal computational overhead. The project also involves deploying the model on an Android device and debugging inference issues using Android Studio.

The model is trained on Shakespearean text and generates text in a similar style based on input prompts. The deployment pipeline includes converting the TensorFlow model to TFLite, optimizing it for mobile inference, and integrating it into an Android application.

## Features & Achievements
- LSTM-based Character-Level Text Generation: Generates Shakespeare-like text based on input prompts.
- TensorFlow Lite (TFLite) Conversion: Enables mobile and edge deployment with reduced model size.
- Android Deployment: Deployed the TFLite model on an Android device using Android Studio.
- Optimized Inference: Plans for INT8 quantization to enhance efficiency further.

## Challenges Addressed
- Ensuring compatibility during TFLite conversion.
- Debugging inference issues on Android Studio.
- Reducing memory usage while maintaining text generation quality.

## Work in Progress: AI Optimization for Edge Inference
- **INT8 Quantization (Upcoming):** Reduce model size while maintaining accuracy.
- **NVIDIA TensorRT Acceleration:** Explore AI hardware optimizations for faster inference.

## Next Steps
- Convert the optimized model into a TensorRT engine (.trt file) for NVIDIA hardware.
- Test AI model inference on an Android device.
- Benchmark performance improvements against standard TFLite execution.

This project demonstrates AI model optimization for mobile and embedded AI deployment. Future improvements will focus on hardware-specific optimizations for NVIDIA platforms.

