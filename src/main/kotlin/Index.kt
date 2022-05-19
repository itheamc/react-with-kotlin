import kotlinx.browser.document
import react.create
import react.dom.render

fun main() {
    document.getElementById("root")?.let {
        render(App.create(), it)
    }
}