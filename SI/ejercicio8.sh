#!/bin/bash

if [[ $# -ne 1 ]];then
	echo -e "Error. Es necesario 1 argumento que debe de ser una ruta a un directorio."
	exit 1
elif [[ ! -e $1 || ! -d $1 ]];then
	echo -e "Error. La ruta especificada no es un directorio o no existe"
	exit 1
else
	dir=$(basename $1)
	nombre_fichero="${dir}_$(date +'%d_%m').dat"
fi

function añadir() {
	if [[ -e /tmp/$nombre_fichero ]]; then
		echo -e "\nEl fichero $nombre_fichero ya existe. Deseas sobreescribirlo?"
		read -p "Ss/Nn?: " op
		case $op in
			[Ss]) añadiendo;;
			[Nn]) salir;;
			*) help_panel2;;
		esac
	fi
}

function orden_natural() {
	declare -i counter
	for i in $(ls -1 $1 | sort); do
		if [[ -f $i ]]; then
			counter+=1
			echo "$counter- $i" >> /tmp/$nombre_fichero
		fi
	done
}

function orden_reverso() {
	declare -i counter
	for i in $(ls -1 $1 | sort -r); do
		if [[ -f $i ]];then
			counter+=1
			echo "$counter- $i" >> /tmp/$nombre_fichero
		fi
	done
}

function añadiendo() {
	rm /tmp/$nombre_fichero
	touch /tmp/$nombre_fichero
	read -p "En que orden quieres que se ordene el fichero? Natural (1) o reverso (2) " orden
	case $orden in
		1) orden_natural;;
		2) orden_reverso;;
		*) help_panel;;
	esac
}

function leer() {
	echo -e "Leyendo...\n\n"
	cat /tmp/$nombre_fichero
}

function salir() {
	echo -e "\nSaliendo..."
	exit 0
}

function help_panel() {
	echo -e "Opción incorrecta. Introduce un 1 o un 2."
}

function help_panel2() {
	echo -e "Introduce 'n' o 's' para confirmar. Volviendo al menú principal..."
}

while true; do
	echo -e "\n--------------------------"
	echo -e "MENÚ:"
	echo -e "\t1.- Añadir los ficheros de $dir a $nombre_fichero en los temporales"
	echo -e "\t2.- Leer $nombre_fichero"
	echo -e "\t3.- Salir\n"
	read -p "Introduce la opción (1, 2, 3): " opt
	case $opt in
	1) añadir;;
	2) leer;;
	3) salir;;
	*) help_panel;;
	esac
done
