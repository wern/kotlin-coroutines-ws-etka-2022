package coroutines.kotlin.coroutines.launch

// Import needed!
import kotlinx.coroutines.*

fun main() =  runBlocking {
    launch {
        delay(1000L)
        println("ETKA!")
    }
    println("Willkommen zum")
}