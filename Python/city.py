class City:

    def __init__(self, name: str, country: str, postal_code: str):
        self.name = name
        self.country = country
        self.postal_code = postal_code

    def __str__(self):
        return f"City : {self.name}, {self.country}, {self.postal_code}"
