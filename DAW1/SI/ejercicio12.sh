#!/bin/bash

declare -i contador
declare -i contador_maq=0
declare -i contador_user=0
declare -i fichas_user=1000
declare -i fichas_maq=1000
game_on=true

function tirada() {
  echo $(( 1 + $RANDOM % 6 ))
}

function juego() {
	loop=true
	while $loop; do
		read -p "Cuánto quieres apostar? " apuesta
		if [[ $apuesta -gt $fichas_user ]];then
			echo -e "No tienes suficientes fichas para hacer esa apuesta! Introduce una cantidad válida\n"
		elif [[ $apuesta -gt $fichas_maq ]];then
			echo -e "La máquina solo tiene $fichas_maq, por favor introduce como máximo esa cantidad\n"
		elif [[ ! $apuesta =~ ^[0-9]+$ ]];then
			echo -e "Apuesta incorrecta. La apuesta solo pueden ser números enteros"
		else
			echo -e "El jugador apuesta $apuesta fichas!\n"
			loop=false
		fi
		tirada_maquina=$(tirada)
		tirada_usuario=$(tirada)
		echo -e "\nLa máquina tira los dados! Saca un $tirada_maquina"
		sleep 1
		echo "Tiras los dados! Sacas un $tirada_usuario"
		sleep 1
		if [[ $tirada_maquina -gt $tirada_usuario ]];then
			echo -e "\nLa máquina gana!"
			contador_maq+=1
			fichas_maq+=$apuesta
			fichas_user=$(( $fichas_user - $apuesta ))
		elif [[ $tirada_maquina -lt $tirada_usuario ]];then
			echo -e "\nTu ganas!"
			contador_user+=1
			fichas_maq=$(( $fichas_maq - $apuesta ))
			fichas_user+=$apuesta
		else
			echo -e "\nEmpate"
		fi
	done
}

function dar_premio_maq() {
	fichas_maq+=200
	fichas_user=$(( $fichas_user - 200 ))
}

function dar_premio_user() {
	fichas_user+=200
	fichas_maq=$(( $fichas_maq -200 ))
}

echo -e "-------------------------------------------------------\n"
echo -e "Bienvenido al casino!"
echo -e "Vas a jugar una partida de dados contra la máquina."
echo -e "\nLas normas son simples. Tienes 1000 fichas con las que jugar."
echo -e "Por cada tirada debes apostar. Cada juego tiene 5 tiradas, y el primero que llegue a 3 juegos ganados recibe 200 fichas del rival (a parte de las apuestas)."
echo -e "Si te quedas sin fichas, has perdido. Adelante, vamos a jugar!\n\n"

while $game_on; do
	contador+=1
	echo -e "\nEmpezando el juego nº $contador\n"
	while [[ ! $contador_maq -eq 3 || ! $contador_user -eq 3 || ! $fichas_maq -gt 0 || ! $fichas_user -gt 0 ]];do
		juego
		echo -e "Puntos máquina: $contador_maq"
		echo -e "Fichas máquina: $fichas_maq\n"
		echo -e "Puntos usuario: $contador_user"
		echo -e "Fichas usuario: $fichas_user"

		if [[ $contador_maq -eq 3 ]];then
			echo -e "\nLa máquina ha ganado la partida"
			dar_premio_maq
		elif [[ $contador_user -eq 3 ]];then
			echo -e "\nHas ganado la partida"
			dar_premio_user
		elif [[ ! $fichas_maq -gt 0 ]];then
			echo -e "\nLa máquina se queda sin fichas! Has ganado la partida"
			game_on=false
			exit 0
		elif [[ ! $fichas_user -gt 0 ]];then
			echo -e "\nTe has quedado sin fichas! La máquina ha ganado la partida"
			game_on=false
			exit 0
		fi
	done
done
