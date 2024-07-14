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
