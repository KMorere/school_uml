from person import Person


class Teacher(Person):
    """ A class reprensenting a real teacher """

    def __init__(self, _first_name: str, _last_name: str, _age: int):
        super().__init__(_first_name, _last_name, _age, None, None)

    def teach(self) -> None:
        super()
