import kotlinx.serialization.*

@Serializable
class Location (_x: Long, _y: Int, _z: Double, _name: String) {
    private var x = _x //Поле не может быть null
    private var y = _y //Поле не может быть null
    private var z = _z //Поле не может быть null
    private var name = _name //Поле может быть null
}