#!/bin/bash

function error() {
	echo -e "\n\nError, el archivo "$file" no existe."
}

if [[ $# -eq 0 ]]; then
	echo -e "\nError, es necesario al menos un argumento"
	exit 1
fi

for file in "$@"; do
	if [ ! -e "$file" ];then
		error
	elif [ -d "$file" ];then
		echo -e "\nNombre del directorio:\t\t$file"
		echo -e "Permisos del directorio:\t\t$(ls -la $file | head -n 2 | tail -n 1 | cut -d' ' -f 1)"
		echo -e "Proptetario del directorio:\t\t$(ls -la $file | head -n 2 | tail -n 1 | cut -d' ' -f 3)"
		echo -e "Grupo del directorio:\t\t$(ls -la $file | head -n 2 | tail -n 1 | cut -d' ' -f 4)\n"
	elif [ -f "$file" ];then
		echo -e "\n\n El contenido de los archivos es el siguiente:\n"
		cat $file
		echo -e "\n -----------------------------------------------------------------\n\n"
	elif [ ! -d "$file" && ! -r "$file" ]];then
		echo -e "\nFichero no legible. Información extra: $(file $file)"
		echo -e "Nombre del fichero:\t\t$file"
		echo -e "Permisos del fichero:\t\t$(ls -la $file | head -n 2 | tail -n1 |cut -d' ' -f 1)"
		echo -e "Propietaro del fichero: \t\t$(ls -la $file | head -n 2 | tail -n 1 | cut -d' ' -f 3)"
		echo -e "Grupo del fichero:\t\t$(ls -la $file | head -n 2 | tail -n 1 | cut -d' ' -f 4)\n"
	fi
done
