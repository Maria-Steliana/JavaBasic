package structuriAlternative;

import org.testng.annotations.Test;

public class StructuriAlternative {

    @Test
    public void testMethod() {
        verificareNumar(5);
        verificareNumar(1);
        verificareNumarParImparPozitvNegativ(3);
        verificareNumarParImparPozitvNegativ(6);
        verificareNumarParImparPozitvNegativ(-3);
        verificareNumarParImparPozitvNegativ(-6);
        verificareNumarParImparPozitvNegativ(0);
        System.out.println(evaluareNota('A'));
        System.out.println(evaluareNota('B'));
        System.out.println(evaluareNota('C'));
        System.out.println(evaluareNota('D'));
        System.out.println(evaluareNota('F'));
        System.out.println(evaluareNota('E'));
        evaluareNota2('A');

    }

    // structura de control "if" este folosita pentru a evalua o conditie booleana si pentru a executa un bloc de cod
    // daca aceasta conditie este adevarata
    // if(conditie) {
    //      bloc de cod care va fii executat daca conditia este adevarata
    // } else {
    //      bloc de cod care va fii executat daca conditia este falsa
    // }

    public void verificareNumar(int numar) {
        if (numar > 3) {
            System.out.println("Numarul " + numar + " este mai mare decat 3");
        } else {
            System.out.println("Numarul " + numar + " este mai mic decat 3");
        }

        // diferenta intre "if" si "elseif":
        // - daca "if" este folosit pentru prima conditie pentru care vrem sa evaluam,
        // - "elseif" este folosit pentru conditii suplimentare daca if este fals
        // - "else" este folosit pentru a executa un bloc de cod daca toate conditiile sunt false
        // este indicat sa folosesti "if" si "elseif" impreuna cand ai mai multe conditii de evaluat

    }

    public void verificareNumarParImparPozitvNegativ(int valoare) {
        if (valoare > 0) {
            if (valoare % 2 == 0) {
                System.out.println("Numarul " + valoare + " este par si pozitiv");
            } else {
                System.out.println("Numarul " + valoare + " este impar si pozitiv");
            }
        } else if (valoare < 0) {
            if (valoare % 2 == 0) {
                System.out.println("Numarul " + valoare + " este par si negativ");
            } else {
                System.out.println("Numarul " + valoare + " este impar si negativ");
            }
        } else {
            System.out.println("Numarul " + valoare + " este 0");
        }
    }

    // "switch" este o ctructura de control care permite evaluarea unei expresii si executarea unuia din
    // mai multe blocuri de cod
    // este folosit de obicei cand sunt mai multe cazuri posibile, fiecare caz fiind asociat unui bloc de cod specific
    // switch (expresia){
    //      case valoare1:
    //          bloc de cod pentru care expresia are valoarea1
    //      break;
    //      case valoare2:
    //          bloc de cod pentru care expresia are valoarea2
    //      break;
    //      alte case-uri posibile:
    //          default
    //      bloc de cod care se executa daca nici unul din case-uri nu se potriveste
    // }

    public String evaluareNota(char nota) {
        switch (nota) {
            case 'A':
                return "Nota este excelent.";
            case 'B':
                return "Nota este super.";
            case 'C':
                return "Nota este bine.";
            case 'D':
                return "Nota este suficient.";
            case 'F':
                return "Repetent";
            default:
                return nota + " nu este o valoare acceptata.";
        }
    }

// tema - de transformat switch-ul asta in void

    public void evaluareNota2(char nota2) {
        if (nota2 == 'A') {
            System.out.println("Nota este excelent.");
        } else if (nota2 == 'B') {
            System.out.println("Nota este super.");
        } else if (nota2 == 'C') {
            System.out.println("Nota este bine.");
        } else if (nota2 == 'D') {
            System.out.println("Nota este suficient.");
        } else if (nota2 == 'F') {
            System.out.println("Nota este repetent.");
        } else {
            System.out.println(nota2 + " nu este o valoare acceptata.");
        }
    }
}
