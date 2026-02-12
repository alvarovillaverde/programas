package examenRepaso;
/* ========================================================
                        Indice
        Usa Ctrl+F y busca la etiqueta (e.g. #M005)
   ========================================================
   * [#M001] - calculaAreaEsfera
   * [#M002] - calculaVolumenEsfera
   * [#M003] - calculaLongCirc
   * [#M004] - calculaAreaCirc
   * [#M005] - isTriangulito
   * [#M006] - suma
   * [#M007] - resta
   * [#M008] - producto
   * [#M009] - cociente
   * [#M010] - modulo
   * [#M011] - potenciaRecursiva
   * [#M012] - potenciaIterativa
   * [#M013] - factorialIterativo
   * [#M014] - ecuacionSegundoGrado
   * [#M015] - maximoComunDivisorIterativo
   * [#M016] - maximoComunDivisorRecursivo
   * [#M017] - esPrimo
   * [#M018] - esPrimoOptimizado
   * [#M019] - cuentaDigitos
   * [#M020] - invierteDigitos
   * [#M021] - esOmirp
   * [#M022] - esArmstrong
   * [#M023] - CalcularAmstrong
   * [#M024] - esPerfecto
   * [#M025] - divisoresNumero
   * [#M026] - sumaDivisores
   * [#M027] - sonAmigos
   * [#M028] - esVampiro
   * [#M029] - numeroSuerteCadena
   * [#M030] - numeroRomanosHasta4000
   * [#M031] - numeroRomanosHasta4000Array
   * [#M032] - terminoNAritmetico
   * [#M033] - terminoNGeometrico
   * [#M034] - sumatorioRecursivo
   * [#M035] - sumatorioFraccionesRepetitiva
   * [#M036] - fibonacciIterativa
   * [#M037] - fibonacciRecursiva
   * [#M038] - progresionGeometricaIterativa
   * [#M039] - progresionGeometricaFormulaSuma
   * [#M040] - minMaxArray
   * [#M041] - repeArray
   * [#M042] - buscarNumeroArray
   * [#M043] - calculoMenorMedioMayorArray
   * [#M044] - calcularHoras
   * [#M045] - calcularTiempoSegundos
   * [#M046] - mesDias
   * [#M047] - esBisiesto
   * [#M048] - esXacobeoIterativo
   * [#M049] - esXacobeoStream
   * [#M050] - divisionDinero
   * [#M051] - divisionDineroOptimizado
   * [#M052] - descubrePorcentaje
   * [#M053] - precioFinal
   * [#M054] - precioFinal2
   * [#M055] - calcularOriginal
   * [#M056] - euroToDolar
   * [#M057] - dolarToEuro
   * [#M058] - centigradosTuFahrenheit
   * [#M059] - fahrenheitTuCentigrados
   * [#M060] - millasAMetros
   * [#M061] - millasAKilometro
   * [#M062] - contar
   * [#M063] - contarDesc
   * [#M064] - imprimirTriangulo
   * [#M065] - imprimirRombo
   * [#M066] - imprimirEscalera
   * [#M067] - tablaMultiplicarHastaEl10
   * [#M068] - tablaMultiplicarHastaN
   * [#M069] - imprimirPares
   * [#M070] - imprimirImpares
   * [#M071] - calculoMenorMedioMayor
   * [#M072] - calculoMenorMedioMayorEficiente
   * [#M073] - notasClasificiacion
   * [#M074] - imcCalculadora
   * [#M075] - randomLetra
   * [#M076] - RandomNumero
   * [#M077] - formatearNumeroComas
   * [#M078] - Class: ArticuloCientifico
   * [#M079] - Class: Automovil
   * [#M080] - Class: Automovil2
   * [#M081] - Class: Avion
   * [#M082] - Class: Caja
   * [#M083] - Class: Circulo
   * [#M084] - Class: Consumo
   * [#M085] - Class: Cuadrado
   * [#M086] - Class: Pajaro
   * [#M087] - Class: Pedido
   * [#M088] - Class: Pelicula
   * [#M089] - Class: Persona
   * [#M090] - Class: Persona2
   * [#M091] - Class: Planeta
   * [#M092] - Class: Rectangulo
   * [#M093] - Class: RestauranteLukas
   * [#M094] - Class: Satelite
   * [#M095] - Class: TrianguloRectangulo
   * [#M096] - Class: calculoNumero
   * [#M097] - Class: CuentaBancaria
   * [#M098] - Class: Letras
   ======================================================== */
import java.text.DecimalFormat;
import java.util.Arrays;


public class ElMetodoComentado {

    // ==========================================
    // GEOMETRIA
    // ==========================================

    // Método para calcular area de una esfera mediante radio.
    // [#M001]
    public static double calculaAreaEsfera(double radio) { // Se define un método estático que devuelve el area de una esfera y recibe su radio. Devuelve el area calculada.
        double area = 0d; // Se inicializa la variable area con valor 0.0.
        area = 4 * Math.PI * Math.pow(radio, 2); // Se calcula el área usando la fórmula correspondiente y la asigna a area.
        return area; // Se devuelve el valor calculado del área.
    }

    // Método para calcular volumen de una esfera mediante radio.
    // [#M002]
    public static double calculaVolumenEsfera(double radio) { // Se define un método estático que devuelve el volumen de una esfera y recibe su radio. Devuelve el volumen calculado.
        double volumen = (4 / 3.0) * Math.PI * Math.pow(radio, 3); // Se calcula el volumen con la fórmula correspondiente y se asigna a volumen.

        return volumen; // Se devuelve el valor calculado del volumen.
    }

    // Método para calcular longitud de un círculo mediante radio.
    // [#M003]
    public static double calculaLongCirc(double radio) { // Define método estático que devuelve la longitud del circulo y recibe su radio. Devuelve la longitud calculada.

        double longitud = 2 * Math.PI * radio; // Calcula la longitud con la fórmula correspondiente y la asigna a longitud.
        return longitud; // Devuelve el valor calculado de la longitud
    }

    // Método para calcular area de un círculo mediante radio.
    // [#M004]
    public static double calculaAreaCirc(double radio) { // Define método estático que devuelve el area de un círculo y recibe su radio. Devuelve el area calculada.
        double area = 0d; // Inicializa la variable area con valor 0.0.
        area = Math.PI * Math.pow(radio, 2); // Calcula el área con la fórmula correspondiente y la asigna a area.
        return area; // Devuelve el valor calculado del área.
    }

    // Método para calcular si un triángulo es válido.
    // [#M005]
    public static boolean isTriangulito(double a, double b, double c) { // Define método que devuelve un boleano y recibe 3 lados de un triángulo. Devuelve true si es válido, false si no lo es.
        if ((a <= b + c) && (b <= a + c) && (c <= a + b)) // Comprueba la desigualdad triangular para los 3 lados.
            return true; // Si se cumple, es un triángulo válido.
        else // Si no se cumple alguna condición.
            return false; // No es un triángulo válido.
    }

    // ==========================================
    // MATEMATICAS BASICAS & ARITMETICA
    // ==========================================

    // Método para calcular suma de dos números.
    // [#M006]
    public static int suma(int n1, int n2) { // Define método que devuelve la suma de 2 enteros y recibe dos números enteros. Devuelve la suma calculada.
        int s = n1 + n2; // Suma los dos números y guarda el resultado en s.
        return s; // Devuelve la suma.
    }

    // Método para calcular resta de dos números.
    // [#M007]
    public static int resta(int a, int b) { // Define método que devuelve la resta de 2 enteros y recibe dos números enteros. Devuelve la resta calculada.
        int res = a - b; // Resta b de a y guarda el resultado en res.
        return res; // Devuelve la resta.
    }

    // Método para calcular producto de dos números.
    // [#M008]
    public static int producto(int numero1, int numero2) { // Define método que devuelve el producto de 2 enteros y recibe dos números enteros. Devuelve el producto calculado.
        return numero1 * numero2; // Multiplica los números y devuelve el resultado directamente.
    }

    // Método para calcular cociente de dos números.
    // [#M009]
    public static int cociente(int n1, int n2) { // Define método que devuelve el cociente de 2 enteros y recibe dos números enteros. Devuelve el cociente calculado.
        return n1 / n2; // Divide n1 entre n2 y devuelve el cociente entero directamente.
    }

    // Método para calcular modulo de dos números.
    // [#M010]
    public static int modulo(int n1, int n2) { // Define método que devuelve el módulo de 2 enteros y recibe dos números enteros. Devuelve el módulo calculado.
        return n1 % n2; // Calcula el resto de la división n1/n2 y lo devuelve directamente.
    }

    // Método para calcular la potencia recursivamente.
    // [#M011]
    public static long potenciaRecursiva(int base, int exponente) { // Define método recursivo para calcular una potencia. Se pide a base y el exponente. Devuelve la potencia calculada.
        if (exponente == 0) // Caso base: si el exponente es 0
            return 1; // Cualquier número elevado a 0 es 1. Devolvemos 1.
        else // Caso recursivo
            return base * potenciaRecursiva(base, exponente - 1); // Multiplica base por potencia de exponente-1. Devolvemos el resultado. Multiplicamos base por si misma todo el rato hasta que exponente sea 0 donde multiplicamos por 1. Llamamos la función potenciaRecursiva() bajando 1 exponente cada vez hasta que exponente sea 0.
    }

    // Método para calcular la potencia iterativamente.
    // [#M012]
    public static long potenciaIterativa(int base, int exponente) { // Define método iterativo para calcular una potencia. Se pide la base y el exponente. Devuelve la potencia calculada.
        long res = 1; // Inicializa el resultado a 1 (cualquier número elevado a 0 es 1).
        if (exponente == 0) // Si el exponente es 0:
            return 1; // Devolvemos 1.
        for (int i = 1; i <= exponente; i++) { // Itera desde 1 hasta exponente
            res *= base; // Multiplica el resultado acumulado por la base.
        }
        return res; // Devuelve el resultado
    }

    // Método para calcular el factorial iterativamente.
    // [#M013]
    public static long factorialIterativo(int n) { // Define método para calcular factorial. Se pide un número entero. Devuelve el factorial calculado.
        long factorial = 1; // Inicializa factorial a 1
        for (int i = 1; i <= n; i++) // Itera desde 1 hasta n
            factorial *= i; // Multiplica el acumulado por i
        return factorial; // Devuelve el factorial calculado
    }

    // Método para calcular la ecuación de segundo grado.
    // [#M014]
    public static void ecuacionSegundoGrado(double a, double b, double c) { // Método void para resolver ecuacion de segundo grado. Se pide a, b y c.
        double raiz; // Variable para almacenar la parte de la raíz cuadrada.
        if (Math.sqrt((Math.pow(b, 2) - (4 * a * c))) >= 0) // Verifica si el discriminante es no negativo
            raiz = Math.sqrt((Math.pow(b, 2) - (4 * a * c))); // Calcula la raíz cuadrada del discriminante
        else // Si el discriminante es negativo
            raiz = -1; // Asigna -1 para indicar error (imaginario)

        if (raiz < 0) // Si la raíz es negativa (indicador de imaginario)
            System.out.println("Esta ecuación no tiene resultado en los números reales."); // Imprime mensaje de error
        else if (raiz == 0) // Si el discriminante es 0, hay una solución única
            System.out.println("Solo existe una solución (es doble): " + ((-b + raiz) / 2 * a)); // Calcula e imprime la solución
        else { // Si hay dos soluciones reales
            System.out.println("El primer resultado es: " + ((-b + raiz) / 2 * a)); // Calcula e imprime solución 1
            System.out.println("El segundo resultado es: " + ((-b - raiz) / 2 * a)); // Calcula e imprime solución 2
        }
    }

    // Método para calcular el máximo común divisor iterativamente.
    // [#M015]
    public static int maximoComunDivisorIterativo(int n1, int n2) { // Método para Máximo Común Divisor iterativo. Se piden dos números enteros. Devuelve el MCD.
        while (n2 != 0) { // Mientras el segundo número no sea 0:
            int res = n1 % n2; // Calcula el residuo de n1 / n2.
            n1 = n2; // Actualiza n1 con el valor de n2.
            n2 = res; // Actualiza n2 con el residuo.
        }
        return n1; // Devuelve n1 que contiene el MCD.
    }

    // Método para calcular el máximo común divisor recursivamente.
    // [#M016]
    public static int maximoComunDivisorRecursivo(int n1, int n2) { // Método para Máximo Común Divisor recursivo. Se piden dos números enteros. Devuelve el MCD.
        int res = n1 % n2; // Calcula el residuo
        if (res != 0) // Si el residuo no es 0
            return maximoComunDivisorRecursivo(n2, res); // Llamada recursiva con n2 y el residuo
        else // Si el residuo es 0
            return n2; // Hemos encontrado el MCD, es n2
    }

    // ==========================================
    // PROPIEDADES DE NUMEROS (PRIMOS, PERFECTOS, ETC.)
    // ==========================================

