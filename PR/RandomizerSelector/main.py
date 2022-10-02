from tkinter import *
import random
import json

#reading json
with open("data1.json", "r") as f:
    data = json.load(f)


# JSON MANIPULATION
def pressed():
    #generamos el número al azar
    global selected
    probabilities = []
    for alumno in data["alumnos"]:
        # if alumno["sale"] == True: ERROR: el número de probabilidades debe coincidir con el numero de valores de random.choices 🔴
        # solucion 1: hacer otra lista vacía, .append los objetos true, calcular probabilidades + elegir de esa lista ✅

        probabilities.append(alumno["veces_salidas"])
    print(probabilities)
    selected = random.choices(data["alumnos"], probabilities)

    #cambio de imagen
    canvas.itemconfig(imagen_canvas, image=transparent_img)
    canvas.itemconfig(texto_vacio, text=selected[0]["nombre"])

    #cambio de probabilidad al elegido
    selected[0]["veces_salidas"] /= 2


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
randomize = Button(text="Elegir", width=21, command=pressed)
randomize.grid(row=1, column=0)
boton_finish = Button(text="Terminar", width=21, command=boton_finish_f)
boton_finish.grid(row=2, column=0)

window.mainloop()