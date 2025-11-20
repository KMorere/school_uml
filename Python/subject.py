from datetime import date

class Subject :

    def __init__(self,name:str):
        self.name = name

    def __str__(self):
        return f"{self.name}"

