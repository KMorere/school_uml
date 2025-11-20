import school

class Classroom:
    def __init__(self, _name: str, _size: int):
        self.name = _name
        self.size = _size
        school.School.add_classroom(self)

    def __str__(self):
        return f"[{self.name} : {self.size}]"
