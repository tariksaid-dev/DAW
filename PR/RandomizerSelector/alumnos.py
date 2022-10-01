from ctypes import pointer
from textwrap import indent
from tkinter import *
from tkinter import messagebox
from random import choice, randint, shuffle
import json
from typing import final
from setuptools import Command

# JSON MANIPULATION
pointer_position = 0
alumno_quiere_salir = []

with open("data1.json", "r") as f:
        # leemos data
        data = json.load(f)

def load_data():
    with open("data1.json", "r") as f:
        # leemos data
        data = json.load(f)
    # print(data["alumnos"][0]["nombre"])
    for name in data["alumnos"]:
        alumno_quiere_salir.append(data["alumnos"][0]["nombre"])
        
    print(alumno_quiere_salir)

# BUTTON FUNCTION

def boton_next_f():
    global pointer_position
    pointer_position += 1
    with open("data1.json", "r") as f:
        data = json.load(f)
        nombre = data["alumnos"][pointer_position]["nombre"]
        canvas.itemconfig(nombre_en_canvas, text = nombre)


def boton_si_f():
    with open("data1.json") as f:
        data = json.load(f)
        for item in data["alumnos"]:
            if item["sale"] in [False]:
                item["sale"] = True
    
    with open("data1.json", "w") as f:
        json.dump(data, f, indent=2)

    

def boton_no_f():
    with open("data1.json") as f:
        data = json.load(f)
        for item in data["alumnos"]:
            if item["sale"] in [True]:
                item["sale"] = False
    
    with open("data1.json", "w") as f:
        json.dump(data, f, indent=2)

        



# UI SETUP

window = Tk()
window.title("Random Selector")
window.config(padx=50, pady=50, bg="white")

canvas = Canvas(width=300, height=250, bg="white", highlightthickness=0, bd=20)
# dados_img = PhotoImage(file="dados1.png")
# canvas.create_image(150, 150, image= dados_img)
canvas.grid(row=0, column=0, columnspan=2)

nombre_en_canvas = canvas.create_text(120, 75, text=data["alumnos"][pointer_position]["nombre"], fill="black", font="Helvetica 15 bold")

"""Button"""

boton_si = Button(text="SI", width=21, command=boton_si_f)
boton_si.grid(row=1, column=0)
boton_no = Button(text="NO", width=21, command=boton_no_f)
boton_no.grid(row=1, column=1)
boton_next = Button(text="Siguiente", width= 21, command=boton_next_f)
boton_next.grid(row=2, column=0)
boton_finish = Button(text="Terminar", width=21, command=window.destroy)
boton_finish.grid(row=2, column=1)


window.mainloop()