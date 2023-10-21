// begin Styling
#set page(
 paper: "a4",
 margin: (x: 2.0cm, y: 2.0cm),
)
#set text(
 font: "Noto Sans",
 size: 11pt,
 lang: "de"
)
#set par(
 justify: true,
 linebreaks: "optimized",
 leading: 1.5em
)
// end Styling

// Start document

#include "titel.typ"

#set page(
 numbering: "I",
)
#counter(page).update(1)

#show outline: set heading(outlined: true)
#outline(title: "Inhaltsverzeichnis")
#outline(target: figure.where(kind: table), title: "Tabellenverzeichnis")
#outline(target: figure.where(kind: figure), title: "Abbildungsverzeichnis")

#set page(
 numbering: "1",
)

#counter(page).update(1)


#set page(
 numbering: "I"
)

#bibliography("bibliografie.bib", title: "Literaturverzeichnis", style: "apa")
// End document