from typing import Protocol


class Educator(Protocol):
    def do_teach(self):
        ...