    // Método para calcular si un número es primo.
    // [#M017]
    public static boolean esPrimo(int n) { // Método para verificar si es primo. Se pide un número entero. Devuelve true si es primo, false si no lo es.
        int i = 2; // Inicia divisor en 2.
        while (i <= Math.sqrt(n)) { // Itera hasta la raíz cuadrada de n. El límite superior (Es asi, no me pregunteis).
            if (n % i == 0) { // Si n es divisible por i.
                return false; // No es primo, devuelve false.
            }
            i++; // Incrementa el divisor.
        }
        return true; // Si no encontró divisores, es primo asi que devuelve true.
    }

    // Método para calcular si un número es primo.
    // [#M018]
    public static boolean esPrimoOtro(int n) { //Otro método para verificar si es primo. Se pide un número entero.
        if (n <= 1) return false; // Si n es menor o igual a 1, no es primo.
        if (n == 2) return true; // Si n es 2, es primo.
        if (n % 2 == 0) return false; // Si n es par, no es primo.
        for (int i = 3; i <= Math.sqrt(n); i += 2) { // Itera desde 3 hasta la raíz cuadrada de n.
            if (n % i == 0) return false; // Si n es divisible por i, no es primo.
        }
        return true; // Si no encontró divisores, es primo asi que devuelve true.
    }

    // Método para calcular el número de dígitos de un número.
    // [#M019]
    public static int cuentaDigitos(int n) { // Método para contar dígitos. Se pide un número entero. Devuelve el número de dígitos.
        int digitos = 0; // Inicializa variable dígitos que se usará para guardar cuántos dígitos tiene el número.
        while (n > 0) { // Mientras queden dígitos:
            digitos++; // Incrementa variable dígitos.
            n = n / 10; // Elimina el último dígito.
        }
        return digitos; // Devuelve el total.
    }

    // Método para invertir los dígitos de un número.
    // [#M020]
    public static int invierteDigitos(int n) { // Método para invertir número. Se pide un número entero. Devuelve el número invertido.
        int digi = cuentaDigitos(n) - 1, reverso = 0; // Calcula los dígitos del número e inicializa la variable reverso.
        while (n > 0) { // Mientras queden dígitos:
            int cifra = n % 10; // Obtiene el último dígito del número. 9 del 1809 por ejemplo.
            n /= 10; // Elimina el último dígito del original. Eliminaria el 9 del 1809.
            reverso += cifra * Math.pow(10, digi); // Añade el dígito en la posición correcta al reverso. Multiplica 10 por la potencia de digi (que es la posición del dígito) y suma el dígito.
            digi--; // Decrementa los dígitos del número.
        }
        return reverso; // Devuelve el número invertido.
    }

    // Método para calcular si un número es Omirp.
    // [#M021]
    public static boolean esOmirp(int n) { // Método para verificar si es Omirp (primo reversible). Se pide un número entero. Devuelve true si es Omirp, false si no lo es.
        if (esPrimo(n) && esPrimo(invierteDigitos(n))) // Si es primo Y su inverso es primo
            return true; // Es Omirp
        else
            return false; // No es Omirp
    }

    // Método para calcular si un número es Armstrong.
    // [#M022]
    public static boolean esArmstrong(int num) { // Método para verificar número Armstrong. Se pide un número entero.
        int amstrong = 0; // Inicializa la variable amstrong donde almacenaremos el calculo.
        int num_ori = num; // Guarda número original.
        int exponente = 0; // Inicializamos una variable exponente.
        int temp = num; // Inicializamos una variable temporal para no destruir el número original.

        while (temp > 0) { // Mientras queden dígitos del temporal:
            temp /= 10; // Elimina el último dígito del temporal. Eliminaria el 9 del 1809.
            exponente++; // Incrementa el exponente.
        }

        while (num > 0) { // Mientras queden dígitos del original:
            int cifra = num % 10; // Obtiene el último dígito del número. 9 del 1809 por ejemplo.
            num /= 10; // Elimina el último dígito del original. Eliminaria el 9 del 1809.
            amstrong += Math.pow(cifra, exponente); // Añade el dígito elevado al cubo al amstrong.
        }

        if (num_ori == amstrong) { // Compara el número original con el amstrong calculado.
            return true; // Devuelve true si es Armstrong.
        } else {
            return false; // Devuelve false si no.
        }
    }

    // Método para calcular si un número es Armstrong.
    // [#M023]
    public static boolean CalcularAmstrong(String numero) { // Método correcto para Armstrong recibiendo el número en Cadena.
        int i = 0, amstrong = 0; // Inicializa índice y acumulador
        char[] elNumero = numero.toCharArray(); // Convierte string a array de caracteres
        do { // Bucle do-while
            amstrong += (int) Math.pow(Character.getNumericValue(elNumero[i]), numero.length()); // Suma dígito elevado a la cantidad de dígitos.
            i++; // Incrementa índice
        } while (i < numero.length()); // Mientras i no sea igual a la longitud del número.
        if (amstrong == Integer.parseInt(numero)) // Si la suma es igual al número original
            return true; // Es Armstrong.
        else
            return false; // No es Armstrong.
    }

    // Método para calcular si un número es perfecto.
    // [#M024]
    public static boolean esPerfecto(int n) { // Método para verificar número perfecto. Se pide un número entero.
        int suma = 0; // Inicializa suma de divisores
        for (int i = 1; i < n; i++) { // Itera desde 1 hasta n-1
            if (n % i == 0) { // Si i es divisor
                suma += i; // Suma el divisor
            }
        }
        if (suma == n) // Si la suma de divisores es igual al número
            return true; // Es perfecto
        else
            return false; // No es perfecto
    }

    // Método para calcular los divisores de un número.
    // [#M025]
    public static void divisoresNumero(int n) { // Método para imprimir divisores. Se pide un número entero.
        for (int i = 1; i <= n; i++) { // Itera de 1 a n
            if (n % i == 0) { // Calcula si es divisor con el módulo.
                System.out.println(i + ","); // Imprime el divisor
            }
        }
    }

    // Método para calcular la suma de los divisores de un número.
    // [#M026]
    public static int sumaDivisores(int n) { // Método para sumar divisores. Se pide un número entero.
        int suma = 0; // Inicializa suma
        for (int i = 1; i < n; i++) { // Itera de 1 a n-1
            if (n % i == 0) // Calcula si es divisor con el módulo.
                suma += i; // Suma el divisor
        }
        return suma; // Devuelve la suma total

    }

    // Método para calcular si dos números son amigos.
    // [#M027]
    public static boolean sonAmigos(int n1, int n2) { // Método para encontrar si 2 números son amigos. Se piden dos números enteros.
        if (n1 == sumaDivisores(n2) && n2 == sumaDivisores(n1)) { // Si n1 es sumaDiv(n2) Y n2 es sumaDiv(n1)
            return true; // Son amigos
        } else {
            return false; // No son amigos
        }
    }

    // Método para calcular si un número es vampiro.
    // [#M028]
    public static boolean esVampiro(int n) { // Método para números vampiro. Se pide un número entero. Maximo 4 dígitos.
        int digitos[], parejas[], w = 0; // Declara arrays de dígitos y parejas, y contador.
        digitos = new int[4]; // Array para 4 dígitos
        parejas = new int[12]; // Array para 12 posibles parejas
        int n_ori = n; // Guarda número original

        for (int i = 0; i < digitos.length; i++) { // Extrae dígitos del número original.
            digitos[i] = n % 10; // Obtiene último dígito del número.
            n /= 10; // Elimina el susodicho dígito almacenado.
        }

        for (int i = 0; i < digitos.length; i++) { // Genera parejas de dígitos.
            for (int j = 0; j < digitos.length; j++) {
                if (i != j) { // Si no son el mismo dígito.
                    parejas[w] = (digitos[i] * 10) + digitos[j]; // Forma número de 2 cifras.
                    w++; // Incrementa contador de parejas.
                }
            }
        }

        for (int i = 0; i < 12; i++) { // Comprueba multiplicaciones de parejas
            for (int j = 0; j < 12; j++) {
                if (i != j) { // Si son parejas distintas
                    if (parejas[i] * parejas[j] == n_ori) { // Si su producto es el original
                        return true; // Es vampiro
                    }
                }
            }
        }
        return false; // No es vampiro
    }

    // Método para calcular el número suerte de una fecha.
    // [#M029]
    public static void numeroSuerteCadena(int dia, int mes, int ano) { // Método para encontrar el número de la suerte mediante una String. Pide día, mes y año com enteros.

        int cifra_media = dia + mes + ano; // Suma día, mes y año
        String numbero = String.valueOf(cifra_media); // Convierte a String el número anterior.
        char[] elNumero = numbero.toCharArray(); // Convierte a array de chars el String anterior.
        int numero_suerte = 0; // Inicializa resultado.
        for (int i = 0; i < numbero.length(); i++) { // Recorre dígitos con el contador i.
            numero_suerte += Character.getNumericValue(elNumero[i]); // Suma dígitos.
            if (numero_suerte > 9) { // Si suma > 9 (tiene 2 dígitos)
                int temp = numero_suerte % 10; // Obtiene unidad
                numero_suerte = numero_suerte / 10; // Obtiene decena
                numero_suerte += temp; // Suma cifras para reducir a un dígito
            }
        }
    }

    // Método para calcular el número romano de un número hasta 4000.
    // [#M030]
    public static void numeroRomanosHasta4000(int n) { // Método conversión a romanos. Pide un número entero.
        String res = ""; // String resultado
        while (n > 0) { // Mientras el número pasado sea mayor que 0.
            while (n > 999) { // Si es >= 1000
                res += "M"; // Añade M
                n -= 1000; // Resta 1000
            }
            while (n > 899) { // Si es >= 900
                res += "CM"; // Añade CM
                n -= 900; // Resta 900
            }
            while (n > 499) { // Si es >= 500
                res += "D"; // Añade D
                n -= 500; // Resta 500
            }
            while (n > 399) { // Si es >= 400
                res += "CD"; // Añade CD
                n -= 400; // Resta 400
            }
            while (n > 99) { // Si es >= 100
                res += "C"; // Añade C
                n -= 100; // Resta 100
            }
            while (n > 89) { // Si es >= 90
                res += "XC"; // Añade XC
                n -= 90; // Resta 90
            }
            while (n > 49) { // Si es >= 50
                res += "L"; // Añade L
                n -= 50; // Resta 50
            }
            while (n > 39) { // Si es >= 40
                res += "XL"; // Añade XL
                n -= 40; // Resta 40
            }
            while (n > 9) { // Si es >= 10
                res += "X"; // Añade X
                n -= 10; // Resta 10
            }
            while (n > 8) { // Si es >= 9
                res += "IX"; // Añade IX
                n -= 9; // Resta 9
            }
            while (n > 4) { // Si es >= 5
                res += "V"; // Añade V
                n -= 5; // Resta 5
            }
            while (n > 3) { // Si es >= 4
                res += "IV"; // Añade IV
                n -= 4; // Resta 4
            }
            while (n > 0) { // Si es >= 1
                res += "I"; // Añade I
                n -= 1; // Resta 1
            }
        }
        System.out.println("Su número convertido a romano es --->" + res); // Imprime resultado
    }

    // Método para calcular el número romano de un número hasta 4000 usando un array.
    // [#M031]
    public static void numeroRomanosHasta4000Array(int n) { // Método romanos con arrays que pide un número entero.
        int[] numeros = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 }; // Valores de las letras romanas.
        String[] romanos = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" }; // Símbolos de las letras romanas.
        String res = ""; // Resultado

