module.exports = {
  root: true,
  env: { browser: true, es2020: true },
  extends: ["eslint:recommended"],
  ignorePatterns: ["dist", ".eslintrc.cjs"],
  parserOptions: { ecmaVersion: "latest", sourceType: "module" },
  settings: { react: { version: "18.2" } },
  rules: {
    "no-unused-vars": "warn",
    "react/prop-types": "off",
    "no-const-assign": "off",
    // "no-undef": "off",
    "no-prototype-builtins": "off",

  },
};
