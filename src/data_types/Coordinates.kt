import kotlinx.serialization.*

@Serializable
class Coordinates(_x: Long, _y: Float) {
    private var x = _x //Значение поля должно быть больше -645
    private var y = _y
}