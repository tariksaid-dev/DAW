#!/bin/bash

declare -i contador_maq=0
declare -i contador_user=0

function tirada() {
  echo $(( 1 + $RANDOM % 6 ))
}

function ambos_tiran() {
	tirada_maquina=$(tirada)
	tirada_usuario=$(tirada)
	echo -e "\nLa máquina tira los dados! Saca un $tirada_maquina"
	sleep 2
	echo "Tiras los dados! Sacas un $tirada_usuario"
	sleep 2
	if [[ $tirada_maquina -gt $tirada_usuario ]];then
		echo -e "\nLa máquina gana!"
		contador_maq+=1
	elif [[ $tirada_maquina -lt $tirada_usuario ]];then
		echo -e "\nTu ganas!"
		contador_user+=1
	else
		echo -e "\nEmpate"
	fi
}

while [[ ! $contador_maq -eq 5 && ! $contador_user -eq 5 ]];do
	ambos_tiran
	echo -e "Puntos máquina: $contador_maq"
	echo -e "Puntos usuario: $contador_user"
done

if [[ $contador_maq == 5 ]];then
	echo -e "\nLa máquina ha ganado la partida"
else
	echo -e "\nHas ganado la partida"
fi
