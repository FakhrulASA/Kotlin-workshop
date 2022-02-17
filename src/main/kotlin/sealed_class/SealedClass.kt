package sealed_class

sealed class Employee
data class Manager(val name: String, val age: Int, val team: List<String>): Employee()
class SeniorDev(val name: String, val age: Int, val projects: Int): Employee()
object JuniorDev: Employee()

val employee: Employee  = SeniorDev("Name",20, 10)
val message = when (employee) {
    is Manager -> {
        "Welcome ${employee.name}! You have ${employee.team.size} employees in your team!"
    }
    is SeniorDev -> {"Welcome ${employee.name}! You have already ${employee.projects} projects under your belt!"}
    //is is not required for SingleTon
    JuniorDev -> {"Welcome aboard! We wish you an awesome Experience!"}
    //no else case is required since all cases are handled
}

fun main(){
    println(message)
}

/**
 * Output: Welcome Name! You have already 10 projects under your belt!
 */