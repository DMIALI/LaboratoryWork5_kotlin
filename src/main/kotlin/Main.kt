import java.util.Scanner

fun main(args: Array<String>) {
    println("Hello World!")
    val scanner = Scanner(System.`in`)
    var command = ""
    while (!command.equals("exit")){
        command = scanner.nextLine()
        print (command)
    }
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}