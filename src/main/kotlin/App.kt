import pages.Homepage
import pages.ProductsPage
import react.*
import react.router.Route
import react.router.Routes
import react.router.dom.BrowserRouter

external interface AppProps : Props

val App = FC<AppProps> {
    BrowserRouter {
        Routes {
            Route {
                path = "/"
                element = Homepage.create { name = "Hey, Amit" }
            }
            Route {
                path = "products"
                element = ProductsPage.create {
                    products = listOf("Product 1", "Product 2", "Product 3", "Product 4")
                }
            }
        }
    }
}


