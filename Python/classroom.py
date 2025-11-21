import person
import school


class Classroom:
    """ Create a Classroom for a school. """
    def __init__(self, _name: str, _size: int):
        self.name = _name
        self.size = _size
        self.persons: list[person.Person] = []
        school.School.add_classroom(self)

    def __str__(self):
        return f"[{self.name} : {self.size}]"

    def get_persons(self):
        return self.persons

    def add_person(self, _person: person.Person):
        self.persons.append(_person)
        print(_person, self.persons)
