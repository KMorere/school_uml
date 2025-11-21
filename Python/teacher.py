from person import Person
import school


class Teacher(Person):
    """ A class representing a real teacher """

    def __init__(self, _first_name: str, _last_name: str, _age: int):
        super().__init__(_first_name, _last_name, _age, None, None)
        self.startDate = "21/11/2025"
        school.School.add_teacher(self)

    def __str__(self):
        return (f"Teacher: "
                f"\n[{self.first_name} {self.last_name}],"
                f"\n[{self.age} ans],"
                f"\n{self.address.__str__()},"
                )

    def teach(self):
        return super()
