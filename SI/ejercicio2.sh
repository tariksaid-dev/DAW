#!/bin/bash

declare -a array

function listar() {
	if [[ ! -e lista.txt ]]; then
		echo -e "El archivo lista.txt no existe. Añade primero un contacto para listarlo a continuación"
	else
		read -p "Quieres ordenarlo por ciudad (1) o por nombre de usuario (2)?: " ord
		echo -e "\n\n"
		case $ord in
		1) cat lista.txt | sort -t ":" -k4;;
		2) cat lista.txt | sort;;
		*) echo -e "Error, introduce 1 si quieres ordenarlo por ciudades o 2 si quieres ordenarlo por nombre de usuarios";;
		esac
	fi
}

function añadir() {
	read -p "Introduce un nombre: " nombre
	read -p "Introduce una dirección: " direccion
	read -p "Introduce un teléfono: " tlf
	read -p "Introduce una ciudad: " ciudad
	echo -e "\nAñadiendo $nombre:$direccion:$tlf:$ciudad a lista.txt..."
	echo "$nombre:$direccion:$tlf:$ciudad" >> lista.txt
}


function buscar() {
	read -p "Introduce el nombre que quieres buscar: " srch
	echo -e "\n"
	cat lista.txt | grep $srch
}

function borrar() {
	read -p "Introduce el nombre que quieres eliminar del registro: " dlt
	cat lista.txt | grep -v "$dlt" | sponge lista.txt
}

function salir() {
	echo -e "\n\nSaliendo..."
	exit 0
}

function help_panel() {
	echo -e "Argumento incorrecto. Elige entre 1, 2, 3, 4, 5."
}

while true; do

	echo -e "\n\nMENÚ:"
	echo -e "\n1.- Listar contactos."
	echo -e "2.- Añadir un contacto."
	echo -e "3.- Buscar un contacto."
	echo -e "4.- Borrar un contacto."
	echo -e "5.- Salir.\n"
	read -p "Selecciona una opción (1, 2, 3, 4, 5): " opt

	case $opt in
	1) listar;;
	2) añadir;;
	3) buscar;;
	4) borrar;;
	5) salir;;
	*) help_panel;;
	esac
done
