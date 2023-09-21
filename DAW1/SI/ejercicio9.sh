#!/bin/bash

declare -i copiados=0
declare -i no_existen=0

jaula="/tmp/jaula"

function salir() {
	echo -e "\nSaliendo..."
	exit 0
}

function help_panel() {
	echo -e "Error. Introduce 's' o 'n'."
	exit 1
}

if [[ ! -e $jaula || ! -d $jaula ]]; then
	read -p "No existe la carpeta jaula en los temporales. Deseas crearla (sS/nN)?: " opt
	case $opt in
		[sS]) mkdir /tmp/jaula;;
		[nN]) salir;;
		*) help_panel;;
	esac
else
	echo -e "\nCopiando..."
fi

for line in $(cat ficheros.dat | tail -n +2);do
	if [[ -e $line && -f $line ]]; then
		cp $line $jaula
		copiados+=1
	elif [[ -e $line && -d $line ]]; then
		cp -r $line $jaula
		copiados+=1
	else
		no_existen+=1
	fi
done

echo -e "\nSe copiaron $copiados archivos"
echo -e "\nNo existen $no_existen archivos"
