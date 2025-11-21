import admin
import student
import school
import classroom
import teacher


rooms: list[classroom.Classroom] = [classroom.Classroom("A1", 20), classroom.Classroom("B1", 20)]
new_school = school.School()

new_student: student.Student = student.Student("Rire", "Dedroite", 17)

new_admin: admin.Admin = admin.Admin("Admin", "", 0)
new_school.add_to_classroom(new_student, rooms[0])
new_school.add_to_classroom(student.Student("Mo", "Sade", 18), rooms[0])
new_school.add_to_classroom(student.Student("Tar", "Tampouin", 18), rooms[0])
new_school.add_to_classroom(student.Student("Pat", "Ibulaire", 18), rooms[0])
new_school.add_to_classroom(teacher.Teacher("Jean", "Aimare", 28), rooms[0])
new_school.add_to_classroom(teacher.Teacher("Reu", "Belotte", 37), rooms[0])

print(new_school)
