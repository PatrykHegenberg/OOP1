import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class Rechnung {
    private int rechnungsnummer;
    private LocalDateTime datum;
    private Kunde kunde;
    private List<Artikel> positionen;
    private double summe;

    public Rechnung(int rechnungsnummer, LocalDateTime datum, Kunde kunde) {
        this.rechnungsnummer = rechnungsnummer;
        this.datum = datum;
        this.kunde = kunde;
        this.positionen = new ArrayList<>();
        this.summe = 0.0;
    }

    public int getRechnungsnummer() {
        return rechnungsnummer;
    }

    public LocalDateTime getDatum() {
        return datum;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void addPosition(Artikel artikel) {
        positionen.add(artikel);
        summe += artikel.getPreis();
    }

    public List<Artikel> getPositionen() {
        return positionen;
    }

    public double getSumme() {
        return summe;
    }

    public void anzeigen() {
        System.out.println("Rechnungsnummer: " + rechnungsnummer);
        System.out.println("Datum: " + datum);
        System.out.println("Kunde: " + kunde.getName() + " " + kunde.getVorname());
        System.out.println("Positionen: ");
        for (Artikel artikel : positionen) {
            String line = "- " + artikel.getName() + " (" + String.format("%.2f", artikel.getPreis()) + "€)";
            int remainingLength = 80 - line.length();
            String padding = String.format("%" + remainingLength + "s", "");
            System.out.println(line + padding + String.format("%8s", ""));
        }
        System.out.println("Summe: " + String.format("%" + (80 - 7) + "s", String.format("%.2f", summe) + "€"));
    }

    public void alsPDFSpeichern(String dateiname) throws IOException {
        Document document = new Document(PageSize.A4, 50, 50, 50, 50);
        try {
            PdfWriter.getInstance(document, new FileOutputStream(dateiname));
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }
        document.open();
    
        Font boldFont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
        Font normalFont = new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL);
    
        Paragraph titel = new Paragraph("Rechnung", boldFont);
        titel.setAlignment(Element.ALIGN_CENTER);
        titel.setSpacingAfter(20);
        try {
            document.add(titel);
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }

        PdfPTable kundenTabelle = new PdfPTable(2);
        kundenTabelle.setWidthPercentage(100);
        kundenTabelle.setSpacingBefore(20);
        kundenTabelle.setSpacingAfter(20);
    
        addCellToTable(kundenTabelle, "Rechnungsnummer", boldFont);
        addCellToTable(kundenTabelle, String.valueOf(rechnungsnummer), normalFont);
    
        addCellToTable(kundenTabelle, "Datum", boldFont);
        addCellToTable(kundenTabelle, datum.toString(), normalFont);
    
        addCellToTable(kundenTabelle, "Kunde", boldFont);
        addCellToTable(kundenTabelle, kunde.getName() + " " + kunde.getVorname(), normalFont);

        try {
            document.add(kundenTabelle);
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }

        PdfPTable positionenTabelle = new PdfPTable(3);
        positionenTabelle.setWidthPercentage(100);
        positionenTabelle.setSpacingBefore(20);
        positionenTabelle.setSpacingAfter(20);
    
        addCellToTable(positionenTabelle, "Artikel", boldFont);
        addCellToTable(positionenTabelle, "Preis", boldFont);
        addCellToTable(positionenTabelle, "Summe", boldFont);
    
        for (Artikel artikel : positionen) {
            addCellToTable(positionenTabelle, artikel.getName(), normalFont);
            addCellToTable(positionenTabelle, String.format("%.2f€", artikel.getPreis()), normalFont);
            addCellToTable(positionenTabelle, String.format("%.2f€", artikel.getPreis()), normalFont);
        }

        try {
            document.add(positionenTabelle);
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }

        PdfPTable summenTabelle = new PdfPTable(2);
        summenTabelle.setWidthPercentage(100);
        summenTabelle.setSpacingBefore(20);
        summenTabelle.setSpacingAfter(20);
    
        addCellToTable(summenTabelle, "Summe", boldFont);
        addCellToTable(summenTabelle, String.format("%.2f€", summe), normalFont);

        try {
            document.add(summenTabelle);
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }

        document.close();
    }
    
    private void addCellToTable(PdfPTable table, String text, Font font) {
        PdfPCell cell = new PdfPCell(new Paragraph(text, font));
        table.addCell(cell);
    }
}      