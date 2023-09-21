#!/bin/bash


declare -a list

loop=true

while $loop; do

	read -p "Introduce un número (0 para terminar): " input
	if [[ "$input" == "0" ]]; then
		loop=false
	else
		list+=("$input")
	fi
done

for i in "${list[@]}"; do
	echo "$i"
	sleep 1
done
