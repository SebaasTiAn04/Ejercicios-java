import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

       // ejercicio1();
       // ejercicio2();
        //ejercicio3();
       // ejercicio4();
        // ejercicio5();
        //ejercicio6();

//        int num1;
//        System.out.println("Ingrese un numero");
//        num1 = scanner.nextInt();
//        ejercicio7(num1);

        //int num;
        //System.out.println("Ingrese un numero");
        //num = scanner.nextInt();
        //ejercicio8(num);

        //int[] numeros = {2,3,4,5,6,7,8,9};
        //ejercicio9(numeros);

        //ejercicio10(numeros);

        //ejercicio11();

        ejercicio13();
    }

    public static void ejercicio1(){
        String nombre = "Sebastian";
        String apellido = "Alfonso";
        int edad = 22;
        System.out.println("Mi nombre es " +nombre+ ", y mi apellido" + apellido + ", tengo " + edad+ " anios");
    }
    public static void ejercicio2(){
        System.out.println("Ingrese un numero");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese otro numero");
        double num2 =scanner.nextDouble();

        System.out.println("Ingrese un tercer numero");
        double num3 = scanner.nextDouble();

        if(num1 >= num2 && num1 >= num3){
            System.out.println(num1 + " es mayor");
        }else if(num2 >= num1 && num2 >= num3){
            System.out.println(num2 + " es mayor");
        }else {
            System.out.println(num3 + " es mayor");
        }
    }

    public static void ejercicio3(){
        int num;
        System.out.println("Ingrese un numero");
        num = scanner.nextInt();

        if(num%2 == 0){
            System.out.println(num +" es par");
        }else{
            System.out.println(num +" es impar");
        }
    }

    public static void ejercicio4(){
        System.out.println("Ingrese un texto");
        String texto1 = scanner.nextLine();

        System.out.println("ingrese un segundo texto");
        String texto2 = scanner.nextLine();

        if(texto1.equals(texto2)){
            System.out.println("Los dos textos son iguales");
        }else{
            System.out.println("No son iguales");
        }
    }

    public static void ejercicio5() {

        int i = 0;
        int[] array = new int[10];
        int num1;
        do {
            System.out.println("Ingrese un numero. Ingrese 0 para salir");
            num1 = scanner.nextInt();

            if (num1 != 0) {

                array[i] = num1;
                i++;
            }
        } while (num1 != 0);

        System.out.println("Salio del programa");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
    }

    public static void ejercicio6(){

        System.out.println("Su nombre?");
        String nom = scanner.nextLine();
        System.out.println("Bienvenido a la consola " + nom);
    }

    public static void ejercicio7(int num1){

        if(num1%2 == 0){
            System.out.println(num1 + " es par");
        }else{
            System.out.println(num1 + " es impar");
        }
    }

    public static void ejercicio8(int num){

        boolean noEsPrimo = false;
        if (num == 0 || num == 1 || num == 4) {
            System.out.println(num + " no es primo");
            noEsPrimo = true;
        }
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                System.out.println(num + " no es primo");
                noEsPrimo = true;
            }
        }

        if(!noEsPrimo){
            System.out.println(num+" es primo");
        }
    }

    public static void ejercicio9(int[] numeros){
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            if(!(numeros[i]%2==0)){
                suma += numeros[i];
            }
        }

        System.out.println("La suma de los numeros impares es: " + suma);
    }

    public static void ejercicio10(int[] numeros){
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]%2==0){
                System.out.println(numeros[i]);

            }
            suma += esPrimo(numeros[i]);
        }
        System.out.println("La suma de todos los numeros primos es " + suma);
    }

    public static int esPrimo(int num){

        int esPrimo = 0;
        boolean noEsPrimo = false;
        if (num == 0 || num == 1 || num == 4) {
            noEsPrimo = true;
        }
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                noEsPrimo = true;
            }
        }

        if(!noEsPrimo){
            esPrimo = num;
        }
        return esPrimo;
    }

    public static void ejercicio11(){
        double num1;
        double num2;
        String signo;
        System.out.println("Calculadora");
        do{

                System.out.println("ingrese un numero o 0 para salir");
                num1 = scanner.nextDouble();

                if(num1 != 0){
                    System.out.println("Ingrese el segundo numero");
                    num2 = scanner.nextDouble();

                    do{
                        System.out.println("Ingrese +,-, *, /");
                        signo = scanner.nextLine();
                    }while(!signo.equals("+") && !signo.equals("-") && !signo.equals("*") && !signo.equals("/"));

                   ejercicio12(num1, num2, signo);
                }

        }while(num1 != 0);

        System.out.println("gracias vuelvas prontos");
    }

    public static void ejercicio12(double num1, double num2, String signo){
        switch (signo){
            case "+":
                System.out.println("La suma es:"  +(num1+num2));
                break;
            case "-":
                System.out.println("La resta es:"  +(num1-num2));
                break;
            case "*":
                System.out.println("La multiplicacion es:"  +(num1*num2));
                break;
            case "/":
                if(num2!=0){
                    System.out.println("La division es:"  +(num1/num2));
                    break;
                }else {
                    System.out.println("no se puede dividir por 0");
                }

        }
    }

    public static void ejercicio13(){
        int entrada = 1500;
        int vip = 2000;
        int capacidadMax = 500;
        double dineroRecaudado = 0;


        String nombre;
        int edad;
        int dni;
        String pase = null;
        String tipoPase = null;
        String tipoCompra = null;
        int opcion;
        do{
            System.out.println("-----------BIENVENIDO AL TROPITANGO----------------");
            System.out.println("---------------------------------------------------");
            System.out.println("1: Ingreso de datos");
            System.out.println("---------------------------------------------------");
            System.out.println("2: Capacidad disponible");
            System.out.println("---------------------------------------------------");
            System.out.println("3: Dinero recaudado");
            System.out.println("---------------------------------------------------");
            System.out.println("4: Salir del sistema");
            System.out.println("---------------------------------------------------");
            opcion = scanner.nextInt();

            if(opcion != 4){
                if(opcion == 1){
                    System.out.println("Ingrese su nombre");
                    nombre = scanner.next();

                    System.out.println("Ingrese su edad " + nombre);
                    edad = scanner.nextInt();

                    System.out.println("Ingrese su dni");
                    dni = scanner.nextInt();

                    if(edad > 21){

                        System.out.println("Tiene pase? S o N");
                        pase = scanner.next();


                        if(pase.equalsIgnoreCase("s")){
                            System.out.println("Pase v (Vip) o d (Descuneto)?");
                            tipoPase = scanner.next();

                            if(tipoPase.equalsIgnoreCase("v")){
                                System.out.println("Bienvenido");
                                capacidadMax--;
                            }else{
                                System.out.println("desea comprar una entrada v (vip) o n (normal)?");
                                tipoCompra = scanner.next();

                                if(tipoCompra.equalsIgnoreCase("v")){
                                    System.out.println("Total: " + (vip*0.50));
                                    System.out.println("Bienvenido");
                                    capacidadMax--;
                                    dineroRecaudado +=  vip*0.50;
                                }else{
                                    System.out.println("Total: " + (entrada*0.50));
                                    System.out.println("Bienvenido");
                                    capacidadMax--;
                                    dineroRecaudado +=  entrada*0.50;
                                }
                            }
                        }else{
                            System.out.println("desea comprar una entrada v (vip) o n (normal) sin descuento?");
                            tipoCompra = scanner.next();

                            if(tipoCompra.equalsIgnoreCase("v")){
                                System.out.println("Total: " + vip);
                                System.out.println("Bienvenido");
                                capacidadMax--;
                                dineroRecaudado +=  vip;
                            }else{
                                System.out.println("Total: " + entrada);
                                System.out.println("Bienvenido");
                                capacidadMax--;
                                dineroRecaudado +=  entrada;
                            }
                        }

                    }else{
                        System.out.println("Lo siento debe ser mayor de 21");
                    }
                }else if(opcion == 2){
                    System.out.println("Capacidad disponible " + capacidadMax);
                }else if(opcion == 3){
                    System.out.println("Dinero recaudado " + dineroRecaudado);
                }else{
                    System.out.println("opcion inexistente");
                }
            }else{
                System.out.println("SALIENDO DEL SISTEMA");
            }

        }while(opcion != 4);
        System.out.println("Capacidad disponible " + capacidadMax);
        System.out.println("---------------------------------------------------");
        System.out.println("Dinero recaudado " + dineroRecaudado);

    }
}