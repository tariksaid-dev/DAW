export function generarEventoICS(arr) {
  const currentDate = new Date();
  const endDate = new Date(currentDate.getTime() + 30 * 24 * 60 * 60 * 1000);

  const eventTitle = "Tareas pendientes";
  const eventDescription = `Número de tareas sin realizar: ${
    arr.filter((el) => !el.isCompleted).length
  }`;

  const icsContent = `BEGIN:VCALENDAR
VERSION:2.0
BEGIN:VEVENT
SUMMARY:${eventTitle}
DESCRIPTION:${eventDescription}
DTSTART:${getFormattedDate(currentDate)}
DTEND:${getFormattedDate(endDate)}
END:VEVENT
END:VCALENDAR`;

  const blob = new Blob([icsContent], { type: "text/calendar;charset=utf-8" });
  const link = document.createElement("a");

  link.href = window.URL.createObjectURL(blob);
  link.download = "calendario_evento.ics";
  link.click();
  link.remove();
}

function getFormattedDate(date) {
  const year = date.getFullYear();
  const month = (date.getMonth() + 1).toString().padStart(2, "0");
  const day = date.getDate().toString().padStart(2, "0");
  const hours = date.getHours().toString().padStart(2, "0");
  const minutes = date.getMinutes().toString().padStart(2, "0");
  const seconds = date.getSeconds().toString().padStart(2, "0");

  return `${year}${month}${day}T${hours}${minutes}${seconds}Z`;
}
