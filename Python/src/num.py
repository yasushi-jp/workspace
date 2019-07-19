import numpy as np
import tensorflow as tf

trX = np.linspace(-1, 1, 101)
trY = 2 * trX + 3 + np.random.randn(*trX.shape) * 0.33

def lin_model(X, w, b):
    return X * w + b

w = tf.Variable([0.])
b = tf.Variable([0.])

x = tf.placeholder(tf.float32, shape=(101))
y = tf.placeholder(tf.float32, shape=(101))
y_hypo = lin_model(x, w, b)

cost = tf.reduce_mean(tf.square(y_hypo - y))
train_step = tf.train.GradientDescentOptimizer(0.01).minimize(cost)

# Initializing
init = tf.global_variables_initializer()

# Train
with tf.Session() as sess:
    sess.run(init)

    for i in range(1001):
        sess.run(train_step, feed_dict={x: trX, y: trY})
        if i % 100 == 0:
            print("%5d:(w,b)=(%10.4f, %10.4f)" % (i, sess.run(w), sess.run(b)))