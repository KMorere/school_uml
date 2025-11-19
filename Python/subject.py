from datetime import date

class Subject :

    def __init__(self,name,startDate:date, endDate:date):
        self.name = name
        self.startDate:date = startDate
        self.endDate:date = endDate

    def __str__(self):
        return f"{self.name}/{self.startDate}/{self.endDate}"