        for (int i = 0; i < numeros.length; i++) { // Recorre los valores de las letras romanas
            int limite = n / numeros[i]; // Averiguamos cuántas veces cabe el valor en nuestro numero. Para 2345 caben 2 veces 1000.
            n %= numeros[i]; // Sacamos el resto.
            if (limite != 0) { // Si cabe al menos una vez.
                for (int j = 0; j < limite; j++) { // Añade el símbolo las veces necesarias.
                    res += romanos[i]; // Concatena símbolo en la variable String resultado.
                }
            }
        }
        System.out.println("Su número convertido a romano es --->" + res); // Imprime resultado
    }

    // ==========================================
    // SECUENCIAS & SERIES
    // ==========================================

    // Método para calcular el término n de una sucesión recursivamente.
    // [#M032]
    public static int terminoNAritmetico(int n) { // Método recursivo para calcular termino n de una sucesión aritmética. Pide un número entero.
        int primer = 0, diferencia = 0; // Inicializar estas variables publicas cuando se vaya a poner en un programa.
        if (n == 1) { // Caso base, cuando n es 1.
            return primer; // Devuelve primer término.
        } else { // Caso recursivo, cuando n es mayor que 1.
            return terminoNAritmetico(n - 1) + diferencia; // Llama a n-1 y suma diferencia.
        }
    }

    // Método para calcular el término n de una sucesión recursivamente.
    // [#M033]
    public static int terminoNGeometrico(int n) { // Método recursivo término N de una sucesión geométrica. Pide un número entero.
        int primer = 0, razon = 0; // Inicializar estas variables publicas cuando se vaya a poner en un programa.
        if (n == 1) // Caso base, cuando n es 1.
            return primer; // Devuelve primer término.
        else
            return terminoNGeometrico(n - 1) * razon; // Multiplica por razón.
    }

    // Método para calcular el sumatorio de una sucesión recursivamente.
    // [#M034]
    public static int sumatorioRecursivo(int n) { // Sumatorio recursivo de una sucesión aritmética. Pide un número entero.
        int primer = 0; // Inicializar estas variables publicas cuando se vaya a poner en un programa.
        if (n == 1) // Caso base, cuando n es 1.
            return primer; // Devuelve primer término.
        else
            return terminoNAritmetico(n) + sumatorioRecursivo(n - 1); // Suma término actual + sumatorio anterior.
    }

    // Método para calcular el sumatorio de fracciones repetitivamente.
    // [#M035]
    public static void sumatorioFraccionesRepetitiva(int n) { // Sumatorio fracciones repetitivo. Pide un número entero.
        double aux = 0, termino = 0; // Inicializamos variables aux(fracción final) y termino(número final).
        int acumula = 0; // Acumulador inicializado a 0.
        for (int i = 1; i <= n; i++) { // Itera de 1 a n.
            aux = i; // Guarda i en en la variabe aux.
            acumula += i; // Acumula suma de enteros. Será la base de la fracción sumatoria.
            termino = 1 / aux; // Calcula fracción 1/aux y la guarda en termino.
            System.out.println(termino + ", "); // Imprime término.
        }

        System.out.printf("El termino " + n + " es: %.2f%n", termino); // Imprime último término formateado

        System.out.println("La fracción sumatoria seria: 1/" + acumula + " y la fracción final sería: 1/" + (int) aux); // Imprime resumen
    }

    // Método para calcular el fibonacci iterativamente.
    // [#M036]
    public static int fibonacciIterativa(int n) { // Fibonacci iterativo. Pide un número entero.
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    // Método para calcular el fibonacci recursivamente.
    // [#M037]
    public static int fibonacciRecursiva(int n) { // Fibonacci recursivo. Pide un número entero.

        if (n == 1) // Caso base 1.
            return 0; // Devuelve 0 (según esta lógica, usualmente F(1)=1).
        if (n == 2) // Caso base 2.
            return 1; // Devuelve 1.
        else // Caso recursivo.
            return fibonacciRecursiva(n - 1) + fibonacciRecursiva(n - 2); // Suma dos anteriores.
    }

    // Método para calcular la progresión geométrica iterativamente.
    // [#M038]
    public static void progresionGeometricaIterativa(int primer, int razon, int n) { // Progresión geométrica. Pide tres números enteros.
        long acumula = primer, termino = primer; // Inicializa acumulador y término a primer.

        for (int i = 1; i < n; i++) { // Itera hasta n-1.
            System.out.print(termino + ", "); // Imprime término actual.
            termino *= razon; // Calcula siguiente término.
            acumula += termino; // Suma al acumulador.
        }
        System.out.println("El termino " + n + " es " + termino); // Imprime último término.

        System.out.println("La suma de los " + n + " terminos es " + acumula); // Imprime suma total.
    }

    // Método para calcular la progresión geométrica por formula.
    // [#M039]
    public static void progresionGeometricaFormulaSuma(int primer, int razon, int n) { // Suma de progresión geométrica fórmula
        int suma = (primer * ((int) Math.pow(razon, n) - 1)) / (razon - 1); // Aplica fórmula de suma.
        System.out.println("La suma por formula da: " + suma); // Imprime resultado.
    }

    // ==========================================
    // ARRAYS & COLLECCIONES
    // ==========================================

    // Método para calcular el máximo y mínimo de un array.
    // [#M040]
    public static void minMaxArray(int[] datos) { // Pide un array de enteros.
        int max = datos[0]; // Asume primero es max.
        int min = datos[0]; // Asume primero es min.

        for (Integer entero : datos) { // Recorre array.
            if (entero > max) // Si es mayor que max actual.
                max = entero; // Actualiza max.
            if (entero < min) // Si es menor que min actual
                min = entero; // Actualiza min
        }

        System.out.println("el maximo valos de los datos es : " + max); // Imprime max
        System.out.println("el minimo valor de los datos es : " + min); // Imprime min
    }

    // Método para calcular el número repetido de un array.
    // [#M041]
    public static void repeArray(int[] datos) { // Busca repetidos. Pide un array de enteros.
        for (int i = 0; i < datos.length; i++) { // Bucle externo. Va desde 0 al límite del array.
            for (int j = i + 1; j < datos.length; j++) { // Bucle interno (comparación). Va desde i+1 al límite del array.
                if (datos[i] == datos[j]) // Si son iguales
                    System.out.println("Este valor está repetido " + datos[i]); // Imprime el valor repetido.
            }
        }
    }

    // Método para buscar un número en un array.
    // [#M042]
    public static boolean buscarNumeroArray(int[] datos, int n) { // Búsqueda lineal. Pide un array de enteros y un número entero.
        for (int i : datos) { // Recorre array con un bucle for-each.
            if (n == i) { // Si encuentra coincidencia.
                return true; // Devuelve true.
            }
        }
        return false; // Si termina sin encontrar, devuelve false.
    }

    // Método para calcular el menor, medio y mayor de tres números usando un array.
    // [#M043]
    public static void calculoMenorMedioMayorArray(int a, int b, int c) { // Ordena 3 números. Pide tres números enteros.
        int[] datos = { a, b, c }; // Crea array con los 3 números.
        Arrays.sort(datos); // Ordena el array.
        System.out.println("El menor es: " + datos[0]); // Imprime menor.
        System.out.println("El medio es: " + datos[1]); // Imprime medio.
        System.out.println("El mayor es: " + datos[2]); // Imprime mayor.
    }

    // ==========================================
    // TIEMPO & FECHA
    // ==========================================

    // Método para calcular horas, minutos y segundos.
    // [#M044]
    public static void calcularHoras(int segundos) { // Convierte segundos a formato tiempo. Pide un número entero.
        int min = segundos / 60; // Calcula minutos totales.
        int seg = segundos % 60; // Calcula segundos restantes.
        int horamin = min / 60; // Calcula horas.
        int horaseg = min % 60; // Calcula minutos restantes de hora.
        int días = horamin / 24; // Calcula días.
        int díahora = horamin % 24; // Calcula horas restantes de día
    }

    // Método para calcular horas, minutos y segundos.
    // [#M045]
    public static void calcularTiempoSegundos(int segundos) { // Otra versión de conversión. Pide un número entero.
        int minutos = (segundos / 60) % 60; // Minutos.
        int horas = (segundos / 3600) % 24; // Horas.
        int dias = (segundos / 3600) / 24; // Días.
        segundos = segundos % 60; // Segundos restantes.
    }

    // Método para calcular el mes y sus dias.
    // [#M046]
    public static void mesDias(int mes) { // Días del mes. Pide un número entero.
        switch (mes) { // Evalúa el mes.
            case 1, 3, 5, 7, 8, 10, 12: // Meses con 31 días.
                System.out.println("El mes tiene 31 dias"); // Imprime 31.
                break;

            case 4, 6, 9, 11: // Meses con 30 días.
                System.out.println("El mes tiene 30 dias"); // Imprime 30.
                break;

            case 2: // Febrero.
                System.out.println("El mes tiene 28 dias(o 29 si es bisiesto)"); // Imprime 28/29.
                break;
            default: // Mes inválido.
                System.out.println("mes incorrecto"); // Imprime error.
        }
    }

    // Método para calcular si un año es bisiesto.
    // [#M047]
    public static boolean esBisiesto(int ano) { // Verifica bisiesto. Pide un número entero.
        if ((ano % 4 == 0) && (ano % 100 != 0)) // Si es divisible por 4 y no por 100.
            return true; // Es bisiesto.
        else if (ano % 400 == 0) // Si es divisible por 400.
            return true; // Es bisiesto.
        else
            return false; // No es bisiesto.
    }

    // Método para calcular si un año es xacobeo iterativamente.
    // [#M048]
    public static boolean esXacobeoIterativo(int ano) { // Verifica año Xacobeo (lista fija). Pide un número entero.
        int[] AÑOS_XACOBEOS = { // Lista de años en array.
                1909, 1915, 1920, 1926,
                1937, 1938, 1943, 1948, 1954,
                1965, 1971, 1976, 1982,
                1993, 1999, 2004, 2010,
                2021, 2022, 2027, 2032, 2038,
                2049, 2055, 2060, 2066,
                2077, 2083, 2088, 2094,
        };

        for (int i = 0; i < AÑOS_XACOBEOS.length; i++) { // Recorre lista.
            if (ano == AÑOS_XACOBEOS[i]) { // Si encuentra coincidencia.
                return true; // Es Xacobeo.
            }
        }
        return false; // No es Xacobeo.
    }

    // Método para calcular si un año es xacobeo stream.
    // [#M049]
    public static boolean esXacobeoStream(int ano) { // Versión Stream de Xacobeo. Pide un número entero.
        int[] AÑOS_XACOBEOS = { // Lista de años en array.
                1909, 1915, 1920, 1926,
                1937, 1938, 1943, 1948, 1954,
                1965, 1971, 1976, 1982,
                1993, 1999, 2004, 2010,
                2021, 2022, 2027, 2032, 2038,
                2049, 2055, 2060, 2066,
                2077, 2083, 2088, 2094,
        };
        boolean enArray = Arrays.stream(AÑOS_XACOBEOS).anyMatch(a -> a == ano); // Busca con stream.
        if (enArray) { // Si está en array.
            return true; // Es Xacobeo.
        } else {
            return false; // No es Xacobeo.
        }
    }

    // ==========================================
    // DINERO & PORCENTAJES
    // ==========================================

    // Método para dividir un número entero en billetes y monedas.
    // [#M050]
    public static void divisionDinero(int dinero) { // Desglose de dinero. Pide un número entero.
        int billete500 = 0, billete200 = 0, billete100 = 0, billete50 = 0, billete20 = 0, billete10 = 0, billete5 = 0; // Contadores
        while (dinero >= 5) { // Mientras quede dinero >= 5
            if (dinero >= 500) { // Si cabe 500
                billete500++; // Suma billete
                dinero -= 500; // Resta valor

            } else if (dinero >= 200) { // Si cabe 200
                billete200++; // Suma billete
                dinero -= 200; // Resta valor

            } else if (dinero >= 100) { // Si cabe 100
                billete100++; // Suma billete
                dinero -= 100; // Resta valor

            } else if (dinero >= 50) { // Si cabe 50
                billete50++; // Suma billete
                dinero -= 50; // Resta valor

            } else if (dinero >= 20) { // Si cabe 20
                billete20++; // Suma billete
                dinero -= 20; // Resta valor
            } else if (dinero >= 10) { // Si cabe 10
                billete10++; // Suma billete
                dinero -= 10; // Resta valor
            } else if (dinero >= 5) { // Si cabe 5
                billete5++; // Suma billete
                dinero -= 5; // Resta valor
            }
            // Cantidad restante son las monedas.
        }
    }

    // Método para dividir un número entero en billetes y monedas de forma optimizada.
    // [#M051]
    public static void divisionDineroOptimizado(int dinero) { // Desglose de dinero. Pide un número entero.
        int[] billetes = { 500, 200, 100, 50, 20, 10, 5 }; // Guardamos los valores de los billetes en un array.
        for (int billete : billetes) { // Recorre array con un bucle for-each.
            if (dinero >= billete) { // Si cabe el billete.
                int cantidad = dinero / billete; // Calcula cantidad de billetes.
                dinero %= billete; // Resta valor.
                System.out.println("Billetes de " + billete + ": " + cantidad); // Imprime resultado.
            }
        }
    }

    // Método para calcular el porcentaje de descuento.
    // [#M052]
    public static double descubrePorcentaje(double original, double actual) { // Calcula % descuento de un producto. Pide dos números enteros.
        return (original - actual) * 100 / original; // Fórmula porcentaje.
    }

    // Método para calcular el precio final.
    // [#M053]
    public static double precioFinal(double original, double porcentaje) { // Calcula precio final de un producto. Pide dos números enteros.
        return original * (1 - (porcentaje / 100)); // Aplica descuento.
    }

    // Método para calcular el precio final.
    // [#M054]
    public static double precioFinal2(double original, double porcentaje) { // Otra forma de precio final. Pide dos números enteros.
        return original - (original / 100 * porcentaje); // Resta cantidad descontada.
    }

    // Método para calcular el precio original.
    // [#M055]
    public static double calcularOriginal(double actual, double porcentaje) { // Calcula precio original de un producto. Pide dos números enteros.
        return actual / ((100 - porcentaje) / 100); // Invierte descuento
    }

    // Método para calcular la conversión de euros a dólares.
    // [#M056]
    public static double euroToDolar(double euro) { // Euro a Dólar
        return euro * 1.17; // Tasa conversión
    }

    // Método para calcular la conversión de dólares a euros.
    // [#M057]
    public static double dolarToEuro(double dollar) { // Dólar a Euro
        return dollar * 0.86; // Tasa conversión
    }

    // ==========================================
    // CONVERSIONES (UNIDADES)
    // ==========================================

    // Método para calcular la conversión de grados centigrados a fahrenheit.
    // [#M058]
    public static double centigradosTuFahrenheit(double temp) { // Celsius a Fahrenheit. Pide un número entero.
        return (9D * temp / 5) + 32; // Fórmula para convertir.
    }

    // Método para calcular la conversión de grados fahrenheit a centigrados.
    // [#M059]
    public static double fahrenheitTuCentigrados(double temp) { // Fahrenheit a Celsius. Pide un número entero.
        return (temp - 32) * 5D / 9; // Fórmula para convertir.
    }

    // Método para calcular la conversión de millas a metros.
    // [#M060]
    public static double millasAMetros(double millas_marinas) { // Millas a Metros. Pide un número entero.
        return millas_marinas * 1852; // Factor conversión
    }

    // Método para calcular la conversión de millas a kilómetros.
    // [#M061]
    public static double millasAKilometro(double millas_marinas) { // Millas a Km. Pide un número entero.
        return millas_marinas * 1.852; // Factor conversión
    }

    // ==========================================
    // IMPRESION DE PATRONES & TABLAS
    // ==========================================

    // Método para contar de 1 a N. 
    // [#M062]
    public static void contar(int n) { // Cuenta ascendente. Pide un número entero.
        for (int i = 1; i <= n; i++) { // Itera de 1 a n
            System.out.println(i); // Imprime i
        }
    }

    // Método para contar de N a 1.
    // [#M063]
    public static void contarDesc(int n) { // Cuenta descendente. Pide un número entero.
        for (int i = n; i >= 1; i--) { // Itera de n a 1
            System.out.println(i); // Imprime i
        }
    } // Fin del método contarDesc

    // Método para imprimir un triángulo de asteriscos.
    // [#M064]
    public static void imprimirTriangulo(int n) { // Imprime triángulo. Pide un número entero.
        for (int i = 0; i < n; i++) { // Contador de filas
            for (int c = n - 1; c > i; c--) { // Contador de espacios
                System.out.print(" "); // Imprime espacio
            }
            for (int j = 0; j < 2 * i + 1; j++) { // Contador de asteriscos
                System.out.print("*"); // Imprime asterisco
            }
            System.out.println(""); // Nueva línea
        }
    }

    // Método para imprimir un rombo de asteriscos.
    // [#M065]
    public static void imprimirRombo(int n) { // Imprime rombo. Pide un número entero.
        for (int i = 0; i < n; i++) { // Contador de filas
            for (int c = n - 1; c > i; c--) { // Contador de espacios
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) { // Contador de asteriscos
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = n - 1; i > 0; i--) { // Contador de filas
            for (int c = i - 1; c < n - 1; c++) { // Contador de espacios
                System.out.print(" ");
            }
            for (int j = 2 * i; j > 0 + 1; j--) { // Contador de asteriscos
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    // Método para imprimir una escalera de asteriscos.
    // [#M066]
    public static void imprimirEscalera(int n) { // Imprime escalera. Pide un número entero.
        System.out.print("\n"); // Salto inicial
        for (int i = 0; i < n; i++) { // Contador de filas
            for (int j = 0; j <= i; j++) { // Contador de asteriscos por fila
                System.out.print("*"); // Imprime asterisco
            }
            System.out.println(""); // Nueva línea
        }
    }

    // Método para imprimir la tabla de multiplicar del 1 al 10.
    // [#M067]
    public static void tablaMultiplicarHastaEl10() { // Tablas 1 al 10
        for (int i = 1; i < 10; i++) { // Contador de números base
            System.out.println("\n" + "Tabla de multiplicar del: " + i); // Cabecera
            System.out.println("---------------------------"); // Separador
            for (int j = 1; j < 11; j++) { // Contador de multiplicador 1-10
                System.out.println(i + "x" + j + "= " + i * j); // Imprime línea
            }
        }
    }

    // Método para imprimir la tabla de multiplicar del 1 al n.
    // [#M068]
    public static void tablaMultiplicarHastaN(int n) { // Tablas 1 al N
        for (int i = 1; i < n; i++) { // Contador de números base
            System.out.println("\n" + "Tabla de multiplicar del: " + i); // Cabecera
            System.out.println("---------------------------"); // Separador
            for (int j = 1; j < 11; j++) { // Contador de multiplicador 1-10
                System.out.println(i + "x" + j + "= " + i * j); // Imprime línea
            }
        }
    }

    // Método para imprimir los números pares.
    // [#M069]
    public static void imprimirPares(int n) { // Imprime pares
        for (int j = 0; j <= n; j = j + 2) { // Contador de pares
            System.out.println(j); // Imprime par
        }
    }

    // Método para imprimir los números impares.
    // [#M070]
    public static void imprimirImpares(int n) { // Imprime impares
        for (int j = 1; j <= n; j = j + 2) { // Contador de impares
            System.out.println(j); // Imprime impar
        }
    }

    // ==========================================
    // LOGICA & COMPARACIONES
    // ==========================================

    // Método para calcular el menor, medio y mayor de tres números.
    // [#M071]
    public static void calculoMenorMedioMayor(int a, int b, int c) { // Ordena 3 números (lógica manual). Pide los 3 números (int).
        if (a > b && b > c) // Si a es mayor que b y b es mayor que c.
            System.out.println("El mayor es " + a + ", el medio es " + b + " y el menor es " + c);
        else if (b < c) // Si b es menor que c.
            System.out.println("El mayor es " + a + ", el medio es " + c + " y el menor es " + b);
        if (b > a && a > c) // Si b es mayor que a y a es mayor que c.
            System.out.println("El mayor es " + b + ", el medio es " + a + " y el menor es " + c);
        else if (a < c) // Si a es menor que c.
            System.out.println("El mayor es " + b + ", el medio es " + c + " y el menor es " + a);
        if (c > a && a > b) // Si c es mayor que a y a es mayor que b.
            System.out.println("El mayor es " + c + ", el medio es " + a + " y el menor es " + b);
        else if (a < b) // Si a es menor que b.
            System.out.println("El mayor es " + c + ", el medio es " + b + " y el menor es " + a);
    }

    // Método para calcular el menor, medio y mayor de tres números de manera eficiente.
    // [#M072]
    public static void calculoMenorMedioMayorEficiente(int a, int b, int c) { // Ordena 3 números (swaps). Pide los 3 números (int).
        if (a > b) { // Si a es mayor que b.
            int temp = a; // Intercambia.
            a = b;
            b = temp;
        }
        if (a > c) { // Si a es mayor que c.
            int temp = a; // Intercambia.
            a = c;
            c = temp;
        }
        if (b > c) { // Si b es mayor que c.
            int temp = b; // Intercambia.
            b = c;
            c = temp;
        }
    }

    // Método para calcular la clasificación de una nota.
    // [#M073]
    public static void notasClasificiacion(int nota) { // Clasifica notas con ifs. Pide la nota (int).
        if (nota >= 9.0) { // Si >= 9.
            System.out.println("sobresaliente");
        } else if (nota >= 7.0) { // Si >= 7.
            System.out.println("notable");
        } else if (nota >= 6.0) { // Si >= 6.
            System.out.println("bien");
        } else if (nota >= 5.0) { // Si >= 5.
            System.out.println("suficiente");
        } else { // Menor a 5.
            System.out.println("insuficiente");
        }
    }

    // Método para calcular el IMC. 
    // [#M074]
    public static void imcCalculadora(double peso, double altura) { // Calculadora IMC. Pide el peso (double) y la altura (double).
        double imc = peso / Math.pow(altura, 2); // Fórmula IMC.
        System.out.printf("Tu IMC es: " + imc); // Imprime IMC.

        if (imc < 16) // Clasificación según IMC.
            System.out.println(" Tienes: Delgadez severa");
        else if (imc >= 16 && imc < 17)
            System.out.println(" Tienes: Delgadez moderada");
        else if (imc >= 17 && imc < 18.5)
            System.out.println(" Tienes: Delgadez leve");
        else if (imc >= 18.5 && imc < 25)
            System.out.println(" Tienes: Peso normal");
        else if (imc >= 25 && imc < 30)
            System.out.println(" Tienes: Sobrepeso");
        else if (imc >= 30 && imc < 35)
            System.out.println(" Tienes: Obesidad leve");
        else if (imc >= 35 && imc < 40)
            System.out.println(" Tienes: Obesidad moderada");
        else
            System.out.println("Tienes: Obesidad mórbida");
    }

    // ==========================================
    // ALEATORIOS
    // ==========================================

    // Método para generar una letra aleatoria.
    // [#M075]
    public static char randomLetra() { // Letra aleatoria.
        return (char) (Math.random() * 26 + 'a'); // Genera char entre 'a' y 'z'.
    }

    // Método para generar un número aleatorio.
    // [#M076]
    public static int RandomNumero() { // Número aleatorio.
        //Random rnd = new Random(); // Creamos una instancai de Random para utilizarla y generar números aleatorios desde 2 rangos que queramos,
        //int valor = rnd.nextInt(0,100); // Genera int entre 0 y 99. Se puede modificar los 2 números para generar números aleatorios entre ellos. El primero es el límite inferior y el segundo el límite superior.
        return (int) (Math.random() * 100); // Genera int entre 0 y 99. Solo puede generar entre 0 y el valor multiplicado.
    }

    // ==========================================
    // FORMATEO
    // ==========================================

    // Método para formatear un número con comas.
    // [#M077]
    public static String formatearNumeroComas(String numero) { // Formato comas. Pide el número (String).
        DecimalFormat formatoDecimal = new DecimalFormat("#,###"); // Patrón formato.
        String numeroFormateado = formatoDecimal.format(numero); // Aplica formato.
        return numeroFormateado; // Devuelve string formateado.
    }

    // ==========================================
    // OBJETOS
    // ==========================================

    // [#M078]
    public class ArticuloCientifico { // Clase para crear objetos de Articulos cientificos.

        String titulo; // Variable de tipo String para almacenar el título del artículo.
        String autor; // Variable de tipo String para almacenar el nombre del autor.
        String[] palabrasClave = new String[3]; // Array de Strings de tamaño 3 para guardar tres palabras clave.
        String publicacion; // Variable String para guardar el nombre de la publicación o revista.
        int ano; // Variable entera para guardar el año de publicación.
        String resumen; // Variable String para guardar un resumen del artículo.

        ArticuloCientifico(String titulo, String autor) { // Constructor que recibe título y autor como parámetros.
            this.titulo = titulo; // Asigna el título recibido al título del objeto.
            this.autor = autor; // Asigna el autor recibido al autor del objeto.
        }

        ArticuloCientifico(String titulo, String autor, String[] palabrasClave, String publicacion) { // Constructor que recibe más datos: título, autor, palabras clave y publicación.
            this(titulo, autor); // Llama al constructor anterior para reutilizar código y asignar título y autor.
            this.palabrasClave = palabrasClave; // Asigna el array de palabras clave recibido al objeto.
            this.publicacion = publicacion; // Asigna la publicación recibida a la publicacion del objeto.
        }

        ArticuloCientifico(String titulo, String autor, String[] palabrasClave, String publicacion, int ano,
                String resumen) { // Constructor completo con todos los datos.
            this(titulo, autor, palabrasClave, publicacion); // Llama al constructor anterior para inicializar los primeros datos.
            this.ano = ano; // Asigna el año recibido al año del objeto.
            this.resumen = resumen; // Asigna el resumen recibido al resumen del objeto.
        }

        public String toString() { // Método toString para devolver una representación en texto del objeto.
            return "El articulo " + titulo + " del autor " + autor + " tiene estas palabras claves "
                    + Arrays.toString(palabrasClave) + ". Se publico en " + publicacion + " en el año " + ano
                    + ". Un resumen puede ser " + resumen + "."; // Añade el resumen al final del mensaje.
        }
    }

    // [#M079]
    public class Automovil { // Clase para crear objetos de Automovil.

        final static int LIMITE_SUPERIOR = 120; // Constante estática para el límite superior de velocidad (120).
        final static int LIMITE_INFERIOR = 0; // Constante estática para el límite inferior de velocidad (0).
        private String marca; // Atributo privado String para la marca del coche.
        private String color; // Atributo privado String para el color del coche.
        private int velocidad; // Atributo privado entero para la velocidad actual.

        public Automovil(String marca, String color, int velocidad) { // Constructor que recibe marca, color y velocidad.
            this.marca = marca; // Asigna la marca recibida a la marca del objeto.
            this.color = color; // Asigna el color recibido al color del objeto.
            this.velocidad = velocidad; // Asigna la velocidad recibida a la velocidad del objeto.
        }

        public String getMarca() { // Método getter público para obtener la marca.
            return marca; // Devuelve el valor de la marca del objeto.
        }

        public void setMarca(String marca) { // Método setter público para cambiar la marca.
            this.marca = marca; // Asigna la nueva marca al objeto.
        }

        public String getColor() { // Método getter público para obtener el color.
            return color; // Devuelve el valor del color del objeto.
        }

        public void setColor(String color) { // Método setter público para cambiar el color.
            this.color = color; // Asigna el nuevo color al objeto.
        }

        public int getVelocidad() { // Método getter público para obtener la velocidad.
            return velocidad; // Devuelve el valor de la velocidad del objeto.
        }

        public void setVelocidad(int velocidad) { // Método setter público para cambiar la velocidad.
            this.velocidad = velocidad; // Asigna la nueva velocidad al objeto.
        }

        public void acelerar(int aumento) { // Método público para aumentar la velocidad.
            if (aumento > 0) { // Comprueba si el aumento es un valor positivo.
                velocidad += aumento; // Suma el aumento a la velocidad actual.
                System.out.println("El " + marca + " acelera con cariño a " + velocidad + " km/h"); // Imprime mensaje de aceleración.
            } else { // Si el aumento no es positivo (es 0 o negativo).
                System.out.println("No se puede acelerar con un valor negativo."); // Imprime mensaje de error.
            }
        }

        public void frenar(int reduccion) { // Método público para disminuir la velocidad.
            if (reduccion > 0) { // Comprueba si la reducción es un valor positivo.
                velocidad -= reduccion; // Resta la reducción a la velocidad actual.
                if (velocidad < 0) { // Comprueba si la velocidad ha quedado negativa.
                    velocidad = 0; // Si es negativa, la ajusta a 0 (no puede ser negativa).
                }
                System.out.println("El " + marca + " frena con cariño a " + velocidad + " km/h"); // Imprime mensaje de frenado.
            } else { // Si la reducción no es positiva.
                System.out.println("No se puede frenar con un valor negativo."); // Imprime mensaje de error.
            }
        }

        public void claxon() { // Método público para hacer sonar el claxon.
            System.out.println("pip pip El " + color + " " + marca + " te saluda con cariño"); // Imprime mensaje simulando el claxon.
        }

        public String toString() { // Método toString para devolver información del coche.
            return "El automovil de marca " + marca + ", de color " + color + " va a una velocidad de " + velocidad; // Devuelve descripción.
        }
    }

    // [#M080]
    public class Automovil2 { // Clase para crear objetos de Automovil2, el retorno.
        private String marca = null; // Atributo privado String para la marca del coche inicializada a null.
        private int modelo = 0; // Atributo privado int para el modelo del coche inicializado a 0.
        private double motor = 0d; // Atributo privado double para el motor del coche inicializado a 0.0.
        private String tipoCombustible; // Atributo privado String para el tipo de combustible del coche.
        private String tipoAutomovil; // Atributo privado String para el tipo de coche.
        private int numeroPuertas = 0; // Atributo privado int para el número de puertas del coche inicializado a 0.
        private int cantidadAsientos = 0; // Atributo privado int para la cantidad de asientos del coche inicializada a 0.
        private int velocidadMaxima = 0; // Atributo privado int para la velocidad máxima del coche inicializada a 0.
        private String color; // Atributo privado String para el color del coche.
        private int velocidadActual = 0; // Atributo privado int para la velocidad actual del coche inicializada a 0.

        public Automovil2(String marca, int modelo, double motor, String tipoCombustible, String tipoAutomovil,
                int numeroPuertas, int cantidadAsientos, int velocidadMaxima, String color, int velocidadActual) { // Constructor completo.
            this.marca = marca; // Asigna marca recibida a la marca del objeto.
            this.modelo = modelo; // Asigna modelo recibido a la marca del objeto.
            this.motor = motor; // Asigna motor recibido a la marca del objeto.
            this.tipoCombustible = tipoCombustible; // Asigna combustible recibido a la marca del objeto.
            this.tipoAutomovil = tipoAutomovil; // Asigna tipo recibido a la marca del objeto.
            this.numeroPuertas = numeroPuertas; // Asigna puertas recibido a la marca del objeto.
            this.cantidadAsientos = cantidadAsientos; // Asigna asientos recibido a la marca del objeto.
            this.velocidadMaxima = velocidadMaxima; // Asigna velocidad máxima recibido a la marca del objeto.
            this.color = color; // Asigna color recibido a la marca del objeto.
            this.velocidadActual = velocidadActual; // Asigna velocidad actual recibido a la marca del objeto.
        }

        public String getMarca() { // Método getter público para obtener la marca.
            return marca; // Devuelve el valor de marca del objeto.
        }

        public void setMarca(String marca) { // Método setter público para asignar la marca.
            this.marca = marca; // Asigna el valor de marca al atributo privado marca del objeto.
        }

        public int getModelo() { // Método getter público para obtener el modelo.
            return modelo; // Devuelve el valor de modelo del objeto.
        }

        public void setModelo(int modelo) { // Método setter público para asignar el modelo.
            this.modelo = modelo; // Asigna el valor de modelo al atributo privado modelo del objeto.
        }

        public double getMotor() { // Método getter público para obtener el motor.
            return motor; // Devuelve el valor de motor del objeto.
        }

        public void setMotor(double motor) { // Método setter público para asignar el motor.
            this.motor = motor; // Asigna el valor de motor al atributo privado motor del objeto.
        }

        public String getTipoCombustible() { // Método getter público para obtener el tipo de combustible.
            return tipoCombustible; // Devuelve el valor de tipoCombustible del objeto.
        }

        public void setTipoCombustible(String tipoCombustible) { // Método setter público para asignar el tipo de combustible.
            this.tipoCombustible = tipoCombustible; // Asigna el valor de tipoCombustible al atributo privado tipoCombustible del objeto.
        }

        public String getTipoAutomovil() { // Método getter público para obtener el tipo de automóvil.
            return tipoAutomovil; // Devuelve el valor de tipoAutomovil del objeto.
        }

        public void setTipoAutomovil(String tipoAutomovil) { // Método setter público para asignar el tipo de automóvil.
            this.tipoAutomovil = tipoAutomovil; // Asigna el valor de tipoAutomovil al atributo privado tipoAutomovil del objeto.
        }

        public int getNumeroPuertas() { // Método getter público para obtener el número de puertas.
            return numeroPuertas; // Devuelve el valor de numeroPuertas del objeto.
        }

        public void setNumeroPuertas(int numeroPuertas) { // Método setter público para asignar el número de puertas.
            this.numeroPuertas = numeroPuertas; // Asigna el valor de numeroPuertas al atributo privado numeroPuertas del objeto.
        }

        public int getCantidadAsientos() { // Método getter público para obtener la cantidad de asientos.
            return cantidadAsientos; // Devuelve el valor de cantidadAsientos del objeto.
        }

        public void setCantidadAsientos(int cantidadAsientos) { // Método setter público para asignar la cantidad de asientos.
            this.cantidadAsientos = cantidadAsientos; // Asigna el valor de cantidadAsientos al atributo privado cantidadAsientos del objeto.
        }

        public int getVelocidadMaxima() { // Método getter público para obtener la velocidad máxima.
            return velocidadMaxima; // Devuelve el valor de velocidadMaxima del objeto.
        }

        public void setVelocidadMaxima(int velocidadMaxima) { // Método setter público para asignar la velocidad máxima.
            this.velocidadMaxima = velocidadMaxima; // Asigna el valor de velocidadMaxima al atributo privado velocidadMaxima del objeto.
        }

        public String getColor() { // Método getter público para obtener el color.
            return color; // Devuelve el valor de color del objeto.
        }

        public void setColor(String color) { // Método setter público para asignar el color.
            this.color = color; // Asigna el valor de color al atributo privado color del objeto.
        }

        public int getVelocidadActual() { // Método getter público para obtener la velocidad actual.
            return velocidadActual; // Devuelve el valor de velocidadActual del objeto.
        }

        public void setVelocidadActual(int velocidadActual) { // Método setter público para asignar la velocidad actual.
            this.velocidadActual = velocidadActual; // Asigna el valor de velocidadActual al atributo privado velocidadActual del objeto.
        }

        public void acelerar(int incremento) { // Método para acelerar.
            if (velocidadActual + incremento > velocidadMaxima) { // Verifica si al acelerar pasamos la velocidad máxima.
                System.out.println("No puedes ir tan rápido."); // Mensaje de advertencia.
            } else { // Si no se pasa el límite.
                velocidadActual += incremento; // Incrementa la velocidad.
            }
        }

        public void desacelerar(int decremento) { // Método para frenar/desacelerar.
            if (velocidadActual - decremento < 0) { // Verifica si al frenar bajamos de 0.
                System.out.println("La velocidad no puede ser negativa."); // Mensaje de error.
            } else { // Si es válido.
                velocidadActual -= decremento; // Reduce la velocidad.
            }
        }

        public void frenar() { // Método para frenar en seco.
            velocidadActual = 0; // Pone velocidad a 0.
        }

        public double tiempoLlegada(double distanciaKm) { // Calcula tiempo para llegar a una distancia.
            if (velocidadActual == 0) { // Si estamos parados.
                System.out.println("si no hay velocidad nunca llegara"); // Mensaje, no llegaremos.
                return -1; // Devuelve -1 indicando error o tiempo infinito.
            }
            return distanciaKm / velocidadActual; // Devuelve tiempo = espacio / velocidad.
        }

        public void Datos() { // Método para imprimir todos los datos.
            System.out.println("Marca:  " + marca); // Imprime marca.
            System.out.println("Modelo:  " + modelo); // Imprime modelo.
            System.out.println("Motor:  " + motor + "  L"); // Imprime motor.
            System.out.println("Tipo de combustible:  " + tipoCombustible); // Imprime combustible.
            System.out.println("Tipo de automóvil:  " + tipoAutomovil); // Imprime tipo.
            System.out.println("Número de puertas:  " + numeroPuertas); // Imprime puertas.
            System.out.println("Cantidad de asientos:  " + cantidadAsientos); // Imprime asientos.
            System.out.println("Velocidad máxima:  " + velocidadMaxima + "  km/h"); // Imprime vel máx.
            System.out.println("Color:  " + color); // Imprime color.
            System.out.println("Velocidad actual:  " + velocidadActual + "  km/h"); // Imprime vel actual.
        }
    }

    // [#M081]
    public class Avion extends Object { // Clase Avion, hereda explícitamente de Object (aunque es implícito en Java).

        final static String LOKI = "LOCKHEED"; // Constante con nombre de fabricante por defecto 'LOCKHEED'.

        private String fabricante; // Atributo privado String fabricante del avión.
        private int motores; // Atributo privado int motores.

        public Avion(String fabricante, int motores) { // Constructor con fabricante y motores.
            super(); // Llama al constructor de la clase padre (Object).
            this.fabricante = fabricante; // Asigna el valor de fabricante al atributo privado fabricante del objeto.
            this.motores = motores; // Asigna el valor de motores al atributo privado motores del objeto.
        }

        public String getFabricante() { // Método getter público para obtener fabricante.
            return fabricante; // Devuelve el valor fabricante del objeto.
        }

        public void setFabricante(String fabricante) { // Método setter público para asignar fabricante.
            this.fabricante = fabricante; // Asigna el valor de fabricante al atributo privado fabricante del objeto.
        }

        public int getMotores() { // Método getter público para obtener motores.
            return motores; // Devuelve el valor motores del objeto.
        }

        public void setMotores(int motores) { // Método setter público para asignar motores.
            this.motores = motores; // Asigna el valor de motores al atributo privado motores del objeto.
        }

        public String toString() { // Método toString.
            return "Avion de fabricante " + fabricante + " con " + motores + " motores."; // Devuelve descripción.
        }

        public void cambiarFabricante(Avion avion) { // Método para copiar el fabricante de otro avión.
            this.setFabricante(avion.getFabricante()); // Obtiene fabricante del otro y lo pone en este.
        }
    }

    // [#M082]
    public class Caja { // Clase para crear objetos de Caja.
        double base; // Atributo privado double base de la caja.
        double anchura; // Atributo privado double anchura de la caja.
        double altura; // Atributo privado double altura de la caja.
        String tipo; // Atributo privado String tipo de caja.

        public Caja(double base, double anchura, double altura) { // Constructor con dimensiones.
            super(); // Llama a superclase (Object).
            this.base = base; // Asigna el valor de base al atributo privado base del objeto.
            this.anchura = anchura; // Asigna el valor de anchura al atributo privado anchura del objeto.
            this.altura = altura; // Asigna el valor de altura al atributo privado altura del objeto.
        }

        public Caja() { // Constructor vacío (por defecto).
            base = anchura = altura = 0d; // Inicializa todo a 0.
        }

        public Caja(double longitud) { // Constructor para cubo (un solo lado).
            this.base = this.anchura = this.altura = longitud; // Asigna el mismo valor a todo.
        }

        public Caja(double base, double anchura, double altura, String tipo) { // Constructor completo con tipo.
            this(base, anchura, altura); // Llama al primer constructor para asignar dimensiones.
            this.tipo = tipo; // Asigna el tipo.
        }

        public String toString() { // Método toString.
            return "Caja de base " + base + " con anchura " + anchura + ", altura " + altura + " y tipo " + tipo + "."; // Descripción.
        }
    }

    // [#M083]
    public class Circulo { // Clase para crear objetos de tipo Circulo.

        int radio; // Atributo privado int radio del círculo.
        java.awt.Color color; // Atributo privado java.awt.Color color del círculo (usando librería AWT).

        Circulo(int radio, java.awt.Color color) { // Constructor completo.
            this.radio = radio; // Asigna el valor de radio al atributo privado radio.
            this.color = color; // Asigna el valor de color al atributo privado color.
        }

        public int getRadio() { // Método getter público para obtener radio.
            return radio; // Devuelve el valor del atributo privado radio.
        }

        public void setRadio(int radio) { // Método setter público para asignar radio.
            this.radio = radio; // Asigna el valor de radio al atributo privado radio.
        }

        public java.awt.Color getColor() { // Método getter público para obtener color.
            return color; // Devuelve el valor del atributo privado color.
        }

        public void setColor(java.awt.Color color) { // Método setter público para asignar color.
            this.color = color; // Asigna el valor de color al atributo privado color.
        }

        @Override
        public String toString() { // Método toString con anotación Override (sobreescribe padre).
            return "Circulo de radio " + radio + " y color " + color + "."; // Descripción.
        }

        double calcularArea() { // Método para calcular área.
            return Math.PI * Math.pow(radio, 2); // PI * r^2.
        }

        double calcularPerimetro() { // Método para calcular perímetro.
            return 2 * Math.PI * radio; // 2 * PI * r.
        }
    }

    // [#M084]
    public class Consumo { // Clase para crear objetos de tipo Consumo.
        public double kms; // Atributo privado double kms (kilómetros).
        public double litros; // Atributo privado double litros (litros consumidos).
        public double vmed; // Atributo privado double vmed (velocidad media).
        public double pgas; // Atributo privado double pgas (precio gasolina).

        public Consumo(double l, double k, double vmed, double pgas) { // Constructor completo.
            this.kms = k; // Asigna el valor de k a kms.
            this.litros = l; // Asigna el valor de l a litros.
            this.vmed = vmed; // Asigna el valor de vmed a velocidad media.
            this.pgas = pgas; // Asigna el valor de pgas a precio gasolina.
        }

        public double getTiempo(int kms, double vmed) { // Método para calcular tiempo.
            return kms / vmed; // Devuelve tiempo = espacio / velocidad.
        }

        public double consumoMedio(int litros, int kms) { // Método para calcular consumo medio l/km.
            return litros / kms; // Devuelve litros/km.
        }

        public double consumoEuros(int litros, double pgas) { // Método para calcular precio/litro.
            return pgas / litros; // Devuelve precio/litro.
        }

    }

    // [#M085]
    public class Cuadrado { // Clase para crear objetos de tipo Cuadrado.

        int lado; // Atributo privado int lado del cuadrado.
        java.awt.Color color; // Atributo privado java.awt.Color color del cuadrado.

        public Cuadrado(int lado, java.awt.Color color) { // Constructor.
            super(); // super().
            this.lado = lado; // Asigna el valor de lado al atributo privado lado.
            this.color = color; // Asigna el valor de color al atributo privado color.
        }

        public int getLado() { // Método getter público para obtener lado.
            return lado; // Devuelve el valor del atributo privado lado.
        }

        public void setLado(int lado) { // Método setter público para asignar lado.
            this.lado = lado; // Asigna el valor de lado al atributo privado lado.
        }

        public java.awt.Color getColor() { // Método getter público para obtener color.
            return color; // Devuelve el valor del atributo privado color.
        }

        public void setColor(java.awt.Color color) { // Método setter público para asignar color.
            this.color = color; // Asigna el valor de color al atributo privado color.
        }

        public String toString() { // Método toString.
            return "cuadrado [lado=" + lado + ", color=" + color + "]"; // Devuelve la descripción.
        }

        double calcularArea() { // Método para calcular área.
            return lado * lado; // Devuelve el valor de lado * lado.
        }

        double calcularPerimetro() { // Método para calcular perímetro.
            return (4 * lado); // Devuelve el valor de 4 * lado.
        }

    }

    // [#M086]
    public class Pajaro { // Clase para crear objetos de tipo Pajaro.
        private char color; // Atributo privado char color.
        private int edad; // Atributo privado int edad.
        private String nombre; // Atributo privado String nombre.

        public Pajaro(char color, int edad, String nombre) { // Constructor.
            this.color = color; // Asigna el valor de color al atributo privado color.
            this.edad = edad; // Asigna el valor de edad al atributo privado edad.
            this.nombre = nombre; // Asigna el valor de nombre al atributo privado nombre.
        }

        public char getColor() { // Método getter público para obtener color.
            return color; // Devuelve el valor del atributo privado color.
        }

        public void setColor(char color) { // Método setter público para asignar color.
            this.color = color; // Asigna el valor de color al atributo privado color.
        }

        public int getEdad() { // Método getter público para obtener edad.
            return edad; // Devuelve el valor del atributo privado edad.
        }

        public void setEdad(int edad) { // Método setter público para asignar edad.
            this.edad = edad; // Asigna el valor de edad al atributo privado edad.
        }

        public String getNombre() { // Método getter público para obtener nombre.
            return nombre; // Devuelve el valor del atributo privado nombre.
        }

        public void setNombre(String nombre) { // Método setter público para asignar nombre.
            this.nombre = nombre; // Asigna el valor de nombre al atributo privado nombre.
        }

        public void cantar() { // Método cantar.
            switch (color) { // Evalúa color.
                case 'R': // Rojo.
                    System.out.println("El pájaro rojo canta melodías alegres."); // Canta alegre.
                    break; // Salir switch.
                case 'A': // Azul.
                    System.out.println("El pájaro azul canta notas suaves."); // Canta suave.
                    break; // Salir switch.
                default: // Otro color.
                    System.out.println("Los pájaros de distinto color cantan una canción única."); // Canta genérico.
                    break; // Salir switch.
            }
        }

        public void mostrarInfo() { // Método mostrar información.
            System.out.println("Pájaro " + nombre + ", color: " + color + ", edad: " + edad + " años."); // Imprime todo.
        }

        public String toString() { // Método toString.
            return "Pajaro de color " + color + " con nombre " + nombre + " y edad " + edad + " años."; // Descripción.
        }
    }

    // [#M087]
    public class Pedido { // Clase Pedido.

        // LOS PARAMETROS NO TIENEN PORQUE SER ATRIBUTOS [#M140]
        public void calcularPrecio(String primerPlato, double costoPrimerPlato, String bebida, double costoBebida) { // Calcula precio menú 2 cosas.
            double total = costoPrimerPlato + costoBebida; // Suma costes.
            System.out.println("El precio de " + primerPlato + " y " + bebida + " es = $" + total); // Imprime total.
        }

        public void calcularPrecio(String primerPlato, double costoPrimerPlato, String segundoPlato, double costoSegundoPlato, String bebida, double costoBebida) { // Calcula precio menú 3 cosas.
            double total = costoPrimerPlato + costoBebida + costoSegundoPlato; // Suma 3 costes.
            System.out.println("El precio de " + primerPlato + " + " + segundoPlato + " + " + bebida + " es = $" + total); // Imprime total.
        }

        public void calcularPrecio(String primerPlato, double costoPrimerPlato, String segundoPlato, double costoSegundoPlato, String postre, double costoPostre, String bebida, double costoBebida) { // Calcula precio menú completo.
            double total = costoPrimerPlato + costoBebida + costoSegundoPlato + costoPostre; // Suma 4 costes.
            System.out.println("El precio de " + primerPlato + " + " + segundoPlato + " + " + bebida + " + " + postre + " es = $" + total); // Imprime total.
        }
    }

    // [#M088]
    public class Pelicula { // Clase para crear objetos de tipo Pelicula.

        private String nombre; // Atributo privado String del nombre de la pelicula.
        private String director; // Atributo privado String del director de la pelicula.

        enum tipoGenero { // Enumeración para géneros.
            ACCION, COMEDIA, DRAMA, SUSPENSO; // Valores posibles.
        } 

        public tipoGenero genero; // Atributo público del tipo enumeración género.
        private int duracion; // Atributo privado int de la duración en minutos.
        private int ano; // Atributo privado int del año de estreno.
        private double puntuacion; // Atributo privado double de la puntuación 0-10.

        public Pelicula(String nombre, String director, tipoGenero genero, int duracion, double puntuacion, int año) { // Constructor completo.
            this.nombre = nombre; // Asigna el valor de nombre al atributo privado nombre del objeto.
            this.director = director; // Asigna el valor de director al atributo privado director del objeto.
            this.genero = genero; // Asigna el valor de género al atributo privado genero del objeto.
            this.duracion = duracion; // Asigna el valor de duración al atributo privado duracion del objeto.
            this.puntuacion = puntuacion; // Asigna el valor de puntuación al atributo privado puntuacion del objeto.
            this.ano = año; // Asigna el valor de año al atributo privado ano del objeto.
        }

        public int getAno() { // Método getter público para obtener el año.
            return ano; // Devuelve el valor del atributo privado ano.
        } 

        public void setAno(int año) { // Método setter público para asignar el año.
            this.ano = año; // Asigna el valor de año al atributo privado ano del objeto.
        }

        public String getDirector() { // Método getter público para obtener el director.
            return director; // Devuelve el valor del atributo privado director.
        } 

        public void setDirector(String director) { // Método setter público para asignar el director.
            this.director = director; // Asigna el valor de director al atributo privado director del objeto.
        }

        public int getDuracion() { // Método getter público para obtener la duración.
            return duracion; // Devuelve el valor del atributo privado duracion.
        } 

        public void setDuracion(int duracion) { // Método setter público para asignar la duración.
            this.duracion = duracion; // Asigna el valor de duración al atributo privado duracion del objeto.
        }

        public tipoGenero getGenero() { // Método getter público para obtener el género.
            return genero; // Devuelve el valor del atributo privado genero.
        } 

        public void setGenero(tipoGenero genero) { // Método setter público para asignar el género.
            this.genero = genero; // Asigna el valor de genero al atributo privado genero del objeto.
        }

        public String getNombre() { // Método getter público para obtener el nombre.
            return nombre; // Devuelve el valor del atributo privado nombre.
        } 

        public void setNombre(String nombre) { // Método setter público para asignar el nombre.
            this.nombre = nombre; // Asigna el valor de nombre al atributo privado nombre del objeto.
        }

        public double getPuntuacion() { // Método getter público para obtener la puntuación.
            return puntuacion; // Devuelve el valor del atributo privado puntuacion.
        } 

        public void setPuntuacion(double puntuacion) { // Método setter público para asignar la puntuación.
            this.puntuacion = puntuacion; // Asigna el valor de puntuación al atributo privado puntuacion del objeto.
        }

        @Override
        public String toString() { // toString.
            return nombre + "Su director es " + director + " con genero " + genero + ". Dura " + duracion+ ". Fue publicada en " + ano + " y tiene una puntuacion de " + puntuacion + "."; // Descripción.
        } 

        public boolean esPeliculaEpica() { // Verifica si es épica (larga).
            if (getDuracion() > 180) { // Si dura más de 3h (180 min).
                return true; // Es épica.
            } else { // Si no.
                return false; // No es épica.
            }
        } 

        public String calcularValoracion() { // Calcula valoración texto según puntuación.
            if (getPuntuacion() >= 0 && getPuntuacion() <= 2) { // Entre 0 y 2.
                return "Muy mala"; // Muy mala.
            } else if (getPuntuacion() > 2 && getPuntuacion() <= 4) { // Entre 2 y 4.
                return "Mala"; // Mala.
            } else if (getPuntuacion() > 4 && getPuntuacion() <= 6) { // Entre 4 y 6.
                return "Decente"; // Decente.
            } else if (getPuntuacion() > 6 && getPuntuacion() <= 8) { // Entre 6 y 8.
                return "Buena"; // Buena.
            } else if (getPuntuacion() > 8 && getPuntuacion() <= 10) { // Entre 8 y 10.
                return "Epica"; // Épica.
            } else { // Fuera de rango.
                return "Valor incorrecto"; // Error.
            } 
        } 

        public boolean esSimilar(Pelicula otra) { // Compara dos películas.
            if (this.getGenero() == otra.getGenero() && this.calcularValoracion().equals(otra.calcularValoracion())) { // Si mismo género y valoración.
                return true; // Son similares.
            } else { // Si no.
                return false; // No son similares.
            } 
        } 
    } 

    // [#M089]
    public class Persona { // Clase para crear objetos del tipo Persona.

        private String nombre; // Atributo privado String nombre.
        private String apellido; // Atributo privado String apellido.
        private int edad; // Atributo privado int edad.

        public Persona() { // Constructor vacío.
            this.nombre = ""; // Inicializa vacío.
            this.apellido = ""; // Inicializa vacío.
            this.edad = 0; // Inicializa 0.
        }

        public Persona(String nombre, String apellido, int edad) { // Constructor con datos.
            this.nombre = nombre; // Asigna el valor de nombre al atributo privado nombre del objeto.
            this.apellido = apellido; // Asigna el valor de apellido al atributo privado apellido del objeto.
            this.edad = edad; // Asigna el valor de edad al atributo privado edad del objeto.
        }

        public String getNombre() { // Método getter público para obtener el nombre.
            return nombre; // Devuelve el valor del atributo privado nombre.
        } 

        public void setNombre(String nombre) { // Método setter público para asignar el nombre.
            this.nombre = nombre; // Asigna el valor de nombre al atributo privado nombre del objeto.
        }

        public String getApellido() { // Método getter público para obtener el apellido.
            return apellido; // Devuelve el valor del atributo privado apellido.
        } 

        public void setApellido(String apellido) { // Método setter público para asignar el apellido.
            this.apellido = apellido; // Asigna el valor de apellido al atributo privado apellido del objeto.
        }

        public int getEdad() { // Método getter público para obtener la edad.
            return edad; // Devuelve el valor del atributo privado edad.
        } 

        public void setEdad(int edad) { // Método setter público para asignar la edad.
            this.edad = edad; // Asigna el valor de edad al atributo privado edad del objeto.
        }

        @Override
        public String toString() { // Método toString.
            return "persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]"; // Descripción.
        } 


        public void firmaPapelFolga(String nombre) { // Método para firmar papel folga.
            System.out.println(nombre + "no viene el jueves"); // Imprime mensaje.
        } 

        public String tengosueño(int horas) { // Método para tener sueño.
            return "tengo horas de sueño atrasadas: " + horas; // Devuelve texto.
        } 

        public void canto() { // Método para cantar.
            System.out.println("estoy cantando como pavarotti la traviata"); // Imprime canto.
        } 
    } 

    // [#M090]
    public class Persona2 { // Clase para crear objetos de Persona2.

        String nombre; // Atributo privado String nombre.
        String apellidos; // Atributo privado String apellidos.
        String DNI; // Atributo privado String DNI.
        int anoNac; // Atributo privado int anoNac.
        String pais; // Atributo privado String pais.
        char genero; // Atributo privado char genero.

        Persona2(String nombre, String apellidos, String DNI, int anoNac) { // Constructor básico.
            this.nombre = nombre; // Asigna el valor de nombre al atributo privado nombre del objeto.
            this.apellidos = apellidos; // Asigna el valor de apellidos al atributo privado apellidos del objeto.
            this.DNI = DNI; // Asigna el valor de DNI al atributo privado DNI del objeto.
            this.anoNac = anoNac; // Asigna el valor de anoNac al atributo privado anoNac del objeto.
        }

        Persona2(String nombre, String apellidos, String DNI, int anoNac, String pais, char genero) { // Constructor completo.
            this(nombre, apellidos, DNI, anoNac); // Llama al constructor básico para ahorrar líneas de código.
            this.pais = pais; // Asigna el valor de pais al atributo privado pais del objeto.
            this.genero = genero; // Asigna el valor de genero al atributo privado genero del objeto.
        }

        public String getNombre() { // Método getter público para obtener el nombre.
            return nombre; // Devuelve el valor del atributo privado nombre.
        } 

        public void setNombre(String nombre) { // Método setter público para asignar el nombre.
            this.nombre = nombre; // Asigna el valor de nombre al atributo privado nombre del objeto.
        }

        public String getApellidos() { // Método getter público para obtener el apellido.
            return apellidos; // Devuelve el valor del atributo privado apellidos.
        } 

        public void setApellidos(String apellidos) { // Método setter público para asignar el apellido.
            this.apellidos = apellidos; // Asigna el valor de apellidos al atributo privado apellidos del objeto.
        }

        public String getDNI() { // Método getter público para obtener el DNI.
            return DNI; // Devuelve el valor del atributo privado DNI.
        } 

        public void setDNI(String dNI) { // Método setter público para asignar el DNI.
            this.DNI = dNI; // Asigna el valor de dNI al atributo privado DNI del objeto.
        }

        public int getAnoNac() { // Método getter público para obtener el año de nacimiento.
            return anoNac; // Devuelve el valor del atributo privado anoNac.
        } 

        public void setAnoNac(int anoNac) { // Método setter público para asignar el año de nacimiento.
            this.anoNac = anoNac; // Asigna el valor de anoNac al atributo privado anoNac del objeto.
        }

        public String getPais() { // Método getter público para obtener el país.
            return pais; // Devuelve el valor del atributo privado pais.
        } 

        public void setPais(String pais) { // Método setter público para asignar el país.
            this.pais = pais; // Asigna el valor de pais al atributo privado pais del objeto.
        }

        public char getGenero() { // Método getter público para obtener el género.
            return genero; // Devuelve el valor del atributo privado genero.
        } 

        public void setGenero(char genero) { // Método setter público para asignar el género.
            this.genero = genero; // Asigna el valor de genero al atributo privado genero del objeto.
        }

        public String toString() { // Método toString.
            return "La persona con nombre " + nombre + " y apellidos " + apellidos + " tiene un DNI " + DNI+ " y nacio en la fecha de " + anoNac; // Descripción.
        } 

    }

    // [#M091]
    public class Planeta { // Clase para crear objetos del tipo Planeta.

        public enum TipoPlaneta { // Enum tipo planeta.
            GASEOSO, TERRESTRE, ENANO // Tipos.
        } 

        private String nombre = null; //  Atributo privado String nombre planeta.
        private int cantidadSatelites = 0; // Atributo privado int cantidadSatelites.
        private double masa = 0.0; // Atributo privado double masa.
        private double volumen = 0.0; // Atributo privado double volumen.
        private int diametro = 0; // Atributo privado int diametro.
        private int distanciaMediaSol = 0; // Atributo privado int distanciaMediaSol.
        private TipoPlaneta tipo; // Atributo privado TipoPlaneta tipo.
        private boolean observable = false; // Atributo privado boolean observable.
        private double PeriodoOrbital = 0.0; // Atributo privado double PeriodoOrbital.
        private double PeriodoRotacion = 0.0; // Atributo privado double PeriodoRotacion.

        public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaMediaSol, TipoPlaneta tipo, boolean observable, double PeriodoOrbital, double PeriodoRotacion) { // Constructor completo.
            this.nombre = nombre; // Asigna el valor de nombre al atributo privado nombre del objeto.
            this.cantidadSatelites = cantidadSatelites; // Asigna el valor de cantidadSatelites al atributo privado cantidadSatelites del objeto.
            this.masa = masa; // Asigna el valor de masa al atributo privado masa del objeto.
            this.volumen = volumen; // Asigna el valor de volumen al atributo privado volumen del objeto.
            this.diametro = diametro; // Asigna el valor de diametro al atributo privado diametro del objeto.
            this.distanciaMediaSol = distanciaMediaSol; // Asigna el valor de distanciaMediaSol al atributo privado distanciaMediaSol del objeto.
            this.tipo = tipo; // Asigna el valor de tipo al atributo privado tipo del objeto.
            this.observable = observable; // Asigna el valor de observable al atributo privado observable del objeto.
            this.PeriodoOrbital = PeriodoOrbital; // Asigna el valor de PeriodoOrbital al atributo privado PeriodoOrbital del objeto.
            this.PeriodoRotacion = PeriodoRotacion; // Asigna el valor de PeriodoRotacion al atributo privado PeriodoRotacion del objeto.
        }

        public String getNombre() { // Método getter público para obtener el nombre.
            return nombre; // Devuelve el valor del atributo privado nombre.
        }

        public void setNombre(String nombre) { // Método setter público para asignar el nombre.
            this.nombre = nombre; // Asigna el valor de nombre al atributo privado nombre del objeto.
        }

        public int getCantidadSatelites() { // Método getter público para obtener la cantidad de satélites.
            return cantidadSatelites; // Devuelve el valor del atributo privado cantidadSatelites.
        }

        public void setCantidadSatelites(int cantidadSatelites) { // Método setter público para asignar la cantidad de satélites.
            this.cantidadSatelites = cantidadSatelites; // Asigna el valor de cantidadSatelites al atributo privado cantidadSatelites del objeto.
        }

        public double getMasa() { // Método getter público para obtener la masa.
            return masa; // Devuelve el valor del atributo privado masa.
        }

        public void setMasa(double masa) { // Método setter público para asignar la masa.
            this.masa = masa; // Asigna el valor de masa al atributo privado masa del objeto.
        }

        public double getVolumen() { // Método getter público para obtener el volumen.
            return volumen; // Devuelve el valor del atributo privado volumen.
        }

        public void setVolumen(double volumen) { // Método setter público para asignar el volumen.
            this.volumen = volumen; // Asigna el valor de volumen al atributo privado volumen del objeto.
        }

        public int getDiametro() { // Método getter público para obtener el diámetro.
            return diametro; // Devuelve el valor del atributo privado diametro.
        }

        public void setDiametro(int diametro) { // Método setter público para asignar el diámetro.
            this.diametro = diametro; // Asigna el valor de diametro al atributo privado diametro del objeto.
        }

        public int getDistanciaMediaSol() { // Método getter público para obtener la distancia media al Sol.
            return distanciaMediaSol; // Devuelve el valor del atributo privado distanciaMediaSol.
        }

        public void setDistanciaMediaSol(int distanciaMediaSol) { // Método setter público para asignar la distancia media al Sol.
            this.distanciaMediaSol = distanciaMediaSol; // Asigna el valor de distanciaMediaSol al atributo privado distanciaMediaSol del objeto.
        }

        public TipoPlaneta getTipo() { // Método getter público para obtener el tipo.
            return tipo; // Devuelve el valor del atributo privado tipo.
        }

        public void setTipo(TipoPlaneta tipo) { // Método setter público para asignar el tipo.
            this.tipo = tipo; // Asigna el valor de tipo al atributo privado tipo del objeto.
        }

        public boolean isObservable() { // Método getter público para obtener si es observable.
            return observable; // Devuelve el valor del atributo privado observable.
        }

        public void setObservable(boolean observable) { // Método setter público para asignar si es observable.
            this.observable = observable; // Asigna el valor de observable al atributo privado observable del objeto.
        }

        public double getPeriodoOrbital() { // Método getter público para obtener el periodo orbital.
            return PeriodoOrbital; // Devuelve el valor del atributo privado PeriodoOrbital.
        }

        public void setPeriodoOrbital(double periodoOrbital) { // Método setter público para asignar el periodo orbital.
            PeriodoOrbital = periodoOrbital; // Asigna el valor de periodoOrbital al atributo privado PeriodoOrbital del objeto.
        }

        public double getPeriodoRotación() { // Método getter público para obtener el periodo de rotación.
            return PeriodoRotacion; // Devuelve el valor del atributo privado PeriodoRotacion.
        }

        public void setPeriodoRotación(double periodoRotación, double PeriodoRotacion) { // Método setter público para asignar el periodo de rotación.
            this.PeriodoRotacion = PeriodoRotacion; // Asigna el valor de periodoRotación al atributo privado PeriodoRotacion del objeto.
        }

        @Override
        public String toString() { // Método toString.
            return "Planeta{" + "nombre='" + nombre + '\'' + ", satélites=" + cantidadSatelites + ", masa=" + masa
                    + ", volumen=" + volumen + ", diámetro=" + diametro + ", distancia al Sol=" + distanciaMediaSol
                    + " millones km" + ", tipo=" + tipo + ", observable=" + observable + "    Periodo Orbital= "
                    + PeriodoOrbital + " años" + "    Periodo Rotación= " + PeriodoRotacion + " días"; // Descripción.
        }

        public double calcularDensidad() { // Calcula densidad.
            if (volumen == 0) { // Si volumen 0.
                return 0; // Densidad 0, evita dividir por 0.
            } 
            return masa / volumen; // Devuelve la densidad calculada (Masa / Volumen).
        } 

        public boolean esExterior() { // Es exterior?
            return (distanciaMediaSol * 1.0) / 149.6 > 3.4; // Devuelve booleano si es exterior.
        } 

    } 

    // [#M092]
    public class Rectangulo { // Clase para crear objetos del tipo Rectangulo.
        private int base; // Atributo privado int base.
        private int altura; // Atributo privado int altura.
        private java.awt.Color color; // Atributo privado java.awt.Color color.

        Rectangulo(int base, int altura) { // Constructor con base y altura
            this.base = base; // Asigna el valor de base al atributo privado base del objeto.
            this.altura = altura; // Asigna el valor de altura al atributo privado altura del objeto.
        } 

        double calcularArea() { // Método calcular Area.
            return base * altura; // Devuelve el valor del área calculada (base * altura).
        }

        double calcularPerimetro() { // Método calcular Perímetro.
            return (2 * base) + (2 * altura); // Devuelve el valor del perímetro calculado (2 * base) + (2 * altura).
        }

        @Override
        public String toString() { // Método toString.
            return "rectangulo [base=" + base + ", altura=" + altura + ", color=" + color + "]"; // Descripción.
        }
    } 

    // [#M093]
    public class RestauranteLukas { // Clase RestauranteLukas.

        private double papas; //  Atributo privado double de stock de patatas.
        private double chocos; // Atributo privado double de stock de chocos.

        public RestauranteLukas(double p, double c) { // Constructor.
            this.papas = p; // Asigna el valor de p al atributo papas del objeto.
            this.chocos = c; // Asigna el valor de c al atributo chocos del objeto.
        } 

        public double getPapas() { // Método getter público para obtener el stock de patatas.
            return papas; // Retorna el valor del atributo papas.
        }

        public void setPapas(double papas) { // Método setter público para asignar el stock de patatas.
            this.papas = papas; // Asigna el valor de papas al atributo privado papas del objeto.
        }

        public double getChocos() { // Método getter público para obtener el stock de chocos.
            return chocos; // Retorna el valor del atributo chocos.
        }

        public void setChocos(double chocos) { // Método setter público para asignar el stock de chocos.
            this.chocos = chocos; // Asigna el valor de chocos al atributo chocos del objeto.
        }

        public int getComensales() { // Método getter público para obtener el número de comensales.
            int comensales = 0; // Inicializa contador.

            while ((papas >= 1) && (chocos >= 0.5)) { // Mientras haya ingredientes para 3 personas (1kg papas, 0.5kg chocos).
                comensales += 3; // Añade 3 comensales.
                papas -= 1; // Resta 1 kg papas.
                chocos -= 0.5; // Resta 0.5 kg chocos.
            } 
            return comensales; // Retorna total comensales.
        } 

        public void addPapas(double p) { // Método para añadir patatas.
            this.papas += p; // Suma al stock.
        }

        public void addChocos(double c) { // Método para añadir chocos.
            this.chocos += c; // Suma al stock.
        }

        public void showPapas() { // Método para mostrar stock patatas.
            System.out.println("en almacén tenemos " + this.papas + " kilos de papas."); // Print.
        }

        public void showChocos() { // Método para mostrar stock chocos.
            System.out.println("en almacén tenemos " + this.chocos + " kilos de chocos."); // Print.
        }

        public void existenciasAlmacen() { // Método para mostrar todo.
            this.showPapas(); // Llama mostrar papas.
            this.showChocos(); // Llama mostrar chocos.
        }

    } 

    // [#M094]
    public class Satelite { // Clase para crear objetos del tipo Satelite.

        private double meridiano; // Atributo privado double posición meridiano.
        private double paralelo; // Atributo privado double posición paralelo.
        private double distancia_tierra; // Atributo privado double distancia tierra.

        Satelite(double m, double p, double d) { // Constructor completo.
            this.meridiano = m; // Asigna el valor de m al atributo privado meridiano del objeto.
            this.paralelo = p; // Asigna el valor de p al atributo privado paralelo del objeto.
            this.distancia_tierra = d; // Asigna el valor de d al atributo privado distancia_tierra del objeto.
        } 

        Satelite() { // Constructor vacío.
            meridiano = paralelo = distancia_tierra = 0; // Todo a 0.
        } 

        public void setPosicion(double m, double p, double d) { // Método público para establecer posición.
            meridiano = m; // Asigna el valor de m al atributo privado meridiano del objeto.
            paralelo = p; // Asigna el valor de p al atributo privado paralelo del objeto.
            distancia_tierra = d; // Asigna el valor de d al atributo privado distancia_tierra del objeto.
        } 

        public void printPosicion() { // Método público para imprimir posición.
            System.out.println("El satélite se encuentra en el paralelo " + paralelo + " Meridiano " + meridiano
                    + " a una distancia de la tierra de " + distancia_tierra + "Kilómetros"); // Print.
        } 
    } 

    // [#M095]
    public class TrianguloRectangulo { // Clase para crear objetos del tipo TrianguloRectangulo.

        private int base; // Atributo privado int base.
        private int altura; // Atributo privado int altura.
        private java.awt.Color color; // Atributo privado java.awt.Color color.

        public TrianguloRectangulo(int base, int altura, java.awt.Color color) { // Constructor completo.
            this.base = base; // Asigna el valor de base al atributo privado base del objeto.
            this.altura = altura; // Asigna el valor de altura al atributo privado altura del objeto.
            this.color = color; // Asigna el valor de color al atributo privado color del objeto.
        } // End constructor.

        public int getBase() { // Método público para obtener el valor del atributo base.
            return base; // Devuelve el valor del atributo base.
        }

        public void setBase(int base) { // Método público para establecer el valor del atributo base.
            this.base = base; // Asigna el valor de base al atributo privado base del objeto.
        }

        public int getAltura() { // Método público para obtener el valor del atributo altura.
            return altura; // Devuelve el valor del atributo altura.
        }

        public void setAltura(int altura) { // Método público para establecer el valor del atributo altura.
            this.altura = altura; // Asigna el valor de altura al atributo privado altura del objeto.
        }

        public java.awt.Color getColor() { // Método público para obtener el valor del atributo color.
            return color; // Devuelve el valor del atributo color.
        }

        public void setColor(java.awt.Color color) { // Método público para establecer el valor del atributo color.
            this.color = color; // Asigna el valor de color al atributo privado color del objeto.
        }

        @Override
        public String toString() { // Método público para obtener una descripción del objeto.
            return "TrianguloRectangulo [base=" + base + ", altura=" + altura + ", color=" + color + "]"; // Descripción.
        }

        public double calcularHipotenusa() { // Método público para calcular la hipotenusa.
            int suma = (int) (Math.pow(base, 2) + Math.pow(altura, 2)); // Pitágoras: a^2 + b^2.
            return Math.sqrt(suma); // Raíz de la suma.
        } 

        double calcularArea() { // Método para calcular el área.
            return (base * altura) * 0.5; // (b*h)/2.
        } 

        double calcularPerimetro() { // Método para calcular el perímetro.
            return base + altura + this.calcularHipotenusa(); // Suma 3 lados.
        } 
    } 

    // [#M096]
    public class calculoNumero { // Clase para crear objetos del tipo calculoNumero.

        private int num; // Atributo privado int num.

        calculoNumero(int n) { // Constructor completo.
            this.num = n; // Asigna el valor de n al atributo num del objeto.
        }

        calculoNumero(calculoNumero obj) { // Constructor copia.
            this.num = obj.num; // Asigna el valor de num del objeto recibido al atributo num del objeto.
            System.out.println("Hemos creado una copia de " + obj.toString()); // Informa copia.
        }

        public int getNum() { // Método público para obtener el valor del atributo num.
            return this.num; // Devuelve el valor del atributo num.
        }

        public void setNum(int n) { // Método público para establecer el valor del atributo num.
            this.num = n; // Asigna el valor de n al atributo num del objeto.
        }

        public int doble() { // Método público para calcular el doble.
            return 2 * this.num; // Devuelve el doble del atributo num.
        }

        public int triple() { // Método público para calcular el triple.
            return 3 * this.num; // Devuelve el triple del atributo num.
        }

        public int cuadruple() { // Método público para calcular el cuadruple.
            return 4 * this.num; // Devuelve el cuadruple del atributo num.
        }

        public String toString() { // Método público para obtener una descripción del objeto.
            return "El numero " + num + " tiene su doble " + doble() + ", su triple " + triple() + "y su cuadruple "
                    + cuadruple(); // Describe.
        }

        @Override
        public int hashCode() { // Método público para obtener el hashcode del objeto.
            final int prime = 31; // Numero primo.
            int result = 1; // Inicializa resultado como un int 1.
            result = prime * result + num; // Calcula el hash y lo almacena en result.
            return result; // Devuelve el resultado.
        }

        @Override
        public boolean equals(Object obj) { // Método público para comprobar si dos objetos son iguales.
            if (this == obj) // Si es el mismo objeto memoria.
                return true; // Iguales.
            if (obj == null) // Si es null.
                return false; // No iguales.
            if (getClass() != obj.getClass()) // Si distinta clase.
                return false; // No iguales.
            calculoNumero other = (calculoNumero) obj; // Cast a calculoNumero.
            if (num != other.num) // Si num no igual.
                return false; // No iguales.
            return true; // Iguales.
        } 

    } 

    // [#M097]
    public class CuentaBancaria { // Clase para crear objetos del tipo de CuentaBancaria.

        private float interes; // Atributo privado float de Interés.
        private String nombre; // Atributo privado String de Nombre.
        private String apellidos; // Atributo privado String de Apellidos.
        private long numero_cuenta; // Atributo privado long de Número cuenta.

        enum TipoCuenta { // Enum tipo cuenta.
            CUENTA_AHORROS, CUENTA_CORRIENTE // Tipos.
        }

        private TipoCuenta cuenta; // Atributo privado tipo TipoCuenta.
        private double saldo; // Atributo privado double de Saldo.

        public CuentaBancaria(Float in, String nombre, String apellidos, long numero_cuenta, CuentaBancaria.TipoCuenta cuenta) { // Constructor con todo menos saldo.
            this.interes = in; // Asigna el valor de in al atributo privado interes del objeto.
            this.nombre = nombre; // Asigna el valor de nombre al atributo privado nombre del objeto.
            this.apellidos = apellidos; // Asigna el valor de apellidos al atributo privado apellidos del objeto.
            this.numero_cuenta = numero_cuenta; // Asigna el valor de numero_cuenta al atributo privado numero_cuenta del objeto.
            this.cuenta = cuenta; // Asigna el valor de cuenta al atributo privado cuenta del objeto.
            this.saldo = 0D; // Inicializa saldo 0.
        } 

        @Override
        public String toString() { // Método público para obtener una descripción del objeto.
            return "CuentaBancaria de " + nombre + " " + apellidos + " con numero de cuenta " + numero_cuenta + ". Su tipo de cuenta es " + cuenta + ", con un interes del " + interes + " y su saldo es " + saldo + "."; // Info.
        }

        public double consultarSaldo() { // Método público para consultar el saldo.
            return this.saldo; // Devuelve el saldo.
        }

        public void consignar(double valor) { // Método público para consignar dinero.
            this.saldo += valor; // Suma al saldo.
        }

        public void retirar(double valor) { // Método público para retirar dinero.
            if (this.saldo - valor < 0) { // Si no hay suficiente saldo.
                System.out.println("No puede retirar dinero. No hay tal cantidad en su cuenta"); // Imprimimos el error.
            } else // Si hay suficiente saldo.
                this.saldo -= valor; // Resta al saldo.
        }

        public void calcularInteres() { // Método público para calcular intereses.
            double cantidad = this.saldo * (interes / 12); // Calcula interés mensual.
            this.saldo += cantidad; // Añade al saldo.
        }

        public boolean compararCuenta(CuentaBancaria CuentaComparar) { // Método público para comparar saldos.
            if (this.saldo >= CuentaComparar.saldo) { // Si mi saldo mayor igual.
                return true; // True.
            } else // Si no.
                return false; // False.
        }

        public void transferencia(CuentaBancaria Cuenta2, double transferencia) { // Método público para transferir dinero.
            if (this.saldo - transferencia > 0) { // Si hay suficiente saldo.
                this.retirar(transferencia); // Intenta retirar el dinero de origen.
                Cuenta2.saldo += transferencia; // Añade dinero a cuenta destino.
            } 
        } 

    } 

    // [#M098]
    public class Letras { // Clase para crear objetos del tipo Letras.

        private char letra; // Atributo privado char de Letra.

        public Letras(char l) { // Constructor completo.
            Character car = l; // Variable auxiliar donde se almacena el carácter.
            car = l; // Asigna.
            if (Character.isAlphabetic(l)) { // Si es alfabético.
                if (Character.isUpperCase(l)) { // Si es mayúscula.
                    this.letra = Character.toUpperCase(l); // Asigna como mayúscula. (Es redundante).
                } else { // Si minúscula.
                    this.letra = car; // Asigna (que es minúscula).
                }
            } else { // Si no es letra.
                System.out.println("No es un valor alfabetico. No se ha inializado."); // Error.
            } 
        } 

        public char getLetra() { //  Método público para obtener el valor del atributo privado letra.
            return letra; // Return.
        }

        public void setLetra(char l) { // Método público para establecer el valor del atributo privado letra.
            Character car = l; // Variable auxiliar donde se almacena el carácter.
            car = l; // Asigna.
            if (Character.isAlphabetic(l)) { // Si es letra.
                if (Character.isUpperCase(l)) { // Si es mayúscula.
                    this.letra = Character.toUpperCase(l); // Set mayúscula.
                } else { // Si es minúscula.
                    this.letra = car; // Set minúscula.
                }
            } else { // Si no es letra.
                System.out.println("No es un valor alfabetico. No se ha indicado un nuevo valor."); // Error.
            } 
        } 

        @Override
        public String toString() { // Método público para obtener una descripción del objeto.
            return "La letra es " + letra + "."; // Info.
        }

    }
}
