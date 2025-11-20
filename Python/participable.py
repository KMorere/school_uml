from typing import Protocol


class Participable(Protocol):
    def do_participate(self):
        ...
