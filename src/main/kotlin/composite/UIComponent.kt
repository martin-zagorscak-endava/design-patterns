package composite

class RectangularUIComponent(
    override val id: Int,
    private val width: Double,
    private val height: Double
) : Measurable() {
    override fun measure(): Double = width * height
}

class EllipticalUIComponent(
    override val id: Int,
    private val majorRadius: Double,
    private val minorRadius: Double
) :
    Measurable() {
    override fun measure(): Double = Math.PI * majorRadius * minorRadius
}

// Layout can hold multiple UI components
class Layout {
    // TODO: make it measurable
}