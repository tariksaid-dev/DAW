#!/bin/bash

matrizFicheros=($(ls -A $1))

function mostrar_matriz {
	echo -e "\n\nFicheros en la matriz:\n"
	for f in "${matrizFicheros[@]}";do
		echo "$f"
	done
}

function salir() {
	echo -e "\nSaliendo..."
	exit 0
}

function borrar {
	read -p "Introduce el nombre del fichero que quieres borrar: " fichero
	if [[ "${matrizFicheros[*]}" =~ "$fichero" ]]; then
		read -p "El fichero  '$fichero' está en la matriz. ¿Borrarlo? [S/N]:" respuesta
		case $respuesta in
			[Ss]) matrizFicheros=("${matrizFicheros[@]/$fichero}")
				  find $1 -name "${fichero}.*" -delete
				  echo -e "\nEl fichero '$fichero' ha sido borrado correctamente";;

			*) echo -e "\nNingún fichero ha sido borrado, volviendo al menú.";;
		esac
	else
		echo -e "\nEl fichero '$fichero' no está en la matriz."
	fi
}

function help_panel() {
	echo -e "Error. Introduce 1, 2, 3."
}

if [[ ! -d $1 || ! $# -eq 1 ]];then
	echo -e "Error, el directorio pasado como parámetro no existe o no has pasado ninguno"
	exit 1
fi

while true;do
	echo -e "\n-------------------------------------"
	echo -e "MENÚ:\n"
	echo -e "\t1.- Listar"
	echo -e "\t2.- Borrar"
	echo -e "\t3.- Salir\n"

	read -p "Opción (1, 2, 3): " opcion
	case $opcion in
		1) mostrar_matriz;;
		2) borrar;;
		3) salir;;
		*) help_panel;;
	esac
done
