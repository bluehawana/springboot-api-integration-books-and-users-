# Inlämningsrapport

Information
OBS!!! Ändra absolut inte på rubrikerna i denna fil!!!!

## Inledning

### Vad handlar uppgiften om?

Uppgiften handlar om att skapa en RESTful API för hantering av bokdata med hjälp av Spring Boot. API:et ska kunna utföra
CRUD-operationer (Create, Read, Update, Delete) på en bokresurs. Dessutom skulle enhetstester skrivas för att
säkerställa att de olika metoderna i controller-klassen fungerar korrekt.

--- Skriv ovanför och ta inte bort denna raden ---

### Hur uppfattade du uppgiften initialt?

Initialt uppfattade jag uppgiften som en praktisk övning i att implementera grundläggande REST API-funktionalitet med
Spring Boot. Jag förstod att det skulle innebära att definiera endpoints i en controller-klass, hantera affärslogik i en
service-klass och interagera med en databas genom ett repository.
--- Skriv ovanför och ta inte bort denna raden ---

## Planering och genomförande

### Hur planerade du att lösa uppgiften?

Jag planerade att lösa uppgiften genom att följa dessa steg:

Skapa en controller-klass med endpoints för CRUD-operationer. Implementera en service-klass för att hantera
affärslogiken. Skapa ett repository för att interagera med databasen. Skriva enhetstester för varje endpoint i
controller-klassen.
Testa API:et manuellt med verktyg som Postman för att säkerställa att det fungerar korrekt.

--- Skriv ovanför och ta inte bort denna raden ---

### Vilka steg tog du för att lösa uppgiften, skiljer sig ditt utförande från tidigare uppgifter?

Stegen jag tog för att lösa uppgiften inkluderade:

Skapade controller- och service-klasserna enligt plan. Definierade CRUD-endpoints i controller-klassen. Implementerade
metoder i service-klassen för att stödja varje endpoint. Skrev enhetstester för att verifiera att varje endpoint
returnerade rätt statuskoder och data.
Utförde manuell testning med Postman.
--- Skriv ovanför och ta inte bort denna raden ---

## Utmaningar och lösningar

### Vilka utmaningar stötte du på under projektet?

För att få rätt HTTP-statuskoder läste jag dokumentation och exempel på korrekt användning av ResponseEntity i Spring
Boot. För att hantera undantag implementerade jag en global exception handler med @ControllerAdvice för att ge
konsistenta felmeddelanden.
Jag skrev omfattande enhetstester som inkluderade både framgångsrika och misslyckade fall, och använde mocks för att
simulera olika scenarier.
--- Skriv ovanför och ta inte bort denna raden ---

### Hur löste du dessa utmaningar?

Jag löste utmaningarna genom att: Läsa dokumentation och exempel på korrekt användning av ResponseEntity i Spring Boot.
Implementera en global exception handler med @ControllerAdvice för att ge konsistenta felmeddelanden. Skriva omfattande
enhetstester som inkluderade både framgångsrika och misslyckade fall, och använda mocks för att simulera olika
scenarier. När jag stötte på problem, använde jag Google och Stack Overflow för att hitta lösningar.
--- Skriv ovanför och ta inte bort denna raden ---

## Reflektion och utvärdering

### Vad lärde du dig genom att genomföra projektet?

Genom att genomföra projektet lärde jag mig följande:

Hur man bygger ett komplett REST API med Spring Boot. Betydelsen av korrekt hantering av HTTP-statuskoder. Hur man
skriver och strukturerar enhetstester för att testa API-endpoints. Att använda ResponseEntity för att skapa flexibla och
meningsfulla HTTP-svar. Hur man hanterar undantag på ett sätt som förbättrar användarupplevelsen.
--- Skriv ovanför och ta inte bort denna raden ---

### Vilka möjligheter ser du för framtida projekt baserat på denna erfarenhet?

Att utveckla mer komplexa REST API:er med avancerad affärslogik och säkerhet. Att implementera API:er som integreras med
externa tjänster och mikroservicemiljöer. Att fördjupa mig i olika teststrategier, inklusive integrationstester och
end-to-end-tester. Att utforska hur man kan använda Spring Boot tillsammans med frontend-ramverk för att skapa
fullstack-applikationer. Att arbeta med databashantering och prestandaoptimering för stora datamängder i API:er.

--- Skriv ovanför och ta inte bort denna raden ---
