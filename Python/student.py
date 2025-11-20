from person import Person


class Student(Person):
    """ Class representing a real Student """

    def __init__(self, first_name: str, last_name: str, age: int):
        super().__init__(first_name, last_name, age)


    def participate(self) -> None:
        super()
