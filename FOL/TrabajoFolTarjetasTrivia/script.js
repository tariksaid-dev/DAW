function setTransform(el, width, height) {
    // Movimiento
    el.addEventListener('mousemove', (evt) => {
        const {layerX, layerY} = evt;

        const yRotation = (
            (layerX - width / 2) / width
        ) * 12;

        const xRotation = (
            (layerY - height /2) / height
        ) * 12;

        const string = `
        perspective(500px)
        scale(1.02)
        rotateX(${xRotation}deg)
        rotateY(${yRotation}deg)`

        el.style.transform = string;
    })

    el.addEventListener('mouseout', () => {
        el.style.transform = `
        perspective(500px)
        scale(1)
        rotateX(0)
        rotateY(0)`
    })

    // Click + modal

    el.addEventListener('click', () => {
        const modal = 
            (el.id === 'tarjeta1') ? document.getElementById('modal1') :
            (el.id === 'tarjeta2') ? document.getElementById('modal2') :
            (el.id === 'tarjeta3') ? document.getElementById('modal3') :
            (el.id === 'tarjeta4') ? document.getElementById('modal4') : null;

        modal.style.display='flex';

        const top = (window.innerHeight - modal.offsetHeight) / 2;
        const left = (window.innerWidth - modal.offsetWidth) / 2;
        modal.style.top = top + 'px';
        modal.style.left = left + 'px';

        modal.addEventListener('click', (e) => {
            if (e.target === modal) {
                modal.style.display = 'none';
                location.reload();
            }
        })

        if (modal.style.display === 'flex') {
            if(modal.id === 'modal1') {
                document.getElementById('tarjeta1-text1').addEventListener('click', () => {
                    const svg = document.querySelector('#modal1 div svg');
                    svg.remove();
                    document.getElementById('tarjeta1-text2').parentElement.remove();
                    document.getElementById('tarjeta1-text3').parentElement.remove();
                    document.getElementById('tarjeta1-text4').parentElement.remove();
                    document.getElementById('tarjeta1-text5').parentElement.remove();
                    document.getElementById('tarjeta1-text6').parentElement.remove();

                    const div = document.createElement("div");
                    const p1 = document.createElement("p");
                    const p2 = document.createElement("p");
                    const p3 = document.createElement("p");
                    const p4 = document.createElement("p");
                    const ans1 = document.createTextNode(pregunta1Text1[0]);
                    const ans2 = document.createTextNode(pregunta1Text1[1]);
                    const ans3 = document.createTextNode(pregunta1Text1[2]);
                    const ans4 = document.createTextNode(pregunta1Text1[3]);
                    p1.appendChild(ans1);
                    p2.appendChild(ans2);
                    p3.appendChild(ans3);
                    p4.appendChild(ans4);
                    div.appendChild(p1);
                    div.appendChild(p2);
                    div.appendChild(p3);
                    div.appendChild(p4);

                    const tarjeta1Text1 = document.getElementById('tarjeta1-text1');
                    tarjeta1Text1.parentNode.insertBefore(div, tarjeta1Text1.nextSibling);

                    document.getElementById('tarjeta1-text1').style.color = 'red';
                    div.style.cssText = "display: flex; flex-direction:column; width: 90%"
                    div.parentNode.style.cssText = "display: flex; flex-direction: column;";
                    p1.style.cssText = "cursor: pointer; "
                    p2.style.cssText = "cursor: pointer;"
                    p3.style.cssText = "cursor: pointer;"
                    p4.style.cssText = "cursor: pointer;"

                    p1.classList.add('paragraph-styles');
                    p2.classList.add('paragraph-styles');
                    p3.classList.add('paragraph-styles');
                    p4.classList.add('paragraph-styles');



                    p1.addEventListener('click', () => {
                        div.removeChild(p2);
                        div.removeChild(p3);
                        div.removeChild(p4);
                        const end = document.createElement("p");
                        const text = document.createTextNode("Has acertado!");
                        end.appendChild(text);
                        div.appendChild(end);
                    });

                    p2.addEventListener('click', () => {
                        console.log('p2 clicked');
                    });
            
                    p3.addEventListener('click', () => {
                        console.log('p3 clicked');
                    });
            
                    p4.addEventListener('click', () => {
                        console.log('p4 clicked');
                    });
                    
                    

                }),
                document.getElementById('tarjeta1-text2').addEventListener('click', () => {
                    console.log('todo ok2');
                }),
                document.getElementById('tarjeta1-text3').addEventListener('click', () => {
                    console.log('todo ok3');
                }),
                document.getElementById('tarjeta1-text4').addEventListener('click', () => {
                    console.log('todo ok4');
                }),
                document.getElementById('tarjeta1-text5').addEventListener('click', () => {
                    console.log('todo ok5');
                }),
                document.getElementById('tarjeta1-text6').addEventListener('click', () => {
                    console.log('todo ok6');
                })
            } else if (modal.id === 'modal2') {
                document.getElementById('tarjeta2-text1').addEventListener('click', () => {
                    console.log('todo ok1');
                }),
                document.getElementById('tarjeta2-text2').addEventListener('click', () => {
                    console.log('todo ok2');
                }),
                document.getElementById('tarjeta2-text3').addEventListener('click', () => {
                    console.log('todo ok3');
                }),
                document.getElementById('tarjeta2-text4').addEventListener('click', () => {
                    console.log('todo ok4');
                }),
                document.getElementById('tarjeta2-text5').addEventListener('click', () => {
                    console.log('todo ok5');
                }),
                document.getElementById('tarjeta2-text6').addEventListener('click', () => {
                    console.log('todo ok6');
                })
            } else if(modal.id === 'modal3') {
                document.getElementById('tarjeta3-text1').addEventListener('click', () => {
                    console.log('todo ok1');
                }),
                document.getElementById('tarjeta3-text2').addEventListener('click', () => {
                    console.log('todo ok2');
                }),
                document.getElementById('tarjeta3-text3').addEventListener('click', () => {
                    console.log('todo ok3');
                }),
                document.getElementById('tarjeta3-text4').addEventListener('click', () => {
                    console.log('todo ok4');
                }),
                document.getElementById('tarjeta3-text5').addEventListener('click', () => {
                    console.log('todo ok5');
                }),
                document.getElementById('tarjeta3-text6').addEventListener('click', () => {
                    console.log('todo ok6');        
                })
            } else if (modal.id === 'modal4') {
                document.getElementById('tarjeta4-text1').addEventListener('click', () => {
                    console.log('todo ok1');
                }),
                document.getElementById('tarjeta4-text2').addEventListener('click', () => {
                    console.log('todo ok2');
                }),
                document.getElementById('tarjeta4-text3').addEventListener('click', () => {
                    console.log('todo ok3');
                }),
                document.getElementById('tarjeta4-text4').addEventListener('click', () => {
                    console.log('todo ok4');
                }),
                document.getElementById('tarjeta4-text5').addEventListener('click', () => {
                    console.log('todo ok5');
                }),
                document.getElementById('tarjeta4-text6').addEventListener('click', () => {
                    console.log('todo ok6');
                })
            }
        }
    })
}

