from tkinter import *
import json

# JSON MANIPULATION
pointer_position = 0

# lecutra de data y creacion del objeto {data}
with open("data1.json", "r") as f:
        data = json.load(f)


# BUTTON FUNCTION

# botón siguiente, creamos un puntero para señalar la posición dentro de alumnos, con el fin de modificar el nombre en el display
def boton_next_f():
    global pointer_position
    pointer_position += 1
    nombre = data["alumnos"][pointer_position]["nombre"]
    canvas.itemconfig(nombre_en_canvas, text=nombre)


# cambiamos el valor "sale" a true
def boton_si_f():
    global pointer_position
    data["alumnos"][pointer_position]["sale"] = True


# cambiamos el valor "sale" a false
def boton_no_f():
    global pointer_position
    data["alumnos"][pointer_position]["sale"] = False


# reescribimos el json con el objeto {data} modificado y cerramos la ventana
def boton_finish_f():
    with open("data1.json", "w") as f:
        json.dump(data, f, indent=2)
    window.destroy()



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
boton_finish = Button(text="Terminar", width=21, command=boton_finish_f)
boton_finish.grid(row=2, column=1)

window.mainloop()