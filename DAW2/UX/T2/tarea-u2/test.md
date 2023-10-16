---
title: "Tema 2: Accesibilidad en la web"
author: [Tarik Said Manjón]
date: "2º DAW"
lang: "es"
colorlinks: true
code-block-font-size: '\large'
listings-no-page-break: true
header-includes:
  - |
    ```{=latex}
    \usepackage{awesomebox}
    \usepackage{graphicx}
    ```
pandoc-latex-environment:
  noteblock: [note]
  tipblock: [tip]
  warningblock: [warning]
  cautionblock: [caution]
  importantblock: [important]
...

# Tarea unidad 2: Accesibilidad en la web

1. Esta parte de la tarea consiste en ayudar a Juan a realizar su tarea. Supongamos que en la página principal vamos a sustituir la sección de presentación de la empresa (el apartado “El tacón de Oro” ) por un slider. **Deberás encargarte de hacer una relación Pautas y Criterios de éxito que deberá verificarse de acuerdo al Nivel de conformidad A y que guarden relación con este slider.** En la relación deberás incluir sólo las técnicas generales y suficientes correspondientes a las dos primeras pautas del primer principio. Indica los pasos a seguir para verificar dichas técnicas. La relación se puede presentar en forma de tabla con 4 columnas:

- Pauta.
- Criterio de éxito.
- Técnica.
- Test.

| Pauta | Criterio de éxito | Técnica |Test |
| ----- | ----------------- | ---------|--- |
**1.1.1 Contenido no textual**| Todo contenido no textual que se presenta al usuario tiene una alternativa textual que cumple el mismo propósito | **G94, G95, G82, G68, G100** | Las imágenes no tienen los nombres de accesibilidad vacíos. |
|**1.3.1 Información y relaciones**| La información, estructura y relaciones comunicadas a través de la presentación pueden ser determinadas por software o están disponibles como texto. |**ARIA11, H101, ARIA12, ARIA13, ARIA16, 1RIA17, ARIA20, G115, G117, G140, G138, G117**| Fallo en algunos de los criterios previamente enumerados (no marcar cabeceras, dejar carácteres en blanco, etc)|
