from tkinter import *
from random import choice, randint, shuffle
import json




#reading json
with open("data1.json", "r") as f:
    data = json.load(f)

# podemos unir estas dos funciones
# FUNCION NÚMERO
def numero_azar():
    global random_number
    random_number = randint(1, 3)

# JSON MANIPULATION

#Al darle al botón, tendrá que generarse un número al azar, cambiar la imagen por dicho número, seleccionar un alumno mediante data["alumnos"][random_number]["nombre"] y sumar +1 en data["alumnos"]["veces salidas"]
def pressed():
    #generamos el número al azar
    numero_azar()
    random_number_display = data["alumnos"][random_number]["nombre"]


    #cambio de imagen
    canvas.itemconfig(imagen_canvas, image=transparent_img)
    canvas.itemconfig(texto_vacio, text=random_number_display)

    #sumar 1 en veces salidas
    data["alumnos"][random_number]["veces_salidas"] += 1

def boton_finish_f():
    with open("data1.json", "w") as f:
        json.dump(data, f, indent=2)
    window.destroy()
    

# UI SETUP

window = Tk()
window.title("Random Selector")
window.config(padx=50, pady=50, bg="white")

canvas = Canvas(width=300, height=250, bg="white", highlightthickness=0, bd=20)
dados_img = PhotoImage(file="dados1.png")
transparent_img = PhotoImage(file="transparent.png")
imagen_canvas = canvas.create_image(150, 150, image= dados_img)
texto_vacio = canvas.create_text(120, 75, text="", fill="black", font="Helvetica 15 bold")

canvas.grid(row=0, column=0)

"""Button"""

randomize = Button(text="Elegir", width=21, command=lambda: [numero_azar(), pressed()])
randomize.grid(row=1, column=0)
boton_finish = Button(text="Terminar", width=21, command=boton_finish_f)
boton_finish.grid(row=2, column=0)


window.mainloop()