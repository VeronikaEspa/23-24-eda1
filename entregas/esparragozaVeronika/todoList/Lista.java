package todoList;

public class Lista {
        private Nodo first = null;

        public int size() {
            int count = 0;
            Nodo iterator = first;
            while (iterator != null) {
                count++;
                iterator = iterator.getNext();
            }
            return count;
        }

        public boolean isEmpty() { return size() == 0; }

        public String[] listAll() {
            int listSize = size();
            String[] list = new String[listSize];
            Nodo iterator = first;
            for (int i = 0; i < listSize; i++) {
                list[i] = iterator.getValue();
                iterator = iterator.getNext();
            }
            return list;
        }

        public void insert(String value, int index){
            int listSize = size();
            if(index == 0){
                insertFront(value);
            } else if(index == listSize - 1){
                insertEnd(value);
            } else {
                insertAtIndex(index, value);
            }
        }

                //Notas.insert("Descripcion", true, "4-11-2023");

        public void insertNota(String titulo, boolean prioridad, String fechaDeVencimiento){
            Lista Nota = new Lista();
            Nota.insert(titulo, prioridad, fechaDeVencimiento);

            int listSize = size();
            if(prioridad) {
                insertFront(titulo, fechaDeVencimiento);
            } else {
                insertEnd(titulo, fechaDeVencimiento);
            }
        }
        public void insert(String titulo, boolean prioridad, String fechaDeVencimiento){
            Nodo titulo = new Nodo(value);
            Nodo fechaDeVencimiento = new Nodo(value);

            System.out.println(titulo + prioridad + fechaDeVencimiento);
            System.out.println("titulo:" + titulo.getValue());
        }

        public void insertFrontNota(String titulo, String fechaDeVencimiento) {
            String value = fechaDeVencimiento + " " + titulo;
            Nodo titulo = new Nodo(value);
            Nodo fechaDeVencimiento = new Nodo(value);

            newNode.setNext(first);
            first = newNode;
            System.out.println("Nota añadida: " + newNode.getValue());
        }

        public void insertEnd(String titulo, String fechaDeVencimiento) {
            String value = fechaDeVencimiento + titulo;
            Nodo newNode = new Nodo(value);
            if (first == null) {
                first = newNode;
            } else {
                Nodo iterator = first;
                while (iterator.getNext() != null) {
                    iterator = iterator.getNext();
                }
                iterator.setNext(newNode);
            }
            System.out.println("Nota añadida: " + newNode.getValue());
        }

        public void insertFront(String value) {
            Nodo newNode = new Nodo(value);
            newNode.setNext(first);
            first = newNode;
            System.out.println("> Llegó al inicio " + newNode.getValue());
        }

        public void insertEnd(String value) {
            Nodo newNode = new Nodo(value);
            if (first == null) {
                first = newNode;
            } else {
                Nodo iterator = first;
                while (iterator.getNext() != null) {
                    iterator = iterator.getNext();
                }
                iterator.setNext(newNode);
            }
            System.out.println("> Llegó " + newNode.getValue());
        }

        public void insertAtIndex(int index, String value) {
            if (index < 0){
                System.out.println("No válido, es menor de 0.");
            } else if(index == 0){
                insertFront(value);
            } else {
                int count = 1;
                Nodo newNode = new Nodo(value);
                Nodo iterator = first;

                while (iterator != null && count < index - 1) {
                    iterator = iterator.getNext();
                    count++;
                }

                if(iterator == null){
                    System.out.println("No válido, la lista no tiene posición "+index);
                } else {
                    newNode.setNext(iterator.getNext());
                    iterator.setNext(newNode);
                    System.out.println("> Llegó " + value + " en la posición " + index);
                }
            }
        }

        public void delete(int index){
            int listSize = size();
            if(index == 1){
                deleteFront();
            } else if(index == listSize - 1){
                deleteBack();
            } else {
                deleteAtIndex(index);
            }
        }

        public void deleteFront() {
            System.out.println("Se fue " + first.getValue());
            if (first != null) {
                first = first.getNext();
            }
        }
        public void deleteBack() {
            if (first != null) {
                if (first.getNext() == null) {
                    first = null;
                } else {
                    Nodo iterator = first;
                    Nodo previous = null;
                    while (iterator.getNext() != null) {
                        previous = iterator;
                        iterator = iterator.getNext();
                    }
                    previous.setNext(null);
                }
                System.out.println("Se fue " + first.getValue());
            }
        }

        public void deleteAtIndex(int index) {
            if (index < 0){
                System.out.println("No válido, es menor de 0.");
            } else if(index == 0){
                deleteFront();
            } else {

            }
        }




        public static void menuDeOpciones(String opcionElegida){
            switch (opcionElegida){
                case "1": System.out.print("Elegiste 1");
                    break;

                case "2":  System.out.print("Elegiste 2");
                    break;

                default:
                    System.out.println("default");
                    break;
            }
        }
    }
