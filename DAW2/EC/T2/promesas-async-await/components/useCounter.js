export async function useCounter(num, target, callback) {
  return new Promise((resolve) => {
    let counter = num;

    const interval = setInterval(() => {
      callback(target, counter);
      counter--;

      if (counter < 0) {
        clearInterval(interval);
        resolve("Tiempo cumplido");
      }
    }, 1000);
  });
}
