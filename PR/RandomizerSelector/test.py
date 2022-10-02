
from ctypes import pointer
from textwrap import indent
from tkinter import *
from tkinter import messagebox
import json
from typing import final
from setuptools import Command
# from numpy.random import choice
import random

#para hacer el weighted choice, hay que hacerlo con numpy. 
#habrá que hacer un for loop del json y añadir el valor "veces salidas" a una lista que luego servirá como probabilidades para el choice de numpy
with open("data1.json", "r") as f:
    data = json.load(f)
    probabilities = []
    for alumno in data["alumnos"]:
        probabilities.append(alumno["veces_salidas"])
    print(probabilities)
    selected = random.choices(data["alumnos"], probabilities)

    print(selected)
    print(selected[0]["nombre"])

    #✅

## Está ok, añade elementos a la lista
# random_number = randint(1, 30)
# print(random_number)
# with open("data1.json", "r") as f:
#     data = json.load(f)
#     print(data["alumnos"][random_number]["numero_lista"])

# with open("data1.json") as f:
#     data = json.load(f)
#     for item in data["alumnos"]:
#         if item["sale"] in [True]:
#             item["sale"] = False
    
# with open("data1.json", "w") as f:
#     json.dump(data, f, indent=2)


# seleccionando (alumon), (alumno["nombre"]), (alumno["nombre"]), alumno["nombre"], alumno["numero_lista"]
# for alumno in data["alumnos"]:
#     print(alumno["nombre"], alumno["sale"])
#     #del alumno["nombre"]   // para borrar

# with open("new_data.json", "w") as f:
#     json.dump(data, f, indent=2)


