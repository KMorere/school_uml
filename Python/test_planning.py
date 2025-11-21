from subject import Subject
from date import Date
from planning import Planning

toto = Date(19,11,2025)

papa = Planning(Date(10,6,2016), ([Subject("Math"), Subject("Anglais")]))

print(papa)

something: list[Subject] = papa.planning_list.get(str(Date(10,6,2016)))

print(something[0])
