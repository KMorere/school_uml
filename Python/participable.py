from typing import Protocol


class Participable(Protocol):
    """ Interface used to store the students and teachers that are present for a class. """
    def do_participate(self):
        ...
