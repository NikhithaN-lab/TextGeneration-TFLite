import tensorflow as tf

model = tf.keras.models.load_model("models/text_gen_model.h5")

converter = tf.lite.TFLiteConverter.from_keras_model(model)
tflite_model = converter.convert()

with open("models/text_gen_model.tflite", "wb") as f:
    f.write(tflite_model)

print("Model successfully converted to TFLite!")
