from typing import Protocol


class Educator(Protocol):
    """ Interface used to add the educators of a classroom. """
    def do_teach(self):
        ...
