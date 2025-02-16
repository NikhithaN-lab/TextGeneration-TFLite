import tensorflow as tf
import numpy as np

# Load the TFLite model
interpreter = tf.lite.Interpreter(model_path="models/text_gen_model.tflite")
interpreter.allocate_tensors()

input_details = interpreter.get_input_details()
output_details = interpreter.get_output_details()

char2idx = {'R': 0, 'O': 1, 'M': 2, 'E': 3, ':': 4, ' ': 5}  # Update with actual vocab
idx2char = {i: c for c, i in char2idx.items()}

def generate_text_tflite(start_string, num_generate=100):
    input_eval = np.array([[char2idx.get(s, char2idx[' '])] for s in start_string], dtype=np.float32)

    text_generated = []
    for _ in range(num_generate):
        interpreter.set_tensor(input_details[0]['index'], input_eval)
        interpreter.invoke()
        predictions = interpreter.get_tensor(output_details[0]['index'])
        predicted_id = np.argmax(predictions[-1])
        text_generated.append(idx2char.get(predicted_id, '?'))
        input_eval = np.array([[predicted_id]], dtype=np.float32)

    return start_string + ''.join(text_generated)

print(generate_text_tflite("ROMEO: ", num_generate=100))
