package pages

import csstype.*
import react.FC
import react.Props
import react.css.css
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.p
import react.useEffect
import react.useState

external interface ProductsPageProps : Props {
    var products: List<String>
}

val ProductsPage = FC<ProductsPageProps> { props ->
    val products by useState(props.products)

    useEffect(
        effect = {
            console.log("UseEffect called!!")
            cleanup {
                console.log("CleanUp Called!!")
            }
        },
        dependencies = arrayOf(products)
    )

    div {
        css {
            height = 100.pct
            width = 100.pct
            display = Display.flex
            flexDirection = FlexDirection.column
            gap = 10.px
        }

        for (product in products) {
            div {
                css {
                    padding = Padding(vertical = 20.px, horizontal = 40.px)
                    color = Color("yellow")
                    backgroundColor = Color("red")
                }
                p {
                    +product
                }
            }
        }
    }
}