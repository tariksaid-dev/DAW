import { Desarrollador } from "./Desarrollador";
import { Empleado } from "./Empleado";
import { Empresa } from "./Empresa";
import { Gerente } from "./Gerente";

const empleado1 = new Empleado("Pepe", "Pepito", 1000);
const empleado2 = new Empleado("Patrick", "Pepito", 1000);
const empleado3 = new Empleado("Migue", "Pepito", 1000);

const gerente = new Gerente("Tarek", "Said", 2000, 1000);

const dev = new Desarrollador("Isaías", "F", 1500, "JavaScript");

const empresa = new Empresa("Helados Tarek", [
  empleado1,
  empleado2,
  empleado3,
  gerente,
  dev,
]);

empresa.pagarSalarios();

console.log(gerente.dinero());
