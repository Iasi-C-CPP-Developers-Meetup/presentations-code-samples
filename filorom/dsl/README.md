# DOMAIN SPECIFIC LANGUAGES AND C++ CODE GENERATION
Florentin Picioroaga

Continut:
* ro.meetup.cpp.dsl: proiect Xtext unde se definieste gramatica pentru DSL
* ro.meetup.cpp.dsl.ui: proiect care se poate executa ca "Eclipse Application" pentru a obtine editorul pentru DSL
* meetup: proiect in editorul DSL (se importa direct in editor) unde se foloseste DSL-ul

Folosire cod:
* Se instaleaza Eclipse pentru DSL: http://www.eclipse.org/downloads/packages/eclipse-ide-java-and-dsl-developers/neon2
* Se importa primele doua proiecte
* Se porneste Editorul DSL prin click dreapta pe proiectul ui si apoi "Run as" -> "Eclipse Application"
* Se importa proiectul meetup
* Se modifica codul DSL si automat se obtin cod nou generat. Alternativ se poate construi un generator de cod care are ca input dsl-ul.

In caz ca se modifica gramatica DbDsl.xtext, trebuie rulat din noul workflow-ul MWE2, click dreapta pe GenerateDbDsl.mwe2 -> Run as -> MWE2 Workflow
Generatorul de cod e implementat in DbDslGenerator.xtend



Have fun!
