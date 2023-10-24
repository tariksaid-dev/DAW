import { HOURS_INTERVAL } from "./constants";

/**
 * Disponemos de un centro médico que permite realizar reservas para asistir a la consulta médica de un médico. Disponemos de un array que contiene las horas entre las 9 y las 15 separadas en tramos de 15 minutos. Disponemos de un array que contiene emoticonos.

Disponemos de un label que diga "Nombre del paciente", un input para el nombre, un label que diga "Fecha" un input para la fecha,

generaremos una matriz con botones que sean las horas disponibles para ese día, y enviamos

Se gestionan las citas médicas almacenar en una clave llamada hospital o centro medico un array de map que contenga nombre de usuario, fecha-hora. No esta permitido insertar usuarios repetidos.
 * @returns 
 */

function App() {
  function handleSubmit(e) {
    e.preventDefault();
  }

  return (
    <div className="flex flex-col h-screen bg-slate-700">
      <form
        className="flex flex-col border border-solid border-gray-500 py-10 px-16 bg-gray-900 m-40 gap-2 rounded-xl shadow-xl"
        onSubmit={handleSubmit}
      >
        <label className="font-medium text-white">Nombre del paciente</label>
        <input type="text" id="username" />
        <label className="font-medium text-white mt-3">Fecha</label>
        <input type="date" id="username" />
        <label className="font-medium text-white mt-3">Nombre</label>
        <input type="text" id="username" />
      </form>

      <Hours />
    </div>
  );
}

export default App;

function Hours() {
  return (
    <div className="grid grid-cols-[repeat(auto-fill,minmax(250px,1fr))] gap-6 m-12 text-white">
      {HOURS_INTERVAL.map((el) => (
        <button
          className="bg-slate-900 gap-3 border border-slate-300"
          key={HOURS_INTERVAL.i}
        >
          {el}
        </button>
      ))}
    </div>
  );
}
