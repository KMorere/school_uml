from classroom import Classroom
import admin
import person

from typing import TYPE_CHECKING
if TYPE_CHECKING:
    from student import Student
    from teacher import Teacher


class School:
    """ Create a new School with a unique admin, a list of students, teachers and rooms. """
    #admin: admin.Admin
    classrooms: list[Classroom] = []
    teachers: list['Teacher'] = []
    students: list['Student'] = []

    @classmethod
    def add_classroom(cls, _classroom: Classroom):
        cls.classrooms.append(_classroom)

    @staticmethod
    def add_to_classroom(_person: person.Person, _classroom: Classroom) -> None:
        _classroom.add_person(_person)

    @classmethod
    def add_teacher(cls, _teacher: 'Teacher'):
        cls.teachers.append(_teacher)

    @classmethod
    def add_student(cls, _student: 'Student'):
        cls.students.append(_student)

    def __str__(self):
        return (f"[Classrooms : {list(map(str, self.classrooms))}], "
                f"\n[Students : {list(map(str, self.students))}], "
                f"\n[Teachers : {list(map(str, self.teachers))}]")
