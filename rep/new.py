from PIL import Image
import pytesseract
import pyttsx3
import time
im=Image.open("circles.eps")
text=pytesseract.image_to_string(im,lang='eng')
f=open("output.txt","w+")
f.write(text)
f.close()
engine=pyttsx3.init()
f=open("output.txt","r")
engine.say(text)
engine.runAndWait()
print(text)
f.close()
