package Oop;

public class Teorie {

    // OOP - programare orientata pe obiecte (object oriented programming)
    // 4 Principii importante: Mostenire, Incapsulare, Polimorfism, Abstractizare.

    // Mostenirea in Java este conceptul prin care clasa (clasa copil) mosteneste clasa parinte.
    // In momentul in care o clasa mosteneste alta clasa, clasa copil are vizibiliate asupra variabilelor si metodelor din clasa parinte.
    // In java se poate mosteni o singura clasa cu ajutorul cuvantului cheie "Extend".
    // In momentul in care o clasa mosteneste alta clasa, clasa copil apeleaza constructorul din parinte.
    // Constructorul din clasa parinte spre copil se apeleaza cu cuvantul cheie "Super".

    // Incapsularea = procesul prin care tine private anumite informatii in asa fel incat acestea sa nu poata fi modificate
    // Ca sa putem face informatiile private vom face variabilele/metodele din "public" in "privat".
    // MODIFICATORI DE ACCES:
    // public - codul se poate accesa de oriunde si din orice clasa
    // private - codul se poate accesa doar din clasa unde s-a scris codul
    // protected - codul se poate accesa doar din pachetul in care s-a scris codul, dar si de catre subclase (cocneptul de mostenire)
    // default = codul se poate accesa doar din pachetul in care s-a scris codul
    // Ca sa extragem(modifica) o valoare a unei variabile private, ne folosim de metode de get/set (getter / setter)

    // Polimorfism = conceptul prin care definim mai multe implenetari pentru o metoda
    // Este de doua tipuri: static (overloading) si dinamic (overreading)
    // Polimorfismul dinamic = intr-o ierarhie de clase obtinute prin mostenire, o metoda poate avea implementari diferite
    // Polimorfismul static = posibilitatea prin care o metoda are mai multe implementari prin diferentierea tipului sau nr de parametri

    // Abstractizarea = procesul de reducere a complexitatii prin ascunderea detaliilor de implementare si expunerea doar a functionalitatii
    // Se realizeaza prin clase abstracte si/sau interfete
    // Clasele abstracte se declara folosind cuvantul cheie "abstract"
    // Pot contine atat metode abstracte (fara corp/cod sau implementare), cat si metode concrete (metodele cu implementare)
    // Clasele abstracte nu pot fi instantiate (nu poti face obiecte din clase abstracte)
    // Poate fi utilizata numai ca superclasa pentru alte clase care extind clasa abstracta
    // Poate avea variabile si atribute precum o clasa normala

    // Interfeta = un protocol pe care clasa trebuie sa il implementeze (ofera raspuns la lipsa mostenirii multiple)
    // O clasa poate mosteni mai multe interfete
    // Interfata contine doar metode abstracte * interfata poate sa contina si metode cu implementare,
    // dar pot sa ai doua tipuri de metode (default: public void sau static void)
    // Interfetele pot extinde alte interfete
    // Ai cuvantul cheie "interface".
    // Ca sa mostenesti o interfata se foloseste cuvantul cheie "implements"
}
