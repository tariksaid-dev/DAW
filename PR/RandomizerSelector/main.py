
from textwrap import indent
from tkinter import *
from tkinter import messagebox
from random import choice, randint, shuffle
import json
from typing import final
from setuptools import Command

RANDOMIZE_PRESSED = False


# podemos unir estas dos funciones
# FUNCION NÚMERO
def numero_azar():
    numero_seleccionado = randint(1, 30)
    print(numero_seleccionado)

# JSON MANIPULATION
def pressed():

    global RANDOMIZE_PRESSED
    RANDOMIZE_PRESSED = True

    new_data = {
        new_data[0]: {
            "numero_lista": 2,
            "sale": True,
        }
    }

    if RANDOMIZE_PRESSED == True:
        try:
            with open("data.json", "r") as data_file:
                #Leemos
                data = json.load(data_file)
        except FileNotFoundError:
            with open("data.json", "w") as data_file:
                json.dump(new_data, data_file, indent=4)
        else: 
            # actualizamos data
            data.update(new_data)

            with open("data.json", "w") as data_file:
                #guardamos data
                json.dump(data, data_file, indent=4)

            
    

# UI SETUP

window = Tk()
window.title("Random Selector")
window.config(padx=50, pady=50, bg="white")

canvas = Canvas(width=300, height=250, bg="white", highlightthickness=0, bd=20)
dados_img = PhotoImage(file="dados1.png")
canvas.create_image(150, 150, image= dados_img)
canvas.grid(row=0, column=0)

"""Button"""

randomize = Button(text="Elegir", width=21, command=lambda: [numero_azar(), pressed()])
randomize.grid(row=1, column=0)






window.mainloop()