const el = document.getElementById('tarjeta1')
const height = el.clientHeight;
const width = el.clientWidth;
setTransform(el, width, height);

const el2 = document.getElementById('tarjeta2')
const height2 = el2.clientHeight;
const width2 = el2.clientWidth;
setTransform(el2, width2, height2);

const el3 = document.getElementById('tarjeta3')
const height3 = el3.clientHeight;
const width3 = el3.clientWidth;
setTransform(el3, width3, height3);

const el4 = document.getElementById('tarjeta4')
const height4 = el4.clientHeight;
const width4 = el4.clientWidth;
setTransform(el4, width2, height2);


// La verdadera siempre es la primera
const pregunta1Text1 = ["1. Sí, el trabajador puede extinguir su contrato de trabajo sin necesidad de alegar ninguna causa.", "2. No, el trabajador solo puede extinguir su contrato si el empleador ha incumplido sus obligaciones.", "3. No, el trabajador necesita la autorización del empleador para extinguir su contrato.","4. No, el trabajador solo puede extinguir su contrato si tiene una causa justificada."];

const pregunta2Text1 = ["La extinción del contrato por voluntad del empresario puede estar justificada por causas económicas, técnicas, organizativas o de producción.", "La extinción del contrato por voluntad del empresario solo puede hacerse por causas disciplinarias.", "La extinción del contrato por voluntad del empresario solo puede hacerse por causas médicas.", "La extinción del contrato por voluntad del empresario solo puede hacerse por acuerdo mutuo entre las partes."]

