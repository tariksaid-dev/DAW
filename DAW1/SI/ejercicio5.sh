#!/bin/bash

declare -a grp_sin
declare -a grp_con
declare -a grp_con_miembros


function grupos_sin_miembros() {
	grp_sin+=($(cat /etc/group | grep -E ":$" | cut -d ":" -f 1))
	for i in "${grp_sin[@]}"; do
		declare -i contador
		contador+=1
		echo -e "Grupo $contador:\t$i"
	done
}

function grupos_con_miembros() {
	grp_con+=($(cat /etc/group | grep -vE ":$" | cut -d ":" -f 1))
	grp_con_miembros+=($(cat /etc/group | grep -vE ":$" | cut -d ":" -f 4))
	for (( i=0; i<"${#grp_con[@]}"; i++ )); do
		declare -i contador
		contador+=1
		echo -e "Grupo $contador:\t${grp_con[i]}\nMiembros:\t${grp_con_miembros[i]}\n"
	done
}

function salir() {
	echo -e "\nSaliendo..."
	exit 0
}

function help_panel() {
	echo -e "\nError. Introduce 1, 2, 3.\n"
}

while true; do
	echo -e "--------------------------------"
	echo -e "\nMENÚ:"
	echo -e "\t1.- Grupos sin miembros."
	echo -e "\t2.- Grupos con miembros."
	echo -e "\t3.- Salir.\n"
	read -p "Elige una opción (1, 2, 3): " opt

	case $opt in
		1) grupos_sin_miembros;;
		2) grupos_con_miembros;;
		3) salir;;
		*) help_panel;;
	esac
done
