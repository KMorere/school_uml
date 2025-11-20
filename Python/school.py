from classroom import Classroom
from teacher import Teacher
from student import Student

class School:
    admin: str = "" # TODO:Implement the Admin class.
    classrooms: list[Classroom] = []
    teachers: list[Teacher] = []
    students: list[Student] = []

    @classmethod
    def add_classroom(cls, _classroom: Classroom):
        cls.classrooms.append(_classroom)

    @classmethod
    def add_teacher(cls, _teacher: Teacher):
        cls.teachers.append(_teacher)

    @classmethod
    def add_student(cls, _student: Student):
        cls.students.append(_student)

    def __str__(self):
        return (f"[Classrooms : {list(map(str, self.classrooms))}], "
                f"\n[Students : {list(map(str, self.students))}], "
                f"\n[Teachers : {list(map(str, self.teachers))}]")
