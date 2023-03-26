#!/bin/bash

if [[ ! $# -eq 3 ]]; then
	echo -e "Error, introduce tres argumentos (operación, número1 y número2)"
elif [[ ! $2 =~ ^[0-9]+$ || ! $3 =~ ^[0-9]+$ ]]; then
	echo -e "El segundo o tercer argumento no es un número válido"
fi

if [[ "$1" =~ "suma" ]];then
	echo $(( $2 + $3 ))
elif [[ "$1" =~ "resta" ]];then
	echo $(( $2 - $3 ))
elif [[ "$1" =~ "producto" ]];then
	echo $(( $2 * $3 ))
elif [[ "$1" =~ "cociente" ]];then
	echo $(( $2 % $3 ))
else
	echo -e "Operación no válida. Las opciones en el primer argumento son: suma, resta, producto, cociente"
fi

