import { useEffect } from "react";
import { useState } from "react";
import {
  LineChart,
  Line,
  CartesianGrid,
  XAxis,
  YAxis,
  Tooltip,
} from "recharts";

const initialDate = new Date();
const initialDateISOS = initialDate.toISOString();
initialDate.setHours(initialDate.getHours() + 24);
const finalDateISOS = initialDate.toISOString();

const URL = `https://apidatos.ree.es/es/datos/mercados/precios-mercados-tiempo-real?start_date=${initialDateISOS}&end_date=${finalDateISOS}&time_trunc=hour`;

function App() {
  const [prices, setPrices] = useState();

  useEffect(() => {
    async function fetchApi() {
      const res = await fetch(URL);
      const data = await res.json();

      const values = data.included.find(
        (item) => item.type === "Precio mercado spot (€/MWh)"
      ).attributes.values;
      setPrices(values);
    }
    fetchApi();
  }, []);

  return (
    <div className="p-4 mt-4 ">
      <h1 className="text-4xl py-12">Precios de la luz de hoy</h1>
      <Products prices={prices} />
      <div className="flex justify-center pt-20 mb-0">
        <Chart prices={prices} />
      </div>
    </div>
  );
}

function Products({ prices }) {
  if (!prices) return <div>Loading...</div>;

  return (
    <ul className="grid grid-cols-[repeat(auto-fill,minmax(250px,1fr))] gap-4">
      {prices.map((el, i) => (
        <li key={i}>
          <div className="border-2 ">
            <h1 className="border-2 bg-slate-800">
              Precio: <b>{el.value}</b>€
            </h1>
            <h2>{new Date(el.datetime).toString()}</h2>
          </div>
        </li>
      ))}
    </ul>
  );
}

function Chart({ prices }) {
  return (
    <LineChart width={800} height={200} data={prices}>
      <Line type="monotone" dataKey="value" stroke="#8884d8" />
      <CartesianGrid stroke="#ccc" />
      <XAxis dataKey="value" />
      <YAxis />
      <Tooltip
        contentStyle={{
          stroke: "#4f46e5",
          fill: "#4f46e5",
          background: "#18212f",
        }}
      />
    </LineChart>
  );
}
export default App;
