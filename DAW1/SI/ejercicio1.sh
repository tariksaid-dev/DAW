#!/bin/bash


function listar() {
	if [[ -e miscorreos.txt ]]; then
		cat miscorreos.txt
	else
		echo -e "No existe el archivo miscorreos.txt"
	fi
}

function añadir() {
	read -p "Escribe tu nombre: " nombre
	read -p "Escribe tu correo electrónico: " correo
	echo "$nombre:$correo" >> miscorreos.txt
}

function salir() {
	echo -e "\n\nSaliendo... \n"
	exit 0
}

function help_panel() {
	echo -e "Opción incorrecta. Elige 1, 2, 3"
}

while true; do
	echo -e "\n\n1.- Listar usuarios."
	echo -e "2.- Añadir usuarios."
	echo -e "3.- Salir.\n"

	read -p "Elige una opción (1, 2, 3): " opt

	case $opt in

	1) listar;;
	2) añadir;;
	3) salir;;
	*) help_panel;;
	esac
done
