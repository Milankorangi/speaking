from PIL import Image
import pytesseract

import time
im=Image.open("sample1.jpg")
text=pytesseract.image_to_string(im,lang='eng')
print(text)
from tkinter import *

canvas_width = 500
canvas_height = 150
def idle_5sec(event=None):
    """freeze the action for 5 seconds"""
    #root.title("Idle for 1 seconds")
    time.sleep(0)
    #root.title("Happy Circles ...")

def idle_5sec(event=None):
    """freeze the action for 5 seconds and save image file"""
   # root.title("Idle for 1 seconds")
    time.sleep(0)
   # root.title("Happy Circles ...")
    w.postscript(file="circles.eps") # save canvas as encapsulated postscript
    #child = SP.Popen("mogrify -format jpg circles.eps", shell=True) # convert eps to jpg with ImageMagick
    #child.wait()

def paint( event ):
   python_green = "#476042"
   x1, y1 = ( event.x - 1 ), ( event.y - 1 )
   x2, y2 = ( event.x + 1 ), ( event.y + 1 )
   w.create_oval( x1, y1, x2, y2, fill = python_green )

'''def delete( event=None ):
    w.remove("all")
    time.sleep(5)'''

master = Tk()
master.geometry("800x800")
master.title( "Painting using Ovals" )
w = Canvas(master, 
           width=canvas_width, 
           height=canvas_height)
w.pack(expand = YES, fill = BOTH)
w.bind( "<B1-Motion>", paint )
master.bind( '<B1-Motion>', idle_5sec)
#master.bind( "<B1-Motion>", delete )

message = Label( master, text = "Press and Drag the mouse to draw" )
message.pack( side = BOTTOM )
    
mainloop()
