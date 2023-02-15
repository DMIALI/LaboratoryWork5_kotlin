import java.util.Scanner

fun main(args: Array<String>) {
    println("Hello World!")
    val scanner = Scanner(System.`in`)
    val a = scanner.nextLine()
    println(a)
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}