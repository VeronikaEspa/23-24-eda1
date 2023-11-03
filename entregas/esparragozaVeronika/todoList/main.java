package todoList;

import java.util.Scanner;

public class main {

    static Scanner scanner = new Scanner(System.in);
    static Lista Nota = new Lista();
    static Lista TODO = new Lista();

    public static void main(String[] args) {

        System.out.println("Hello world");
        TODO.insertNota("Descripcion", true, "4-11-2023");
        //imprimirOpciones();
        //viewLine(Nota);

        //Notas.insert("Primera nota", 0);
        //Notas.insert("Descripcion", true, "4-11-2023");
        //descripcion, prioridad, fecha de vencimiento
        //viewLine(Notas);
    }
    static void viewLine(Lista listaDeNotas) {
        String[] array = listaDeNotas.listAll();

        System.out.println("LA FILA" + "-".repeat(18));
        for (String nota : array) {
            System.out.println(nota);
        }
        System.out.println("-".repeat(25));
    }
    public static void imprimirOpciones(){
        System.out.println("Bienvenido a la TODO list:");
        System.out.println("1. Crear nota");
        System.out.println("2. Mostrar todas las listas");
        String opcionMenu = scanner.nextLine();
        Lista.menuDeOpciones(opcionMenu);
    }
}
