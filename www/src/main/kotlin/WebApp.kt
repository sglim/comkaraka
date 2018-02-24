import io.ktor.application.*
import io.ktor.features.CallLogging
import io.ktor.features.DefaultHeaders
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun Application.main() {
    install(DefaultHeaders)
    install(CallLogging)
    install(Routing) {
        get("/") {
            call.respondText("Comkaraka Web", ContentType.Text.Html)
        }
    }
}

//fun main(args: Array<String>) {
//    embeddedServer(Netty, 8080, watchPaths = listOf("WebAppKt"), module = Application::module).start()
//}