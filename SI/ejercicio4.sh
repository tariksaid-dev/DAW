#!/bin/bash

if [[ ! $# -ge 2 ]]; then
	echo -e "Argumentos inválidos. Se necesita como mínimo un directorio de destino y el nombre de un archivo"
elif [[ ! -e $1 || ! -d $1 ]]; then
	echo -e "El directorio de destino no existe o no es un directorio"
fi

for i in "$@";do
	if [[ "$i" != "$1" ]];then
		if [[ -e "$i" ]]; then
			cp "$i" "$1"
			echo -e "Se ha copiado el archivo '$i'"
		else
			echo -e "El archivo '$i' no existe"
		fi
	fi
done
