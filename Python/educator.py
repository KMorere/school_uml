from typing import Protocol


class Educator(Protocol):
    """ Interface used to add educators of a class. """
    def do_teach(self):
        ...
