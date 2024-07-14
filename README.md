
# Kotlin Básico: Variables, Constantes, Opcionales y Manejo de Nulos

## Variables

En Kotlin, las variables se pueden declarar usando `var` (para variables mutables) o `val` (para variables inmutables).

### Ejemplo de Variable Mutable

```kotlin
fun main() {
    var mutableVariable: Int = 10
    println("Mutable variable before: $mutableVariable")
    mutableVariable = 20
    println("Mutable variable after: $mutableVariable")
}
```

## Constantes

Las constantes en Kotlin se declaran utilizando `val` y se colocan en el ámbito superior o dentro de un objeto para que sean inmutables.

### Ejemplo de Constante

```kotlin
const val CONSTANT_VALUE: String = "This is a constant value"

fun main() {
    println(CONSTANT_VALUE)
}
```

## Opcionales

En Kotlin, los tipos opcionales (o nullables) se indican con `?`. Esto significa que la variable puede contener un valor nulo.

### Ejemplo de Variable Nullable

```kotlin
fun main() {
    var nullableVariable: String? = "Hello, Kotlin"
    println("Nullable variable: $nullableVariable")
    nullableVariable = null
    println("Nullable variable after setting to null: $nullableVariable")
}
```

## Manejo de Nulos

Kotlin proporciona varias maneras de manejar nulos, como el operador de llamada segura (`?.`), el operador Elvis (`?:`), y el uso de `let`.

### Ejemplos de Manejo de Nulos

```kotlin
fun main() {
    var nullableVariable: String? = "Hello, Kotlin"
    println("Length of nullable variable: ${nullableVariable?.length}")
    nullableVariable = null
    val length = nullableVariable?.length ?: -1
    println("Length of nullable variable with Elvis operator: $length")
    nullableVariable?.let {
        println("Nullable variable is not null: $it")
    } ?: run {
        println("Nullable variable is null")
    }
}
```
