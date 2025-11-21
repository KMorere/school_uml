class Date :

    #constructor
    def __init__(self,day:int,month:int, year:int):
        self.day:int = day
        self.month:int = month
        self.year:int = year

    #display
    def __str__(self):
        return f"{self.day}/{self.month}/{self.year}"

