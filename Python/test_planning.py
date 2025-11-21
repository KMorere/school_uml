from subject import Subject
from date import Date
from planning import Planning

toto = Date(19,11,2025)

papa = Planning(Date(10,6,2016), ([Subject("Math"), Subject("Anglais")]))

print(papa)

#this display the desired subject at a certain date
something: list[Subject] | None = papa.planning_list.get(str(Date(10,6,2016)))
#I need to put the If Else here because it put a red warning that the value might be None
#With an If Else there is no warning
if something is not None:
    print(something[0])
else:
    print("No subjects found for that date.")


print("------ Test print--------")
################ TEST TEST
planning_list_test: list[Planning] = [

    Planning(Date(10, 6, 2016), ([Subject("Math"), Subject("Anglais")])),
    Planning(Date(11, 6, 2016), ([Subject("Français"),Subject("Sport"), Subject("Anglais")])),
    Planning(Date(12, 6, 2016), ([Subject("SVT"),Subject("Musique"), Subject("Anglais")])),
    Planning(Date(13, 6, 2016), ([Subject("Math"), Subject("Physique chimie")])),
    Planning(Date(14, 6, 2016), ([Subject("Espagnol"),Subject("Histoire"), Subject("Math")]))

]
for planning in planning_list_test:
    print(planning)
bonjour_list: list[Subject] | None = planning_list_test[0].planning_list.get(str(Date(11,6,2016)))

#this display the desired subject at a certain date
check_subject = planning_list_test[0].planning_list.get(str(Date(11,6,2016)))
#I need to put the If Else here because it put a red warning that the value might be None
#With an If Else there is no warning
if check_subject is not None:
    print(check_subject[0])
else:
    print("No subjects found for that date.")

################ TEST TEST
print("--------------")