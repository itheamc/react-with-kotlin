package pages

import csstype.*
import react.FC
import react.Props
import react.css.css
import react.dom.html.ReactHTML.div
import react.router.dom.Link
import react.useState

external interface HomePageProps: Props {
    var name: String
}

val Homepage = FC<HomePageProps> {props ->
    val name by useState(props.name)

    div {
        css {
            padding = Padding(vertical = 10.px, horizontal = 20.px)
            height = 100.pct
            width = 100.pct
            backgroundColor = rgba(255, 200, 175, 0.75)
            display = Display.flex
            flexDirection = FlexDirection.column
            justifyContent = JustifyContent.center
            alignItems = AlignItems.center
        }

        div {
            css {
                width = 170.px
                height = 170.px
                backgroundColor = rgba(175, 225, 250, 1.0)
                display = Display.flex
                flexDirection = FlexDirection.column
                justifyContent = JustifyContent.center
                alignItems = AlignItems.center
            }
            +name
        }

        Link {
            css {
                padding = Padding(vertical = 10.px, horizontal = 25.px)
                backgroundColor = rgb(175, 100, 150)
                color = Color("white")
                textDecoration = TextDecoration.none
                fontWeight = FontWeight.bolder
                transition = Transition.all
                transitionDuration = 0.3.s


                hover {
                    backgroundColor = rgb(120, 50, 150)
                    color = Color("yellow")
                }
            }
            to = "/products"
            +"Go to Products"
        }
    }
}