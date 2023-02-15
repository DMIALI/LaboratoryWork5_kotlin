import kotlinx.serialization.*

@Serializable
class MusicBand(
    _id: Long,
    _name: String,
    _coordinates: Coordinates,
    _creationDate: java.time.LocalDate
    creationDate,
    _numberOfParticipants: Int,
    _albumsCount: Int,
    _genre: MusicGenre,
    _frontMan: Person
) {
    private var id = _id //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private var name = _name //Поле не может быть null, Строка не может быть пустой
    private var coordinates = _coordinates //Поле не может быть null
    private var creationDate = _creationDate //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private var numberOfParticipants = _numberOfParticipants //Значение поля должно быть больше 0
    private var albumsCount = _albumsCount //Значение поля должно быть больше 0
    private var genre = _genre //Поле не может быть null
    private var frontMan = _frontMan //Поле может быть null
}