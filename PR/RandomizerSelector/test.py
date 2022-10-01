
from ctypes import pointer
from textwrap import indent
from tkinter import *
from tkinter import messagebox
from random import choice, randint, shuffle
import json
from typing import final
from setuptools import Command

## Está ok, añade elementos a la lista
random_number = randint(1, 30)
print(random_number)
with open("data1.json", "r") as f:
    data = json.load(f)
    print(data["alumnos"][random_number]["numero_lista"])

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


