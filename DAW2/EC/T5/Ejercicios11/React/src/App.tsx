import { useState } from "react";

function App() {
  return (
    <>
      <Ej1 />
      <hr />
      <Ej2 />
      <hr />
      <Ej3 />
      <hr />
      <Ej4 />
      <hr />
      <Ej5 />
      <hr />
      <Ej6 bg={"green"} text={"Test"} event={() => console.log("Test")} />
      <hr />
      <Ej7 condition={true} />
      <hr />
      <Ej8 title={"Título"} body={"Descripción"} footer={"Footer"} />
      <hr />
      <Ej9 />
      <hr />
      <Ej10 userList={["Pepe", "Diego", "Lucas"]} />
      <hr />
      <Ej11 isLoggedIn={true} userRole={"admin"} />
    </>
  );
}

function Ej1() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);
  return (
    <>
      <p>{isLoggedIn ? "Bienvenido" : "Por favor, inicia sesión"}</p>
      <button onClick={() => setIsLoggedIn(!isLoggedIn)}>
        {!isLoggedIn ? "Login" : "Logout"}
      </button>
    </>
  );
}

function Ej2() {
  const list = ["Sota", "Caballo", "Rey"];

  return (
    <ul>
      {list.map((el) => (
        <li key={el}>{el}</li>
      ))}
    </ul>
  );
}

function Ej3() {
  return (
    <button onClick={() => console.log("Mensaje de ejemplo")}>Mensaje</button>
  );
}

function Ej4() {
  return (
    <header>
      <h3>Título</h3>
    </header>
  );
}

function Ej5() {
  return <h5 style={{ backgroundColor: "red" }}>Inline style</h5>;
}

// @ts-expect-error interface needed
function Ej6({ bg, text, event }) {
  return (
    <button onClick={event} style={{ backgroundColor: bg }}>
      {text}
    </button>
  );
}

// @ts-expect-error interface needed
function Ej7({ condition }) {
  return (
    <p>{condition === true ? "Condición verdadera" : "Condición falsa"}</p>
  );
}

// @ts-expect-error interface needed
function Ej8({ title, body, footer }) {
  return (
    <>
      <header>{title}</header>
      <main>{body}</main>
      <footer>{footer}</footer>
    </>
  );
}

function Ej9() {
  const [isVisible, setIsVisible] = useState(true);

  return (
    <>
      {isVisible ? <p>Párrafo ocultable</p> : ""}
      <button onClick={() => setIsVisible(!isVisible)}>
        {isVisible ? "Ocultar párrafo" : "Mostrar párrafo"}
      </button>
    </>
  );
}

// @ts-expect-error interface needed
function Ej10({ userList }) {
  return (
    <>
      <ol>
        {userList.map((el: string, i: number) => (
          <li key={i}>
            <>
              Nombre: <strong>{el}</strong>, índice: <a>{i}</a>
            </>
          </li>
        ))}
      </ol>
    </>
  );
}

// @ts-expect-error interface needed
function Ej11({ isLoggedIn, userRole }) {
  return (
    <>
      <p>{isLoggedIn ? "Bienvenido" : "Inicia sesión"}</p>
      {userRole === "admin" ? <p>Eres admin</p> : ""}
    </>
  );
}
export default App;
