from city import City


class Address:
    def __init__(self, city: City, street: str, street_number: str, additionnal_info: str):
        self.city = city
        self.street = street
        self.street_number = street_number
        self.additionnal_info = additionnal_info

    def __str__(self):
        return (f"Addresse : "
                f"\n[{self.city}], "
                f"\n[{self.street_number} {self.street}], "
                f"\n[{self.additionnal_info}]")

