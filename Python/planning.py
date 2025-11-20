from subject import Subject
from date import Date


class Planning:
    week_days: list[str] = ["Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"]
    # dict clé date et contient list subject
    planning : dict[Date, 'Subject'] = {}
    def __init__(self,date:Date, subject_list:list[Subject]):
        self.date = date
        self.subject_list:list[Subject] = subject_list


    def __str__(self):
        # "map(str," is just to translate data on the console
        return f"{self.date}/{list(map(str,self.subject_list))}"

