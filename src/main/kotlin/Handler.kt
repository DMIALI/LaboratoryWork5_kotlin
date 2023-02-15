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
                    "help"->{

                    }
                    "info"->{

                    }
                    "show"->{

                    }
                    "add {element}"->{

                    }
                    "update id {element}"->{

                    }
                    "remove_by_id id"->{

                    }
                    "clear"->{

                    }
                    "save"->{

                    }
                    "execute_script file_name"->{

                    }
                    "exit"->{
                        println("Goodbye :)")
                    }
                    "remove_at index"->{

                    }
                    "shuffle"->{

                    }
                    "reorder"->{

                    }
                    "remove_any_by_front_man frontMan"->{

                    }
                    "count_by_number_of_participants numberOfParticipants"->{

                    }
                    "filter_by_albums_count albumsCount"->{

                    }

                    else -> println("no such command")
                }
                //val command = scanner.nextLine()
            }
        } catch(e: IllegalArgumentException){
            return
        }
    }
}