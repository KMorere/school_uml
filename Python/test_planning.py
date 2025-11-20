from subject import Subject
from date import Date
from planning import Planning

toto = Date(19,11,2025)

papaa = Planning(Date(10,6,2016), ([Subject("Math"), Subject("Anglais")]))

print(papaa)

something: list[Subject] = papaa.planning.get(str(Date(10,6,2016)))

print(something[0])
