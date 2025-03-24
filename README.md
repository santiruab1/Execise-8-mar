# Proyecto: Clase `CuentaBancaria`

## Descripción
Este proyecto implementa una clase llamada `CuentaBancaria` que modela una cuenta bancaria básica. La clase utiliza principios de programación orientada a objetos como encapsulamiento, constructores sobrecargados y validaciones en los métodos de acceso para garantizar la integridad de los datos. Además, incluye una clase principal (`Main`) para probar las funcionalidades de la clase.

## Reflexiones

### ¿Por qué es importante encapsular los atributos como privados?
Encapsular los atributos como privados es esencial para proteger la integridad de los datos de la clase. Esto asegura que los atributos no puedan ser modificados directamente desde fuera de la clase, evitando errores o inconsistencias. Al proporcionar métodos de acceso (getters y setters), se puede controlar cómo se accede y modifica cada atributo, aplicando validaciones y reglas de negocio que garantizan que los datos sean válidos y consistentes.

### ¿Qué ventaja tiene usar constructores sobrecargados en esta clase?
El uso de constructores sobrecargados permite crear instancias de la clase `CuentaBancaria` de manera flexible, adaptándose a diferentes necesidades del usuario:
- El constructor vacío inicializa los atributos con valores predeterminados, útil cuando no se dispone de información inicial.
- El constructor con parámetros permite inicializar los atributos con valores específicos, asegurando que los datos sean válidos desde el momento de la creación. Esto facilita la creación de objetos con diferentes configuraciones y mejora la reutilización del código.

### ¿Cómo aseguran los setters la integridad de los datos?
Los setters aseguran la integridad de los datos al incluir validaciones que verifican que los valores ingresados sean válidos antes de asignarlos a los atributos. Por ejemplo:
- El método `setSaldo` evita que se asignen valores negativos al saldo.
- El método `setNombreTitular` asegura que el nombre del titular no sea nulo ni vacío.
- El método `setIdCuenta` valida que el identificador de la cuenta no sea nulo ni vacío.
  
Estas validaciones, junto con el encapsulamiento, garantizan que los atributos de la clase mantengan un estado consistente y válido, evitando errores y asegurando la calidad del código.

## Funcionalidades de la Clase

### Atributos
- **`idCuenta`**: Identificador único de la cuenta.
- **`saldo`**: Cantidad de dinero en la cuenta.
- **`nombreTitular`**: Nombre del titular de la cuenta.

### Constructores
1. **Constructor vacío**: Inicializa los atributos con valores predeterminados:
   - `idCuenta = "00000"`
   - `saldo = 0.0`
   - `nombreTitular = "Titular sin asignar"`
2. **Constructor con parámetros**: Permite inicializar los atributos con valores específicos, validando que sean válidos:
   - `idCuenta` no puede ser nulo ni vacío.
   - `saldo` no puede ser negativo.
   - `nombreTitular` no puede ser nulo ni vacío.

### Métodos de acceso
- **Getters**: Permiten obtener los valores de los atributos.
- **Setters**: Permiten modificar los valores de los atributos, asegurando que sean válidos mediante validaciones.

### Método adicional
- **`depositar(double cantidad)`**: Incrementa el saldo de la cuenta, validando que la cantidad a depositar sea positiva.

## Ejemplo de Uso

### Código de prueba
```java
public class Main {
    public static void main(String[] args) {
        // Crear una cuenta usando el constructor vacío
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.setIdCuenta("00001");
        cuenta1.setNombreTitular("Maria Suarez");
        cuenta1.depositar(100.0);

        // Crear una cuenta usando el constructor con parámetros
        CuentaBancaria cuenta2 = new CuentaBancaria("00002", 23000.12, "Ramon Perez");
        cuenta2.depositar(124583.89);

        // Imprimir los datos de las cuentas
        System.out.println("Información cuenta1: " + cuenta1.getIdCuenta() + "; " +
                           cuenta1.getSaldo() + "; " + cuenta1.getNombreTitular());
        System.out.println("Información cuenta2: " + cuenta2.getIdCuenta() + "; " +
                           cuenta2.getSaldo() + "; " + cuenta2.getNombreTitular());
    }
}
