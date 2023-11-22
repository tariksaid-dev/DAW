import { createHtml } from "./src/components/htmlGenerator";
import { paginator } from "./src/components/paginator";
import { paintPokemons } from "./src/hooks/usePokemons";

const { createHeader, createMain, createFooter } = createHtml();

localStorage.clear();

createHeader();
createMain();
createFooter();
paintPokemons();

paginator();
