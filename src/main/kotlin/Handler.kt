import java.lang.IllegalArgumentException
import java.util.Scanner

class Handler {
    fun Handler(){
        // constructor
    }
    fun CommandsMenu (){
        try{
            val scanner = Scanner(System.`in`)
            var command = ""
            while(command != "exit"){
                command = scanner.nextLine()
                when(command){
                    "help" -> println("Usfull information")
                    else -> println("no such command")
                }
                //val command = scanner.nextLine()
            }
        } catch(e: IllegalArgumentException){
            return
        }
    }
}