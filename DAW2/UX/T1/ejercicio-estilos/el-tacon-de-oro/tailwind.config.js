/** @type {import('tailwindcss').Config} */
export default {
  content: ["./index.html", "./src/**/*.{js,ts,jsx,tsx}"],
  theme: {
    fontFamily: {
      sans: "Roboto Mono, monospace",
    },
    extend: {
      height: {
        screen: "100dvh",
      },
      keyframes: {
        moveDown: {
          "0%": { top: "0" },
          "100%": { top: "var(--topDistance)" },
        },
        bounceAndDescend: {
          // "0%, 100%": { transform: "translateY(0) translateX(0)" },
          "30%": { transform: "translateY(30vh) translateX(-80px)" },
          "70%": { transform: "translateY(70vh) translateX(80px)" },
          "100%": { transform: "translateY(99vh) translateX(50px)" },
        },
        descend: {},
      },
      animation: {
        moveDown: "moveDown 4s linear infinite",
        bounceAndDescend: "bounceAndDescend 15s linear infinite",
      },
    },
  },
  plugins: [],
};
