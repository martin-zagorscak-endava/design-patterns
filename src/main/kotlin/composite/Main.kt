package composite

fun main() {
    val measurableComponents = mutableListOf(
        RectangularUIComponent(0, 10.0, 25.0),
        RectangularUIComponent(1, 20.0, 30.0),
        EllipticalUIComponent(2, 12.5, 5.0),
        EllipticalUIComponent(3, 10.0, 10.0)
    )
    measurableComponents.map { Pair(it.id, it.measure()) }.forEach {
        println("Component ${it.first} size: ${it.second}")
    }

    val totalMeasure: Double = measurableComponents.sumOf { it.measure() }
    println("Total measure: $totalMeasure")

    // TODO: expand measurableComponents with nested Layouts and then recalculate
}
