from classroom import Classroom


class School:
    admin: str = "" # TODO:Implement the Admin class.
    classrooms: list[Classroom] = []

    @classmethod
    def add_classroom(cls, _classroom: Classroom):
        cls.classrooms.append(_classroom)

    def __str__(self):
        return f"{list(map(str, self.classrooms))}"
