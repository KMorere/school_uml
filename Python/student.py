from person import Person
import school


class Student(Person):
    """ Class representing a real Student """

    def __init__(self, first_name: str, last_name: str, age: int):
        super().__init__(first_name, last_name, age, None, None)
        school.School.add_student(self)

    def participate(self) -> None:
        super()
