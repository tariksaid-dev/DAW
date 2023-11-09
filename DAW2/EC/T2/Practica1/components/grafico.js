import * as echarts from "echarts";

export default function crearGrafico({ tasks }, container) {
  const width = container.clientWidth;
  const height = container.clientHeight;

  const completed = tasks.reduce((acc, el) => {
    return el.isCompleted ? acc + 1 : acc;
  }, 0);
  const uncompleted = tasks.reduce((acc, el) => {
    return el.isCompleted ? acc : acc + 1;
  }, 0);

  const options = {
    tooltip: {
      trigger: "item",
    },
    legend: {
      top: "5%",
      left: "center",
      selectedMode: false,
    },
    series: [
      {
        name: "Access From",
        type: "pie",
        radius: ["40%", "70%"],
        center: ["50%", "70%"],
        // adjust the start angle
        startAngle: 180,
        label: {
          show: true,
          formatter(param) {
            // correct the percentage
            return param.name + " (" + param.percent * 2 + "%)";
          },
        },
        data: [
          { value: completed, name: "Tareas completadas" },
          { value: uncompleted, name: "Tareas por hacer" },
          {
            // make an record to fill the bottom 50%
            value: completed + uncompleted,
            itemStyle: {
              // stop the chart from rendering this piece
              color: "none",
              decal: {
                symbol: "none",
              },
            },
            label: {
              show: false,
            },
          },
        ],
      },
    ],
  };

  let miGrafico = echarts.init(container, "dark");
  miGrafico.resize({ width, height });
  miGrafico.setOption(options);

  return miGrafico;
}
