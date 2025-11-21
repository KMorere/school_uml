from person import Person
import school


class Student(Person):
    """ Class representing a real Student """

    def __init__(self, first_name: str, last_name: str, age: int):
        super().__init__(first_name, last_name, age, None, None)
        school.School.add_student(self)

    def __str__(self):
        return (f"Student: "
                f"\n[{self.first_name} {self.last_name}],"
                f"\n[{self.age} ans],"
                f"\n{self.address.__str__()},"
                )

    def participate(self):
        return super()
