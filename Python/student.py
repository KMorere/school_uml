from Python.person import Person
from Python.address import Address
from Python.city import City


class Student(Person):
    """ Class representing a real Student """


    def __init__(self, first_name: str, last_name: str, age: int, address: Address):
        super().__init__(first_name, last_name, age, address)


    def participate(self) -> None:
        return None


# new_address = Address(City("Toulouse", "France", "31100"),
#                       "Chemin des martyrs de bordelongue",
#                       "4",
#                       "Deuxième étage")
#
#
# new_student = Student("Matthieu", "Couderc", 39, new_address)
#
# print(new_student)