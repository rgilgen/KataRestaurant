# Aufgabenstellung

Schreibe ein Programm, das Essensbestellungen in einem Restaurant verwaltet und für jeden Gast eine detaillierte Rechnung erzeugen kann.

## Funktionalität

### Menükarte

Es gibt eine feste Menükarte mit folgenden Artikeln und Preisen:

| Artikel                  | Preis (CHF) |
|--------------------------|-------------|
| Mineralwasser            | 4.00        |
| Süssgetränk              | 5.00        |
| Kaffee oder Tee          | 4.50        |
| Suppe                    | 8.00        |
| Salat                    | 8.00        |
| Spezialität des Kochs    | 25.00       |
| Schnitzel Pommesfrites   | 18.00       |
| Tabulé                   | 18.00       |

### Bestellungen

Verschiedene Gäste (Benutzer) können Bestellungen aufgeben. Eine Bestellung besteht aus einer beliebigen Anzahl von Artikeln von der Menükarte.

### Rechnung

Für jeden Gast kann eine Rechnung erzeugt werden, die alle bestellten Artikel mit Einzelpreisen, Gesamtpreis und Gastnamen auflistet.

#### Beispiel

Angenommen, folgende Bestellungen werden aufgegeben:

```java
restaurant.placeOrder("Anna", Arrays.asList("Suppe", "Mineralwasser"));
restaurant.placeOrder("Ben", Arrays.asList("Spezialität des Kochs", "Kaffee oder Tee", "Salat"));
restaurant.printBill("Anna");
```

Ausgabe:

```
Rechnung für: Anna

--------------------------

Suppe                8.00 CHF
Mineralwasser        4.00 CHF

--------------------------

Total:              12.00 CHF
```

## Anforderungen

- Die Lösung soll testgetrieben entwickelt werden (TDD).
- Schreibe sinnvolle Unit-Tests für die wichtigsten Funktionen.
- Implementiere die Lösung einmal objektorientiert (mit Klassen wie Restaurant, Bestellung, Gast, Menükarte etc.).
- Implementiere die Lösung einmal funktional (z.B. mit unveränderlichen Datenstrukturen, Streams, reinen Funktionen).
- Die Datenhaltung (z.B. Bestellungen) kann im Speicher erfolgen.
- Es ist keine Benutzeroberfläche nötig, die Ausgabe kann z.B. auf der Konsole erfolgen.

## Tipps für die Umsetzung

**Objektorientiert:**
- Nutze Klassen wie Restaurant, Bestellung, Gast, Menükarte, evtl. ein Interface für die Rechnungsausgabe.

**Funktional:**
- Arbeite mit unveränderlichen Listen, reinen Funktionen (z.B. eine Funktion, die eine Liste von Bestellungen nimmt und eine Rechnung als String zurückgibt).

**Tests:**
- Schreibe Tests für das Hinzufügen von Bestellungen, die korrekte Preisberechnung und die Ausgabe der Rechnung.

## Warum eignet sich diese Kata?

- Sie ist überschaubar, aber nicht trivial.
- Sie bietet Raum für sinnvolle OO- und funktionale Ansätze.
- Sie lässt sich gut testgetrieben entwickeln.
- Sie ist in 2h pro Ansatz für einen durchschnittlichen Entwickler lösbar.

# Vorgehen

- Klasse Restaurant mit main Methode