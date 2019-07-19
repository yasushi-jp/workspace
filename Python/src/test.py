'''
Created on 2018/03/11

@author: yasushi
'''
import tensorflow as tf
hello = tf.constant('Hello, TensorFlow!')
sess = tf.Session()
print(sess.run(hello))