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
        const modal = document.getElementById('modal');
        modal.style.display='flex';

        const top = (window.innerHeight - modal.offsetHeight) / 2;
        const left = (window.innerWidth - modal.offsetWidth) / 2;
        modal.style.top = top + 'px';
        modal.style.left = left + 'px';

        modal.addEventListener('click', (e) => {
            if (e.target === modal) {
                modal.style.display = 'none';
            }
        })
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