const pregunta3Text1 = ["Son aquellas que están relacionadas con la empresa, la producción o la capacidad del trabajador.", "Son aquellas que están relacionadas con el comportamiento del trabajador.", "Son aquellas que están relacionadas con la salud del trabajador.", "Son aquellas que están relacionadas con la situación económica del trabajador."]

const pregunta4Text1 = ["Es la extinción del contrato de trabajo por parte del empleador debido a un incumplimiento grave y culpable por parte del trabajador.", "Es la extinción del contrato de trabajo por voluntad del trabajador.", "Es la extinción del contrato de trabajo por voluntad del trabajador.", "Es la extinción del contrato de trabajo por voluntad del trabajador."]

const pregunta5Text1 = ["Se considera despido nulo aquel que vulnere derechos fundamentales o libertades públicas del trabajador, como la discriminación por razones de género, religión, orientación sexual, discapacidad, etc.", "El despido nulo es aquel que se produce sin haber cumplido el preaviso establecido por la ley.", "El despido nulo es aquel que se produce por causas disciplinarias.", "El despido nulo es aquel que se produce por causas objetivas."]

const pregunta6Text1 = ["Una cantidad de dinero que la empresa paga al empleado al finalizar la relación laboral.", "Una cantidad de dinero que el empleado paga a la empresa al finalizar la relación laboral.", "Un documento que el empleado debe presentar al inicio de la relación laboral.", "Un documento que la empresa debe presentar al inicio de la relación laboral."]

const pregunta1Text2 = ["El trabajador debe cumplir un plazo de preaviso de 15 días.", "El trabajador no tiene que cumplir ningún plazo de preaviso.", "El trabajador debe cumplir un plazo de preaviso de 30 días.", "El trabajador debe cumplir un plazo de preaviso de 60 días."]

const pregunta2Text2 = ["El plazo de preaviso en la extinción del contrato por voluntad del empresario por causas económicas, técnicas, organizativas o de producción es de 15 días.", "El plazo de preaviso en la extinción del contrato por voluntad del empresario por causas económicas, técnicas, organizativas o de producción es de 1 día.", "El plazo de preaviso en la extinción del contrato por voluntad del empresario por causas económicas, técnicas, organizativas o de producción es de 30 días.", "No es necesario cumplir ningún plazo de preaviso en la extinción del contrato por voluntad del empresario."]

const pregunta3Text2 = ["El empleador debe cumplir un plazo de preaviso de 15 días.", "El empleador no tiene que cumplir ningún plazo de preaviso.", "El empleador debe cumplir un plazo de preaviso de 30 días.", "El empleador debe cumplir un plazo de preaviso de 60 días."]

const pregunta4Text2 = ["El empleador debe comunicar el despido disciplinario al trabajador de forma inmediata y por escrito, especificando los hechos que lo motivan.", "El empleador tiene un plazo de 7 días para comunicar el despido disciplinario al trabajador.", "El empleador tiene un plazo de 30 días para comunicar el despido disciplinario al trabajador.", "El empleador no tiene que comunicar el despido disciplinario al trabajador."]

const pregunta5Text2 = ["Se considera despido improcedente aquel que se produce sin que el empresario acredite la existencia de una causa válida que justifique la extinción del contrato.", "El despido improcedente es aquel que se produce por causas objetivas.", "El despido improcedente es aquel que se produce por causas disciplinarias.", "El despido improcedente es aquel que se produce cuando el trabajador no cumple con sus obligaciones laborales."]

const pregunta6Text2 = ["Ninguna de las anteriores.", "Si ha causado daños a la empresa.", "Si ha renunciado a su puesto de trabajo.", "Si ha sido despedido disciplinariamente."]

const pregunta1Text3 = ["Si el trabajador no realiza el preaviso antes de extinguir su contrato, puede perder el derecho a una indemnización por despido.", "Si el trabajador no realiza el preaviso antes de extinguir su contrato, debe pagar una indemnización al empleador.", "Si el trabajador no realiza el preaviso antes de extinguir su contrato, el empleador puede retener parte de su salario.", "Si el trabajador no realiza el preaviso antes de extinguir su contrato, no tiene ninguna consecuencia."]

const pregunta2Text3 = ["El trabajador tiene derecho a una indemnización, cuyo importe depende de la causa que motiva la extinción del contrato y de la antigüedad del trabajador en la empresa.", "El trabajador no tiene derecho a ninguna indemnización en caso de extinción del contrato por voluntad del empresario.", "El trabajador tiene derecho a una indemnización fija en todos los casos.", "El trabajador solo tiene derecho a una indemnización si la extinción del contrato se produce por causas disciplinarias."]

