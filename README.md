## Collaboratori
- **Kristian Xoxe**
  - [GitHub](https://github.com/krikri05)

- **Damiano Pagliarini**
  - [GitHub](https://github.com/DamiPaglia)    

- **Edoardo Paoletti**
  - [GitHub](https://github.com/Paoletz00)

## Guida Didattica
- **Docente: Monica Ciuchetti**
  - [GitHub](https://github.com/mciuchetti)

- **Docente di Laboratorio: Francesco Amendola**

## Dettagli Scolastici
- **Anno Scolastico: 2023/2024**
- **Classe: 5BINF**
- **Corso: TPSIT**
- **Istituto: [ITTS A. Volta](https://www.avoltapg.edu.it/)**
  - *Perugia (PG), Italia*

## Requisiti del Progetto

Per il prossimo Grand Prix è essenziale progettare un simulatore che consenta l'accesso riservato a ciascun giocatore.
I dati dei piloti e delle loro auto sono memorizzati in un file, insieme alle informazioni dei giocatori, le cui password sono cifrate con il cifrario di Vigénere.
Ogni giocatore può selezionare il numero di auto da far partire contemporaneamente e il circuito su cui gareggiare.
Ogni circuito ha una lunghezza definita e le auto percorrono tratti specifici ogni secondo in base alla velocità.
I giocatori possono personalizzare la lunghezza del circuito, il numero di giri, i pit stop e possono anche influenzare la gara, decidendo se truccare un'auto, causare un incidente o far intervenire la safety car.
Il giudice di gara deve comunicare l'inizio e la fine della gara a tutti i partecipanti e al pubblico, monitorare l'avanzamento delle auto durante la gara e notificare situazioni anomale. Alla fine della gara, deve annunciare il vincitore e salvare la classifica in un file consultabile dai giocatori.

## Classi usate

## Giocatore

La classe Giocatore è progettata per gestire le informazioni relative ai giocatori nel simulatore del Grand Prix. Di seguito sono elencate le principali caratteristiche e funzionalità della classe:

**Caratteristiche principali:**
-Attributi privati: La classe contiene attributi privati per memorizzare lo username, la password, lo stato di accesso, il numero di auto e gli array di oggetti Automobile e Pilota.

**Metodi pubblici principali:**
-accedi(): Questo metodo permette ai giocatori di accedere al simulatore inserendo lo username e la password. La password viene cifrata utilizzando il cifrario di Vigenère.
-creazione(): Questo metodo consente ai giocatori di creare le proprie auto e piloti, inserendo informazioni come marca, colore, numero e nome del pilota.
-iniziaGara(): Questo metodo avvia la gara e gestisce l'assegnazione dei partecipanti in base alle impostazioni del giocatore.

**Altri metodi:**
-pulisciConsole(): Questo metodo pulisce la console.
-getNauto(): Questo metodo restituisce il numero di auto selezionate dal giocatore.
-isAccesso(): Questo metodo restituisce lo stato di accesso del giocatore.

## Gestore

La classe Gestore funge da punto di ingresso per il simulatore del Grand Prix. Di seguito sono elencate le principali caratteristiche e funzionalità della classe:

**Caratteristiche principali:**
-Metodo main: Il metodo main gestisce il flusso del programma, permettendo agli utenti di selezionare diverse opzioni come l'accesso, la creazione di piloti e macchine, e l'avvio della gara.

**Metodi pubblici principali:**
-visualizza(): Questo metodo visualizza un menu delle opzioni disponibili per gli utenti, inclusi comandi per l'accesso, la creazione di piloti e macchine, e l'avvio della gara.

**Funzionalità aggiuntive:**
-La classe utilizza un oggetto Lettore per leggere le informazioni degli utenti da un file JSON.
-Implementa un ciclo while che continua fino a quando l'utente non sceglie di chiudere il programma (digitando 0).
-Gestisce l'input dell'utente e chiama i metodi appropriati della classe Giocatore in base alla selezione dell'utente.

## Automobile
La classe Automobile rappresenta un'automobile partecipante al simulatore del Grand Prix. Di seguito sono elencate le principali caratteristiche e funzionalità della classe:

**Caratteristiche principali:**
Attributi privati: La classe contiene attributi privati per memorizzare la marca, il colore e il numero dell'automobile.

**Metodi pubblici principali:**
-getMarca(): Restituisce la marca dell'automobile.
-getColore(): Restituisce il colore dell'automobile.
-getnAuto(): Restituisce il numero dell'automobile.

**Metodi:**
-gareggia(): Questo metodo simula il comportamento dell'automobile durante la gara.

**Metodi di Thread:**
-run(): Implementa il comportamento dell'automobile come un thread, richiamando il metodo gareggia().

**Funzionalità aggiuntive:**
Utilizza un oggetto Random per generare comportamenti casuali durante la gara.

## Pilota

La classe Pilota rappresenta un pilota partecipante al simulatore del Grand Prix. Di seguito sono elencate le principali caratteristiche e funzionalità della classe:

**Caratteristiche principali:**
Attributi privati: La classe contiene attributi privati per memorizzare il nome, il cognome, il numero del pilota e l'età.

**Metodi pubblici principali:**
-getNome(): Restituisce il nome del pilota.
-getCognome(): Restituisce il cognome del pilota.
-getNumeroPilota(): Restituisce il numero identificativo del pilota.
-getEta(): Restituisce l'età del pilota.

-Metodo toString():
Restituisce una stringa che rappresenta il pilota concatenando nome, cognome, numero del pilota e età.

**Funzionalità aggiuntive:**
La classe non contiene altre funzionalità particolari oltre alla memorizzazione delle informazioni del pilota.

## Classi Cifratore,Vigenere,Matrice

Servono per la cifratura e la decifratura dei dati di accesso alla piattaforma di GranPrix

##Classi Lettore,Scrittore

Servono a leggere e scrivere sul file JSON
