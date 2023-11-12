import { PDFDocument, StandardFonts, rgb } from "pdf-lib";

export async function createPDF(arr) {
  const pdfDocument = await PDFDocument.create();
  const timesRomanFont = await pdfDocument.embedFont(StandardFonts.TimesRoman);
  const page = pdfDocument.addPage();
  const { width, height } = page.getSize();

  const fontSize = 19;
  const text = arr
    .map(
      ({ id, isCompleted, title }) =>
        `-Id: ${id}\n-IsCompleted: ${isCompleted}\n-Title: ${title}\n-Fecha: ${Date.now()}`
    )
    .join("\n\n");

  page.drawText(text, {
    x: 50,
    y: height - 4 * fontSize,
    size: fontSize,
    font: timesRomanFont,
    color: rgb(0, 0, 0),
  });

  const pdfBytes = await pdfDocument.save();

  const blob = new Blob([pdfBytes], { type: "application/pdf" });
  const currentDate = new Date();

  const formattedDate = `${currentDate.getFullYear()}-${(
    currentDate.getMonth() + 1
  )
    .toString()
    .padStart(2, "0")}-${currentDate.getDate().toString().padStart(2, "0")}`;

  const fileName = `${
    arr[0].title.substring(0, 4) ?? arr[0].title
  }_${formattedDate}.pdf`;

  const link = document.createElement("a");
  link.href = window.URL.createObjectURL(blob);
  link.download = fileName;

  link.click();
  link.remove();
}
