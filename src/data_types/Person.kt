class Person (_name: String, _passportID: String, _hairColor: Color, _nationality: Country, _location: Location){
    private var name = _name //Поле не может быть null, Строка не может быть пустой
    private var passportID = _passportID //Строка не может быть пустой, Длина строки должна быть не меньше 6, Поле не может быть null
    private var hairColor = _hairColor //Поле не может быть null
    private var nationality = _nationality //Поле может быть null
    private var location = _location //Поле не может быть null
}