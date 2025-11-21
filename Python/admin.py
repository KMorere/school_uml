from person import Person


class Admin(Person):
    """ A class that represents the school director """

    def __init__(self, _first_name: str, _last_name: str, _age: int):
        super().__init__(_first_name, _last_name, _age, None, None)

    def teach(self):
        super()

    def participate(self):
        super()