const pregunta3Text3 = ["El trabajador tiene derecho a una indemnización de 20 días de salario por año trabajado, con un máximo de 12 mensualidades.", "El trabajador no tiene derecho a ninguna indemnización en caso de extinción del contrato por causas objetivas.", "El trabajador tiene derecho a una indemnización de 30 días de salario por año trabajado, con un máximo de 12 mensualidades.", "El trabajador tiene derecho a una indemnización de 10 días de salario por año trabajado, con un máximo de 6 mensualidades."]

const pregunta4Text3 = ["El trabajador no tiene derecho a indemnización en caso de despido disciplinario.", "El trabajador tiene derecho a una indemnización de 20 días de salario por año trabajado.", "El trabajador tiene derecho a una indemnización de 30 días de salario por año trabajado.", "El trabajador tiene derecho a una indemnización de 45 días de salario por año trabajado."]

const pregunta5Text3 = ["La calificación judicial de un despido como nulo obliga al empresario a readmitir al trabajador y a abonarle los salarios correspondientes al período de tiempo en el que ha estado fuera de la empresa.", "La calificación judicial de un despido como nulo no tiene consecuencias para el empresario.", "La calificación judicial de un despido como nulo obliga al empresario a indemnizar al trabajador, pero no a readmitirlo.", "La calificación judicial de un despido como nulo obliga al empresario a indemnizar al trabajador, pero no a abonarle los salarios correspondientes."]

const pregunta6Text3 = ["Todas las anteriores.", "El salario correspondiente al último mes trabajado.", "La parte proporcional de las pagas extras.", "Indemnizaciones por vacaciones no disfrutadas."]

const pregunta1Text4 = ["Sí, el trabajador puede extinguir su contrato de trabajo durante el período de prueba sin necesidad de alegar ninguna causa.", "No, el trabajador debe cumplir todo el período de prueba antes de extinguir su contrato.", "No, el trabajador solo puede extinguir su contrato durante el período de prueba si tiene una causa justificada.", "No, el trabajador necesita la autorización del empleador para extinguir su contrato durante el período de prueba."]

const pregunta2Text4 = ["El empresario debe seguir un procedimiento legal que incluye la comunicación por escrito al trabajador, la entrega de una carta de despido y el respeto de los plazos de preaviso establecidos por la ley.", "El empresario puede hacer la extinción del contrato por voluntad del empresario de forma verbal.", "El empresario solo necesita entregar una carta de despido al trabajador. ", "El empresario no necesita seguir ningún procedimiento legal"]

const pregunta3Text4 = ["Sí, el trabajador puede impugnar la extinción del contrato por causas objetivas ante los tribunales si considera que no se han cumplido los requisitos legales.", "No, el trabajador no puede impugnar la extinción del contrato por causas objetivas.", "El trabajador solo puede impugnar la extinción del contrato por causas objetivas si tiene un contrato indefinido.", "El trabajador solo puede impugnar la extinción del contrato por causas objetivas si es representante legal de los trabajadores."]

const pregunta4Text4 = ["Sí, el trabajador puede impugnar el despido disciplinario ante los tribunales si considera que no se han cumplido los requisitos legales o que el despido no está justificado.", "No, el trabajador no puede impugnar el despido disciplinario.", "El trabajador solo puede impugnar el despido disciplinario si tiene un contrato indefinido.", "El trabajador solo puede impugnar el despido disciplinario si es representante legal de los trabajadores."]

const pregunta5Text4 = ["La calificación judicial de un despido como nulo obliga al empresario a readmitir al trabajador y a abonarle los salarios correspondientes al período de tiempo en el que ha estado fuera de la empresa.", "La calificación judicial de un despido como nulo no tiene consecuencias para el empresario.", "La calificación judicial de un despido como nulo obliga al empresario a indemnizar al trabajador, pero no a readmitirlo.", "La calificación judicial de un despido como nulo obliga al empresario a indemnizar al trabajador, pero no a abonarle los salarios correspondientes."]

const pregunta6Text4 = ["En un plazo máximo de 30 días desde la fecha de finalización del contrato.", "En un plazo máximo de 15 días desde la fecha de finalización del contrato.", "En un plazo máximo de 45 días desde la fecha de finalización del contrato.", "En un plazo máximo de 60 días desde la fecha de finalización del contrato."]